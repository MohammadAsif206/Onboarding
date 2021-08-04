import java.util.*;

public class WCCOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first string value: ");
        String s1 = in.nextLine();
        System.out.println("Please enter your second string value: ");
        String s2 = in.nextLine();
        System.out.println();
        //first problem
        lcs(s1,s2);

        //second problem
        int[] arr2={5,3,1,2};
        int[] arr={7,5,6,1,4,2};
        findMissingElem(arr);
        findMissingElem(arr2);

    }

    /**
     * Problem 1: Given two Strings A and B. Find the length of the Longest
     * Common Subsequence (LCS) of the given Strings. Input: A = Minneapolis, B = Minnesota.
     *
     * @param s1 string type, first input
     * @param s2 string type, second input
     */
    public static void lcs(String s1, String s2){
        int len= 0;
        List<Character> list = new ArrayList<>();
        List<Character> list1 = new ArrayList<>();
        for(int i = 0; i<s1.length(); i++){
            if(!list.contains(s1.charAt(i))){
                list.add(s1.charAt(i));
            }
        }
        for(int i = 0; i<s2.length(); i++){
            if(!list1.contains(s2.charAt(i))){
                list1.add(s2.charAt(i));
            }
        }
        for(int i = 0; i<list.size(); i++){
            for (int j = 0; j<list1.size(); j++){
                if(list.get(i).equals(list1.get(j))){
                    len++;
                }
            }
        }
        System.out.println("LCS of String A and B: "+len);

    }

    /**
     * Problem 2: Write java Program to Find Smallest and Largest Element in an Array.
     * Note: Number can not be repeated in the array.
     *
     * For example:
     * 1
     * 2
     * 3
     * 4
     * 5
     * 6
     *
     * int[] arr1={7,5,6,1,4,2};
     * Missing number : 3
     * int[] arr2={5,3,1,2};
     * Missing number : 4
     *
     * @param arr
     */
    public static void findMissingElem(int [] arr){
        int res = 0;
        Arrays.sort(arr);
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] != (arr[i+1]-1)){
                res= arr[i];
            }
        }
        System.out.println("The missing element is: "+(res+1));
    }

    /**
     * Logical Reasoning:
     * 3) This question is based on a certain code language. Understand the logic in the coding and answer the following question.
     * If PROCESSOR is coded as D4F3C5C1E1S1S1E3C6, what is the code for QUADRANT?
     */
    /**
     * The encrypted value of the alphabets in PROCESSOR, whose natural positional value is not
     * a prime number, has been calculated based on the natural positional value of another
     * alphabet.
     * So based on that pattern, the encryption for QUADRANT would be:
     * Q1G3A1B2I2A1G2E4
     *
     */


}
