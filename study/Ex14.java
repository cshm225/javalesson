import java.util.*;
public class Ex14{
	public static void main(String[] args){
		double bottom,height,radius;
		System.out.print("底辺を入力>>");
		bottom=new Scanner(System.in).nextDouble();
		System.out.print("高さを入力>>");
		height=new Scanner(System.in).nextDouble();
		System.out.print("半径を入力>>");
		radius=new Scanner(System.in).nextDouble();
		calcTriangleArea(bottom,height);
		System.out.println("面積1:"+calcTriangleArea(bottom,height)+"\n面積2:"+calcCircleArea(radius));
	}
	public static double calcTriangleArea(double bottom,double height){
		double Area=0;
		Area=bottom*height/2;
		return Area;
	}
	public static double calcCircleArea(double radius){
		double Area=0;
		Area=Math.pow(radius,2)*3.14;
		return Area;
	}
}
