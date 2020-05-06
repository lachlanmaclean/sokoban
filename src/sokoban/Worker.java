package sokoban;

public class Worker extends Moveable {
    int y;
    int x;
    public Worker(int y, int x, Object o) {
        this.y = y;
        this.x = x;
    }
    public String toString(){
        return "w"; }
}
