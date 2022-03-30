import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		int[] dice=new int[10];
		for(int i=0;i<dice.length;i++){
			dice[i]=new Random().nextInt(6)+1;
		}
		System.out.printf("%s\n",Arrays.toString(dice));
	}
}
