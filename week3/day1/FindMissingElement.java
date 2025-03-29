package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] input= {1,4,3,2,8,6,7};
        Arrays.sort(input);
        for(int i=0;i <input.length; i++)
        {
            int x=i+1;
            if(x!=input[i])
            {
                System.out.println(x);
                break;
            }
        }
    }
}
