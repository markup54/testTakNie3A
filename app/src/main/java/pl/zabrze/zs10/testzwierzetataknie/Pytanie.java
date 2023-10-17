package pl.zabrze.zs10.testzwierzetataknie;
public class Pytanie {
    private String trescPytania;
    private boolean odpowiedz;
    private int idObrazu;
    private boolean czyUdzielonoPoprawnejOdpowiedzi;
    private String podpowiedz;

    public Pytanie(String trescPytania, boolean odpowiedz, int idObrazu, String podpowiedz) {
        this.trescPytania = trescPytania;
        this.odpowiedz = odpowiedz;
        this.idObrazu = idObrazu;
        this.podpowiedz = podpowiedz;
        czyUdzielonoPoprawnejOdpowiedzi = false;
    }

    public void setCzyUdzielonoPoprawnejOdpowiedzi(boolean czyUdzielonoPoprawnejOdpowiedzi) {
        this.czyUdzielonoPoprawnejOdpowiedzi = czyUdzielonoPoprawnejOdpowiedzi;
    }

    public String getTrescPytania() {
        return trescPytania;
    }

    public boolean isOdpowiedz() {
        return odpowiedz;
    }

    public int getIdObrazu() {
        return idObrazu;
    }

    public boolean isCzyUdzielonoPoprawnejOdpowiedzi() {
        return czyUdzielonoPoprawnejOdpowiedzi;
    }

    public String getPodpowiedz() {
        return podpowiedz;
    }

}
