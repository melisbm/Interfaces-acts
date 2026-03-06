package Level1.Aircraft;

public class Airplane implements Flyable{

    public Airplane(){}

    @Override
    public void fly_obj(){
        System.out.println("Airplane is flying");
    };
}
