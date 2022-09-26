import java.util.Scanner;
class Man{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<n-2;i++){
            if(arr[i]%2!=0 && arr[i+2]%2!=0){
                if(arr[i+1]%2==0){
                    c=c+1;
                }
            }
            
        }
        System.out.println(c);
    }
}