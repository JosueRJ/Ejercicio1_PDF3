
package positivos;

public class Positivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Arreglo de 10 números naturales
        int[] arreglo = new int[10];
        arreglo[0]=-1;
        arreglo[1]=1;
        arreglo[2]=2;
        arreglo[3]=3;
        arreglo[4]=-2;
        arreglo[5]=5;
        arreglo[6]=6;
        arreglo[7]=-7;
        arreglo[8]=8;
        arreglo[9]=-9;
        
        //Metodo para recorrer arreglo y determinar los positivos
        int cont =0;
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo [i] >=0)
                cont++;
        }
        
        //Salida del resultado
        System.out.println("Cantidad de positivos :" +cont);
    }
    
}
