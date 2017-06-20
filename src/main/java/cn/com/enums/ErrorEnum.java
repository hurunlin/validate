/**
 * @Title: ErrorEnum
 * @Package cn.com.enums
 * @Description: 错误码
 * @author hu.rl
 * @date 2017/6/11 16:43
 * @version V1.0
 */
package cn.com.enums;

/**
 * @author hu.rl
 * @ClassName: ErrorEnum
 * @Description: 错误码枚举类
 * @date 2017/6/11 16:43
 */
public enum ErrorEnum implements ValidateEnumInterface{
    // 默认系统返回成功
    DDEFULT_SUECCESS("000000", "成功");

    private String respCode;
    private String respMsg;

    private ErrorEnum(String respCode, String respMsg) {
        this.respCode = respCode;
        this.respMsg = respMsg;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public static String getRespMsg(String respCode) {
        for (ErrorEnum c : ErrorEnum.values()) {
            if (c.getRespCode().equals(respCode)) {
                return c.getRespMsg();
            }
        }
        return null;
    }
}
