import java.util.*;
import java.util.Vector;

public class helloworld{
    static void main(String[] args){
        System.out.println("Hello Seba!");

        //Array di caratteri con lettere del nome "Seba"
       Vector<Character> lettere = new Vector<>();
       lettere.add('S');
       lettere.add('e');
       lettere.add('b');
       lettere.add('a');

        //Stampa le lettere dell'array
        for(char lettera : lettere){
            System.out.println(lettera + " ");
        }
    }
}