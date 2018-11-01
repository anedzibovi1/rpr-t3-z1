package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{
    public int mreza;
    public String broj;

    MobilniBroj(int mobilnaMreza, String broj) {
        this.mreza=mobilnaMreza;
        this.broj=broj;
    }

    public String ispisi() {
        String s=new String();
        s+="0" + this.mreza + "/" + this.broj;
        return s;
    }
}
