public abstract class Unit {
    protected String name;
    protected int jump;
    protected int run;

    protected Unit(String name, int jump, int run){
        this.name=name;
        this.jump=jump;
        this.run=run;
    }
    public abstract void jump();
    public abstract  void run();
    public abstract String getName();
}
