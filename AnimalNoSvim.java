package homeworkSem1;

public class AnimalNoSvim extends Animal{

    public AnimalNoSvim(String name, String color, Integer weight) {
        super(name, color, weight);
    }
    private void toGo(){
        System.out.println("Двигается");
    }
    private void fly(){
        System.out.println("Летает");
    }
    public void note(){
        toGo();
        fly();
    }
    
}
