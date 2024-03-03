package org.borei.springbootinit.controller.api;

import lombok.extern.slf4j.Slf4j;
import org.borei.springbootinit.common.BaseResponse;
import org.borei.springbootinit.utils.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 16116
 * description
 * date 2024/3/3 14:50
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @GetMapping
    public BaseResponse<String> test1(){
        return ResultUtils.success("我是你爹");
    }
}
