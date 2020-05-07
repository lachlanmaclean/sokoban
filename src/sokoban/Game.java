package sokoban;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Game{

    public List<Level> allMyLevels = new ArrayList<Level>();

    public int LevelIndex;
    public static int totalLevels=0;
    public int gameWidth;



    public Game() {

    }

    public void addLevel(String levelname, int height, int width, String levelmap) {

        Level level = new Level(levelname, height, width, levelmap);
        this.allMyLevels.add(level);
        this.gameWidth = width;


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



    public void move(Direction direction) {
        int workerx = 0;
        int workery =0;

        //Get Worker Position
        Placeable[][] thePlaceables = this.allMyLevels.get(LevelIndex).allPlaceables;
        for(int y =0;y<thePlaceables.length;y++){
            for(int x = 0; x < gameWidth; x++){
                if(thePlaceables[y][x].toString() == "w"){


                    System.out.println(String.format("Worker is at [%s][%s]", x, y));
                    workerx = x;
                    workery = y;
                }
            }
        }
        //Get Worker Position

        switch (direction){
            case RIGHT:
                break;
            case LEFT:
                int xoffset = workerx + direction.getX();
                int yoffset = workery + direction.getY();
                System.out.println(String.format("Worker wants to go to [%s][%s]", xoffset, yoffset));

                System.out.println("LEFT IS PRESSED");

               break;
            case UP:
                break;
            case DOWN:
                break;


        }


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