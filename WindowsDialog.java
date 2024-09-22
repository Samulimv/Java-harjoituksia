class WindowsDialog extends Dialog {

    public WindowsDialog(int ikkunanleveys, int ikkunankorkeus) {
        super(ikkunanleveys, ikkunankorkeus);
        this.type = "Win";
    }

    public int getTruePixels() {
        return ikkunanleveys * (ikkunankorkeus + 10);
    }
}