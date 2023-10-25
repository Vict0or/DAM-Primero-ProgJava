public class Task22 {
    public static void main(String[] args) {
        /*Mostrar el producto de los 10 primeros numeros impares.
         */
        int num = 1;

        for (int i = 1; i <= 10; i++){
            if(i % 2 != 0){
                num *= i;
            }else{
                continue;
            }
        }
        System.out.println("El producto de los 10 primeros numeros impares es: " + num);
    }
    
}
