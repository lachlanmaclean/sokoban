package sokoban;

import javax.swing.*;
import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.List;


public class Level extends Game{
    public int completedCount;
    public String name;
    public int height;
    public int width;
    public String levelmap;
    public int targetCount;
    public int moveCount;
    public int totalLevels;
    protected Placeable[] [] allPlaceable;

    public List<String> mapArr = new ArrayList<String>();



    public Level(String name, int height, int width, String levelmap) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.levelmap = levelmap;

        int count = 0;
        for(int i=0; i < this.levelmap.length(); i++)
        {    if(levelmap.charAt(i) == '+')
            count++;
        }

       this.targetCount = count;
       totalLevels ++;



    }

    public String getLevelmap() { //-------------------------------------------------------------

        int y = 0;
        int x = 0;
        String result = "";
        while (y < this.height) {

            String current_line = this.levelmap.substring(x, x + this.width);
            mapArr.add(current_line);

            //System.out.print(current_line);
            result += current_line + "\n";
            x += this.width;
            y++;

        }
        return result;

    }


    public String toString() {

        String result = "";

        result += this.getName()+"\n"; //Level1
        result += getLevelmap(); //#########
        result += "move " + getMoveCount()+ "\n"; //move 0

        result += "completed " + this.completedCount + " of " + totalLevels + "\n";




        return result;

    }


    public int getCompletedCount() {
        return this.completedCount;
    }


    public String getName() {
        return this.name;
    }

    public int getMoveCount() { return this.moveCount; }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

}
