/**
 * @Title: ValidateInterfaceImpl
 * @Package cn.com.validate.impl
 * @Description: 验证实现类
 * @author hu.rl
 * @date 2017/6/11 16:04
 * @version V1.0
 */
package cn.com.validate.impl;

import cn.com.entity.dto.ValidateResult;
import cn.com.entity.vo.PayRequest;
import cn.com.enums.ErrorEnum;
import cn.com.validate.ValidateInterface;
import cn.com.validate.helper.PrivateValidate;
import cn.com.validate.helper.PublicValidate;

/**
 * @author hu.rl
 * @ClassName: ValidateInterfaceImpl
 * @Description: 验证实现类
 * @date 2017/6/11 16:04
 */
public class ValidateInterfaceImpl<T, E> implements ValidateInterface {

    public Object validate(Object obj) {
        // 获取对象
        PayRequest request = (PayRequest) obj;
        // 获取请求的类型
        String method = request.getMethod();
        //  根据接口名验证公共验证
        PublicValidate<ValidateResult> publicValidate = new PublicValidate<ValidateResult>();
        publicValidate.pubValidate(request);
        // 获取公共验证结果
        ValidateResult pubResult = publicValidate.validateResult();
        // 成功
        if (!ErrorEnum.DDEFULT_SUECCESS.getRespCode().equals(pubResult.getRespCode())) {
            return pubResult;
        }
        // 根据接口名验证部分验证
        PrivateValidate<ValidateResult> privateValidate = new PrivateValidate<ValidateResult>();
        privateValidate.priValidate(request);
        // 获取私有验证结果
        ValidateResult priResult = privateValidate.validateResult();
        if (ErrorEnum.DDEFULT_SUECCESS.getRespCode().equals(priResult.getRespCode())) {
            // 返回请求对象
            return priResult;
        }
        // 封装默认异常报文
        return null;
    }
}
