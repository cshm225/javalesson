import java.util.*;
public class Method1{
	public static void main(String[] args){
		int sum=0;

		if(args.length==0){
			System.out.println("コマンドライン引数はありません");
		}else{
				System.out.println(Arrays.toString(args));
			for(String s:args){
				sum+=Integer.parseInt(s);
				System.out.println(s);
			}
		}
		System.out.println(sum);
	}
}
