package fthtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class FileReadingTest {
public static void main(String[] args) throws IOException {
    FileReadingTest fr = new FileReadingTest();
   fr.doesFileExist(null);  

   Properties prop = fr.readFile("src\\fthtest\\data.properties");
   Set<Object> keys=prop.keySet();
   for(Object key:keys) {
     String values= (String)prop.get(key);
     String[] valArrays= values.split(",");
     System.out.println(key+": ");
     for(String val:valArrays) {
         System.out.println(val);
     }
   }

 
   System.out.println("Take: "+ prop.getProperty("Take"));
}

public void doesFileExist(String path) {
   
	File f = new File("src\\fthtest\\data.properties");

       if (f.exists()) {
        System.out.println("Exists");
       }else System.out.println("Does not Exists");
 
   
}

public Properties readFile(String filePath) throws IOException {
    File f = new File(filePath);
    FileInputStream fileInput = new FileInputStream(f);
   
    Properties prop = new Properties();
    prop.load(fileInput);
    return prop;
}
}
