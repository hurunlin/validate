/**
 * @Title: CommonPackage
 * @Package cn.com.utils
 * @Description: 全局封包
 * @author hu.rl
 * @date 2017/6/23 21:49
 * @version V1.0
 */
package cn.com.support;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author hu.rl
 * @ClassName: CommonPackage
 * @Description: 全局封包
 * @date 2017/6/23 21:49
 */
public class CommonPackage {

    /**
     * 默认返回数据
     *
     * @param object
     * @return
     */
    public static JSONObject commonPackage(Object object) {
        JSONObject resultJson = new JSONObject();
        if (object == null) {

        }
        return resultJson;
    }

    /**
     * @param body:主体数据
     * @param head:公共数据
     * @Description: [打包方法]
     * @date 2017/6/23  21:52
     */
    public static JSONObject packJson(String body, String head) throws Exception {
        JSONObject packJson = new JSONObject();
        JSONObject headJson = new JSONObject();
        packJson.put("head", headJson);
        packJson.put("body", JSONObject.parseObject(head));
        return packJson;
    }


}
