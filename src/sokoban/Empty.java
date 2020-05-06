package sokoban;

public class Empty extends Enterable{
    int y;
    int x;
    public boolean workerActive;
    public boolean crateActive;
    public Empty(int y, int x) {
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
        crateActive =true;

    }
    public String toString(){
        if(crateActive){return "x";};
        if(workerActive){return "w";}
        return ".";}
}
