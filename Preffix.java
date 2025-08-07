import java.util.ArrayList;

public class Preffix {
    public static void main(String[] args){
        ArrayList<Integer> seq = new ArrayList<>();
        seq.add(3); seq.add(5);seq.add(57); seq.add(22);seq.add(1); seq.add(11);
        System.out.println(seq);
        System.out.println(PrefArray(seq));

    }
    public static ArrayList<Integer> PrefArray(ArrayList<Integer> arr){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(0);
        for(int i = 1; i <arr.size() + 1 ;i ++ ){
            temp.add(temp.get(i-1) + arr.get(i - 1));
        }
        return temp;
    }

}
