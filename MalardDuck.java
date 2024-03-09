// VANSHIKA TYAGI
// 22070126128
// AIML B-3

public class MalardDuck extends Duck{
    public MalardDuck(){
        quackBehaviour=new Quack();
        flyBehaviour=new FlyWithWings();
        swimBehaviour= new Drown();

    }
    void display(){
        System.out.println("This is MalardDuck Duck......");

    }
}