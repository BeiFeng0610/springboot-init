package org.borei.springbootinit.common;

import lombok.Data;

import java.io.Serializable;

/**
 * id 请求
 *
 * @author <a href="https://github.com/BeiFeng0610">borei</a>
 *
 */
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}