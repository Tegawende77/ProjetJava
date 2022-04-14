import Fonctions.MesFonctions;
import java.util.ArrayList;
import java.util.Scanner;
import Fonctions.MesFonctions;

public class Application{

	public static void main(String[] args){
		int choix = 0;
		MesFonctions f = new MesFonctions();
		Scanner sc = new Scanner(System.in);
		System.out.println("TAPEZ!");
		System.out.println("1: MINIMUM ENTRE DEUX ENTIERS");
		System.out.println("2: MAXIMUM ENTRE DEUX ENTIERS");
		System.out.println("FACTORIEL D'UN ENTIER POSITIF");
		System.out.println("4: VERIFIEZ SI UN MOT PALINDROME");
                System.out.println("VOTRE CHOIX!!!");
                choix = sc.nextInt();
		try{
			switch(choix){
                        	case 1:
                        		System.out.println("Entrez a");
					int a = sc.nextInt();
					System.out.println("Entrez b");
					int b = sc.nextInt();
					int min =  f.minimum(a,b);
					System.out.println("Le minimum entre "+a+"et"+ b+" est:"+min);
					break;
				case 2:
                                        System.out.println("Entrez a");
                                        int c = sc.nextInt();
                                        System.out.println("Entrez b");
                                        int d = sc.nextInt();
                                        int max =  f.maximum(c,d);
                                        System.out.println("Le maximum entre "+c+"et"+d+" est:"+max);
                                        break;
				case 3:
                                        System.out.println("Entrez un nombre positif");
                                        int e = sc.nextInt();
                                        int fact =  f.factoriel(e);
                                        System.out.println("Le Factoriel de "+e+"est:"+fact);
                                        break;
                                case 4:
                                        System.out.println("Entrez votre mot");
                                        String mot = sc.nextLine();
                                        f.estPalindrome(mot);
                                        break;
                                default:
                                    System.out.println("Erreur de choix!!!");
                                    break;
			}
		}
		catch(Exception e)
		{
			System.out.println("Erreur");
		}

	}


}
