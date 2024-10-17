package com.nt.model;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("menu")
@Setter
@ToString
@ConfigurationProperties(prefix = "menu")
public class MenuItem {

	private Float dosaPrice;

	private Float idlyPrice;

	private Float pohaPrice;

	private Float vadaPaoPrice;
}
