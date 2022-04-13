public class Tribe{
	int hp;
	int magicpower;
	int power;
	int dex;
	int speed;
	String name;
	public Tribe(Hikasen h,int tribenum){
		if(tribenum==0){
			human(h);
		}
		if(tribenum==1){
			hiElf(h);
		}
		if(tribenum==2){
			troll(h);
		}
		if(tribenum==3){
			norm(h);
		}
	}
	public void human(Hikasen h){
		h.hp+=10;
		h.magicpower+=10;
		h.power+=10;
		h.dex+=10;
		h.speed+=10;
		this.name="人間";
	}
	public void hiElf(Hikasen h){
		h.hp+=0;
		h.magicpower+=20;
		h.power+=0;
		h.dex+=10;
		h.speed+=20;
		this.name="ハイエルフ";

	}
	public void troll(Hikasen h){
		h.hp+=30;
		h.magicpower+=0;
		h.power+=20;
		h.dex+=0;
		h.speed+=0;
		this.name="トロル";
	}
	public void norm(Hikasen h){
		h.hp+=10;
		h.magicpower+=0;
		h.power+=0;
		h.dex+=25;
		h.speed+=20;
		this.name="ノーム";
	}
		
}
