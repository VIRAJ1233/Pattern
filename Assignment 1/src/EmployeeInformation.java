import java.util.Scanner;


public class EmployeeInformation {

	public static  void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees");
		int count = sc.nextInt();
		for (int i =1 ; i<=count ; i++){
			System.out.println("Enter employee details");
	
		
			Employee emp = new Employee();
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter First name");
			emp.firstName = scan.nextLine();
		    
		    System.out.println("Please enter Last name");
			emp.lastName = scan.nextLine();
			
			
			System.out.println("Please enter City name");
			emp.city = scan.nextLine();
			
			System.out.println("Please enter mobile number");
		    emp.mobNo = scan.nextLong();
		   
		    System.out.println("Name:"+emp.firstName);
		    System.out.println("Last name:"+emp.lastName);
		    System.out.println("City:"+emp.city);
		    System.out.println("Mob No:"+emp.mobNo);
			
		    }
	}
	
}

