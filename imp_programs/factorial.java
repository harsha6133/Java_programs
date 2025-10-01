
public class factorial {
    public static void main(String[] args) {
        /*int num=0;
        int sum=1;
        for(int i=1;i<=num;i++){
            sum*=i;
        }
        System.out.println(sum);*/
        int max=0;
        int max2nd=0;
        int a[]={1,2,5,4};
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
                
            }

        }
        for(int i=0;i<a.length;i++){
            if(a[i]==max){
                continue;
            }
            else if(a[i]>max2nd){
                max2nd=a[i];
            }
           

        }
        System.out.println(max2nd);

        }
    }
    
