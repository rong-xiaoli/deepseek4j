package top.rongxiaoli.deepseek4j.consts.deepseek.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class DeepseekModelList {
    /**
     * Possible values: [list]
     */
    public String returnObject;
    public ArrayList<DeepseekModel> data;
}
