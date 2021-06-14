package coding.com;
import java.util.HashSet;
public class UnionIntersection {
    public static void main(String[] args) {
        int a[]={2,3,6,8,9};
        int b[]={3,5,6,7,8,9};
        int n=a.length;
        int m=b.length;
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        }
        for(int i=0;i<m;i++)
        {
            hs.add(b[i]);
        }
        System.out.println(hs);//so here we are printing the union of the given two sorted array!!
        System.out.println("Here we are going to print the elements of the intersection");
        HashSet<Integer>hash=new HashSet<Integer>();
        int i=0;
        int j=0;
        while(i<n&&j<m)
        {
            if(a[i]<b[j])
            {
                i++;
            } else if(a[i]>b[j])
            {
                j++;
            }
            else{
                hash.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.println("Intersection elements are:"+hash);//here we are prntng the elements of the ntersection

    }
}
