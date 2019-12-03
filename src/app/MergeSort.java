package app;
public class MergeSort{

    public static void main(String args[]){
        MergeSort m = new MergeSort();
        int a[] = {4,5,6,3,2,1};

        m.sort(a, 0, a.length-1);

        for(int v:a){
            System.out.println(v);
        }
    }

    public void sort(int a[],int l,int h){
        int m = (l+h)/2;
        if(l<h){
            sort(a,l,m);
            sort(a,m+1,h);
            merge(a, l, m, h);
        }
    }
    public void merge(int []a,int l,int m,int h){
        int [] temp = new int[h-l+1];
        int i = l;
        int j = m+1;
        int z = 0;

        while(i<=m && j<=h){

            if(a[i]<a[j]){
                temp[z++] = a[i++];
            }else{
                temp[z++] = a[j++];
            }
        }

        while(i<=m){
            temp[z++] = a[i++];
        }
        while(j<=h){
            temp[z++] = a[j++];
        }

        for(int x = 0; x < temp.length; x ++){
            a[l+x] = temp[x];
        }
    }
}