
package lab.pkg3;

public class Lab3 {

    public static void main(String[] args) {
//        String s = "Bangladesh";
//        System.out.println(s.toUpperCase());
//        int sum=0;
//        for(int i=1;i<=99;i+=2){
//            sum=sum+i;
//            
//            
//        }
//        System.out.println("Series Summation: "+sum);
//        double avg = (double)sum/99;
//        System.out.println("Average: "+avg);
        int arr[] = new int[4];
        arr[0]=95;
        arr[1]=-127;
        arr[2]=2;
        arr[3]=1885;
        int sum =0;
        for(int i=0;i<4;i++){
            
        System.out.println("index["+i+"]= "+arr[i]);
        sum=sum+arr[i];
        }
        System.out.println("Array sum: "+sum);
    }
    
}
