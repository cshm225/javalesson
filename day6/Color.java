import java.util.*;
public class Color{
	public static void main(String[] args){
		System.out.println("何色ですか？>>");
		String color=new Scanner(System.in).nextLine();
		switch(color){
			case "赤":
				System.out.println("red");
				break;
			case "青":
				System.out.println("blue");
				break;
			case "黄":
			case "黄色":
				System.out.println("yellow");
				break;
			default:
				System.out.println("unknown");
		}
	}
}
