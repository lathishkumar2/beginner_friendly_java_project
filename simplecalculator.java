/**
 * simple
 */
import java.util.*;
public class simplecalculator {

    public static void main(String[] args) {
        System.out.print("enter the numbers :");
     Scanner input1 = new Scanner (System.in);
        int num1 = input1.nextInt();
        int num2 = input1.nextInt();
        System.out.println();
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.print("which one : ");
    Scanner input2 = new Scanner (System.in);
        String str=input2.nextLine();
        char chr = str.charAt(0);
        if(chr=='a'||chr== 'A'){
            System.out.println(" addition :"+(num1+num2));
        }else if (chr=='s'||chr== 'S') {
            System.out.println(" subraction :"+(num1-num2));
        }else if (chr=='m'||chr== 'M') {
            System.out.println(" multipication :"+(num1*num2));
        }else if (chr=='d'||chr== 'D')  {
            System.out.println(" division :"+(num1/num2));
        }else {
            System.out.println("option is not there😅😊");
        }
    

        

    }
    
}