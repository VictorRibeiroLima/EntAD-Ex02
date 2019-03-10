package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_DRIVER")
@SequenceGenerator(name="DRIVER",sequenceName="SQ_T_DRIVER",allocationSize=1)
public class Driver {
	@Id
	@Column(name="DRIVER_ID")
	@GeneratedValue(generator="DRIVER",strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="DRIVER_NAME",nullable=false,length=150)
	private String name;
	@Column(name="DRIVER_BD")
	@Temporal(TemporalType.DATE)
	private Calendar birthday;
	@Lob
	@Column(name="DRIVER_IMG")
	private byte[] licencePic;
	@Enumerated(EnumType.STRING)
	@Column(name="DRIVER_GENDER")
	private Gender gender;
	
	public Driver(String name, Calendar birthday, Gender gender) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
	}
	public Driver(String name, Calendar birthday, byte[] licencePic, Gender gender) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.licencePic = licencePic;
		this.gender = gender;
	}
	public Driver() {
		super();
	}
	public Driver(int id, String name, Calendar birthday, byte[] licencePic, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.licencePic = licencePic;
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
	public byte[] getLicencePic() {
		return licencePic;
	}
	public void setLicencePic(byte[] licencePic) {
		this.licencePic = licencePic;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
