package ba.unsa.etf.rpr.tutorijal03;

import com.sun.org.apache.xpath.internal.operations.String;

public class MedjunarodniBroj extends TelefonskiBroj{
    String drzava;
    String broj;
    MedjunarodniBroj(String drzava, String broj) {
        this.drzava=drzava;
        this.broj=broj;
    }
    public String ispisi() {
        String s=new String();

        s+=this.broj;
        return s;
    }

}
