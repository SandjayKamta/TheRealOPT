public class KlantType extends Milieukorting
{
    private String klanttype;
    private Milieukorting kortingpercentage;

    public KlantType(String klanttype, int kortingpercentage) {
        super(kortingpercentage);
        this.klanttype= klanttype;
    }

    public String getKlanttype() {
        return klanttype;
    }

    public void setKlanttype(String klanttype) {
        this.klanttype = klanttype;
    }
}
