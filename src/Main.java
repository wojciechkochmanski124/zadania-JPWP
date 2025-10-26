public class Main {
    public static void main(String[] args) {
        System.out.println("=== START GŁÓWNEGO PROGRAMU (Main) ===");

        System.out.println("\n[Wywołuję Zadanie2_1.main...]");
        try {
            String[] args1 = {};
            Zadanie2_1.main(args1);
        } catch (Exception e) {
            System.err.println("Błąd podczas uruchamiania Programu 1: " + e.getMessage());
        }
    }
}
