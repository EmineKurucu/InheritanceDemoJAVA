//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());

        KrediUI krediUI1 = new KrediUI();
        krediUI1.KrediHesapla(new AskerKrediManager());

        KrediUI krediUI2 = new KrediUI();
        krediUI2.KrediHesapla(new TarimKrediManager());



    }
}