package sokoban;
import javax.sound.midi.SysexMessage;
import javax.xml.transform.stax.StAXResult;
import java.lang.reflect.AccessibleObject;
import java.util.ArrayList;
import java.util.List;

public class Game {


    public List<Level> allMyLevels = new ArrayList<Level>();


    public int LevelIndex;

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
            result = this.LevelIndex;

        return result;


    }
    public String getCurrentLevelName() {

        String result = "";

        if (allMyLevels.isEmpty()) {
            result = "no levels";
        }
        else
        result = this.allMyLevels.get(1).name;
        System.out.println(result);
        return result;

    }


    public List<String> getLevelNames() {


        List<String> names = new ArrayList<>();
        for (int i=0; i < actualLevel; i++){
            String str = allMyLevels.get(this.actualLevel).name.toString();

            names.add(str);
        }
        return null;

    }


    public void move(Object right) {
    }

    public String toString() {
        String result = "";

        if (allMyLevels.isEmpty()){
            result = "no levels";
        }
        else
        result = String.format(allMyLevels.get(this.LevelIndex).name.toString());

        return result;


    }

}