
///////////// Les Importations des differentes librairies/////////////////////////////
import java.util.ArrayList;
import java.util.Scanner;

///////////////////// Definition de la classe MesFonctions //////////////////////////

public class MesFonctions{
  
    public int maximum(int a, int b){
        return a >= b ? a : b ;
    }

    public int minimum(int a, int b){
        return a >= b ? b : a ;
    }

    public int factoriel(int n){
        int fact = 1 ;
        if(n != 1 && n != 0){
           while(n < 0){
             fact = fact * n ;
             n = n - 1 ;
            }
         }
        return fact ;
    }

    public void estPalindrome(String s){
        //////// FONCTION ITERATIVE

               /* On teste le premier caractere avec le dernier
        et s'ils sont egaux, le programme continu
        On deroule la boucle while et on teste
        le caractere suivant(i+1) avec (longeur-(i+1))
        jusqu'a ce i soit egale a longueur/2,
        sinon le booleen egale recoit false
       */

        int i=0, longueur = s.length()-1;
        boolean egale = false;
        while(i<longueur/2 && egale){
           if(s.charAt(longueur-i)!= s.charAt(i))
           {
               egale = false;
           }else{
               egale = true;
                       }
           i++;
        }
        if(egale ==  true){
          System.out.println(s + " est un palindrome");
        }
        else{
            System.out.println(s + " n'est pas un palindrome");
        }
    }


}
