/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwadvisor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Mac
 */
public class Test {

    public static void main(String[] args) {
        Resource r = new ClassPathResource("bean.xml");
        BeanFactory factory = new XmlBeanFactory(r);
        Validator v = factory.getBean("proxy", Validator.class);
        try {
            v.validate(12);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
