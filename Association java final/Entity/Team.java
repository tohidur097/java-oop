package Entity;

public class Team {

    private String teamName;
    private Player players[];

    public Team() {
        players = new Player[14];               // Create 14 empty slots for players
    }

    public Team(String teamName, int teamSize) {
        this.teamName = teamName;
        players = new Player[teamSize];
    }
	
	public void setTeamName(String teamName){
		this.teamName=teamName;
	}
	public String getTeamName(){
		return teamName;
	}

    public void insertPlayer(int pos, Player p) {
        if (pos >= 0 && pos < players.length) {				// [80] ,0 theke boro kintu player.length[11] thekeu boro tai [invalid]
            players[pos] = p;                           // ei jaigai position ta player number hoiye jabe 
        } else {
            System.out.println("Invalid position");
        }
    }
	
	
	public void removePlayer(int pos){                    //remove player 
		if(pos>=0 && pos<players.length){
			players[pos]=null;
		}
		System.out.println("Remove player number:"+pos);
	}
	
	
	
	public Player getPlayer(int pos){             // show one player info
		if(pos>=0 && pos<players.length){
			return players[pos];
		}
		else{
			return null;
		}
	}
	
	public void addPlayer(int pos,Player p){
		if(pos>=0 && pos<players.length){
			players[pos]=p;
		}
		else{
			System.out.println("invalid position");
		}
	}
	
			
	
	
	
	public void setPlayerName(int pos, String newName){
		if(pos >= 0 && pos < players.length){               //update player name 
			players[pos].setPlayerName(newName);
		}
		else{
			System.out.println("Invalid position");
		}
	}

    public void showTeam() {
      // System.out.println("------------------");
        System.out.println("Team Name:"+teamName);
        for (int i = 0; i < players.length; i++) {   
            if (players[i] != null) {												//Skip empty positions
                System.out.println("Player: " + i);      //player number print korbe
                players[i].showPlayer();                    // player file a chole jabe [showPlayer] print korbe
            }
        }
        System.out.println("------------------");
    }
}

/* 0 → null  loop use 
1 → null  
2 → Rahim  
3 → null  
4 → Jamal  
5 → null  
6 → null  
7 → Kamal  
8 → null  
9 → null  
10 → null */

