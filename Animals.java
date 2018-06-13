
public interface Animals {
	
    void speak();
    void eat();

    public static void main(String[] args) {
      cat c=new cat();
      c.speak();
      c.eat();
      Dog d=new Dog();
      d.speak();
      d.eat();
      
	}

}

class cat implements Animals{
	public void speak() {
		System.out.println("Meow");
	}
	public void eat() {
		System.out.println("Cat Eating");
	}
 }

 class Dog implements Animals{
	public void speak() {
		System.out.println("Bark.");
	}
	public void eat() {
		System.out.println("Dog Eating");
	}
 }
 