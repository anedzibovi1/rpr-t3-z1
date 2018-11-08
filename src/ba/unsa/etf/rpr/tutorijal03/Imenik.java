package ba.unsa.etf.rpr.tutorijal03;


import java.util.*;
import java.lang.String;

public class Imenik {
    Map<String, TelefonskiBroj> mapa = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        if(!this.mapa.containsKey(ime))
            this.mapa.put(ime, broj);

    }
    public String dajBroj(String ime) {
        String s=new String();
        s=this.mapa.get(ime).ispisi();
        return s;
    }

    public static String getKeyFromValue(Map hm, TelefonskiBroj value) {
        for (java.lang.Object s : hm.keySet()) {
            if (hm.get(s).equals(value)) {
                return (String) s;
            }
        }
        return null;
    }

    public String dajIme(TelefonskiBroj broj) {
            return getKeyFromValue(mapa, broj);
    }

    public String naSlovo(char s) {
        String d = new String();
        int i = 0;
        for (String key : mapa.keySet()) {
            char c = key.charAt(0);
            if (Objects.equals(c, s)) {
                i++;
                d += i + "." + key + "-" + mapa.get(key).ispisi();
            }
        }
        return d;
    }

    public Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> set = new TreeSet<String>();
        for(String s : mapa.keySet()) {
            if(mapa.containsValue(g)) set.add(s);
        }
        return set;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> set = new TreeSet<TelefonskiBroj>();
        for(String s : mapa.keySet()) {
            if(mapa.containsValue(g)) set.add(mapa.get(s));
        }
        return set;
    }

}

