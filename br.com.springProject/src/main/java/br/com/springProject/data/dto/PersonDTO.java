package br.com.springProject.data.dto;

import java.io.Serializable;
import java.util.Objects;


public class PersonDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String fistName;
	private String lastName;
	private String addrees;
	private String gender;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddrees() {
		return addrees;
	}

	public void setAddrees(String addrees) {
		this.addrees = addrees;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonDTO other = (PersonDTO) obj;
		return Objects.equals(id, other.id);
	}

	public PersonDTO(Long id, String fistName, String lastName, String addrees, String gender) {
		super();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.addrees = addrees;
		this.gender = gender;
	}

	public PersonDTO() {
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fistName=" + fistName + ", lastName=" + lastName + ", addrees=" + addrees
				+ ", gender=" + gender + "]";
	}
	

}
