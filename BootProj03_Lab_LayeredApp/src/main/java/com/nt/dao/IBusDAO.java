package com.nt.dao;

import java.util.List;

import com.nt.model.Bus;

public interface IBusDAO {
	int insertBus(Bus bus);

	List<Bus> getAllBuses();
}
