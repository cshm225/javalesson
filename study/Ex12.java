import java.util.*;
public class Ex12{
	public static void main(String[] args){
		String title,address,text;
		title="シフトの件";
		address="cshm225@gmail.com";
		text="20日 21日休み希望";
		email(title,address,text);
	}
	public static void email(String title,String address,String text){
		System.out.println(address+"に以下のメールを送信しました。");
		System.out.println("件名;"+title);
		System.out.println("本文;"+text);
	}
}
