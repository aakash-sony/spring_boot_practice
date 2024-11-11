package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.BusOperationController;

@SpringBootApplication
public class BootProj03LabLayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj03LabLayeredAppApplication.class, args);

		BusOperationController controller = ctx.getBean(BusOperationController.class);

		controller.addBus();
		controller.retrieveAllBus();

	}

}
