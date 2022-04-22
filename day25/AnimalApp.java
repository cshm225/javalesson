public class AnimalApp{
	public static void main(String[] args){
		Animal[] animals={
			new Dog("dog"),
			new Pig("pig"),
			new Cat("cat"),
		};
		for(Animal a:animals){
			a.makeNoise();
			if(a instanceof Cat){
				((Cat)a).sleep();
			}
		}
		((Cat)animals[2]).sleep();
	}
}
abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	abstract void makeNoise();
}
class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println(this.name+"wan!");
	}
}
class Pig extends Animal{
	Pig(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println(this.name+"boo!");
	}

}
class Cat extends Animal{
	Cat(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println(this.name+"meow!");
	}
	void sleep(){
		System.out.println(this.name+"sleep");
	}
}
