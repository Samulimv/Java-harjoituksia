public class WindowsDialog extends Dialog{

    public WindowsDialog(int ikkunankorkeus, int ikkunanleveys){
        super(ikkunanleveys, ikkunankorkeus);
        this.type = "Win";
    }
    public int getTruePixels(){
        return (ikkunanleveys*(ikkunankorkeus+10));
    }
}
