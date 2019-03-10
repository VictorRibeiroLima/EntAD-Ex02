package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_VEHICLE")
@SequenceGenerator(name="VEHICLE",sequenceName="SQ_T_VEHICLE",allocationSize=1)
public class Vehicle {
	@Id
	@Column(name="VEHICLE_ID")
	@GeneratedValue(generator="VEHICLE",strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="PLATE_DS",nullable=false,length=9)
	private String plate;
	@Column(name="COLOR_DS",nullable=false,length=20)
	private String color;
	@Column(name="YEAR_NB")
	private int year;
	
	public Vehicle() {
		super();
	}
	public Vehicle(String plate, String color) {
		super();
		this.plate = plate;
		this.color = color;
	}
	public Vehicle(String plate, String color, int year) {
		super();
		this.plate = plate;
		this.color = color;
		this.year = year;
	}
	public Vehicle(int id, String plate, String color, int year) {
		super();
		this.id = id;
		this.plate = plate;
		this.color = color;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
