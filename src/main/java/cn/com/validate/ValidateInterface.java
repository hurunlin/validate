/**
 * @Title: ValidateInterface
 * @Package cn.com.validate
 * @Description: 验证接口
 * @author hu.rl
 * @date 2017/6/11 15:55
 * @version V1.0
 */
package cn.com.validate;

/**
 * @author hu.rl
 * @ClassName: ValidateInterface
 * @Description: 验证接口
 * @date 2017/6/11 15:55
 */
public interface ValidateInterface<T, E> {

    /**
     * @Description: [公共验证方法]
     * @date 2017/6/11  16:03
     */
    public <E> Object publicValidate();

    /**
     * 私有验证
     * @param <E>
     * @return
     */
    public <E> Object privateValidate();


}
