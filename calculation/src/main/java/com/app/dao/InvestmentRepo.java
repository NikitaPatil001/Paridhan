package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Investment;

public interface InvestmentRepo extends JpaRepository<Investment, Integer> {

}
