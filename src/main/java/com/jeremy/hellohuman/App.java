package com.jeremy.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
public class App {
        public static void main(String[] args) {
                SpringApplication.run(App.class, args);
        }
        
        // 1. Annotation
        @RequestMapping("/")
        // 3. Method that maps to the request route above
        public String hellohuman(@RequestParam(value="name", required = false) String name) { // 3
        		if (name == null) {
        			name = "Human";
        		}
                return "Hello" + " " + name;
        } 
}
