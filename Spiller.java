/**
 * @author jarle
 */


public class Spiller {

    private String navn;
    private int posisjon;

    /**
     * meteode for å oprette en spiller
     * @param navn
     * @param posisjon
     */
    public Spiller(String navn, int posisjon) {
        this.navn = navn;
        this.posisjon = posisjon;

    }
    public String getNavn() {
        return navn;
    }

    public int getPosisjon() {
        return posisjon;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    public void  setPosisjon(int posisjon) {
        this.posisjon = posisjon;
    }
}
