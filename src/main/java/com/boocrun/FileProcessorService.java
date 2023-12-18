package com.boocrun;

import java.util.List;

public class FileProcessorService {
  
  FileReadingService frs;
  
  public void processFile() {
    
    List<String> lines = frs.readFile("autosales.csv");
    for (String line : lines) {
      System.out.println(line);
    }
   
  }

}
