package com.boocrun;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FileProcessorService {
  
  FileReadingService frs;
  
  public void processFile() {
    frs = new FileReadingService();
    List<String> lines = frs.readFile("../crimes.csv");
    for (String line : lines) {
      System.out.println(line);
    }
   
  }

}
