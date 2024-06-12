import java.util.Scanner;

public class busquedaBinaria {
    public static void main(String[] args) {
    
    Scanner cap_teclado = new Scanner(System.in);
    int[] elArray = {23, 56, 12, 89, 34, 17, 42, 68, 91, 8, 53, 27, 75, 49, 5, 61, 37, 19, 43, 72};

        ordenar(elArray);
        imprimirArray(elArray);
        busqueda(elArray, cap_teclado);

    cap_teclado.close();
    }

    //ordenamos el array
    public static void ordenar(int[] unArray){
        
        for ( int i = 0; i < unArray.length  -1; i++ ){
            
            for ( int j = 0; j < unArray.length  -i - 1 ; j++ ){
                if ( unArray[j] > unArray[j + 1] ){
                    int temp = unArray[j];
                    unArray[j]= unArray[j + 1];
                    unArray[j + 1] = temp;
                    
                }
            }
        }
    }
    //mostramos el array ya ordenado
    public static void imprimirArray(int[] unArray){
        for ( int i = 0; i < unArray.length; i++ ){
            System.out.print(" - " + unArray[i] + " - ");
        }
    }
    //se realiza la busqueda
    /**
     * @param unArray
     * @param num
     */
    public static void busqueda(int[] unArray, Scanner cap_teclado){
        int valorMitad = unArray[unArray.length / 2];
        boolean encontrado = false;
        //System.out.print("\nDame un numero para buscar: ");
        //int num = cap_teclado.nextInt();
        int i = 0;
            while (encontrado == false){
                System.out.print("\nDame un numero para buscar: ");
                int num = cap_teclado.nextInt();
                if ( num > valorMitad ){
                    for ( i = unArray.length / 2; i < unArray.length ; i++ ){
                        if (num == unArray[i]) {
                        System.out.println("\nEl numero: " + unArray[i] + " esta en la posicion: " + i );
                        encontrado = true;
                        }
                    }
                }else if (num == valorMitad  ){
                        System.out.println("\nEl numero:  " + valorMitad + " esta en la posicion: " + unArray.length / 2);
                        encontrado = true;
                }else if (num < valorMitad ){
                    for ( i = 0; i < unArray.length ; i++ ){
                        if (num == unArray[i]) {
                        System.out.println("\nEl numero: " + unArray[i] + " esta en la posicion: " + i );
                        encontrado = true;
                        }
                    }
                }if (  encontrado == false ){
                    System.out.println("no se encuentra el numero");
                    imprimirArray(unArray);
                }
            }
        }
}

