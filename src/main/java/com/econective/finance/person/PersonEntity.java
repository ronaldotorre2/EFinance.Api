package com.econective.person;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity()
@Table(name="Person")
public class PersonEntity implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long Id;
	
	@Column(nullable = false)
	int Type;
	
	@Column(nullable = false)
	String Name;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	/*
	 * @Column(nullable = true) String SocialName;
	 * 
	 * @Column(nullable = true) LocalDate BirthDate;
	 * 
	 * @Column(nullable = true) int hometownState;
	 * 
	 * @Column(nullable = true) String hometownCity;
	 * 
	 * @Column(nullable = true) PersonEnum.Gender Gender;
	 * 
	 * @Column(nullable = false) String Document1;
	 * 
	 * @Column(nullable = true) String Document2;
	 * 
	 * @Column(nullable = true) PersonEnum.StateCivil StateCivill;
	 * 
	 * @Column(nullable = true) PersonEnum.Schooling Schooling;
	 * 
	 * @Column(nullable = true) String SposeName;
	 * 
	 * @Column(nullable = true) String MotherName;
	 * 
	 * @Column(nullable = true) String FatherName;
	 */
	
	
	/*
	 * List<AddressEntity> Addresses; 
	 * List<ContactEntity> Contacts;
	 */
	
	/*
	 * public List<AddressEntity> getAddresses() { return Addresses; }
	 * 
	 * public void setAddresses(List<AddressEntity> addresses) { Addresses =
	 * addresses; }
	 * 
	 * public void addAddress(AddressEntity address) { Addresses.add(address); }
	 * 
	 * public List<ContactEntity> getContacts() { return Contacts; }
	 * 
	 * public void setContacts(List<ContactEntity> contacts) { Contacts = contacts;
	 * }
	 * 
	 * public void addContract(ContactEntity contact) { Contacts.add(contact); }
	 * 
	 * public PersonEntity() { this.Addresses = new ArrayList<AddressEntity>();
	 * this.Contacts = new ArrayList<ContactEntity>(); }
	 */
}