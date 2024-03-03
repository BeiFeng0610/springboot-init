package org.borei.springbootinit;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class InitApplicationTests {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Resource
    private RedissonClient redissonClient;

    @Test
    void contextLoads() {
    }

    @Test
    void testRedis() {
        redisTemplate.opsForValue().set("init", "init");
    }

    @Test
    void testRedisson() {
        RLock lock = redissonClient.getLock("init");
        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)) {
                System.out.println("获取锁成功");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

}
