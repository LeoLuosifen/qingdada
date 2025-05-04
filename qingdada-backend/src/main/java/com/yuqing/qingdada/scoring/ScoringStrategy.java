package com.yuqing.qingdada.scoring;

import com.yuqing.qingdada.model.entity.App;
import com.yuqing.qingdada.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略接口
 *
 * @author Yuqing Luo
 * @date 2025/5/4 12:50
 */
public interface ScoringStrategy {

    /**
     *
     * 执行评分
     *
     * @param choices
     * @param app
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}
