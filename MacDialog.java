 public class MacDialog extends Dialog {
    
    public MacDialog(int ikkunanleveys, int ikkunankorkeus) {
        super(ikkunanleveys, ikkunankorkeus);
        this.type = "Mac";
    }

    public int getTruePixels() {
        return ikkunanleveys * (ikkunankorkeus + 5);
    }
}