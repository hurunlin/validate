/**
 * @Title: test
 * @Package cn.com.validate
 * @Description:
 * @author hu.rl
 * @date 2017/6/11 15:06
 * @version V1.0
 */
package cn.com;

import cn.com.entity.dto.ValidateResult;
import cn.com.entity.vo.PayRequest;
import cn.com.validate.ValidateInterface;
import cn.com.validate.impl.ValidateInterfaceImpl;

/**
 * @ClassName: test
 * @Description:
 * @author hu.rl
 * @date 2017/6/11 15:06
 */
public class Test {

    public static void main(String[] args) {
        ValidateInterface validateInterface = new ValidateInterfaceImpl();
        ValidateResult result = (ValidateResult) validateInterface.validate(new PayRequest());
        System.out.println(result.getRespCode());
        System.out.println(result.getRespMsg());
    }
}
