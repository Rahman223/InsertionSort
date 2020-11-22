public class TestInsertionSort {
    public static void main (String []args){
        int [] array = new int [5];
        array[0]= 2;
        array[1]= 4;
        array[2]= 1;
        array[3]= 3;
        array[4]= 5;
        displayArray(array);
        insertionSort(array);
        displayArray(array);


    }

public static void insertionSort (int [] array){
    for (int i=0; i <array.length; i++){
        int temp = array[i];
        int j = i-1;
        while (j>=0 && array[j]> temp){
            array[j+1]=array[j];
            array[j]=temp;
            j--;
        }
        
    }
}

public static void displayArray (int [] array){
    for (int i=0; i<array.length; i++){
        System.out.println(array[i]);
    }
    System.out.println();
}
}