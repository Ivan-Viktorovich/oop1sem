package homeworkSem1;

public class Animal {
    private String name;
    private String color;
    private Integer weight;
    public Animal(String name, String color, Integer weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    private void toGo(){
        System.out.println("Двигается");
    }
    private void fly(){
        System.out.println("Летает");
    }
    private void swim(){
        System.out.println("Плавает");
    }
    public void note(){
        toGo();
        fly();
        swim();
    }
    public String toString(){
        return String.format("Животное: %s, Цвет: %s, Вес: %s", name, color, weight);
    }
    
}