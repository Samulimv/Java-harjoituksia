public class Main {
    public static void main(String[] args) {
        WindowsDialog windowsDialog = new WindowsDialog(64, 64);
        System.out.println(windowsDialog.getTruePixels());
        System.out.println("True Pixels (Windows): " + windowsDialog.getTruePixels());

        MacDialog macDialog = new MacDialog(50, 10);
        System.out.println(macDialog.getTruePixels());
        System.out.println("True Pixels (Mac): " + macDialog.getTruePixels());

        Animal animal1 = new Cat("Katti");
        Cat cat1 = new Cat("Kissa");
        Horse horse1 = new Horse("Hevonen");

        animal1.breathe();
       cat1.breathe();
       horse1.talk();
    }
}