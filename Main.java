public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Cat("Katti");
        Cat cat1 = new Cat("Kissa");
        Horse horse1 = new Horse("Hevonen");

        animal1.breathe();
       cat1.breathe();
       horse1.talk();

    }
}