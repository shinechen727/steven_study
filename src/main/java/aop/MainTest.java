package aop;

import java.lang.reflect.Proxy;

public class MainTest {
    public static void main (String[] args){

        UserService userService = new UserServiceImpl();
        MyInvocationHandler myinvocation  = new MyInvocationHandler(userService);
        UserService proxyUserService = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),userService.getClass().getInterfaces(),myinvocation);
        proxyUserService.getName(10);
    }
}
