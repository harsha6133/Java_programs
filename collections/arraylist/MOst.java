public class MOst {
    public static void main(String[] args) {
        int a[]={0};
        int maxcount=0;
        int count=0;
        for(int i=0;i<a.length;){
            int x=a[i];
            while(i<a.length&&x==a[i]){
                count++;
                //System.out.println(x+" "+a[i]);
                i++;
            }
            if(maxcount<count){
                maxcount=count;
            }
            count=0;
        }
        System.out.println(maxcount);

    }
}