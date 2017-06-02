/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aopexample;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Mac
 */
public class MyAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] os, Object target) throws Throwable {
        System.out.println("additional concern before actual logic");
        System.out.println("method info:" + method.getName() + " " + method.getModifiers());
        System.out.println("argument info:");
        for (Object arg : os) {
            System.out.println(arg);
        }
        System.out.println("target Object:" + target);
        System.out.println("target object class name: " + target.getClass().getName());
    }

}
