import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static void approach_1(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
    static void approach2(int arr[]){

        int count=0;
        int major=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                major=arr[i];
            }
            if(major==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==major){
                count++;
            }
        }
        System.out.println("Majority element is:"+major);
        System.out.println("count of that element is:"+count);
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,1,1,1,2,2};
        approach_1(arr);
        approach2(arr);
    }
}
