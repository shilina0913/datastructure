/**
 * 冒泡排序，空间复杂度o(1),时间复杂度最坏o(n^2)
 *
 * @author shilina
 * @create 2017年11月01日
 */
public class BubbleSort {

    static void bubbleSort(int[] a){
        int length=a.length;
        for(int i=0;i<length-1;i++){
            boolean flag=false;
            for(int j=length-1;j>i;j--){
                if (a[j]<a[j-1]) {
                    swap(a,j,j-1);
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

    static void swap(int[] a,int m,int n){
        int tmp=a[m];
        a[m]=a[n];
        a[n]=tmp;
    }

    public static void main(String[] args){
        int[] a={0,7,3,9,1,10,45};
        bubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
