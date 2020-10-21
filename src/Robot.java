public class Robot extends Unit{
    public static int runLimitation=800;
    public static int jumpLimitation=30;

    protected Robot(String name, int jump, int run) {
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
        return "Robot '"+"name "+name+" jump " + jump + "run " + run+'\'';
    }
    public String getName(){
        System.out.print("Robot ");
        return name;
    }
}
