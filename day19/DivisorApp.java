package divisorapp.main;
import java.util.*;
import divisorapp.logics.*;
public class DivisorApp{
	public static void main(String[] args){
		if(args.length==0){
			System.out.println("エラー");
			return;
		}
		for(String s:args){
			System.out.printf("%s:%s\n",s,Arrays.toString(DivisorLogic.createDivisorArr(Integer.parseInt(s))));	
		}

	}
}
