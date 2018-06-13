abstract class animals {
	String breed,color,name;
	abstract void eat();
	void speak() {
		System.out.println("Animal Speaking");
	}
}
class dog extends animals{
	
	dog(String name, String breed,String color){
	this.breed=breed;
	this.color=color;
	this.name=name;
	}
	
	void dog1() {
		System.out.println("Name:"+name);
		System.out.println("Colour:"+color);
		System.out.println("Breed:"+breed);
		
	}

	void eat(){
		System.out.println("Dog Eating");
	}

}

public class Abstr {

	public static void main(String[] args) {
		animals a=new dog("Bruno","Pitbull","White");
		dog d=new dog("Mack","Lebra","Black");
		d.dog1();
		a.eat();
		a.speak();
	}

}