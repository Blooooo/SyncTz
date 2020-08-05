import model.ComparsionResult;
import model.FirstObject;
import model.SecondObject;
import service.ComparatorService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<FirstObject> firstObjects = new ArrayList<>();
    private static List<SecondObject> secondObjects = new ArrayList<>();

    //Блок статической инициализации массивов. Можно добавить свои интересные варианты для сравнения ☺
    static {
        firstObjects.add(new FirstObject("1", "a", BigDecimal.ZERO));
        firstObjects.add(new FirstObject("2", "a", BigDecimal.ONE));
        firstObjects.add(new FirstObject("3", "", BigDecimal.TEN));
        firstObjects.add(new FirstObject("3", "a", new BigDecimal("2")));
        firstObjects.add(new FirstObject("4", "b", new BigDecimal("3")));
        firstObjects.add(new FirstObject("4a", "b", new BigDecimal("4")));
        secondObjects.add(new SecondObject(1L, "b", "0"));
        secondObjects.add(new SecondObject(2L, "a", "0"));
        secondObjects.add(new SecondObject(2L, "a", "1"));
        secondObjects.add(new SecondObject(4L, "", "3"));
        secondObjects.add(new SecondObject(5L, "b", "4"));
    }

    public static void main(String[] args) {
        ComparatorService comparatorService = new ComparatorService();
        List<ComparsionResult> resultList = comparatorService.compare(firstObjects, secondObjects);

        if (resultList != null) {
            System.out.print("Результаты сравнения:");
            // Вывести результаты сравнения в консоль после реализации метода
            for (ComparsionResult comparsionResult : resultList) {
                System.out.println(comparsionResult.getComparsionMessage());
            }
        }
    }
}
