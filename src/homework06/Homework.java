package homework06;
import java.util.List;
public class Homework {
    public static String findMaxAvg(List<Integer> listOne, List<Integer> listTwo ){
        if (listOne.isEmpty() || listTwo.isEmpty()){
            throw new IllegalArgumentException();
        }
        double resultOne = searchAverage(listOne);
        double resultTwo = searchAverage(listTwo);

        if (resultOne > resultTwo){
            return "Первый список имеет большее среднее значение";
        } else if (resultTwo > resultOne){
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

     public static double searchAverage(List<Integer> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        double sum = 0;
        for (int i: list) {
            sum += i;
        }
        return sum / list.size();
    }
}
