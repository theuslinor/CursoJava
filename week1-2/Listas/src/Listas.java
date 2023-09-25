import java.util.ArrayList;

public class Listas{
    public static void main(String[] args) {
        ArrayList<String> minhaLista = new ArrayList<>();
        ArrayList<String> minhaLista1 = new ArrayList<>();
        ArrayList<String> minhaLista2 = new ArrayList<>();
        minhaLista.add("Maria");
        minhaLista.add("Jorge");
        minhaLista.add("Sergio");

        System.out.println(minhaLista);

        minhaLista.add(2, "Cão");
        System.out.println(minhaLista);

        minhaLista1.add("João");
        minhaLista1.add("Ana");
        minhaLista1.add("Pedro");

        minhaLista2.add("Sofia");
        minhaLista2.add("Isabella");
        minhaLista2.add("Matheus");

        minhaLista.addAll(2, minhaLista1);
        minhaLista.addAll(5, minhaLista2);

        for(String word:minhaLista){
            System.out.print(word + " ");
        }
    }
}