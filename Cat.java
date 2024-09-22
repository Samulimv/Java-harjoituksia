public class Cat extends Animal {

    public Cat(String name) {
        super(name); 
    }

    public void talk() {
        System.out.println(name + " says: Meow!");
        for (int i = 0; i < 5; i++) {
            breathe();
        }
    }
}