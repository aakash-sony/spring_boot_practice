package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menu")
@Data
public class MenuItem {
	@Value("${menu.dosaPrice}")
	private Float dosaPrice;
	@Value("${menu.idlyPrice}")
	private Float idlyPrice;
	@Value("${menu.pohaPrice}")
	private Float pohaPrice;
	@Value("${menu.vadaPaoPrice}")
	private Float vadaPaoPrice;
}
