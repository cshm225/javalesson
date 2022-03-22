import java.util.*;
public class ArrayForDna{
	public static void main(String[] args){
		int num,i;
		int[] dna=new int[10];
		char[] moji={'A','T','G','C'};
		for(i=0;i<10;i++){
		num=new Random().nextInt(4);
		dna[i]=num;
		System.out.println(moji[dna[i]]);
		}
	}
}
