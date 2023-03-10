class Sort01 {
    void segregate0and1(int[] arr, int n) {
        int t=0;
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]==0)
            low++;
            else{
                t=arr[high];
                arr[high]=arr[low];
                arr[low]=t;
                high--;
            }
        }
    }

}
