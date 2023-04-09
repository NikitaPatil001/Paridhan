package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Sell;

@Repository
public interface SellRepo extends JpaRepository<Sell, Integer> {

}
