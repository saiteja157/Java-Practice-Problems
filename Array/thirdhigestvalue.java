import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        int high3 = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            if(a[i]>high1){
                high3 = high2;
                high2 = high1;
                high1 = a[i];
            }
            else if(a[i]>high2 && a[i]<high1){
                high3 = high2;
                high2 = a[i];
            }
            else if(a[i]>high3 && a[i]<high2){
                high3 = a[i];
            }
        }
        System.out.print(high3);
    }
}
