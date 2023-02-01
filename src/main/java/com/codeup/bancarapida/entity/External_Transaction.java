package com.codeup.bancarapida.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

//import java.time.LocalDateTime;

@Entity
@Table(name="extenaltransfer")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class External_Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer idAccount;
	@Column
	private String EANumber;
	@Column
	private String transactionType;
	@Column
	private String EAType;
	@Column
	private Integer amount = 0;
    //@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-5")
    //https://programmerclick.com/article/6994892329/

	@Column
	private Date date;
	@Column
	private String status;
	@Column
	private String EAOwnerName;
	@Column
	private String EAOwnerId;
	@Column
	private String EAOwnerIdType;
	@Column
	private String description;
	@Column
	private String bankName;
    
    public External_Transaction() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public void setEANumber(String EANumber) {
		this.EANumber = EANumber;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getEAType() {
		return EAType;
	}

	public void setEAType(String EAType) {
		this.EAType = EAType;
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

	public void setEAOwnerName(String EAOwnerName) {
		this.EAOwnerName = EAOwnerName;
	}

	public String getEAOwnerId() {
		return EAOwnerId;
	}

	public void setEAOwnerId(String EAOwnerId) {
		this.EAOwnerId = EAOwnerId;
	}

	public String getEAOwnerIdType() {
		return EAOwnerIdType;
	}

	public void setEAOwnerIdType(String EAOwnerIdType) {
		this.EAOwnerIdType = EAOwnerIdType;
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
