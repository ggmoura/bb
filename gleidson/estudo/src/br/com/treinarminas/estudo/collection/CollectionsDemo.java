package br.com.treinarminas.estudo.collection;

import java.util.*;


public class CollectionsDemo {

   public static void main(String[] args) {
      List<String> a1 = new ArrayList<>();
      a1.add("Gleidosn");
      a1.add("Gleidosn");
      a1.add("Fariman");
      a1.add("Isabella");
//      a1.add(new Pessoa());
//      a1.add(50);
      a1.add(1, "depois do gleidosn");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);
      
      

//      List l1 = new LinkedList();
//      l1.add("Zara");
//      l1.add("Mahnaz");
//      l1.add("Ayan");
//      System.out.println();
//      System.out.println(" LinkedList Elements");
//      System.out.print("\t" + l1);
   }
}