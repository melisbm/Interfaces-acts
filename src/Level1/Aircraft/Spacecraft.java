package Level1.Aircraft;

public class Spacecraft implements Flyable{

    public Spacecraft(){}

    @Override
    public void fly_obj(){
        System.out.println("Spacecraft is flying");
    };
}
