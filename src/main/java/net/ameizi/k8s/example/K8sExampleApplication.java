package net.ameizi.k8s.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class K8sExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sExampleApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello,Skaffold!";
    }
}
