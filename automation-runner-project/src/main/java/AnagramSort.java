
import java.util.Arrays;
import java.util.Comparator;

        	public class AnagramSort implements Comparator<String>
	{
        	    public String sortChars(String s)
        	    {
            	        char[] content = s.toCharArray();
                        Arrays.sort(content);
                        return new String(content);
                }

        @Override

        public int compare(String s1, String s2)
        {
            return sortChars(s1).compareTo(sortChars(s2));
        }

        	    public static void main(String[] args)
        	    {
            	        String[] strArray = {"abcd" ,"abc" ,"abce" , "acd" ,"abdc" };
					Arrays.sort(strArray);
					System.out.println("Sorted Array");
					for (int i = 0; i < strArray.length; i++)
					{
						System.out.print(strArray[i]+",");
					}

        	        Arrays.sort(strArray, new AnagramSort());
					System.out.println("\n\nAll Anagrams Together");
            	        for (int i = 0; i < strArray.length; i++)
                	        {
                	            System.out.print(strArray[i]+",");
                	        }
            	        //way 1

            	        Arrays.sort(strArray,Comparator.reverseOrder());

            	        //way 2

					    Comparator<String> reverseArray = String::compareTo;
					    Arrays.sort(strArray,reverseArray.reversed());

					System.out.println("\n\nReverse Sorted Array");
					for (int i = 0; i < strArray.length; i++)
					{
						System.out.print(strArray[i]+",");
					}



            }
        }

