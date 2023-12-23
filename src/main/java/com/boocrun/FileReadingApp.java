package com.boocrun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class FileReadingApp {
  
  @Bean
  static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer () {
    return new PropertySourcesPlaceholderConfigurer();
  }
  
  public static void main (String[] args) {
    
    ApplicationContext context = new AnnotationConfigApplicationContext(FileReadingApp.class);
    
    FileProcessorService fps = (FileProcessorService) context.getBean("fileProcessorService");
       
    fps.processFile();
    
  }

}
