package coding.com;
public class Arraywith012{
    public static void main(String[] args){
        int arr[]={0,2,1,1,1,1,0,1,2,2,1,0,};
        int n= arr.length;
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c0=c0+1;
            }else if(arr[i]==1)
            {
                c1=c1+1;
            }else{
                c2=c2+1;
            }
        }
        for(int i=0;i<c0;i++){
            arr[i]=0;
        }
        for(int i=c0;i<c0+c1;i++){
            arr[i]=1;
        }
        for(int i=c0+c1;i<n;i++){
            arr[i]=2;
        }
        System.out.println("Array after reverse");
        System.out.println("the things");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
