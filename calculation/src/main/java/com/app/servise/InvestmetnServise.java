package com.app.servise;

import java.util.List;

import com.app.pojo.Investment;

public interface InvestmetnServise {
	Investment addItem(Investment investment);

	String deleteItem(Integer id);

	Investment updateItem(Investment item);

	Integer getTotalInvestment();

	List<Investment> getTotalList();
}
