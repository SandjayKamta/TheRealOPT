public class KlantType
{
    private String adres;
    private int telefoonnummer;

    public KlantType(String adres, int telefoonnummer) {
        this.adres = adres;
        this.telefoonnummer = telefoonnummer;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }
}
