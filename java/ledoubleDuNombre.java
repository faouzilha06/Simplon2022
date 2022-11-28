import java.util.Scanner;
public class ledoubleDuNombre {

public static void main(String[]args){
Scanner nombre=new Scanner(System.in);
   System.out.println("Veuillez saisir un nombre:");
   double x=nombre.nextDouble();
   double y=2*x;
   System.out.println("Le double de : "+x+"est "+y);
   
   nombre.close();
   }
}
