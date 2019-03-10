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
@Table(name="T_PAYMENT")
@SequenceGenerator(name="PAYMENT",sequenceName="SQ_T_PAYMENT",allocationSize=1)
public class Payment {
	@Id
	@Column(name="PAYMENT_ID")
	@GeneratedValue(generator="PAYMENT",strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="PAYMENT_DATE",nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar paymentDate;
	@Column(name="PAYMENT_VALUE",nullable=false)
	private double value;
	@Column(name="PAYMENT_FORM",nullable=false)
	private String paymentForm;
	public Payment(int id, Calendar paymentDate, double value, String paymentForm) {
		super();
		this.id = id;
		this.paymentDate = paymentDate;
		this.value = value;
		this.paymentForm = paymentForm;
	}
	public Payment() {
		super();
	}
	public Payment(Calendar paymentDate, double value, String paymentForm) {
		super();
		this.paymentDate = paymentDate;
		this.value = value;
		this.paymentForm = paymentForm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Calendar paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getPaymentForm() {
		return paymentForm;
	}
	public void setPaymentForm(String paymentForm) {
		this.paymentForm = paymentForm;
	}
	
}
