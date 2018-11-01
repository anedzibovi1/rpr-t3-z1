package ba.unsa.etf.rpr.tutorijal03;


import java.util.HashMap;
import java.util.Map;


public class Imenik {
    Map<String, TelefonskiBroj> mapa = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        if(!this.mapa.containsKey(ime))
            this.mapa.put(ime, broj);

    }
    public void dajBroj(String ime) {
        this.mapa.get(ime).ispisi();
    }

    public static String getKeyFromValue(Map hm, Object value) {
        for (Object s : hm.keySet()) {
            if (hm.get(s).equals(value)) {
                return (String) s;
            }
        }
        return null;
    }

    public String dajIme(TelefonskiBroj broj) {
            return this.getKeyFromValue(mapa, broj);
    }
    
}

