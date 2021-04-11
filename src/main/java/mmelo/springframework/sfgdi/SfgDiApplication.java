package mmelo.springframework.sfgdi;

import mmelo.springframework.sfgdi.controllers.*;
import mmelo.springframework.sfgdi.services.ProtoTypeBean;
import mmelo.springframework.sfgdi.services.SingletonBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    /*
     * public static void main(String[] args) {
     * SpringApplication.run(SfgDiApplication.class, args); }
     */

    // Código para capturar o contexto e utilizá-lo em comand line.
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        String gretting = myController.sayHello();
        System.out.println(gretting);

        System.out.println("-------Property----------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
                .getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------Setter----------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
                .getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------Constructor----------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
                .getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("-------Profile----------");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayGreeting());

        System.out.println("-------Scope Singleton----------");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());

        System.out.println("-------Scope Singleton----------");
        ProtoTypeBean protoTypeBean1 = ctx.getBean(ProtoTypeBean.class);
        System.out.println(protoTypeBean1.getProtoTypeBean());
        ProtoTypeBean protoTypeBean2 = ctx.getBean(ProtoTypeBean.class);
        System.out.println(protoTypeBean2.getProtoTypeBean());
    }
}
