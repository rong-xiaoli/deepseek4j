package top.rongxiaoli.deepseek4j.consts.deepseek;

public class DeepseekApiProvider {
    public static final String BASE_URL = "https://api.deepseek.com";
    /**
     * 根据输入的上下文，来让模型补全对话内容。
     */
    public static final String CHAT_COMPLETIONS = BASE_URL + "/chat/completions";
    /**
     * FIM（Fill-In-the-Middle）补全 API。<br/>
     * 用户需要设置 {@code base_url="https://api.deepseek.com/beta"} 来使用此功能。
     */
    public static final String FIM_COMPLETIONS = BASE_URL + "/beta/completions";
    /**
     * 列出可用的模型列表，并提供相关模型的基本信息。请前往<a href="https://api-docs.deepseek.com/zh-cn/quick_start/pricing">模型 & 价格</a>查看当前支持的模型列表。
     */
    public static final String MODELS = BASE_URL + "/models";
    /**
     * 查询账号余额
     */
    public static final String BALANCE = BASE_URL + "/user/balance";
}
