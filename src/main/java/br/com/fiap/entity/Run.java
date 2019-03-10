package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_RUN")
@SequenceGenerator(name="RUN",sequenceName="SQ_T_RUN",allocationSize=1)
public class Run {
	@Id
	@Column(name="RUN_ID")
	@GeneratedValue(generator="RUN",strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="RUN_START",length=150)
	private String start;
	@Column(name="RUN_DESTINATION",length=150)
	private String destination;
	@Column(name="RUN_DT")
	@Temporal(TemporalType.DATE)
	private Calendar runDate;
	@Column(name="RUN_PRICE",nullable=false)
	private double price;
	public Run(int id, String start, String destination, Calendar runDate, double price) {
		super();
		this.id = id;
		this.start = start;
		this.destination = destination;
		this.runDate = runDate;
		this.price = price;
	}
	public Run() {
		super();
	}
	public Run(String start, String destination, Calendar runDate, double price) {
		super();
		this.start = start;
		this.destination = destination;
		this.runDate = runDate;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Calendar getRunDate() {
		return runDate;
	}
	public void setRunDate(Calendar runDate) {
		this.runDate = runDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
