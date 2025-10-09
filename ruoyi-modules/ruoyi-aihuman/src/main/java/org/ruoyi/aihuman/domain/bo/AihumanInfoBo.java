package org.ruoyi.aihuman.domain.bo;

import org.ruoyi.aihuman.domain.AihumanInfo;
import org.ruoyi.core.domain.BaseEntity;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
import java.io.Serializable;
import org.ruoyi.common.core.validate.AddGroup;
import org.ruoyi.common.core.validate.EditGroup;
import java.io.Serializable;
import java.io.Serializable;
import org.ruoyi.common.core.validate.AddGroup;
import org.ruoyi.common.core.validate.EditGroup;

/**
 * 数字人信息管理业务对象 aihuman_info
 *
 * @author ageerle
 * @date Fri Sep 26 20:03:06 GMT+08:00 2025
 */
@Data

@AutoMapper(target = AihumanInfo.class, reverseConvertGenerate = false)
public class AihumanInfoBo implements Serializable {

    private Long id;

    /**
     * 交互名称
     */
    private String name;
    /**
     * 交互内容
     */
    private String content;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

}
