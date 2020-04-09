package laboratorio1;

public class Laboratorio1 {

    public static void main(String[] args) {
//Laboratorio #1 - Conceptos Básicos de JAVA

//EJERCICIO 1
//A)Construir un vector de enteros llamado vecNumeros e inicializarlo con los 
//números 11, -22, 33, -44, 55, -66, 77, -88, 99.*/
        int vecNumeros[] = {11, -22, 33, -44, 55, -66, 77, -88, 99};

//B)Construir un vector de enteros llamados vecPositivos, de longitud 10, que 
//contenga los números positivos de vecNumeros.
        int vecPositivos[] = new int[10];
        for (int i = 0; i < vecNumeros.length; i++) {
            if (vecNumeros[i] > 0) {
                vecPositivos[i] = vecNumeros[i];
            } else {
                vecPositivos[i] = 0;
            }
        }

//C)Construir un vector de enteros llamado vecNegativos, de longitud 10, que 
//contenga los numeros negativos de vecNumeros.
        int vecNegativos[] = new int[10];
        for (int i = 0; i < vecNumeros.length; i++) {
            if (vecNumeros[i] < 0) {
                vecNegativos[i] = vecNumeros[i];
            } else {
                vecNegativos[i] = 0;
            }
        }

//D)Acumular la suma de los valores positivos en una variable totalPositivos.
        int totalPositivos = 0;
        for (int i = 0; i < vecPositivos.length; i++) {
            totalPositivos = totalPositivos + vecPositivos[i];
        }

//E)Acumular la suma de los valores negativos en una variable totalNegativos.
        int totalNegativos = 0;
        for (int i = 0; i < vecPositivos.length; i++) {
            totalNegativos = totalNegativos + vecNegativos[i];
        }

//EJERCICIO2
//Imprimir en pantalla:
//A)el contenido de vecNumeros
        for (int i = 0; i < vecNumeros.length; i++) {
            if(i==0){
            System.out.print("{" + vecNumeros[i] + ", ");
            }
            else{
                if(i==vecNumeros.length-1){
                    System.out.print(vecNumeros[i] + "}" + "\n");
                }
                else{
                    System.out.print(vecNumeros[i] + ", ");
                }
            }
            
        }
       
//B)el contenido de vecPositivos
        for (int i = 0; i < vecPositivos.length; i++) {
            if(i==0){
            System.out.print("{" + vecPositivos[i] + ", ");
            }
            else{
                if(i==vecPositivos.length-1){
                    System.out.print(vecPositivos[i] + "}" + "\n");
                }
                else{
                    System.out.print(vecPositivos[i] + ", ");
                }
            }
            
        }
//C)el contenido de vecNegativos
       for (int i = 0; i < vecNegativos.length; i++) {
            if(i==0){
            System.out.print("{" + vecNegativos[i] + ", ");
            }
            else{
                if(i==vecNegativos.length-1){
                    System.out.print(vecNegativos[i] + "}" + "\n");
                }
                else{
                    System.out.print(vecNegativos[i] + ", ");
                }
            }
            
        }
//D)los valores de totalPositivos y totalNegativos
        System.out.println("totalPositivos: " + totalPositivos);
        System.out.println("totalNegativos: " + totalNegativos);
    }

}
