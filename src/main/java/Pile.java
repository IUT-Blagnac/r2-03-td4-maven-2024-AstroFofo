public class Pile {
    private int[] elements;
    private int top;
    private int maxSize;

    // Question 1: Empiler des éléments dans la pile
    public void empiler(int element) {
        if (!estPlein()) {
            top++;
            elements[top] = element;
        } else {
            System.out.println("La pile est pleine, impossible d'empiler.");
        }
    }

    // Question 2: Obtenir le sommet de la pile
    public int sommet() {
        if (!estVide()) {
            return elements[top];
        } else {
            System.out.println("La pile est vide, pas de sommet à retourner.");
            return -1; // Valeur par défaut si la pile est vide
        }
    }

    // Question 3: Dépiler un élément de la pile
    public int depiler() {
        if (!estVide()) {
            int elementDepile = elements[top];
            top--;
            return elementDepile;
        } else {
            System.out.println("La pile est vide, impossible de dépiler.");
            return -1; // Valeur par défaut si la pile est vide
        }
    }

    // Question 4: Vider la pile
    public void vider() {
        top = -1;
    }

    public boolean estVide() {
        return top == -1;
    }

    public boolean estPlein() {
        return top == maxSize - 1;
    }

    public Pile(int maxSize) {
        this.maxSize = maxSize;
        this.elements = new int[maxSize];
        this.top = -1;
    }

    public static void main(String[] args) {
        Pile pile = new Pile(5);
        
        // Test des fonctionnalités de la pile
        pile.empiler(10); // Empiler 10
        pile.empiler(20); // Empiler 20
        pile.empiler(30); // Empiler 30

        System.out.println("Sommet de la pile : " + pile.sommet()); // Afficher le sommet
        System.out.println("Dépiler : " + pile.depiler()); // Dépiler un élément
        System.out.println("Sommet de la pile après dépiler : " + pile.sommet()); // Afficher le sommet après dépiler

        pile.vider(); // Vider la pile
        System.out.println("La pile est vide : " + pile.estVide()); // Vérifier si la pile est vide
    }
}
