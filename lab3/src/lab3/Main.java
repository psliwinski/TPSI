/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.lang.NullPointerException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, NullPointerException {
        // Zadanie 1
        Set<String> zbiorDni = new TreeSet<>();
        zbiorDni.add("poniedziałek");
        zbiorDni.add("wtorek");
        zbiorDni.add("środa");
        zbiorDni.add("czwartek");
        zbiorDni.add("piątek");
        zbiorDni.add("sobota");
        zbiorDni.add("niedziela");
        for (String dzien : zbiorDni) {
            System.out.println(dzien);
        }
        //Zadanie 2
        Map<String, Teacher> teachers = new HashMap<>();
        teachers.put("Sieci neuronowe", new Teacher("Krzysztof", "Krawczyk"));
        teachers.put("Gry komputerowe", new Teacher("Norbert", "Gierczak"));
        teachers.put("E-learning", new Teacher("Łukasz", "Stanisławowski"));
        teachers.put("Programowanie obiektowe", new Teacher("Mateusz", "Morawiecki"));

        Teacher teacher = teachers.get("Programowanie obiektowe");
        System.out.println("Programowania obiektowego uczy: " + teacher);

        Map<Integer, List<Student>> grupy = new HashMap<>();

        List<Student> grupa32 = new ArrayList<>();
        List<Student> grupa33 = new ArrayList<>();
        List<Student> grupa34 = new ArrayList<>();
        List<Student> grupa35 = new ArrayList<>();
        grupa32.add(new Student("Jan", "Kowalski"));
        grupa32.add(new Student("Zenon", "Nowak"));
        grupa33.add(new Student("Cristiano", "Ronaldo"));
        grupa33.add(new Student("James", "Bond"));
        grupa34.add(new Student("Harry", "Potter"));
        grupa34.add(new Student("Ferdynand", "Kiepski"));
        grupa35.add(new Student("Marian", "Paździoch"));
        grupa35.add(new Student("Arnold", "Boczek"));

        grupy.put(32, grupa32);
        grupy.put(33, grupa33);
        grupy.put(34, grupa34);
        grupy.put(35, grupa35);

        List<Student> grupa = grupy.get(grupa32);
        System.out.println("Do grupy 32 należą: " + grupa32);

        //Zadanie 3
        List<Product> listaProduktow = new ArrayList<>();

        Map<Integer, Product> znajdzPoId = new TreeMap<>();
        //Set<String> kategorie = new HashSet<>();
        Map<String, List<Product>> znajdzPoKategorii = new TreeMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader("produkty.txt"))) {

            String s = in.readLine();
            while (s != null) {

                String[] pola = s.split(";");
                Product p1 = new Product(Integer.parseInt(pola[0]), pola[1], pola[2], Double.parseDouble(pola[3]));
                listaProduktow.add(p1);

                if (!znajdzPoKategorii.containsKey(pola[2])) {
                    //kategorie.add(pola[2]);
                    znajdzPoKategorii.put(pola[2], new ArrayList());
                }

                znajdzPoId.put(Integer.parseInt(pola[0]), p1);

                s = in.readLine();

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (Product p : listaProduktow) {
            znajdzPoKategorii.get(p.getCategory()).add(p);
        }
        System.out.println("\nLista produktów:");
        for (Product p : listaProduktow) {
            System.out.println(p);
        }
        System.out.println("\nLista po id:");
        for (Integer i : znajdzPoId.keySet()) {
            Product p = znajdzPoId.get(i);
            System.out.println(i + " - " + p);
        }
        System.out.println("\nLista po kategorii");
        for (String ss : znajdzPoKategorii.keySet()) {
            List<Product> p = znajdzPoKategorii.get(ss);
            System.out.println(ss + ":\n" + p);
        }

    }
}

/*
1.Co się stanie, jeśli zmienimy HashSet na TreeSet?
Dni tygodnia zostaną posortowane alfabetycznie, pomijając "ś", które jest polskim znakiem.
2.Czym się różni HashSet od TreeSet?
HashSet zapewnia jedynie unikalność elementów, TreeSet gwarantuje dodatkowe sortowanie.
3.Której klasy użyć w jakiej sytuacji?
HashSet - gdy chcemy szybko wyszukać, dodać lub usunąć elementy, ale nie interesuje nas ich kolejność, a także do przechowywania
obiektów typu null
TreeSet - gdy chcemy, aby obiekty były posortowane. Pozwala na użycie operacji takich jak higher(), ceiling(), floor() etc.
4.Czy były wymagane jakiekolwiek zmiany w kodzie poza miejscem tworzenia obiektu (new HashSet<>() / new TreeSet<>()) ?
Nie było, poza dodaniem odpowiedniej biblioteki.
 */
