import java.util.Scanner;

public class Secuencia_Fibonacci{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, validacion;
        validacion = 1;

        int [] numeros;
        int a = 2;

        System.out.println("\nPrograma de Secuencia Fibonacci");
        do{

            System.out.print("Ingrese el numero de terminos a calcular: ");
            num = entrada.nextInt();
            numeros = new int [num+5];
            numeros[0] = 0;
            numeros[1] = 1;
    
            if(num >= 1){
                validacion = 0;
            }
            else{
                System.out.println("Entrada Invalida, intentelo de nuevo...\n");
            }
        }while(validacion == 1);

        System.out.print("1, ");
        for(int i = 0; i<num-1; i++){
            int aux = numeros[a-2] + numeros[a-1];
            numeros[a]= aux;

            System.out.print(aux + ", ");
            a++;
            
            if(a%11 == 0){
                System.out.print("\n");
            }
        }
        

    }
}