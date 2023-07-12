package com.aml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.AlertedTransactions;
@Repository
public interface AlertedTranactionsRepo extends JpaRepository<AlertedTransactions, Integer>{
	public List<AlertedTransactions> findByDataId(Integer dataid);
}

 
 