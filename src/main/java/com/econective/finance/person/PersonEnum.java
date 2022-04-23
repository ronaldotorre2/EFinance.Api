package com.econective.finance.person;

public class PersonEnum {
	
	public enum Gender {
		Female,		//Feminino
		Male;		//Masculino
		
		public int getGenderId() {
			switch(this) {
			case Female:
		        return 1;
			case Male:
				return 2;
			default:
			    return 0;
			}
		}
		
		public String getGenderInitial() {
			switch(this) {
			case Female:
		        return "F";
			case Male:
				return "M";
			default:
			    return null;
			}
		}
	}
	
	public enum Type {
		Physical,		//Fisica
		Juridical;		//Jurídica
		
		public int getTypeId() {
			switch(this) {
			case Physical:
		        return 1;
			case Juridical:
				return 2;
			default:
			    return 0;
			}
		}
				
		public String getTypeInitial() {
			switch(this) {
			case Physical:
		        return "F";
			case Juridical:
				return "J";
			default:
			    return null;
			}
		}
	}
	
	public enum StateCivil {
		Married,		//Casado(a)
		Dating,			//Namorando
		Single,			//Solteiro
		Separate,		//Separado
		Divorced,		//Divorciado(a)
		Widower,		//Viúvo(a)
		other;			//Outros
		
		public int getStateCivilId() {
			switch(this) {
			case Married:
		        return 1;
			case Dating:
				return 2;
			case Single:
				return 3;
			case Separate:
				return 4;
			case Divorced:
				return 5;
			case Widower:
				return 6;
			case other:
				return 7;
			default:
			    return 0;
			}
		}
	}
	
	public enum Schooling {
		Illiterate,		//Analfabeto
		Childhood,		//Infantil
		Fundamental,	//Ensino Fundamental
		Medium,			//Ensino Médio
		Graduation,		//Graduado
		Postgraduate,	//Pós Graduação
		Masters,		//Mestrado
		Doctorate;		//Doutorado
		
		public int getSchoolingId() {
			switch(this) {
			case Illiterate:
		        return 1;
			case Childhood:
				return 2;
			case Fundamental:
				return 3;
			case Medium:
				return 4;
			case Graduation:
				return 5;
			case Postgraduate:
				return 6;
			case Masters:
				return 7;
			case Doctorate:
				return 8;
			default:
			    return 0;
			}
		}
	}
}