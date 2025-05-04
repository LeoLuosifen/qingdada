package com.yuqing.qingdada.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Yuqing Luo
 * @date 2025/5/4 11:50
 */
@Data
public class ReviewRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 状态：0-待审核，1-通过，2-拒绝
     */
    private Integer reviewStatus;

    /**
     * 审核信息
     */
    private String reviewMessage;

    private static final long serialVersionUID = 1L;
}
