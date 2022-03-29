package calcapp.main;
import calcapp.main.*;
import calcapp.logic.*;
public class Calc{
	public static void main(String[] args){
		int a=5,b=2,sum=0;
		sum=CalcLogic.tasu(a,b);
		System.out.println(sum);
		sum=CalcLogic.hiku(a,b);
		System.out.println(sum);
	}
}
