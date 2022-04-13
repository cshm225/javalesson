public class Job{
	int hp;
	int magicpower;
	int power;
	int dex;
	int speed;
	String name;
	public Job(Hikasen h,int jobnum){
		if(jobnum==0){
			warrior(h);
		}
		if(jobnum==1){
			thief(h);
		}
		if(jobnum==2){
			priest(h);
		}
		if(jobnum==3){
			wizard(h);
		}
	}
	public void warrior(Hikasen h){
		h.hp*=1.6;
		h.magicpower*=1;
		h.power*=1.4;
		h.dex*=1;
		h.speed*=1;
		this.name="戦士";
	}
	public void thief(Hikasen h){
		h.hp*=1.1;
		h.magicpower*=1;
		h.power*=1.2;
		h.dex*=1.3;
		h.speed*=1.3;
		this.name="盗賊";

	}
	public void priest(Hikasen h){
		h.hp*=1.3;
		h.magicpower*=1.5;
		h.power*=1.1;
		h.dex*=1;
		h.speed*=1;
		this.name="僧侶";
	}
	public void wizard(Hikasen h){
		h.hp*=1;
		h.magicpower*=1.9;
		h.power*=1;
		h.dex*=1;
		h.speed*=1.1;
		this.name="魔術師";
	}

}
