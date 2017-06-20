/**
 * @Title: ValidateEnum
 * @Package cn.com.validate.enums
 * @Description: 所需严重类型
 * @author hu.rl
 * @date 2017/6/11 15:12
 * @version V1.0
 */
package cn.com.enums;

import java.util.List;

/**
 * @author hu.rl
 * @ClassName: ValidateEnum
 * @Description: 验证类型
 * @date 2017/6/11 15:12
 */
public enum ValidateEnum implements ValidateEnumInterface {
    MERCH("merch","商户验证"), MERCH_SIGN("merch_sign","");

    public String validateName;
    public String validateMessage;

    public List<Enum> list ;

    private ValidateEnum(String validateMessage,String validateName) {
    }





}
