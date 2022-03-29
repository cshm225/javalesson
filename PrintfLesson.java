import java.util.*;
public class PrintfLesson{
	public static void main(String[] args){
		System.out.println(Math.PI);
		System.out.printf("%.2f\n",Math.PI);
		System.out.println(Math.PI);
		
		int a;
		a=847216595;
		System.out.printf("%,d%n",a);

		String name="松岡";
		int age=25;
		System.out.printf("%s(%d)さんこんにちは%n",name,age);
		
		
		System.out.printf("%,6d%n",34);
		System.out.printf("%,6d%n",2575);
		System.out.printf("%,6d%n",872);
		System.out.printf("%,6d%n",6);
		System.out.printf("%,6d%n",8658);
		System.out.printf("%,6d%n",384);
	}
}
