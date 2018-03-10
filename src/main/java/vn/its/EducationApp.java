package vn.its;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.its.service.StudentService;

public class EducationApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        StudentService service =  applicationContext.getBean("studentService", StudentService.class);
        System.out.println(service.getAllStudent().size());
    }
}
