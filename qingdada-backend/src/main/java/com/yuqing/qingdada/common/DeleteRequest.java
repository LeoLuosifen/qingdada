package com.yuqing.qingdada.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * @author <a href="https://github.com/liyuqing">程序员鱼皮</a>
 * @from <a href="https://yuqing.icu">编程导航知识星球</a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}