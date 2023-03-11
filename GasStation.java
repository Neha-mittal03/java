public class GasStation {
    static void approach(int gas[],int cost[]){
        int start=0,rem=0,loss=0;
        for(int i=0;i<gas.length;i++){
            rem += gas[i]-cost[i];
            if(rem<0){
                start=i+1;
                loss +=rem;
                rem=0;
            }
        }
        if(loss+rem>=0){
            System.out.println(start);
        }
        else{
     System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        approach(gas, cost);
    }
}
