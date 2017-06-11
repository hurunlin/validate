/**
 * @Title: PubValidate
 * @Package cn.com.validate
 * @Description: 全局验证
 * @author hu.rl
 * @date 2017/6/11 15:30
 * @version V1.0
 */
package cn.com.validate.helper;

import cn.com.entity.dto.ValidateResult;
import cn.com.entity.vo.PayRequest;
import cn.com.enums.ErrorEnum;

/**
 * @author hu.rl
 * @ClassName: PubValidate
 * @Description: 全局验证
 * @date 2017/6/11 15:30
 */
public class PublicValidate<E> extends BaseValidate {

    private E obj;

    /**
     * @throws
     * @Description: [接口私有验证]
     * @date 2017/6/11  16:14
     */
    public void pubValidate(PayRequest request) {
        // 1、根据方法名具体验证实现
        ValidateResult<PayRequest> result = new ValidateResult<PayRequest>();
        result.setRespCode(ErrorEnum.DDEFULT_SUECCESS.getRespCode());
        result.setRespMsg(ErrorEnum.DDEFULT_SUECCESS.getRespMsg());
        result.setObj(new PayRequest());
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
