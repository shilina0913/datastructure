/**
 * 折半排序,
 *
 * @author shilina
 * @create 2017年11月02日
 */
public class HalfSort {

    static void halfSort(int[] a){
        for(int i=1;i<a.length;i++){
            int low=0;
            int high=i-1;
            int tmp=a[i];
            while(low<high){
                int mid=(low+high)/2;
                if(a[mid]<tmp){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }
            int j;
            for(j=i-1;j>=low&&a[j]>tmp;j--){
                a[j+1]=a[j];
            }
            a[j+1]=tmp;
        }
    }

    public static void main(String[] args){
        int[] a={0,7,3,9,1,10,45};
        halfSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
