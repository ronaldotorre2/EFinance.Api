package br.com.econective.Finance.Person;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

	@Column(nullable = false, name = "name", unique = true, length = 75)
	String Name;

	@Column(nullable = true, name = "socialName", length = 150)
	String SocialName;

	@Column(nullable = true, name = "birthDate")
	LocalDate BirthDate;
	
	@Column(nullable = true, name = "hometownCountry")
	int HometownCountry;

	@Column(nullable = true, name = "hometownState")
	int HometownState;

	@Column(nullable = true, name = "hometownCity")
	String HometownCity;

	@Column(nullable = true, name = "gender")
	String Gender;

	@Column(nullable = false, name = "document1", unique = true)
	String Document1;

	@Column(nullable = true, name = "document2")
	String Document2;

	@Column(nullable = true, name = "document3")
	String Document3;
	
	@Column(nullable = false, name = "active")
	Boolean Active;
	
	@Column(nullable = false, name = "createdAt")
	LocalDateTime CreatedAt;
	
	@Column(nullable = true, name = "updatedAt")
	LocalDateTime updatedAt;

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
		return HometownCountry;
	}

	public void setHometownCountry(int hometownCountry) {
		this.HometownCountry = hometownCountry;
	}

	public int getHometownState() {
		return HometownState;
	}

	public void setHometownState(int hometownState) {
		this.HometownState = hometownState;
	}

	public String getHometownCity() {
		return HometownCity;
	}

	public void setHometownCity(String hometownCity) {
		this.HometownCity = hometownCity;
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

	public Boolean getActive() {
		return Active;
	}

	public void setActive(Boolean active) {
		Active = active;
	}

	public LocalDateTime getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		CreatedAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}