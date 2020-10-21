public class Track extends Let{
    protected char iAmTrack='t';
    protected char iAmWall='f';
    protected int distand;
    protected Track(int distand){
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
        return "Track '"+distand+'\'';
    }
    public int getDistand(){
        return distand;
    }
    public void setDistand(int distand1){
        distand=distand1;
    }
    public char getiAmTrack(){
        return iAmTrack;
    }
    public char getiAmWall(){
        return iAmWall;
    }
}