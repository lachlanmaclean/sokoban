package sokoban;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

public class Game{

    public List<Level> allMyLevels = new ArrayList<Level>();

    public int LevelIndex;
    public static int totalLevels=0;

    public Game() {

    }

    public void addLevel(String levelname, int height, int width, String levelmap) {

        Level level = new Level(levelname, height, width, levelmap);
        this.allMyLevels.add(level);

        this.totalLevels = this.totalLevels + 10;

        this.LevelIndex = allMyLevels.size()-1;


    }
    public int getLevelCount() {
        if (this.allMyLevels.isEmpty()) {

            return 0;
        } else

        this.totalLevels = this.allMyLevels.size();
        return this.totalLevels;
    }

    public String getCurrentLevelName() {

        String result = "";

        if (allMyLevels.isEmpty()) {
            result = "no levels";
        }
        else
        result = this.allMyLevels.get(LevelIndex).name;

        return result;

    }

    public List<String> getLevelNames() {
        List<String> leveltitles = new ArrayList<>();
        int i;
        for( i=0; i < allMyLevels.size();i++){
            leveltitles.add(this.allMyLevels.get(i).name);

        }
        return leveltitles;
    }

    public void move(Direction right) {





        }

    public String toString() {
        String result = "";

        if (allMyLevels.isEmpty()){
            result = "no levels";
            return result;
        }
        else
            result += this.allMyLevels.get(LevelIndex).toString(); //LEVEL. ToSTRING


        return result;


    }

}