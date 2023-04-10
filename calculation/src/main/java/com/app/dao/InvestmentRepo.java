package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojo.Investment;

public interface InvestmentRepo extends JpaRepository<Investment, Integer> {
	@Query(value = "SELECT SUM(total_amount) FROM Investment", nativeQuery = true)
	Integer getTotalInvestment();
}
