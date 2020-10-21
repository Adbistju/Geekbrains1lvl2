public class Wall extends Let{
    protected char iAmWall='w';
    protected char iAmTrack='f';
    protected int distand;
    protected Wall(int distand){
        this.distand=distand;
    }
    public boolean valid(int s){
        if(distand>=s){
            return true;
        }else {
            return true;
        }
    }
    @Override
    public String toString(){
        return "Wall '"+distand+'\'';
    }
    public int getDistand(){
        return distand;
    }
    public void setDistand(int distand1){
        distand=distand1;
    }
    public char getiAmWall(){
        return iAmWall;
    }
    public char getiAmTrack(){
        return iAmTrack;
    }
}