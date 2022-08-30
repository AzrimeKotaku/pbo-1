package tugaspbo;

public class TugasPbo{

    public static void main(String[] args) {
 
    Agent agent1 = new Agent();
    Agent agent2 = new Agent("Azri", 100);
    Player player1 = new Player();
    Player player2 = new Player(10, 1);
    
    agent1.info();
    agent2.info();
    player1.InfoPlayer();
    player2.InfoPlayer();
    

    }
    
}
