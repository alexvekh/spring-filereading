package com.boocrun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileProcessorService {
  
  @Autowired
  FileReadingService frs;
  
  public void processFile(@Value("${report.filename}") String filename) {
    List<String> lines = frs.readFile(filename);
    for (String line : lines) {
      System.out.println(line);
    }
   
  }

}
