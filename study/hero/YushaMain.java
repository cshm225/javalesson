import java.util.*;
public class YushaMain{
	public static void main(String[] args){
		Yusha h=new Yusha();	
		h.hp=100;
		h.name="輝";
		System.out.printf("勇者%sを生み出しました\n",h.name);
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}

