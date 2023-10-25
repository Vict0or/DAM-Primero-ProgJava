import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /*Pedir al Usuario 3 numeros y mostrarlos de Mayor a Menor
         */
        int a = 0, b = 0, c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Primer Numero: ");
        a = sc.nextInt();
        System.out.println("Introduzca Segundo Numero: ");
        b = sc.nextInt();
        System.out.println("Introduzca Tercer Numero: ");
        c = sc.nextInt();

        sc.close();
        //Comprobaciones
        if(a > b & a > c){
            System.out.println(a + " " + b + " " + c);
        }else{
            if(a >c & c > b){
                System.out.println(a + " " +  c + " " + b);
            }else{
                if(b > a & a > c){
                    System.out.println(b + " " + a + " " + c);
                }else{
                    if(b > c & c > a){
                        System.out.println(b + " " + c + " " + a);
                    }else{
                        if(c > a & a > b){
                            System.out.println(c + " " + a + " " + b);
                        }else{
                            if(c > b & b > a){
                                System.out.println(c + " "  + b + " " + a);
                            }
                        }
                    }
                }
            }
        }
    }
    
}
