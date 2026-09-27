package br.com.springProject.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false,length = 120)
	private String fistName;
	@Column(nullable = false,length = 120)
	private String lastName;
	@Column(nullable = false,length = 120)
	private String addrees;
	@Column(nullable = false,length = 120)
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
		Person other = (Person) obj;
		return Objects.equals(id, other.id);
	}

	public Person(Long id, String fistName, String lastName, String addrees, String gender) {
		super();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.addrees = addrees;
		this.gender = gender;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fistName=" + fistName + ", lastName=" + lastName + ", addrees=" + addrees
				+ ", gender=" + gender + "]";
	}
	

}
