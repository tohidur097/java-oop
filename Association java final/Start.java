import Entity.Player;
import Entity.Team;

public class Start {
    public static void main(String[] args) {
        Team t1 = new Team("AIUB",11);                         // 11 holo size 
        t1.insertPlayer(1,new Player("Tohidur",22,15000));                     //1 holo position
        t1.insertPlayer(2,new Player("Rahim",12,20000));
        t1.insertPlayer(3,new Player("Jamal",23,30000));
        t1.insertPlayer(4,new Player("Kamal",15,18000));
        t1.insertPlayer(5,new Player("rafi",28,17000));						// 5 holo position
        t1.insertPlayer(6,new Player("rifat",27,16000));
        t1.insertPlayer(7,new Player("torun",69,15000));
        t1.insertPlayer(80,new Player("asif",96,18500));         //80 holo position 
		
        t1.showTeam();
		
		t1.removePlayer(7);
		t1.removePlayer(5);
		t1.removePlayer(3);
		t1.removePlayer(1);
		
	
		t1.showTeam();
		
		Player x = t1.getPlayer(4);
		System.out.println("---------player info------------");
		x.showPlayer();
		
		t1.setPlayerName(4, "Jamal Uddin"); // pos=4 এ kamal আছে
		t1.showTeam();


		
		Player x2 = t1.getPlayer(7);
		System.out.println("-----------------player info------------");
		if(x2 !=null){
			x2.showPlayer();
		}
		else {
			System.out.println("No player found this position 7");
		
		}
		
		t1.addPlayer(7,new Player("torun",69,15000));
		System.out.println("---------player Added------------");
		t1.showTeam();
	
    }
}

