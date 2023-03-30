public class EssentieleOptie extends Optie{
    private String essentieleoptie;

    public EssentieleOptie(String essentieleoptie, String omschrijvingoptie) {
        super(omschrijvingoptie);
        this.essentieleoptie = essentieleoptie;
    }

    public String getEssentieleoptie() {
        return essentieleoptie;
    }

    public void setEssentieleoptie(String essentieleoptie) {
        this.essentieleoptie = essentieleoptie;
    }
}
