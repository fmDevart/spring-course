package helloworld;
import helloworld.HelloWorldConfig.Address;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(  HelloWorldConfig.class);

        System.out.println( context.getBean("person") );


        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));


    }

}
