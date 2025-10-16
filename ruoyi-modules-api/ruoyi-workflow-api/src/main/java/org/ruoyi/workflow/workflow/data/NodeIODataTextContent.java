package org.ruoyi.workflow.workflow.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.ruoyi.workflow.enums.WfIODataTypeEnum;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class NodeIODataTextContent extends NodeIODataContent<String> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String title;

    private Integer type = WfIODataTypeEnum.TEXT.getValue();

    private String value;
}
