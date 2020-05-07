package sokoban;


public class Level extends Game{
    public int completedCount;
    public String name;
    public int height;
    public int width;
    public String levelmap;
    public int targetCount;
    public int moveCount;
    public int totalLevels;
    public Placeable[][] allPlaceables;

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
        int m = 0;
        String result = "";

        this.allPlaceables = new Placeable[this.height][this.width];

        while (y < this.height) {
            String current_line = this.levelmap.substring(m, m + this.width);
            for (int x=0; x < current_line.length();x++){


                char c = current_line.charAt(x);
                if(c == '#'){allPlaceables[y][x] = new Wall(y,x);}
                if(c == 'x'){allPlaceables[y][x] = new Crate(y,x, null);}
                if(c == '+'){allPlaceables[y][x] = new Target(y,x);}
                if(c == '.'){allPlaceables[y][x] = new Empty(y,x);}
                if(c == 'w'){allPlaceables[y][x] = new Worker(y,x, null);}


            }

            //System.out.print(current_line);
            m += this.width;
            y++;

        }

        for (Placeable[] aPlaceable : allPlaceables){
            result+="\n";
            for (Placeable row: aPlaceable){
                result+= row;
            }

        }
        return result+"\n";

    }


    public String toString() {

        String result = "";

        result += this.getName(); //Level1
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

    public int getMoveCount() { return this.moveCount++; }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

}
