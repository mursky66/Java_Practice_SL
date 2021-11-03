package myPackage;

interface Animal {
	String Sound();
}

class Duck implements Animal {

	@Override
	public String Sound() {
		return "Quack Quack";
	}

}

class Dog implements Animal {

	@Override
	public String Sound() {
		return "Bow Bow";
	}

}

public class Temp {
	public static void main(String[] args) {
		Animal a;
		a = new Duck();
		System.out.println(a.Sound());

		a = new Dog();
		System.out.println(a.Sound());

	}
}
