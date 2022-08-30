package tugaspbo;

public class Player {
    private int direction, id, strength;
    
    public Player(){
        
    }
    
    public Player(int id, int direction){
        this.direction = direction;
        this.id = id;
    }
    
    public void AddStrength(int str){
        this.strength = str;
    }
    
    public void InfoPlayer(){
        System.out.print("Player id: " + this.id);
        System.out.println(" direction: " + this.direction);
    }
}
