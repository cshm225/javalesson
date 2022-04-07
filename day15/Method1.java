import java.util.*;
public class Method1{
	public static void main(String[] args){
		int a=maxOf(3,5);
		System.out.println(a);
		System.out.println(maxOf(3,5));
		System.out.println(calcTriangleArea(3,5));
		boolean isSame=isSame(new int[]{3,3,3});
			if(isSame){
				System.out.println("要素はすべて正しい");
			}else{
				System.out.println("違います");
			}
			int price=2800;
			int tax=10;
			int taxin =calcTaxIn(price,tax);
			System.out.printf("%d縁です\n",taxin);
			System.out.print("身長");
			double height=new Scanner(System.in).nextDouble();
			System.out.print("体重");
			double weight=new Scanner(System.in).nextDouble();
			double bmi=calcBmi(weight,height);
			System.out.println(bmi);
	}
	public static int maxOf(int a,int b){
		return a>b?a:b;
	}
	public static double calcTriangleArea(int a,int b){
		double sum=0;
		sum=(double)(a*b)/2;
		return sum;
	}
	public static boolean isSame(int[] arr){
		int first=arr[0];
		for(int i=1;i<arr.length;i++){
			if(first!=arr[i]){
				return false;
			}
		}
		return true;
	}
	public static int calcTaxIn(int price,int tax){
		int taxin=(int)(price*(1+tax/100d));
		return taxin;

	}
	public static double calcBmi(double weightkg,double heightcm){
		double bmi=weightkg/(heightcm/100*heightcm/100);
		return bmi;
	}
}
