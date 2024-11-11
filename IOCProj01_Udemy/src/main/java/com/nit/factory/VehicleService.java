package com.nit.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.sbeans.ISpeaker;
import com.nit.sbeans.ITyre;

@Component
public class VehicleService {

//	@Autowired
	private ISpeaker speaker;

	@Autowired
	private ITyre tyre;

	public ISpeaker getSpeaker() {
		return speaker;
	}

	@Autowired
	public void setSpeaker(ISpeaker speaker) {
		this.speaker = speaker;
	}

	public ITyre getTyre() {
		return tyre;
	}

	
	public void setTyre(ITyre tyre) {
		this.tyre = tyre;
	}

	public void playMusic() {
		speaker.makeSound();
	}

	public void moveVehicle() {
		tyre.rotate();
	}

}
