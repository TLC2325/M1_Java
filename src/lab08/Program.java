package lab08;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account person = new Account("John", 600);
		person.deposit(400);
		person.withdraw(50);
		person.getDetails();
		System.out.println("-----------------------------");
//		Account myAccount = new Account("myAccount", 100);
//		myAccount.addInterest();
//		myAccount.getDetails();
		Account myAccount = new Account("myAccount2", 100);
		processAccount(myAccount);
		System.out.println("-----------------------------");
		Account partnerAccount = myAccount;
		partnerAccount.getDetails();
		System.out.println("-----------------------------");
		
	}
	
	static void processAccount(Account acc){
		 acc.addInterest(); 
	}
	
	private static void incInt(int x) {
		x++;
	}

}
//Back in Main(), create an instance of Account called myAccount and call the processAccount method, 
//passing myAccount as parameter.