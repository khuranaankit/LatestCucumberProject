import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test {
 public int i = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*test t = new test();
		t.negativeAtOneEnd();
		int[] y = {1,5,2,6,4};
		int missingNumber = test.getMissingNo(y, 5);
		System.out.println("Missing Number is : " + missingNumber +"\n");
		int[] targetPositions = t.twoSum(y, 3);
		System.out.println("["+targetPositions[0]+","+targetPositions[1]+"]\n");
		System.out.println("Length Of longest substring: " + t.lengthOfLongestSubstring("bfcabcadeb"));*/
		
		test t1 = new test();
		SeleniumTest st = new SeleniumTest();
		
		ArrayList<Object> s1 = new ArrayList<Object>();
		s1.add(t1);
		s1.add(st);
		System.out.println(s1.size());
		Object o = null;
		
		Iterator<Object> itr = s1.iterator();
		while(itr.hasNext())
		o = itr.next();
		if(o instanceof test)
		{
			test st1 = (test) o;
			System.out.println(st1.i);
		}
		else
		{
			SeleniumTest st2 = (SeleniumTest) o;
			System.out.println(st2.j);
		}
	}

	void negativeAtOneEnd()
	{
		//start with j=0 assuming j is first positive number if it is not increment it by 1
		int x[]={-1,-2,3,5,6,-4};
		int size = x.length;
		int j=0,temp;
		
			for (int i = 0; i < size; i++) { 
		        if (x[i] < 0) { 
		            if (i != j) 
		            {
		            	temp = x[i];
		            	x[i]=x[j];
		            	x[j]=temp;
		            }
		            
		            j++; 
		        } 
		    
			}
		
		for(int k:x)
		{
			System.out.println(k);
		}
		System.out.println("\n");
	}
	static int getMissingNo(int a[], int n) 
	{ 
		//concept : sum of consecutive numbers n(n+1)/2
	    int i, total; 
	    total = (n + 1) * (n + 2) / 2; 
	    for (i = 0; i < n; i++) 
	        total -= a[i]; 
	    return total; 
	}
	
	public int[] twoSum(int[] nums, int target) {
		/*
		 * To find index in array to give sum as target.
		 * Time complexity : O(n). We traverse the list containing nn elements only once. Each look up in the table costs only O(1) time.

		   Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores at most n elements.
		 */
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++)
        {
            int complement = target - nums[i];
            if(hm.containsKey(complement))
            {
                int hmKey = hm.get(complement);
                return new int[] { hmKey,i };
            }
            hm.put(nums[i],i);
        }
        return new int[] {0,0};
    }
	public int lengthOfLongestSubstring(String s) {
        String temp="";
        int prevLen = 0;
        int curLen = 0;
        for(int i=0;i<s.length();i++)
        {
            if(temp.indexOf(s.charAt(i))<0)
            {
                temp = temp + s.charAt(i);
                curLen = temp.length();
            }
            else
            {
            	if(prevLen<curLen)
            	{
            		prevLen = curLen;
            	}
            	temp = ""+ s.charAt(i);
            }
        }
        return prevLen;
    }
}