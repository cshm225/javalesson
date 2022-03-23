import java.util.*;
public class Marry{
	public static void main(String[] args){
		/*
		 *女性16,男性18
		 *Dont Repert Yourself DRY
		 */
		System.out.println("性別");
		String gender=new Scanner(System.in).next();
		System.out.println("年齢");
		int age=new Scanner(System.in).nextInt();
/*
		if(gender.equals("女")){
			if(age<16){
				System.out.println(age+"で"+gender+"のあなたは結婚できません");
			}else{
				System.out.println(age+"で"+gender+"のあなたは結婚できます");
			}
		}

		if(gender.equals("男")){
			if(age<18){
				System.out.println(age+"で"+gender+"のあなたは結婚できません");
			}else{
				System.out.println(age+"で"+gender+"のあなたは結婚できます");
			}
		}*/
		if((gender.equals("女性") && age >=16) ||
				(gender.equals("男性") && age >= 18)){
				System.out.println(age+"で"+gender+"のあなたは結婚できます");
		}else{
				System.out.println(age+"で"+gender+"のあなたは結婚できません");
		}
	}
}
