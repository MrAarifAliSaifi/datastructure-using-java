package coding.com;
public class Deletion {
    public static void main(String[] args){
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 4};
        int n = arr.length;
        int position = 3;
        for(int i=position;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        for(int ele:arr)
        {
            System.out.println(ele);
        }
    }
}
