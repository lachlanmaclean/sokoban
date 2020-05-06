package sokoban;

public class Wall extends Immovable {
    int y;
    int x;

    public Wall(int y, int x) {

        this.y = y;
        this.x = x;
    }

    public String toString(){
        return "#";
    }
}
