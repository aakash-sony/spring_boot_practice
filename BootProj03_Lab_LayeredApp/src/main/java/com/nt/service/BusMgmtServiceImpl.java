package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IBusDAO;
import com.nt.model.Bus;

@Service
public class BusMgmtServiceImpl implements IBusMgmtService {

	@Autowired
	private IBusDAO busDAO;

	@Override
	public String registerBus(Bus bus) {

		int count = busDAO.insertBus(bus);
		return count == 0 ? "Bus Registration Failed" : "Bus Registered Successfully..";
	}

	@Override
	public List<Bus> fetchAllBuses() {
		return busDAO.getAllBuses();
	}

}
