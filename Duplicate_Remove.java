import java.util.Scanner;
import java.util.*;
public class Duplicate_Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]= {-3,-1,0,0,0,3,3};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }

        System.out.println("");

        //HashMAp Approach
        
        HashMap<Integer , Integer> set = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(!set.containsKey(arr[i]))
            {
                set.put(arr[i], i);
            }

        }
        System.out.println();
        int res[] =new int[set.size()];
        
        int j = 0, r = 0;
        for (int k: set.keySet()){
            res[j++] = k;
            arr[r++] = k;
            System.out.print(k+ " ");
        }


        Arrays.sort(res);
        System.out.println();

        System.out.println("Array After removing duplicates");
        for (int i = 0; i < res.length; i++) {
            System.out.print(arr[i]+" ");
        }

        

    }
}

