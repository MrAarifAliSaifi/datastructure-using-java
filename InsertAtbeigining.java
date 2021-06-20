package coding.com;
public class InsertAtbeigining {
    public static void main(String[] args) {
//        System.out.println("hello is this working??");
        int arr[]={1,2,3,4,5,6,7,8};
        int k=0,item=10;
        int n=arr.length;
        System.out.println("the origional elements of the array are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("array elements after the insertion!!");
        for(int i=n-2;i>=k;i--){
            arr[i+1]=arr[i];
        }
        arr[k]=item;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
