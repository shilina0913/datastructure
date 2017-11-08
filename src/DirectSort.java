/**
 * 直接排序,时间复杂度o(n^2),空间复杂度o(1)
 *
 * @author shilina
 * @create 2017年11月02日
 */
public class DirectSort {

    static void directSort(int[] a){
        int tmp;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                tmp=a[i];
                int j;
                for(j=i-1;a[j]>tmp && j>=0;j--){
                    a[j+1]=a[j];
                }
                a[j+1]=tmp;
            }
        }
    }

    public static void main(String[] args){
        int[] a={0,7,3,9,1,10,45};
        directSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }

}
