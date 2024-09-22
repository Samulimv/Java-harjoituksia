public class MacDialog extends Dialog {

    public MacDialog(int ikkunankorkeus, int ikkunanleveys, String type){
        super(ikkunanleveys, ikkunankorkeus);
        this.type = "Mac";
    }
    public int getTruePixels(){
        return (ikkunanleveys*(ikkunankorkeus+5));
    }
}
