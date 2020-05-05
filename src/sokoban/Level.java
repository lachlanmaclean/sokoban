package sokoban;

public class Level {
    public Object completedCount = 0;
    public String name;
    public int height;
    public int width;
    public String levelmap;
    public int moveCount;
    public int targetCount;


    public Level(String name, int width, int height, String levelmap) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.levelmap = levelmap;

    }

    public String toString() {
        return String.format(levelmap.toString());


    }
}
