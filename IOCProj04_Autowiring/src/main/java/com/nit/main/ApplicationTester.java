package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confgs.AppConfig;
import com.nit.sbeans.Vehicle;

public class ApplicationTester
{
    public static void main(String[] args) 
    {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Vehicle vehicle = ctx.getBean(Vehicle.class);
        
        vehicle.getService().engineChecking();
        
        ctx.close();
    }
}
