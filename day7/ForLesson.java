import java.util.*;
public class ForLesson{
	public static void main(String[] args){
		int i,min,max,sum=0;
		min=new Scanner(System.in).nextInt();
		max=new Scanner(System.in).nextInt();
		for(i=min;i<=max;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
}
