public class Czlowiek {
    public int zycie;
    public int exp;
    public int obrazenia;

    Czlowiek(){
        zycie = 100;
        exp = 0;
        obrazenia = 0;
    }
    public void walka(int obrazenia){
        System.out.println("Zaatakowałeś kogoś!");
        zycie-=obrazenia;
        exp+=23;
        obrazenia+=obrazenia;
    }
    public void leczenie(int 100){
        zycie+=100;
        System.out.println("Uleczyłeś się.");
    }
    public void Statystyki(){
        System.out.println("Oto twoje statystyki:");
    }
}
