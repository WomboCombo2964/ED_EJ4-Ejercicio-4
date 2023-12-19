public class ClaseBelen {

    public static void main(String[] args) {
        dibujarArbol();
    }

    public static void dibujarArbol() {
        System.out.println("¡Feliz Navidad!");
        System.out.println();

        int altura = 5;
      
        // Imprime las ramas del árbol
        for (int i = 1; i <= altura; i++) {
            for (int j = altura - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k % 2 == 0) {
                    System.out.print("o");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Imprime el tronco del árbol
        for (int i = 0; i < altura - 1; i++) {
            for (int j = 0; j < altura - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}