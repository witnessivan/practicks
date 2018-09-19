package practicks2;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Practicks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[];
        Scanner in =new Scanner(System.in);
        yama p = new yama();
        System.out.println("Введите количество элементовЭ");
        int n = in.nextInt();
        p.n=n;
        x = new int[n];
        inp_array(x,p);
        out_array(x,p);
        int z = in.nextInt();
        int rez=seach_array(x,z);
        if(rez!=-1){
            System.out.println("Индекс лемента=" + rez);
        }
        else
        {
            System.out.println("Нет такогшо числа");
        }
        del_elem_for_array(x,z,p);
        out_array(x,p);
    }
    public static void inp_array(int []a,yama n){
       Scanner in = new Scanner(System.in);
       for(int i =0;i<n.n;i++){
            a[i]=in.nextInt();
       }
    }
    public static void out_array(int[]a,yama n ){
       System.out.println("Числа массива");
       for(int i = 0; i < a.length;i++){
           System.out.print(a[i]+" ");
      }
    }
    public static int seach_array(int[]a,int z){
        int i;
        System.out.println("числа массива");
        for( i = 0; i < a.length && a[i]!= z; ++i);
            return(i==a.length)?-1:i;
        
    }
    public static void del_elem_for_array(int a[],int z,yama n){
        //int n = a.lenght();
        int j = seach_array(a,z);
        n.n =a.length;
        
        for(int i =0;i < n.n -1;i++){
            if(i >= j){
                a[j]= a[i+1];
            }
        }
        n.n--;
    }
}