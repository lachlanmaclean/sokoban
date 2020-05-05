package sokoban;

import java.util.ArrayList;
import java.util.List;

public class Level {
    public int completedCount;
    public String name;
    public int height;
    public int width;
    public String levelmap;
    public int moveCount;
    public int targetCount;
    public List<String> mapArr = new ArrayList<String>();

    public String[] Array;

    public Level(String name, int height, int width, String levelmap) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.levelmap = levelmap;

        int count = 0;
        for (int i=0; i < levelmap.length(); i++)
        {
            if(levelmap.charAt(i) == '+')
                count++;
            this.targetCount = count;
        }


    }

    public String toString() {


        int y = 0;
        int x = 0;
        String result ="";
        while(y < height){

            String current_line = levelmap.substring(x,  x + width);
            mapArr.add(current_line);

            //System.out.print(current_line);
            result += current_line + "\n";
            x += width;
            y ++;

        }


        //return String.format(levelmap.toString());
        return result;

    }

    public int getCompletedCount() {
        return this.completedCount;
    }


    public String getName() {
        return this.name;
    }

    public int getMoveCount() {
        return this.moveCount;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
