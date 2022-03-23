import java.util.*;
public class Nagasu{
	public static void main(String[] args){
		int dice1,dice2,dice3;
		dice1=new Random().nextInt(6)+1;
		dice2=new Random().nextInt(6)+1;
		dice3=new Random().nextInt(6)+1;
		if(dice1==dice2 && dice1==dice3 || dice2==dice3 && dice2==dice1 || dice3==dice1 && dice3==dice2){
			System.out.println("Miracle!!!");
		}else if(dice1==dice2 || dice1==dice3 || dice2==dice3 || dice2==dice1 || dice3==dice1 || dice3== dice2){
			System.out.println("Happy!");
		}else{
			System.out.println("Bad...");
		}
	}
}
