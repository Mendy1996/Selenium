package utilities;

//import com.ebay.xcelite.annotations.Column;

public class Siren {

    //@Column(name="numeroSiren")
    private String numeroSiren;

    //@Column (name="utilise")
    private String utilise;

    public Siren() {
    }

    public String getNumeroSiren() {
        return numeroSiren;
    }

    public void setNumeroSiren(String numeroSiren) {
        this.numeroSiren = numeroSiren;
    }

    public String getUtilise() {
        return utilise;
    }

    public void setUtilise(String utilise) {
        this.utilise = utilise;
    }
}
