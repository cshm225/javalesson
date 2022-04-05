import java.util.*;
public class StringMethod{
	public static void main(String[] args){
		String fruits="apple";
		System.out.println(apple.length());//文字の数
		for(int i=0;i<fruits.length;i++){
			System.out.println(fruits.charAt(i));//1mojizutudasu
		}
		char[] data=fruits.toCharArray();
		System.out.println(Arrays.toString(data));
		if(fruits.contains("pp")){
			System.out.println("ppを含みます");

		}
		if(fruits.equals("apple")){
			System.out.println("ppを含みます");
		}
		if(fruits.equalsIgnoreCase("apple")){
			System.out.println("ppを含みます");
		}
		String str=fruits.toUpperCase();
		System.out.println(str);//大文字変換
		System.out.println(fruits.toLowerCase());//大文字変換

		if(fruits.startswith("a")){//aで始まるends終わる
			System.out.println("aで終わります");

		}

		String str2=fruits.substring(0,3);
		System.out.println(str2);//app

		String str3=fruits.substring(2,4);
		System.out.println(str3);//pl

		String str4=fruits.substring(0,fruits.length-1);
		System.out.println(str4);//appl

		//aから10個(a,b,c...)
		char[] chars=new char[10];
		char alph="a";
		for(int i=0;i<chars.length;i++){
			chars[i]=alph;
			alph+=1;
		}
	}
