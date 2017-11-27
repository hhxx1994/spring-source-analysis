package com.hhx.beans.factory;

import com.interface21.beans.factory.xml.XmlBeanFactory;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;

/**
 * @author haoxing_h
 */
public class BeanFactoryTest {

    @Test
    public void testXmlBeanFactory() {
        InputStream inputStream = BeanFactoryTest.class.getClassLoader()
            .getResourceAsStream("tinyioc.xml");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(inputStream);
        HelloWorldService helloWorldService = (HelloWorldService) xmlBeanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();

    }

}
