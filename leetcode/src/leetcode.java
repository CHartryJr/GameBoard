public class leetcode{
    public static void main(String[] args) throws Exception {
        System.out.println(findMedianSortedArrays(new int[]{},new int[]{3,4}));
    }
   public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int values = nums1.length +nums2.length;
        // if(values == 2)
        //     return (double)(nums1[0]+nums2[0])/2;

        int[] merged = new int [values];
        int i =0,j=0,k=0;
        while(values > k)
        {
            if(nums1.length > i && nums2.length > j )
            {
                if(nums1[i] <= nums2[j])
                {
                    merged[k]= nums1[i];
                    i++;
                    k++;
                }
                else
                {
                    merged[k]= nums2[j];
                    j++;
                    k++;
                }
            }
            else
            {
                if(nums1.length <= i)
                {
                    merged[k]= nums2[j];
                    j++;
                    k++;
                }
                else
                {
                     merged[k]= nums1[i];
                    i++;
                    k++;
                }
            }
        }
        int index = values/2;
        return  values%2==0? ((double)merged[index]+(double)merged[index-1])/2:(double)merged[index];
    }
}
