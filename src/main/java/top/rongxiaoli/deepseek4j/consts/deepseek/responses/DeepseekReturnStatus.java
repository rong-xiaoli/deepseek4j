package top.rongxiaoli.deepseek4j.consts.deepseek.responses;


/**
 * Return code enum.
 */
public enum DeepseekReturnStatus {
    /**
     * Normal code.
     */
    NORMAL,
    /**
     * <b>原因</b>：请求体格式错误<br/>
     * <b>解决方法</b>：请根据错误信息提示修改请求体
     */
    FORMAT_ERROR(400),
    /**
     * <b>原因</b>：API key 错误，认证失败<br/>
     * <b>解决方法</b>：请检查您的 API key 是否正确，如没有 API key，请先 <a href="https://platform.deepseek.com/api_keys">创建 API key</a>
     */
    AUTHENTICATION_ERROR(401),
    /**
     * <b>原因</b>：账号余额不足<br/>
     * <b>解决方法</b>：请确认账户余额，并前往 <a href="https://platform.deepseek.com//top_up">充值</a> 页面进行充值
     */
    BALANCE_NOT_ENOUGH(402),
    /**
     * <b>原因</b>：请求体参数错误 <br/>
     * <b>解决方法</b>：请根据错误信息提示修改相关参数
     */
    PARAMETER_ERROR(422),
    /**
     * <b>原因</b>：请求速率（TPM 或 RPM）达到上限 <br/>
     * <b>解决方法</b>：请合理规划您的请求速率。
     */
    REQUEST_REACH_LIMIT(429),
    /**
     * <b>原因</b>：服务器内部故障 <br/>
     * <b>解决方法</b>：请等待后重试。若问题一直存在，请联系 <a href="mailto:api-service@deepseek.com">我们</a> 解决。
     */
    SERVER_INTERNAL_ERROR(500),
    /**
     * <b>原因</b>：服务器负载过高 <br/>
     * <b>解决方法</b>：请稍后重试您的请求
     */
    SERVICE_UNAVAILABLE(503),
    /**
     * Page (API endpoint) not found.
     */
    PAGE_NOT_FOUND(404);
    final int statusCode;

    /**
     * Initialize method with customized response code.
     * @param code Return code.
     */
    DeepseekReturnStatus(int code) {
        statusCode = code;
    }

    /**
     * Initialize method with default code 200.
     */
    DeepseekReturnStatus() {
        statusCode = 200;
    }
    public static DeepseekReturnStatus cast(int code) {
        switch (code) {
            case 200:
                return NORMAL;
            case 400:
                return FORMAT_ERROR;
            case 401:
                return AUTHENTICATION_ERROR;
            case 402:
                return BALANCE_NOT_ENOUGH;
            case 422:
                return PARAMETER_ERROR;
            case 429:
                return REQUEST_REACH_LIMIT;
            case 500:
                return SERVER_INTERNAL_ERROR;
            case 503:
                return SERVICE_UNAVAILABLE;
            case 404:
                return PAGE_NOT_FOUND;
            default:
                throw new IllegalArgumentException("Got input value: " + code + ", expected value in possible values: [200, 400, 401, 402, 422, 429, 500, 503, 404]");
        }
    }
    public int getStatusCode() {
        return statusCode;
    }
}