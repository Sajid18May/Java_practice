abstract class Animal{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animal{
	 void cats(){
		System.out.println("Cats meow");
	}
	 void dogs() {
		 
	 }
}
class Dogs extends Animal{
	void cats() {
		
	}
	 void dogs(){
		System.out.println("Dogs bark");
	}
}
public class Animal_M {

	public static void main(String[] args) {
	Animal a1=new Cats();
	Animal a2=new Dogs();
	a1.cats();
	a2.dogs();
	}

}
