public class Man extends Unit {

    public static int runLimitation=400;
    public static int jumpLimitation=10;

    protected Man(String name, int jump, int run) {
        super(name, jump, run);
    }
    @Override
    public void jump(){
        System.out.println("Jump!");
    }
    @Override
    public void run(){
        System.out.println("Run!");
    }
    @Override
    public String toString(){
        return "Man '"+"name "+name+" jump " + jump + "run " + run+'\'';
    }
    public String getName(){
        System.out.print("Man ");
        return name;
    }
}
