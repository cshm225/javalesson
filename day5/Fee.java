import java.util.*;
public class Fee{
	public static void main(String[] args){
		/*男性:2000円(65以上:1500円)
		 * 女性:1800円(65以上:1200)
		 *
		 */
		int money=0;
		System.out.print("性別");
		String gender=new Scanner(System.in).nextLine();
		System.out.print("年齢");
		int age=new Scanner(System.in).nextInt();
		if(gender.equals("男")){
			if(age>=65){
				money=1500;
			}else{
				money=2000;
			}
		}
		if(gender.equals("女")){
			if(age>=65){
				money=1200;
			}else{
				money=1800;
			}
		}
		System.out.println("料金は"+money);
	}
	}


