import java.util.*;

public class Task_2{
    public static void main(String [] args){
        
        Scanner sc= new Scanner (System.in);
        
        float arr[] = new float[sc.nextInt()];
        
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=sc.nextFloat();
        }

        System.out.println(efficientJanitor(arr));
        
        sc.close();
    }
    static int efficientJanitor (float [] weight){
        
        int total_bag=0;
        Arrays.sort(weight);

        int first_bag=weight.length/2-1;
        int second_bag=weight.length/2;

        for(int i=0 ; i<weight.length/2 ; i++){
            
            if(weight[first_bag]+weight[second_bag]<=3.0){
                total_bag++;
                first_bag--;
                second_bag++;
            }
            else{
                break;
            }
        }
        total_bag+=weight.length-(total_bag*2);
        return total_bag;
    }
    
}
