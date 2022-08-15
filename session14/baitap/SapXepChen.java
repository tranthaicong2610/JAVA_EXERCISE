package session14.baitap;

public class SapXepChen {
    public void sapXepChen(int[] arr,int n){
        int i,key ,j;
        for( i=1;i<n;i++){
            key = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1]=key;
            System.out.println("step "+i+" : ");
            for(int k=0;k<n ;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }

    }
}
