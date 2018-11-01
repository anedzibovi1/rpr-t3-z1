package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj {
    public abstract String ispisi();
    public abstract int hashCode();
}

class FiksniBroj extends TelefonskiBroj {
    public String broj;
    public enum Grad {BIHAC, ORASJE, TUZLA, ZENICA, GORAZDE, TRAVNIK, MOSTAR, SIROKIBRIJEG, SARAJEVO, LIVNO, BRCKO};
    
}


public class Main {

    public static void main(String[] args) {
	    System.out.println("Cilj vježbe je napraviti aplikaciju \"ETF Telefonski imenik\". Aplikacija se treba sastojati od sljedećih klasa:\n" +
				"Apstraktna klasa TelefonskiBroj sadrži javnu apstraktnu metodu String ispisi() koja vraća broj u tekstualnoj formi pogodnoj za ispis, te apstraktnu metodu int hashCode() objašnjenu na predavanjima. Iz ove klase izvedene su sljedeće klase:\n" +
				"FiksniBroj sadrži konstruktor FiksniBroj(Grad grad, String broj). Parametar broj je dio telefonskog broja bez pozivnog broja npr. \"123-456\", a grad je promjenljiva pobrojanog tipa koji označava pozivni broj koji treba koristiti npr.:\n" +
				"\tenum Grad { SARAJEVO, TUZLA, ZENICA…}\n" +
				"Spisak pozivnih brojeva se može naći ovdje. Umjesto imena kantona koristite ime glavnog grada kantona (kao u primjeru iznad), a umjesto Brčko distrikta stavite BRCKO. Metoda ispisi() treba vratiti broj oblika \"033/123-456\".\n" +
				"MobilniBroj ima konstruktor MobilniBroj(int mobilnaMreza, String broj) pri čemu oznaka mobilne mreže predstavlja drugu i treću cifru pozivnog broja tj. 60-67 (detaljnije informacije možete naći na istoj stranici). Metoda ispisi vraća broj istog oblika \"061/987-654\".\n" +
				"MedunarodniBroj ima konstruktor MedunarodniBroj(String drzava, String broj) pri čemu string drzava sadrži kompletan pozivni broj za državu npr. \"+387\".\n" +
				"Klasa Imenik omogućuje da se pretražuju brojevi koristeći klasu HashMap. Ova klasa treba sadržavati sljedeće javne metode:\n" +
				"void dodaj(String ime, TelefonskiBroj broj)\n" +
				"String dajBroj(String ime) - vraća telefonski broj osobe pod imenom ime u formi stringa pozivajući metodu ispisi() klase TelefonskiBroj,\n" +
				"String naSlovo(char s) - vraća sve brojeve u telefonskom imeniku za osobe čije ime počinje na slovo s u formatu:\n" +
				"1. Ime Prezime - broj\n" +
				"2. Ime Prezime - broj\n" +
				"…\n" +
				"Set<String> izGrada(Grad g) - vraća skup Stringova koji sadrži imena i prezimena svih osoba koje žive u gradu g (istog pobrojanog tipa koji je dat u klasi FiksniBroj), što se može saznati ako osoba ima fiksni broj telefona u tom gradu. Pri tome skup treba biti sortiran abecedno.\n" +
				"Set<TelefonskiBroj> izGradaBrojevi(Grad g) - vraća brojeve za osobe iz grada g. Ovaj skup treba biti sortiran po stringu koji se dobije metodom ispisi().\n" +
				"Klasa Program treba sadržavati main metodu koja korisniku omogućuje da unosom naredbi pomoću tastature pozove sve metode klasa navedenih iznad.\n" +
				"\n" +
				"Dodajte nedostajuće testove po potrebi. Prilikom rješavanja zadatka obavezno se pridržavati pravila rada koja su navedena na predavanjima, između ostalog:\n" +
				"ispravno imenovanje paketa, klasa, metoda i promjenljivih,\n" +
				"primjenu komentara,\n" +
				"atomic commits.\n");
    }
}
