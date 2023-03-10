import java.util.*;
public class SecondMax {

    static int findSecondMax(int[] arr){
        int max=Integer.MIN_VALUE,sec=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            sec=max;
            max=arr[i];
        }
        else if(max!=arr[i] && sec<arr[i]){
            sec=arr[i];
        }
 
    }
    return sec;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size");
    int n=sc.nextInt();
    System.out.print("enter elements");
    int []arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sec=findSecondMax(arr);
    if(sec==Integer.MIN_VALUE){
        System.out.println("second element not present in array:");
    }
    else{
        System.out.println("second element present in array is:"+sec);
    }
    sc.close();
}
}
