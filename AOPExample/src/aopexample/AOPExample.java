/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aopexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Mac
 */
public class AOPExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Resource resource= new ClassPathResource("bean.xml");
        BeanFactory factory= new XmlBeanFactory(resource);
        A a= factory.getBean("proxy", A.class);
        System.out.println("proxy class name: "+a.getClass().getName());  
        a.m();
    }
    
}
