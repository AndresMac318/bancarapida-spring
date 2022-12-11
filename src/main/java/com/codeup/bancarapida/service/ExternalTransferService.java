package com.codeup.bancarapida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeup.bancarapida.entity.External_Transaction;
import com.codeup.bancarapida.repository.ExternalTransferRepository;

@Service
public class ExternalTransferService {
	
	@Autowired
	private ExternalTransferRepository externalTransferRepository;
	
	public List<External_Transaction> findAll(){
		return externalTransferRepository.findAll();
	}
	
	public External_Transaction save(External_Transaction external_transaction) {
		return externalTransferRepository.save(external_transaction);
	}
	
	public External_Transaction get(Integer id) {
		return externalTransferRepository.getReferenceById(id);
	}
	
	public void delete(Integer id) {
		externalTransferRepository.deleteById(id);
	}
	
}
