package homeworkSem1;
// Дз: добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса
// наследника Animal, умеющих летать, плавать, бегать. При этом добиться того, чтобы не умеющие летать или плавать, 
// не могли этого сделать. САМОЕ ВАЖНОЕ! В файле readme.md в репозитории гитхаб описать
// какие проблемы в таком проектировании Вы увидели, а также там же написать возникшие при выполнении дз вопросы
// (если они есть)
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Утка", "Корчневый", 2);
        System.out.println(animal);
        animal.note();
        AnimalNoSvim animal1 = new AnimalNoSvim("Сова", "Серый", 5);
        System.out.println(animal1);
        animal1.note();
        AnimalNoFly animal3 = new AnimalNoFly("Собака", "Черный", 32);
        System.out.println(animal3);
        animal3.note();
    }
}
