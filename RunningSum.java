public class Running {
    static void runningsum(int arr[]){
    for(int i=1;i<arr.length;i++){
    arr[i]=arr[i]+arr[i-1];
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,4,8,4,9,1};
        runningsum(arr);
    }
}
