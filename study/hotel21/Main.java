import java.util.*;
public class Main{
	public static void main(String[] args){
		RoomNumberMachine a=new RoomNumberMachine();
		Front b=new Front();
		int roomnum=a.machine();
		b.guide(roomnum);
	}
}
