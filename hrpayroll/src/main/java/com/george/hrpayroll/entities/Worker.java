package com.george.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double dailyIncome;

	public Worker() {

	}

	public Worker(Long id, String name, Double dailyIncome) {
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

}
