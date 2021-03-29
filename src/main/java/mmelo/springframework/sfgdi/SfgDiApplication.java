package mmelo.springframework.sfgdi;

import mmelo.springframework.sfgdi.controllers.MyController;
import mmelo.springframework.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    /*public static void main(String[] args) {
        SpringApplication.run(SfgDiApplication.class, args);
    }*/

    //Código para capturar o contexto e utilizá-lo em comand line.
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        String gretting = myController.sayHello();
        System.out.println(gretting);

        System.out.println("-------Property----------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
    }
}
