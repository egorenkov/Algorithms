import java.util.ArrayList;

public class MergeSort {

    public static void main(String[] args){
        int []arr = {5,2,4,1,67,21,3,12,45};

        ArrayList<Integer> seq = new ArrayList<>();

        for(int el : arr){seq.add(el); }
        System.out.println(seq);
        System.out.println(sort(seq));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> seq) {
        // Базовые случаи рекурсии
        if (seq.size() <= 1) {
            return seq;
        }

        if (seq.size() == 2) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(Math.min(seq.get(0), seq.get(1)));
            result.add(Math.max(seq.get(0), seq.get(1)));
            return result;
        }

        // Разделяем список на две части
        int mid = seq.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(seq.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(seq.subList(mid, seq.size()));

        // Рекурсивно сортируем каждую часть
        left = sort(left);
        right = sort(right);

        // Сливаем отсортированные части
        return merge(left, right);
    }

    private static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        // Добавляем оставшиеся элементы
        while (i < left.size()) {
            result.add(left.get(i++));
        }

        while (j < right.size()) {
            result.add(right.get(j++));
        }

        return result;
    }
}