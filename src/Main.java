import java.util.Random;

public class Main {
    protected Unit[] units;
    protected Let[] let;
    protected int numberOfUnits;
    protected String[] name;
    protected Random random=new Random();

    public static void main(String[] args) {
        Main d= new Main();
        d.mainDev();

    }
    public void mainDev(){
        initUnit();
        initLet();
        print();
        trackLet();
    }
    public void initUnit(){
        name= new String[10];
        for (int i = 0; i < name.length; i++) {
            name[i]="a"+i;
        }
        numberOfUnits=7;
        units=new Unit[numberOfUnits];
        int x,y,n;
        for (int i = 0; i < units.length; i++) {
            int r=random.nextInt(3);
            switch (r){
                case 0:
                    x=random.nextInt(Cat.jumpLimitation);
                    y=random.nextInt(Cat.runLimitation);
                    n=random.nextInt(name.length);
                    units[i]=new Cat(name[n],x,y);
                    break;
                case 1:
                    x=random.nextInt(Man.jumpLimitation);
                    y=random.nextInt(Man.runLimitation);
                    n=random.nextInt(name.length);
                    units[i]=new Man(name[n],x,y);
                    break;
                case 2:
                    x=random.nextInt(Robot.jumpLimitation);
                    y=random.nextInt(Robot.runLimitation);
                    n=random.nextInt(name.length);
                    units[i]=new Robot(name[n],x,y);
                    break;
            }
        }
    }
    public void print(){
        for (int i = 0; i < units.length; i++) {
            System.out.println(units[i].toString());
        }
        for (int i = 0; i < let.length; i++) {
            System.out.println(let[i].toString());
        }
    }
    public void initLet(){
        int x,y;
        let= new Let[random.nextInt(11)];
        for (int l = 0; l < let.length; l++) {
            x=random.nextInt(2);
            if(x==0){
                y=random.nextInt(400);
                let[l]=new Track(y);
            }else if(x>=1){
                y=random.nextInt(30);
                let[l]=new Wall(y);
            }
        }
    }
        public void trackLet(){
        int unitsSucses=0;
        if(let.length==0){
            System.out.println("Препядстивий нет!))) ");
            unitsSucses=units.length;
            System.out.println("All units is win! " + unitsSucses);
            return;
        }
        for (int i=0; i<units.length; i++){
            System.out.println((i+1)+ " Персонаж преодолевает дистанцию" +"_______________________________________________________");
            for (int j = 0; j < let.length; j++) {
                if(let[j].getiAmTrack()=='t'){
                    if(units[i].run>=let[j].getDistand()){
                        System.out.println(units[i].getName() + " RUN");
                        if(j==let.length-1){
                            System.out.println("Distand sucses!");
                            unitsSucses++;
                        }
                    }else{
                        System.out.println(units[i].getName()+ " no run");
                        break;
                    }
                }else if(let[j].getiAmWall()=='w'){
                    if(units[i].jump>=let[j].getDistand()){
                        System.out.println(units[i].getName() + " JUMP");
                        if(j==let.length-1){
                            System.out.println("Distand sucses!");
                            unitsSucses++;
                        }
                    }else{
                        System.out.println(units[i].getName()+ " no jump");
                        break;
                    }
                }
            }
        }
        System.out.println(unitsSucses+" Unit Winner");
    }
}