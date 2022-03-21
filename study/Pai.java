import java.util.*;
public class Pai{
	public static void main(String[] args){
		double r,m;
		System.out.println("円の半径を入力");
		r=new Scanner(System.in).nextDouble();
		m=Math.pow(r,2)*3.14;
		System.out.println("円の面積は"+m);
		
	}
}
