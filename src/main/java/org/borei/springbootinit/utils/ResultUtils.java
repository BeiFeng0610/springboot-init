package org.borei.springbootinit.utils;

import org.borei.springbootinit.common.BaseResponse;
import org.borei.springbootinit.common.ErrorCode;

/**
 * 返回工具类
 *
 * @author <a href="https://github.com/BeiFeng0610">borei</a>
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 成功
     *
     * @param data
     * @return
     */
    public static BaseResponse<Object> success(byte[] data) {
        return new BaseResponse<>(0, data, "data");
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse error(int code, String message) {
        return new BaseResponse(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message) {
        return new BaseResponse(errorCode.getCode(), null, message);
    }
}
