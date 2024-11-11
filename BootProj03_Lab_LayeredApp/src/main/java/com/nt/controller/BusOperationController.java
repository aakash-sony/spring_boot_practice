package com.nt.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Bus;
import com.nt.service.IBusMgmtService;

@Controller
public class BusOperationController {

	Scanner scanner = new Scanner(System.in);
	@Autowired
	private IBusMgmtService service;

	public void addBus() {
		System.out.print("Enter bus number: ");
		String busNum = scanner.nextLine();

		System.out.print("Enter bus name: ");
		String busName = scanner.nextLine();

		System.out.print("Enter bus color: ");
		String busColor = scanner.nextLine();

		System.out.print("Enter ticket Price: ");
		double price = scanner.nextDouble();

		System.out.print("Enter bus pickup point: ");
		String pickup = scanner.nextLine();
		pickup = scanner.nextLine();

		System.out.print("Enter bus drop point: ");
		String drop = scanner.nextLine();

		Bus bus = new Bus();
		bus.setBus_number(busNum);
		bus.setBus_name(busName);
		bus.setBus_color(busColor);
		bus.setTicket_price(price);
		bus.setStartFrom(pickup);
		bus.setEndsTo(drop);

		String result = service.registerBus(bus);
		System.out.println(result);
	}

	public void retrieveAllBus() {
		System.out.println("\nAll bus Details:- \n");
		List<Bus> fetchAllBuses = service.fetchAllBuses();
		fetchAllBuses.forEach(bus -> {
			System.out.println(bus.getBus_number() + " " + bus.getBus_name() + " " + bus.getBus_color() + " "
					+ bus.getTicket_price() + " " + bus.getStartFrom() + " " + bus.getEndsTo());
		});
	}
}
