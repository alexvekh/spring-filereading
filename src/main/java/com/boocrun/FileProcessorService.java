package com.boocrun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileProcessorService {
  
  @Autowired
  FileReadingService frs;
  
  public void processFile() {
    // frs = new FileReadingService(); // now Autowired
    List<String> lines = frs.readFile("../crimes.csv");
    for (String line : lines) {
      System.out.println(line);
    }
   
  }

}
