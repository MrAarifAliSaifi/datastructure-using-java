package coding.com;
public class CylindricallyRotateArrayBy1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n= arr.length;
        int x=n-1;
        System.out.print(arr[x]);
        for(int i=0;i<n-1;i++)
        {
            System.out.print("\t"+arr[i]);
        }

    }
}
