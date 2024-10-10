package com.nit.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;

public class MainTester {
    @SuppressWarnings({ "resource" })
	public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter language name: ");
        String lang = scanner.nextLine();
        System.out.print("Enter country code: ");
        String country = scanner.nextLine();
        
        Locale locale = new Locale(lang,country);
        
        String msg1 = ctx.getMessage("welcome.msg",new Object[]{}, locale);
        String msg2 = ctx.getMessage("goodbye.msg",new Object[]{}, locale);
        String msg3 = ctx.getMessage("application.title",new Object[]{}, locale);
        String msg4 = ctx.getMessage("wish.message",new Object[]{}, locale);
        
        System.out.println(msg1+" "+msg2+" "+msg3+" "+msg4);
        
        ctx.close();
    }
}
