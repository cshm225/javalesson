package calcapp.main;
import calcapp.logics.*;
public class Calc{
	public static void main(String[] args){
		int a=10;
		int b=2;
		int total=CalcLogic.tasu(a,b);
		int delta=CalcLogic.hiku(a,b);
		System.out.printf("足すと%d引くと%d",total,delta);

	}
}
