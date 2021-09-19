public class findingSecondMax {
    public static void main(String[] args) {
        int[] inputArr = {1,-2,-8,-7,-8,-2,-9,0};

        int firstLargest = inputArr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=1; i<inputArr.length;i++){

            if(inputArr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = inputArr[i];
            }
            else if(inputArr[i]>secondLargest && inputArr[i]!=firstLargest){
                secondLargest = inputArr[i];
            }

        }

        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("No Second Largest");
        }
        else{
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
