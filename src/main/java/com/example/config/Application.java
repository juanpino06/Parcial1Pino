package com.example.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    private Application() {

    }

    public static AnnotationConfigApplicationContext getContext() {
        return context;
    }
}