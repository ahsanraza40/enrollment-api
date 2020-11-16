package org.meridian.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * The persistent class for the dependent database table.
 * 
 */
@Entity
public class Dependent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private int id;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "birth_date", nullable = false)
	private Date birthDate;

	@Column(nullable = false, length = 45)
	private String name;

	// bi-directional many-to-one association to Enrollee
	@ManyToOne
	@JoinColumn(name = "enrollee_id")
	private Enrollee enrollee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Enrollee getEnrollee() {
		return enrollee;
	}

	public void setEnrollee(Enrollee enrollee) {
		this.enrollee = enrollee;
	}
}