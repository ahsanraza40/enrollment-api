package org.meridian.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * The persistent class for the enrollee database table.
 * 
 */

@Entity
public class Enrollee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private int id;

	@Column(name = "activation_status", nullable = false)
	private boolean activationStatus;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "birth_date", nullable = false)
	private Date birthDate;

	@Column(nullable = false, length = 45)
	private String name;

	@Column(name = "phone_number", length = 11)
	private int phoneNumber;

	// bi-directional many-to-one association to Dependent
	@OneToMany(mappedBy = "enrollee")
	private List<Dependent> dependents = new ArrayList<Dependent>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(boolean activationStatus) {
		this.activationStatus = activationStatus;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Dependent> getDependents() {
		return dependents;
	}

	public void setDependents(List<Dependent> dependents) {
		this.dependents = dependents;
	}

}