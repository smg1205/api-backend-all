package com.smg.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除返回类
 * @author hf47
 */
@Data
public class DeleteResponse implements Serializable {
    private Long id;
    private static final long serialVersionUID = 1L;
}
