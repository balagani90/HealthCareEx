package com.rk.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "appointment_tab")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="app_doc_id_fk_col")
	private Doctor doctor;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="app_dte_col")
	private Date date;
	
	@Column(name="app_slots_col")
	private Integer noOfSlots;
	
	@Column(name="app_dtls_col")
	private String details;
	
	@Column(name="app_amt_col")
	private Double fee;

	public Appointment() {
		super();
	}
	
	public Appointment(Long id, Doctor doctor, Date date, Integer noOfSlots, String details, Double fee) {
		super();
		this.id = id;
		this.doctor = doctor;
		this.date = date;
		this.noOfSlots = noOfSlots;
		this.details = details;
		this.fee = fee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getNoOfSlots() {
		return noOfSlots;
	}

	public void setNoOfSlots(Integer noOfSlots) {
		this.noOfSlots = noOfSlots;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}
	
}
