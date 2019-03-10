package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_PASSANGER")
@SequenceGenerator(name="PASSANGER",sequenceName="SQ_T_PASSANGER",allocationSize=1)
public class Passanger {
	@Id
	@Column(name="PASSANGER_ID")
	@GeneratedValue(generator="PASSANGER",strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="PASSANGER_NAME",nullable=false,length=100)
	private String name;
	@Column(name="PASSANGER_BD")
	@Temporal(TemporalType.DATE)
	private Calendar birthday;
	@Column(name="PASSANGER_GENDER")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	public Passanger(int id, String name, Calendar birthday, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
	}
	public Passanger() {
		super();
	}
	public Passanger(String name, Calendar birthday, Gender gender) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getBirthday() {
		return birthday;
	}
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
