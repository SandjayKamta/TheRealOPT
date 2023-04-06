package source.src;

public class Klant extends Gebruiker
{
    private String adres;
    private int telefoonnummer;

    public Klant(String naam, String email, String adres, int telefoonnummer) {
        super(naam, email);
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
