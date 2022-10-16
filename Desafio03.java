public class Desafio03 {

    public static void main(String args[]){
        int [] array1 = new int[]{1,3,5,7};
        int [] array2 = new int[]{2,4,6,8,12,15};

        int [] result = juntarArrays(array1, array2, new int [array1.length + array2.length]);

        System.out.print("[");
        for (int numeros : result){
            System.out.print(numeros+", ");
        }
        System.out.print("]");
    }

    public static int [] juntarArrays(int[] array1,
    int[] array2,
    int[] arrayConsolidado) {
        int interadorArray1=0;
        int interadorArray2=0;

        for(int i=0 ;i<arrayConsolidado.length; i++){
            
            if( i%2 == 0 && interadorArray1 < array1.length ){
                arrayConsolidado[i] = array1[interadorArray1];
                interadorArray1++;
            } else if( interadorArray2 < array2.length ){
                arrayConsolidado[i]= array2[interadorArray2];
                interadorArray2++;
            }
        }

        return arrayConsolidado;
    }   
}
