public class Trapping {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=arr.length;
        int prefixMin[]=new int[n];
        prefixMin[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixMin[i]=Math.max(prefixMin[i-1],arr[i]);
        }
        int suffixMin[]=new int[n];
        suffixMin[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffixMin[i]=Math.max(suffixMin[i+1],arr[i]);
        }
        int total=0;
        for(int i=0;i<n;i++){
            int c=arr[i];
            int la=prefixMin[i];
            int ra=suffixMin[i];
            int min=Math.min(la,ra);
            if(min>c){
                total += min-c;
            }


        }
        System.out.println("total amout of water is:"+ total);
        
    }
}
