import java.util.*;
public class Ball{
	public static void main(String[] args){
		int[] ball={1,2,3,4,5};
		for(int i=0;i<ball.length;i++){
			int random=new Random().nextInt(ball.length-i)+i;
			int tmp;
			tmp=ball[random];
			ball[random]=ball[i];
			ball[i]=tmp;

		}
		System.out.println(Arrays.toString(ball));
	}
}
