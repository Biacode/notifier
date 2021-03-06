package com.sflpro.notifier.api.web;

import com.sflpro.notifier.DirectNotificationProcessorConfiguration;
import com.sflpro.notifier.queue.producer.ProducerConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Company: SFL LLC
 * Created on 03/12/2017
 *
 * @author Davit Harutyunyan
 */
@SpringBootApplication
@PropertySource(value = "classpath:application.properties")
@Import({ProducerConfiguration.class, DirectNotificationProcessorConfiguration.class})
@ComponentScan(basePackages = "com.sflpro.notifier")
public class NotifierApiApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(NotifierApiApplication.class).run(args);
    }
}