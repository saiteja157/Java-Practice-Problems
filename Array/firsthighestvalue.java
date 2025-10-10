import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int high = Integer.MIN_VALUE;
    
        for(int i=0; i<n; i++){
            if(a[i]>high){
                
                high = a[i];
            }
           
        }
        System.out.print(high);
    }
}
