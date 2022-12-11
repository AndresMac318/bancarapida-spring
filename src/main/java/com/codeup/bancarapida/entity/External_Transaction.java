package com.codeup.bancarapida.entity;

import java.util.Date;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import java.time.LocalDateTime;

@Entity
@Table(name="extenaltransfer")
public class External_Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idAccount;
    private String EANumber;
    private String transactioType;
    private String EAType;
    private Integer amount = 0;
    //@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-5")
    //https://programmerclick.com/article/6994892329/
    private Date date;
    private String status;
    private String EAOwnerName;
    private String EAOwnerId;
    private String EAOwnerType;
    private String description;
    private String bankName;
    
    public External_Transaction() {
    }

	public Integer getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}

	public String getEANumber() {
		return EANumber;
	}

	public void setEANumber(String eANumber) {
		EANumber = eANumber;
	}

	public String getTransactioType() {
		return transactioType;
	}

	public void setTransactioType(String transactioType) {
		this.transactioType = transactioType;
	}

	public String getEAType() {
		return EAType;
	}

	public void setEAType(String eAType) {
		EAType = eAType;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEAOwnerName() {
		return EAOwnerName;
	}

	public void setEAOwnerName(String eAOwnerName) {
		EAOwnerName = eAOwnerName;
	}

	public String getEAOwnerId() {
		return EAOwnerId;
	}

	public void setEAOwnerId(String eAOwnerId) {
		EAOwnerId = eAOwnerId;
	}

	public String getEAOwnerType() {
		return EAOwnerType;
	}

	public void setEAOwnerType(String eAOwnerType) {
		EAOwnerType = eAOwnerType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
    
    

}
