package coding.com;
public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,67,7,8};
        int n= arr.length;
        int start=0;
        int end=n-1;
        while(start<end)
        {
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("array after reverse:");
        for(int elemnts:arr)
        {
            System.out.print(elemnts);
            System.out.print("\t");
        }
    }
}
