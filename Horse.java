public class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }

    public void talk() {
        System.out.println(name + " says: Neigh!");
        for (int i = 0; i < 5; i++) {
            breathe();
        }
    }
}