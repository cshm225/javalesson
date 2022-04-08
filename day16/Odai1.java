import java.util.*;
public class Odai1{
	public static String[] kuku(int num){
		String[] kuku=new String[9];
		for(int i=0;i<9;i++){
			kuku[i]=num+"*"+(i+1)+"="+(num*(i+1));
		}
		return kuku;
	}

	public static void printKuku(String[] data){
		for(int i=0;i<9;i++){
			System.out.printf("%s\n",data[i]);
		}

	}

	public static void main(String[] args){
		System.out.print("九九の段を入力>>");
		int num=new Scanner(System.in).nextInt();
		String[] kuku=kuku(num);
		printKuku(kuku);
	}
}
