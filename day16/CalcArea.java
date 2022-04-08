import java.util.*;
public class CalcArea{
	public static double calc(double height,double width){
		return height*width;
	}
	public static void main(String[] args){
		System.out.print("縦>>");
		Scanner scan=new Scanner(System.in);
		double height=scan.nextDouble();
		System.out.print("横>>");
		double width=scan.nextDouble();
		System.out.printf("長方形の面積は%.1f",calc(height,width));
	}
}
