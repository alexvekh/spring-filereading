package com.boocrun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class FileReadingApp {
  
  public static void main (String[] args) {
    
    ApplicationContext context = new AnnotationConfigApplicationContext(FileReadingApp.class);
    
    FileProcessorService fps = (FileProcessorService) context.getBean("fileProcessorService");
       
    fps.processFile();
    
  }

}
