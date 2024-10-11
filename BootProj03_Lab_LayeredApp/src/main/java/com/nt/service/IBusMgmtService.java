package com.nt.service;

import java.util.List;

import com.nt.model.Bus;

public interface IBusMgmtService {
	String registerBus(Bus bus);

	List<Bus> fetchAllBuses();
}
