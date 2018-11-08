package ba.unsa.etf.rpr.tutorijal03;




public class FiksniBroj extends TelefonskiBroj {
    public String broj;
    public enum Grad {
        SARAJEVO("033"), BIHAC("037"), ORASJE("031"), TUZLA("035"), ZENICA("032"), GORAZDE("038"), TRAVNIK("030"), MOSTAR("036"), SIROKIBRIJEG("039"), LIVNO("034"), BRCKO("049");
        private String pozivni;
        Grad(String pozivni) {
            this.pozivni=pozivni;
        }
        public String getPozivni() {
            return this.pozivni;
        }
    }
    Grad grad;
    FiksniBroj(Grad grad, String broj) {
        this.broj=broj;
        this.grad=grad;
    }
    public String ispisi() {
        String s= new String();
        s+=this.grad.getPozivni() + "/" + this.broj;
        return s;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}