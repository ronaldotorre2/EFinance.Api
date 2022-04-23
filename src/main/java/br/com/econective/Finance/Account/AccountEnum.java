package br.com.econective.Finance.Account;

public class AccountEnum {

	public enum Type {
		Current,  		//Conta corrente
		Savings,  		//Poupança 
		Investment;		//Investimento
		
		public int getTypeId() {
			switch(this) {
			case Current:
		        return 1;
			case Savings:
				return 2;
			case Investment:
				return 3;
			 default:
			    return 0;
			}
		}
				
		public String getTypeInitial() {
			switch(this) {
			case Current:
		        return "C";
			case Savings:
				return "S";
			case Investment:
				return "I";
			default:
			    return null;
			}
		}
	} 

}