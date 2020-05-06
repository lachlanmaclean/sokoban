package sokoban;
import java.util.ArrayList;
import java.util.List;

public class Game {


    public List<Level> allMyLevels = new ArrayList<Level>();

    public int LevelIndex;
    public int totalLevels;
    public int actualLevel;



    public Game() {

    }



    public void addLevel(String levelname, int height, int width, String levelmap) {

        Level level = new Level(levelname, height, width, levelmap);
        this.allMyLevels.add(level);
        this.LevelIndex = allMyLevels.size()-1;
        this.actualLevel = allMyLevels.size();



    }

    public int getLevelCount() {
        int result = 0;

        if (allMyLevels.isEmpty()) {
            result = this.LevelIndex;

        } else
            result = this.actualLevel;

        return result;


    }
    public String getCurrentLevelName() {

        String result = "";

        if (allMyLevels.isEmpty()) {
            result = "no levels";
        }
        else
        result = this.allMyLevels.get(LevelIndex).name;
       // System.out.println(result);
        return result;

    }


//======================================

    public List<String> getLevelNames = new ArrayList<String>();
    getLevelNames.add("1");

    public List<String> getLevelNames() {
        return getLevelNames;
    }

    //=====================
    public void move(Object right) {
    }

    public String toString() {
        String result = "";

        if (allMyLevels.isEmpty()){
            result = "no levels";
            return result;
        }
        else



            result += this.allMyLevels.get(LevelIndex).toString(LevelIndex, allMyLevels.size()); //LEVEL. ToSTRING




        //result +=
        //result = String.format(allMyLevels.get(this.LevelIndex).name.toString());

        return result;


    }

}