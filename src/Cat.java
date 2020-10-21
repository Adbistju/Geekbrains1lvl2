public class Cat extends Unit {

    public static int runLimitation=300;
    public static int jumpLimitation=20;

    protected Cat(String name, int jump, int run) {
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
        return "Cat '"+"name "+name+" jump " + jump + "run " + run+'\'';
    }
    public String getName(){
        System.out.print("Cat ");
        return name;
    }
}
