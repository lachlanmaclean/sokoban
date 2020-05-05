package sokoban;
import java.util.ArrayList;
import java.util.List;

public class Game {

    ArrayList<String> levels = new ArrayList<String>();
    public String name;
    public int height;
    public int width;
    public String levelmap;
    private String[] mapArr;


    public Game() {

    }


    public int getLevelCount() {

       return levels.size();
    };

    public String getCurrentLevelName() {
        return "hi";
    }


    public List<String> getLevelNames() {
        return null;

    }

    public void addLevel(String levelname, int height, int width, String levelmap) {
    this.name = levelname;
    this.height = height;
    this.width = width;
    this.levelmap = levelmap;

    this.mapArr = levelmap.split("\\+");


    }

    public void move(Object right) {
    }


    public String toString() {
        return String.format(String.valueOf(mapArr.length));


    }

}



