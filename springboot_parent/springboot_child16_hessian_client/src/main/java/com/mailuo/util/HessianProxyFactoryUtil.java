package com.mailuo.util;

import com.caucho.hessian.client.HessianProxyFactory;

/**
 * @Author jinwenqi
 * @Date 18:07 2019/6/26
 * @Project SpringBoot
 * @Description
 **/
public class HessianProxyFactoryUtil {

    /**
     *  获取调用端对象
     * @param clazz 实体对象泛型
     * @param url 客户端url地址
     * @param <T>
     * @return 业务对象
     */
    public static <T> T getHessianClientBean(Class<T> clazz,String url) throws Exception
    {
        // 客户端连接工厂,这里只是做了最简单的实例化，还可以设置超时时间，密码等安全参数
        HessianProxyFactory factory = new HessianProxyFactory();

        return (T)factory.create(clazz,url);
    }


}
