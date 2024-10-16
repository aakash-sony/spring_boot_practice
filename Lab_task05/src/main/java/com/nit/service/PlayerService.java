package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.sbean.Player;

@Service
public class PlayerService {
	@Autowired
	private Player player;

	public PlayerService(Player player) {
		super();
		this.player = player;
	}

	public void displayPlayerInfo() {
		System.out.println("Player Id: " + player.getPlayerId());
		System.out.println("Player Name: " + player.getPlayerName());
		System.out.println("Player Number: " + player.getYearsNumber());
		System.out.println("Player Team Name: " + player.getTeamName());
	}
}
