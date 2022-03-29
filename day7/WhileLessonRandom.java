import java.util.*;
public class WhileLessonRandom{
	public static void main(String[] args){
	/*	int n,i;
		i=0;
		while(true){
			i++;
			n=new Random().nextInt(10);
			System.out.println(n);
			if(n==7){
				break;
			}
		}
		System.out.println(i+"回数かかりました");*/
		int r=0,i=0;
		while(r!=1){
			i++;
			r=new Random().nextInt(100);
			if(r==1){
			System.out.println(r+" SSR");
			}else if(r<4){
			System.out.println(r+" SR");
			}else if(r<37){
			System.out.println(r+" R");
			}else{
			System.out.println(r+" N");
			}
		}
			System.out.println(i+"回");
	}
}
