package com.buka.partnermatchingbackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * 通用的删除请求参数
 */
@Data
public class DeleteRequest implements Serializable {
    static final long serialVersionUID = 65484844456554L;
    private long id;

}
