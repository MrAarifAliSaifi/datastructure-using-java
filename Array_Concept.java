package data_structure;
class Implementation{
    int arr[]={1212,2,3,4,5,6,7,8,9,10};
    int len= arr.length;
    public void insertAtBeiginning(int elemensts)
    {
        for(int i=len-2;i>=0;i--)
        {
             arr[i+1]=arr[i];

        }
        System.out.println("Elements has been submitted at biegginig!!");
        arr[0]=elemensts;
    }
    public void insertAtPosition(int elemensts,int position)
    {
        if(position>len)
        {
            System.out.println("Please Enter the valid position!!");
        }
        for(int i=len-2;i>=position;i--)
        {
            arr[i+1]=arr[i];

        }
        arr[position]=elemensts;

    }
    public void insertAtEnd(int elemensts)
    {
      arr[len-1]=elemensts;
    }
    public void deleteAtBeigining()
    {
         for(int i=1;i<len;i++)
        {
            arr[i-1]=arr[i];
        }
    }
    public void deleteAtPosition(int postion)
    {
       for(int i=postion+1;i<len-1;i++)
       {
           arr[i-1]=arr[i];
       }
    }
    public void deleteAtLast()
    {
      for(int i=len-2;i>=0;i--)
      {
          arr[i+1]=arr[i];
      }

    }
    public boolean Search(int elemensts)
    {
        for(int i=0;i<len;i++)
        {
            if(arr[i]==elemensts)
                return true;
        }
        return false;
    }
    public void Traversing()
    {
       for(int i=0;i<len;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
}
//this is driver code
public class Array_Concept{
    public static void main(String[] args)
    {
     Implementation impl=new Implementation();
//     impl.insertAtBeiginning(13);
//        impl.insertAtPosition(10,3);

//         impl.deleteAtBeigining();
//         impl.deleteAtPosition(3);
//         impl.deleteAtLast();
           System.out.println(impl.Search(11));
           impl.Traversing();

    }
}
