import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {
	public static int findTheMedian(int[] nums) {
		int a = nums.length;
		
		if(a % 2 == 0) {
			int x = a/2;
			int y = nums[x];
			int z = nums[x-1];
			
			int result = (y+z)/2;
			return result;
		}else {
			int x = Math.round(a/2);
			return nums[x];
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the first array:");
		int n = scan.nextInt();
		
		int nums1[] = new int[n+1];
        System.out.println("Enter all the elements for the first array:");
        for(int i = 0; i < n; i++)
        {
            nums1[i] = scan.nextInt();
        }
        
        System.out.println("Enter the number of elements in the second array:");
        int m = scan.nextInt();
        
        System.out.println("Enter all the elements for the second array:");
        int nums2[] = new int[m+1];
        for(int j = 0; j < m; j++)
        {
        	nums2[j] = scan.nextInt();
        }
        
        int[] nums3 = new int[n + m];
        System.arraycopy(nums1, 0, nums3, 0, n);
        System.arraycopy(nums2, 0, nums3, n, m);
        
        Arrays.sort(nums3);
        
        System.out.println("Solution:" + findTheMedian(nums3));
        
		scan.close();
	}

}
