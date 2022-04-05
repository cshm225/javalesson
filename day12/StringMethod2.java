import java.util.*;
public class StringMethod2{
	public static void main(String[] args){
		//文字列の置換
		String str="apple:orenge:banana";
		str=str.replace(":",",");
		System.out.println(str);
	//文字列を,	区切りで配列に格納	
		String[] data=str.split(",");
		System.out.println(Arrays.toString(data));
//配列に格納されている文字列を,で文字列にする
		String result=String.join(",",data);
		System.out.println(result);

	}
}
