package sokoban;

public class Target extends Immovable{
    int y;
    int x;
    public boolean workerActive;
    public boolean crateActive;

    public Target(int y, int x) {
        this.y = y;
        this.x = x;
    }


    public void addWorker(Worker worker) {
        this.y = y;
        this.x = x;
        workerActive = true;


    }

    public void addCrate(Crate crate) {
        this.y = y;
        this.x = x;
        crateActive = true;

    }
    public String toString(){
        if(crateActive){return "X";};
        if(workerActive){return "W";}
        else {return "+";}



    }
}
