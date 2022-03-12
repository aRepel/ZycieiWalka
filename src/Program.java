public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Czlowiek gracz = new Czlowiek();
        String akcja = "1";
        while (!akcja.equals("x")) {
            System.out.println("Proszę wybrać akcję(wyjście(x), walka(a), leczenie(h), wyświetlanie statystyk(q))");
            akcja = input.next();
            if (akcja.equals("x")) {
                break;
            }

        }
    }
}