package tugaspbo;

public class Agent {

    private int health, pos_x, pos_y;
    private String name;

    public Agent() {
    }

    public Agent(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void SetPos(int x, int y) {
        this.pos_x = x;
        this.pos_y = y;
    }

    public int GetPos() {
        return this.pos_x + this.pos_y;
    }

    public void info() {
        System.out.print("name: " + this.name);
        System.out.println(" health: " + this.health);
    }
}
