import java.util.*;
public class Haba{
	public static void main(String[] args){
		int random=0,num,tmp1=0,tmp2=0,tmp3;
		double sum=0;
		System.out.print("幅>>");
		num=new Scanner(System.in).nextInt();
		for(int i=0;i<3;i++){
			sum=0;
			for(int j=0;j<num;j++){
				random=new Random().nextInt(2)+1;
					
				System.out.printf("%d",random);
				sum+=random;
				if(j==0){
					tmp1=random;
				}
				if(j>0){

					if(random==tmp1){
						tmp2=random;
					}else{
						tmp3=0;
					}
				}
			}
			System.out.println();
			if(tmp1==){
				System.out.println("あたり");
			}
		}
	}
}
