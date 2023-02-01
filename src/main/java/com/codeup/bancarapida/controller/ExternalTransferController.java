package com.codeup.bancarapida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeup.bancarapida.entity.External_Transaction;
import com.codeup.bancarapida.service.ExternalTransferService;

@RestController
@RequestMapping("/api")
public class ExternalTransferController {

	@Autowired
	private ExternalTransferService externalTransferService;

	@PostMapping("/create_ext_transaction")
	public ResponseEntity<External_Transaction> save(@RequestBody External_Transaction external_transaction ){
		return new ResponseEntity<>(externalTransferService.save(external_transaction), HttpStatus.CREATED);
	}
	
	@GetMapping(value="/get_ext_transactions")
	public ResponseEntity<List<External_Transaction>> findAllTransactions(){
		return new ResponseEntity<>(externalTransferService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value="get_ext_transaction/{id}")
	public ResponseEntity<External_Transaction> findById(@PathVariable Integer id){
		return new ResponseEntity(externalTransferService.get(id), HttpStatus.OK);
	}
	
	@DeleteMapping("del_ext_transaction/{id}")
	public ResponseEntity delete(@PathVariable Integer id) {
		externalTransferService.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
