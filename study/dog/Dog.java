import java.util.*;
public class Dog{
	int Age;
	private String Name;
	public void SetName(String nm){
		Name=nm;
	}
	public void ShowProfile(){
		System.out.println("名前は、"+this.Name+"で年齢は"+this.Age);
	}
	public void SetAge(int age){
		Age=age;
	}
}
