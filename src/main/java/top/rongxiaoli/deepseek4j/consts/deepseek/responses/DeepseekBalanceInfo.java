package top.rongxiaoli.deepseek4j.consts.deepseek.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeepseekBalanceInfo {
    /**
     * 货币，人民币或美元<br/>
     * Possible values: [{@code CNY}, {@code USD}]
     */
    @AllArgsConstructor
    public enum currency {
        CNY,
        USD;
    }

    /**
     * 总的可用余额，包括赠金和充值余额
     */
    public String totalBalance;
    /**
     * 未过期的赠金余额
     */
    public String grantedBalance;
    /**
     * 充值余额
     */
    public String toppedUpBalance;
}
