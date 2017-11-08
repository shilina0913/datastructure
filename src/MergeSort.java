/**
 * 归并排序 空间复杂度o(n),时间复杂度nlog2n
 *
 * @author shilina
 * @create 2017年11月02日
 */
public class MergeSort {

    static void merge(int[] a,int low,int high){
        int[] b=new int[high-low+1];
        System.arraycopy(a,low,b,0,high-low+1);
        int middle=(high-low)/2;
        int length=high-low+1;
        int i=0,j=middle+1,m=low;
        while(i<=middle&&j<length){
            if(b[i]<b[j]){
              a[m++]=b[i];
              ++i;
            }else{
                a[m++]=b[j];
                ++j;
            }
        }
       while(i<=middle){
         a[m++]=b[i++];
       }
       while(j<length){
           a[m++]=b[j++];
       }
    }

    static void mergeSort(int[] a,int low,int high){
        if(low<high) {
            int middle = (low + high) / 2;
            mergeSort(a, low, middle);
            mergeSort(a, middle + 1, high);
            merge(a,low,high);
        }
    }

    public static void main(String[] args){
        int[] a={0,7,3,9,1,10,45};
        mergeSort(a,0,6);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
