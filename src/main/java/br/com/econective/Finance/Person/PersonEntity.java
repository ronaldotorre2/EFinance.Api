package br.com.econective.Finance.Person;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity()
@Table(name = "Person")
public class PersonEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long Id;

	@Column(nullable = false, name = "typeId")
	int Type;

	@Column(nullable = false)
	String Name;

	@Column(nullable = true)
	String SocialName;

	@Column(nullable = true)
	LocalDate BirthDate;
	
	@Column(nullable = true)
	int hometownCountry;

	@Column(nullable = true)
	int hometownState;

	@Column(nullable = true)
	String hometownCity;

	@Column(nullable = true)
	String Gender;

	@Column(nullable = false)
	String Document1;

	@Column(nullable = true)
	String Document2;

	@Column(nullable = true)
	String Document3;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public int getType() {
		return Type;
	}

	public void setType(int type) {
		Type = type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSocialName() {
		return SocialName;
	}

	public void setSocialName(String socialName) {
		SocialName = socialName;
	}

	public LocalDate getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		BirthDate = birthDate;
	}

	public int getHometownCountry() {
		return hometownCountry;
	}

	public void setHometownCountry(int hometownCountry) {
		this.hometownCountry = hometownCountry;
	}

	public int getHometownState() {
		return hometownState;
	}

	public void setHometownState(int hometownState) {
		this.hometownState = hometownState;
	}

	public String getHometownCity() {
		return hometownCity;
	}

	public void setHometownCity(String hometownCity) {
		this.hometownCity = hometownCity;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDocument1() {
		return Document1;
	}

	public void setDocument1(String document1) {
		Document1 = document1;
	}

	public String getDocument2() {
		return Document2;
	}

	public void setDocument2(String document2) {
		Document2 = document2;
	}

	public String getDocument3() {
		return Document3;
	}

	public void setDocument3(String document3) {
		Document3 = document3;
	}
	
}