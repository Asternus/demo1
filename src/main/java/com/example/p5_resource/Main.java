package com.example.p5_resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();

        Resource systemFile = applicationContext.getResource("file:c:\\system.txt");
        Resource classpathFile = applicationContext.getResource("classpath:classpath.txt");
        Resource classpathFileAnotherVariant  = new ClassPathResource("classpath.txt", Main.class.getClassLoader());
        Resource rootFile = applicationContext.getResource("file:root.txt");
        Resource packageFile = applicationContext.getResource("file:src/main/java/com/example/p5_resource/package.txt");
        Resource urlResource = applicationContext.getResource("url:http://www.google.com");

        readFileThroughResource(classpathFile);
//        readFileThroughResource(classpathFileAnotherVariant);
//        readFileThroughResource(rootFile);
//        readFileThroughResource(packageFile);
//        readFileThroughResource(urlResource);
    }

    private static void readFileThroughResource(Resource resource) {
        try {
            InputStream is = resource.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
