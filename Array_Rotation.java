package coding.com;
public class Array_Rotation {
    public static void main(String[] arg)
    {
        //System.out.println("hello for cheking");
        int arr[]={2,3,4,5,2,7,};//this is the array which is we have to rotate
        int n= arr.length;
        System.out.println("the array after rotation!!");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print("\t"+arr[i]);
        }
    }
}
