import java.util.ArrayList;
import java.util.Scanner;

class Student {
	Student(int Roll, String Name, int Marks) {
		this.Roll = Roll;
		this.Name = Name;
		this.Marks = Marks;
	}

	String Name;
	int Roll;
	int Marks;
	Subject S = new Subject(Marks);
	String subject[] = { "Maths", "English" };
}


  class Subject { Subject(int Marks) {
	  this.Marks = Marks; }
  
  int Marks;
  
  }
 

public class Teacher {
	static ArrayList<Student> s = new ArrayList<Student>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter name");
			String n = sc.next();
			System.out.println("Enter Marks");
			int m = sc.nextInt();
			Student c = new Student(i, n, m);
			s.add(c);
		}
		System.out.println(s.get(0).Name + " " + s.get(0).Marks);
		System.out.println("Enter a to Find average of marks");
		System.out.println("Enter b Find Max and Min and display the marks");
		String K = sc.next().toLowerCase();
		sc.close();
		switch (K) {
		case "a": {
			int res=0;
			int Avg=0;
			for (int i = 0; i < 10; i++) {
				Avg+=s.get(i).Marks;
			}
			res=Avg/10;
			System.out.println("Avg is "+res);
			
			break;
		}
		case "b": {
			int Max=0,Min=s.get(0).Marks;
			for (int i = 0; i < 10; i++) {
				if(Max<s.get(i).Marks) {
					Max=s.get(i).Marks;
				}
				if(Min>s.get(i).Marks) {
					Min=s.get(i).Marks;
				}
			}
			System.out.println("Max marks "+Max);
			System.out.println("Min marks "+Min);
			break;
		}
		default:
			System.out.println("Wrong Input");
		}
	}
		
}
