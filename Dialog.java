public class Dialog {

    protected int ikkunankorkeus;
    protected int ikkunanleveys;

    protected String type;

    public Dialog(int ikkunanleveys, int ikkunankorkeus){

        this.ikkunankorkeus = ikkunankorkeus;
        this.ikkunanleveys = ikkunanleveys;
        this.type = "default";
    }

    public Dialog(int ikkunankorkeus, int ikkunanleveys, String type){

            this.ikkunankorkeus = ikkunankorkeus;
            this.ikkunanleveys = ikkunanleveys;
            this.type = type;
        }
        public String sivunkuvaus(){
            return "Dialog type "+type+" Ikkunan leveys "+ikkunanleveys+" Ikkunan korkeus "+ikkunankorkeus;

        }
    }
