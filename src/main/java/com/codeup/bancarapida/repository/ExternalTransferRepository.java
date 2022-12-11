package com.codeup.bancarapida.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeup.bancarapida.entity.External_Transaction;

@Repository
public interface ExternalTransferRepository extends JpaRepository<External_Transaction, Integer> {
	
}
