package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.pojo.Sell;

@Repository
public interface SellRepo extends JpaRepository<Sell, Integer> {
	@Query(value = "SELECT SUM(total_amount) FROM sell", nativeQuery = true)
	Integer getTotalSell();
}
