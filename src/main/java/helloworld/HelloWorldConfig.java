package helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    record Person(String name, int age){}
    record  Address(String street, String city){}

    @Bean
    public String name(){
        return "Francesco";
    }

    @Bean
    public  Person person(){
        return new Person("Paolino",27);
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean(name = "address2")
    public Address address(){
        return new Address("Baker Street","London");

    }


}
