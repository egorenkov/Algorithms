import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(3);arr.add(7); arr.add(8);arr.add(11); arr.add(33);
        System.out.println(arr);

        System.out.println(Search(arr, 33));
        System.out.println(Search(arr, 12));
    }
    public static boolean Search(ArrayList<Integer> seq, int tar){
        int l = 0;
        int r = seq.size() -1;
        while (l <= r){
            int mid = (l + r) /2;
            if (seq.get(mid) == tar){
                return true;
            }else if(seq.get(mid) > tar){
                r = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return false;

    }
}
