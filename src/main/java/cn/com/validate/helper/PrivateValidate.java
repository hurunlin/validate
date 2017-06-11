/**
 * @Title: PrivateValidate
 * @Package cn.com.validate
 * @Description: 具体某一个接口的单个验证
 * @author hu.rl
 * @date 2017/6/11 15:31
 * @version V1.0
 */
package cn.com.validate.helper;

import cn.com.entity.dto.ValidateResult;
import cn.com.entity.vo.PayRequest;
import cn.com.enums.ErrorEnum;

/**
 * @author hu.rl
 * @ClassName: PrivateValidate
 * @Description: 具体某一个接口的单个验证
 * @date 2017/6/11 15:31
 */
public class PrivateValidate<E> extends BaseValidate {

    private E obj;

    /**
     * @throws
     * @Description: [接口私有验证]
     * @date 2017/6/11  16:14
     */
    public void priValidate(PayRequest request) {
        // 1、根据方法名具体验证实现
        ValidateResult<PayRequest> result = new ValidateResult<PayRequest>();
        result.setRespCode(ErrorEnum.DDEFULT_SUECCESS.getRespCode());
        result.setRespMsg(ErrorEnum.DDEFULT_SUECCESS.getRespMsg());
        result.setObj(request);
        // 2、将处理完成的结果赋值给obj
        obj = (E) result;
    }

    /**
     * @Description: [返回验证结果]
     * @date 2017/6/11  16:18
     */
    public E validateResult() {
        return obj;
    }
}
