import java.util.*;
public class Archer{
	int power;
	char suffix;
	public Archer(char suffix){
		this.power=new Random().nextInt(90)+10;
		this.suffix=suffix;
	}
	public int attack(){
		return power;
	}
}
