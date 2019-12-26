package app.sort;
import java.util.Arrays;

public class SelectionSort{

    public static void main(String args[]){
        Integer[] a = {4,5,6,3,2,1};
        SelectionSort s = new SelectionSort();
        s.optimizeSort(a);
    }

    public void sort(Integer[] args){

        Integer a[] = args;
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(a[i] > a[j]){
                  
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            Arrays.asList(a).forEach(item -> System.out.print(item));
            System.out.println();
           
        }

      

    }

    public void optimizeSort(Integer [] args){
        Integer a[] = args;
        int n = a.length;
        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(a[i] > a[j]){
                    minIndex = a[j] < a[minIndex] ? j : minIndex;
                }
                swap(a,i,minIndex);
            }
            Arrays.asList(a).forEach(item -> System.out.print(item));
            System.out.println();
        }

        
    }

    public void swap(Integer[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}