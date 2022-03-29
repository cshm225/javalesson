
import java.util.*;
public class For2{
	public static void main(String[] args){
		int num;
		System.out.println("いくつ＞＞");
		num=new Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
