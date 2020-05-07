package com.github.alxbel.sia2.ch1.knight;
import com.github.alxbel.sia2.ch1.knight.model.Knight;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class KnightApp {
    public static void main(String[] args) throws Exception {
        //BeanFactory factory =
        //        new XmlBeanFactory(new FileSystemResource("hello.xml"));


        ClassPathResource resource = new ClassPathResource("knight.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Knight knight = (Knight) factory.getBean("knight");
        knight.embarkOnQuest();
    }
}