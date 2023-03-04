public class Buy {
static void approach(int arr[]){
        int n=arr.length;
        int profit=0;
        int finalProfit=0;
        int min=arr[0];
        for(int i=0;i<n;i++){
            finalProfit=arr[i]-min;
            profit=Math.max(finalProfit, profit);
            min=Math.min(arr[i],min);
        }
    
    }
    public static void main(String[] args) {
        int arr[]={7,2,3,8,1,4};
        approach(arr);
    }
}
