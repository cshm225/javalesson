import java.util.*;
public class Kimura{
	public static void main(String[] args){
		int i,num,sum=0;
		String restart="null";
		new Scanner(System.in).nextLine();
		for(i=0;i<3;i++){
			num=new Random().nextInt(10)+1;
			sum+=num;
			if(sum>21){
				i=2;
				System.out.println("今の持ち点は"+sum+" 匹夫の勇");
			}else{
				System.out.println("今の持ち点は"+sum);
				if(i!=2){
				System.out.println("続けますか？");
				restart=new Scanner(System.in).nextLine();
				}else if(restart.equals("やめる")){
					i=2;
				}
			}
		}if(sum==21){
			System.out.println("今の持ち点は"+sum+"神");
		}else if(sum<21 && sum>19){
			System.out.println("今の持ち点は"+sum+"クレイジー");
		}else if(sum<18 && sum>15){
			System.out.println("今の持ち点は"+sum+"普通");
		}else if(sum<16 && sum>9){
			System.out.println("今の持ち点は"+sum+"ビビり");
		}else if(sum<10 && sum>0){
			System.out.println("今の持ち点は"+sum+"チキン");
		}
	}
}
