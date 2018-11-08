package ba.unsa.etf.rpr.tutorijal03;



public class MedunarodniBroj extends TelefonskiBroj{
    String drzava;
    String broj;

    MedunarodniBroj(String drzava, String broj) {
        this.drzava=drzava;
        this.broj=broj;
    }
    public String ispisi() {
        String s=new String();
        s = this.drzava + this.broj;
        return s;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
