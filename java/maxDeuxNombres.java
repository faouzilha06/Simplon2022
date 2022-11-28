import java.util.Scanner;
public class maxDeuxNombres {
    public static void main (String[]args) {
        System.out.println("Veuillez saisir le premier nombre : ");
        Scanner sc1=new Scanner(System.in);
        float x=sc1.nextFloat();

            System.out.println("Veuillez saisir le deuxieme nombre : ");
            Scanner sc2=new Scanner(System.in);
            float y=sc2.nextFloat();

        if(x<=y){

    System.out.println("Le maximum des deux nombres :"+x+"et"+y+"est égale à"+y);
         }
        else {
    System.out.println("Le maximum des deux nombres :"+x+"et"+y+"est égale à"+x);
            }
            sc1.close();
            sc2.close();
    }
}











