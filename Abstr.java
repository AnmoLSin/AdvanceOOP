abstract class animals {
	String breed,color;
	int age;
	abstract void eat();
	void speak() {
		System.out.println("Animal Speaking");
	}
}
class dog extends animals{
	
	dog(String breed,String color,int age){
	this.breed=breed;
	this.color=color;
	this.age=age;
	}
	
	void dog1() {
		System.out.println("Age:"+age);
		System.out.println("Colour:"+color);
		System.out.println("Breed:"+breed);
		
	}

	void eat(){
		System.out.println("Dog Eating");
	}

}

public class Abstr {

	public static void main(String[] args) {
		animals a=new dog("Pitbull","White",5);
		dog d=new dog("Lebra","Black",6);
		d.dog1();
		a.eat();
		a.speak();
	}

}