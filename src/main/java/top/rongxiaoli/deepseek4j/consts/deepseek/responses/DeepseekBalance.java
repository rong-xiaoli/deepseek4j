package top.rongxiaoli.deepseek4j.consts.deepseek.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeepseekBalance {
    public boolean isAvailable;
    public DeepseekBalanceInfo info;
}
