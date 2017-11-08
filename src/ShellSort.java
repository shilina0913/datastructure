/**
 * 希尔排序
 *
 * @author shilina
 * @create 2017年11月02日
 */
public class ShellSort {

    static void shellSort(int[] a){
        int d=a.length/2;
        int length=a.length;
        int tmp;
        while(d>=1){
            for(int i=d;i<length;i++){
                tmp=a[i];
                int j;
                for(j=i-d;j>=0&&a[j]>tmp;j=j-d){
                    a[j+d]=a[j];
                }
                a[j+d]=tmp;
            }
            d=d/2;
        }
    }

    public static void main(String[] args){
        int[] a={0,7,3,9,1,10,45};
        shellSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
