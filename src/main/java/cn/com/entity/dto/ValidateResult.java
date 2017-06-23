/**
 * @Title: ValidateResult
 * @Package cn.com.entity
 * @Description: 验证结果
 * @author hu.rl
 * @date 2017/6/11 16:08
 * @version V1.0
 */
package cn.com.entity.dto;

import cn.com.entity.vo.PubRequest;

/**
 * @author hu.rl
 * @ClassName: ValidateResult
 * @Description: 验证结果
 * @date 2017/6/11 16:08
 */
public class ValidateResult<T> extends PubRequest {
    // 验证类型
    public String type;
    // 返回异常码
    public String respCode;
    // 返回异常描述
    public String respMsg;
    // 返回泛型对象
    public T obj;

    public ValidateResult() {
    }

    public ValidateResult(String type, T obj) {
        this.type = type;
        this.obj = obj;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
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
}
