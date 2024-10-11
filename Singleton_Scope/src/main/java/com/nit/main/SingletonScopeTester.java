package com.nit.main;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.confg.AppConfig;
import com.nit.sbean.WishMessageGenerator;

public class SingletonScopeTester {
	public static void main( String[] args )
    {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       
       WishMessageGenerator bean1 = ctx.getBean(WishMessageGenerator.class);
       
       WishMessageGenerator bean2 = ctx.getBean(WishMessageGenerator.class);
       
       System.out.println(bean1.hashCode()==bean2.hashCode());
       
       LocalDate lt1 = ctx.getBean(LocalDate.class);
       LocalDate lt2 = ctx.getBean(LocalDate.class);
       
       System.out.println(lt1.hashCode()==lt2.hashCode());
       
       ctx.close();
    }
}
