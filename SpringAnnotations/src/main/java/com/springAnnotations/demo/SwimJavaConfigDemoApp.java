package com.springAnnotations.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("swimCoach",SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call our new coach methods ... has the props values injected
        System.out.println("email: " + ((SwimCoach) theCoach).getEmail());
        System.out.println("team: " + ((SwimCoach) theCoach).getTeam());

        // close the context
        context.close();
    }
}

