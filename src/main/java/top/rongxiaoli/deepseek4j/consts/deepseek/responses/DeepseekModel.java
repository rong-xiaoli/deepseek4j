package top.rongxiaoli.deepseek4j.consts.deepseek.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeepseekModel {
    /**
     * 模型的标识符
     */
    public String id;
    /**
     * Possible values: [{@code model}]
     * <br/>
     * 对象的类型，其值为 {@code model}。
     */
    public String obj;
    /**
     * 拥有该模型的组织。
     */
    public String ownedBy;
}
