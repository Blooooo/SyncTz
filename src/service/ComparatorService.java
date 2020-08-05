package service;

import model.ComparsionResult;
import model.FirstObject;
import model.SecondObject;

import java.util.List;

public class ComparatorService {
    public List<ComparsionResult> compare(List<FirstObject> firstObjects, List<SecondObject> secondObjects) {
        /*
            Необходимо реализовать алгоритм сравнения обьектов двух разных типов FirstObject и SecondObject.
            - Произвести валидацию данных: отсеить повторы, обработать ошибки в данных
            - Cравнить данные, например: если в secondObjects не найдено соответствующее значение из firstObjects,
              то записать в результат сравнения ComparsionResult.comparsionMessage «Объект с id <Значение поля id> не найден во втром списке»,
              или если не совпадают значения, но совпадают id, то записать в результат стравнения «Различается значения для id <id value>: <различающиеся значения>»
        */
        return null;
    }
}
