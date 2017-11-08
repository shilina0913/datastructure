/**
 * 快速排序 空间复杂度复杂最坏o(n),最好o(log2n),
 *
 * @author shilina
 * @create 2017年11月01日
 */
public class QucikSort {
    static void quickSort(int[] a,int low,int high){
        int pivot=partition(a,low,high);
        if(low<pivot) {
            quickSort(a, low, pivot);
        }
        if((pivot+1)<high) {
            quickSort(a, pivot + 1, high);
        }

    }

    static int partition(int[] a,int low,int high){
        int pivot=a[low];
        while(low<high){
            while(high>low&&a[high]>pivot){
                --high;
            }
            a[low]=a[high];
            while(low<high&&a[low]<pivot){
                ++low;
            }
            a[high]=a[low];
        }
        a[low]=pivot;
        return low;
    }

    public static void main(String[] args){
        int[] a={0,7,3,9,1,10,45};
        quickSort(a,0,6);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
