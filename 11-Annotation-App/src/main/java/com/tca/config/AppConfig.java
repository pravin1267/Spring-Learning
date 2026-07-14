package com.tca.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tca.model.Student;

@Configuration
@ComponentScan("com.tca")
public class AppConfig {
     @Bean
     Map<String,Student> getStudentStore(){
    	 Map<String,Student> hmob = new HashMap<>();
    	 
    	 Student s1= new Student("Sachin","new Sangavi",80.5);
         Student s2 = new Student("Sourabh","old sangavi",99.5);
    	 
    	 hmob.put("sb-1", s1);
    	 hmob.put("sb-2", s2);
    	 
    	 return hmob;
     }
}
