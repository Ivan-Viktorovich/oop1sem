package homeworkSem1;

public class AnimalNoFly extends Animal{

    public AnimalNoFly(String name, String color, Integer weight) {
        super(name, color, weight);
    }
    private void toGo(){
        System.out.println("Двигается");
    }
    private void swim(){
        System.out.println("Плавает");
    }
    public void note(){
        toGo();
        swim();
    }
    
}
