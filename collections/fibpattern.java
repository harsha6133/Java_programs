public class fibpattern {
    public static void main(String[] args) {
        int n=10;
        int a=0,b=1;
        int[] arr=new int[n];
        for(int i=1;i<=n;i++){
            //System.out.print(a+" ");
            arr[i-1]=a; 
            int sum=a+b;
            a=b;
            b=sum;    
        }
        
        for(int i=0;i<4;i++){
            int k=i;
            int m=3;
            for(int j=0;j<=i;j++){
                System.out.print(arr[k]+" ");
                k=k+m;
                m--;
            }
            System.out.println();
        }
        
    }
    
}
