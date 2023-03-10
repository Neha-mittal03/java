import java.util.Scanner;
public class ArraySpan{
  static int span(int arr[]){
    int max,min;
    max=arr[0];
    min=arr[0];
    for(int i=0;i<arr.length;i++){
      if(max<arr[i])
        max=arr[i];
      if(min>arr[i])
        min=arr[i];
    }
    int s=max-min;
    return s;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a[]={1,3,5,7,9};
    int ans=span(a);
    System.out.println(ans);
  }
}
