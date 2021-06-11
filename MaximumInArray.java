package coding.com;
class max{
    public void max(int arr[],int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)//here we are making the logic
        {
            for(int j=i+1;j<n-1;j++)//here also we are creating the logic
            {
                if(arr[i]<arr[j])
                {
                    max=arr[j];

                }
            }
        }
        System.out.print("the maximum number in the array is:");
        System.out.println(max);//printing the maximum elements in the array so here we are crweaating the maximum number in the array
    }
}
public class MaximumInArray{
    public static void main(String[] args) {
        int arr[]={1,3,6,8,9,3};
        int n= arr.length;
        max m=new max();
        m.max(arr,n);


    }
}
