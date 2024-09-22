public class Dialog {

    protected int ikkunankorkeus;
    protected int ikkunanleveys;
    protected String type;

    public Dialog(int ikkunanleveys, int ikkunankorkeus) {
        this.ikkunanleveys = ikkunanleveys;
        this.ikkunankorkeus = ikkunankorkeus;
        this.type = "default";
    }

    public Dialog(int ikkunanleveys, int ikkunankorkeus, String type) {
        this.ikkunanleveys = ikkunanleveys;
        this.ikkunankorkeus = ikkunankorkeus;
        this.type = type;
    }

    public String getDescription() {
        return "Dialog Type: " + type + ", Width: " + ikkunanleveys + ", Height: " + ikkunankorkeus;
    }
}