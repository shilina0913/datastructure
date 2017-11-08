/**
 * 简单选择排序，空间复杂度O(1),
 * 时间复杂度O(n^2)
 * @author shilina
 * @create 2017年11月01日
 */
public class SelectSort {

    static void swap(int[] a,int m,int n){
        int tmp=a[m];
        a[m]=a[n];
        a[n]=tmp;
    }

    static void selectSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length-1;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                swap(a,i,min);
            }
        }
    }

    public static void main(String[] args){
        int[] a={0,7,3,9,1,10,45};
        selectSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
