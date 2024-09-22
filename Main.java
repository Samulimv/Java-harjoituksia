public class Main {
    public static void main(String[] args) {
        WindowsDialog windowsDialog = new WindowsDialog(64, 64);
        System.out.println(windowsDialog.getTruePixels());
        System.out.println("True Pixels (Windows): " + windowsDialog.getTruePixels());

        MacDialog macDialog = new MacDialog(128, 128, null);
        System.out.println(macDialog.getTruePixels());
        System.out.println("True Pixels (Mac): " + macDialog.getTruePixels());
    }
}