import java.util.Scanner;

public class Com {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  id , name, salary, degignation");
		Company c1 = new Company();
		System.out.println("Enter id");
		c1.id = sc.nextInt();
		System.out.println("Enter name");
		c1.name = sc.next();
		System.out.println("Enter salary");
		c1.salary = sc.nextInt();
		System.out.println("Enter designation");
		c1.designation = sc.next();
		System.out.println("  ID = " + c1.id + "; Name = " + c1.name + "; Salary = " + c1.salary + "; Designation = "+ c1.designation);

		Company c2 = new Company();
		System.out.println("Enter id");
		c2.id = sc.nextInt();
		System.out.println("Enter name");
		c2.name = sc.next();
		System.out.println("Enter salary");
		c2.salary = sc.nextInt();
		System.out.println("Enter designation");
		c2.designation = sc.next();
		System.out.println("  ID = " + c2.id + "; Name = " + c2.name + "; Salary = " + c2.salary + "; Designation = "+ c2.designation);
		
		Company c3 = new Company();
		System.out.println("Enter id");
		c3.id = sc.nextInt();
		System.out.println("Enter name");
		c3.name = sc.next();
		System.out.println("Enter salary");
		c3.salary = sc.nextInt();
		System.out.println("Enter designation");
		c3.designation = sc.next();
		System.out.println("  ID = " + c3.id + "; Name = " + c3.name + "; Salary = " + c3.salary + "; Designation = "+ c3.designation);
		
		Company c4 = new Company();
		System.out.println("Enter id");
		c4.id = sc.nextInt();
		System.out.println("Enter name");
		c4.name = sc.next();
		System.out.println("Enter salary");
		c4.salary = sc.nextInt();
		System.out.println("Enter designation");
		c4.designation = sc.next();
		System.out.println("  ID = " + c4.id + "; Name = " + c4.name + "; Salary = " + c4.salary + "; Designation = "+ c4.designation);
		
		Company c5 = new Company();
		System.out.println("Enter id");
		c5.id = sc.nextInt();
		System.out.println("Enter name");
		c5.name = sc.next();
		System.out.println("Enter salary");
		c5.salary = sc.nextInt();
		System.out.println("Enter designation");
		c5.designation = sc.next();
		System.out.println("  ID = " + c5.id + "; Name = " + c5.name + "; Salary = " + c5.salary + "; Designation = "+ c5.designation);
        sc.close();
	}

}
