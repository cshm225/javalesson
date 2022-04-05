import java.util.*;
public class Araay2{
	public static void main(String[] args){
		int[][] arr=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=new Random().nextInt(9)+1;
			}
			System.out.printf("%s",Arrays.toString(arr[i]));
			System.out.println();
		}
	}
}
