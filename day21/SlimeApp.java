import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		Slime s1=new Slime("スラ吉",5);
		Slime s2=new Slime("スラ",6);
		s1.attack();
		s2.attack();
		Slime[] slimes=new Slime[2];
		slimes[0]=s1;
		slimes[1]=s2;

		for(Slime s:slimes){
			s.attack();
		}
	}
}
