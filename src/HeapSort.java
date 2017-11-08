

/**
 * 堆排序，所需空间复杂度为O(1)，
 * @author shilina
 * @create 2017年11月1日
 */
public class HeapSort {
    static int tmp;
    //建立大根堆
    static void buildMaxHeap(int[] a,int length){
        for(int i=length/2;i>0;i--){
            adjustDown(a,i,length);
        }
    }
    static void adjustDown(int[] a,int i,int length){
        tmp=a[i];

        for(int j=i*2;j<=length;j=j*2){
            if((j+1)<=length&&a[j+1]>a[j]){
                j++;
            }
            if(tmp>=a[j]){
                break;
            }else{
                a[i]=a[j];
                i=j;
            }
        }
        a[i]=tmp;
    }

    static void swap(int[] a,int m,int n){
        int t=a[m];
        a[m]=a[n];
        a[n]=t;
    }

    static void heapSort(int a[],int length){
        buildMaxHeap(a,length);

        for(int i=length;i>0;i--){
            System.out.println(a[1]);
            swap(a,1,i);
            adjustDown(a,1,i-1);

        }
    }

    public static void main(String[] args){
        int[] a={0,7,3,9,1,10,45};
        heapSort(a,6);
    }

}
