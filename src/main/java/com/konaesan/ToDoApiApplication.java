package com.konaesan;

import com.konaesan.service.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;


@SpringBootApplication
public class ToDoApiApplication
{

    @Bean
    RmiProxyFactoryBean rmiProxy()
    {
        RmiProxyFactoryBean bean = new RmiProxyFactoryBean();
        bean.setServiceInterface(TaskService.class);
        bean.setServiceUrl("rmi://localhost:1099/ToDoPersistence");

        return bean;
    }


    public static void main(String[] args)
    {
        SpringApplication.run(ToDoApiApplication.class, args);
    }

}
