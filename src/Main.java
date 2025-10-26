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
        // 2. Wywołanie Zadanie2_2
        System.out.println("\n[Wywołuję Program2.main...]");
        try {
            // Z przekazywaniem argumentów (np. z argumentów przekazanych do Main)
            String[] args2 = {"parametr1", "parametr2"}; 
            Zadanie2_2.main(args2); 

            // Opcjonalnie: możesz przekazać argumenty, które otrzymała klasa Main:
            // Program2.main(args); 

        } catch (Exception e) {
            System.err.println("Błąd podczas uruchamiania Programu 2: " + e.getMessage());
        }
    }
}
