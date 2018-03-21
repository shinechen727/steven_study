package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    MyInvocationHandler(Object obi){
        this.target = obi;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("beforeGetMethod>>>"+method.getName());
        Object result = method.invoke(target,args);
        System.out.println("afterGetMethod>>>"+method.getName());

        return result;
    }
}
