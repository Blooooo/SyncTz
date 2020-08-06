package service;

import model.ComparsionResult;
import model.FirstObject;
import model.SecondObject;

import java.util.*;

public class ComparatorService{
    public List<ComparsionResult> compare(List<FirstObject> firstObjects, List<SecondObject> secondObjects) {
        /*
            Необходимо реализовать алгоритм сравнения обьектов двух разных типов FirstObject и SecondObject.
            - Произвести валидацию данных: отсеить повторы, обработать ошибки в данных
            - Cравнить данные, например: если в secondObjects не найдено соответствующее значение из firstObjects,
              то записать в результат сравнения ComparsionResult.comparsionMessage «Объект с id <Значение поля id> не найден во втром списке»,
              или если не совпадают значения, но совпадают id, то записать в результат стравнения «Различается значения для id <id value>: <различающиеся значения>»
        */
        // Обработка входных списков
        validation(firstObjects);
        validation(secondObjects);
        // Создаем коллекцию для возврата работы метода
        List<ComparsionResult> result = new ArrayList<>();
        // В цикле пробегаемся по первому списку, извлекая по одному объекту для сравнения
        for (FirstObject objFirst : firstObjects) {
            // Устанавливаем флаг
            int flag = 0;
            // Внутренний цикл просмотра объектов второго списка
            for (SecondObject objSecond : secondObjects) {
                // Условие на соответсвие id двух объектов по полю id
                if(objFirst.getId().equals(objSecond.getId().toString())){
                    // Устанавливаем флаг входа в область совпадений
                    flag = 1;
                    // Если объекты совпадают по всем полям
                    if(objFirst.toString().equals(objSecond.toString())){
                        result.add(new ComparsionResult(objFirst.getId(), objSecond.checkAndGetId(), String.format("\tНайдено полное совпадение для id %s",objFirst.getId())));
                        continue;
                    }
                    // Если объекты совпадают по 2 полям: <id> + <value>
                    else if(objFirst.idValue().equals(objSecond.idValue())){
                        result.add(new ComparsionResult(objFirst.getId(), objSecond.checkAndGetId(), String.format("\tНайдено совпадающее значение по полю Value для id %s", objFirst.getId())));
                        continue;
                    }
                    // Если объекты совпадают по 2 полям: <id> + <anotherValue>
                    else if(objFirst.idAvalue().equals(objSecond.idAvalue())){
                        result.add(new ComparsionResult(objFirst.getId(), objSecond.checkAndGetId(), String.format("\tНайдено совпадающее значение по полю anotherValue для id %s", objFirst.getId())));
                        continue;
                    }
                    // Если обхекты совпадают только по <id>
                    result.add(new ComparsionResult(objFirst.getId(), objSecond.checkAndGetId(),String.format("\tРазличается значения для id %s: <различающиеся значения>", objFirst.getId())));
                }
            }
            if(flag == 0){
                result.add(new ComparsionResult(String.format("\tОбъект с id %s не найден во втром списке", objFirst.getId())));
            }
        }
        return result;
    }

    // Добавляем метод валидации данных
    private <Temp> void validation(List<Temp> argList){
        // Обрабатываем битые данные
        argList.removeIf((Temp obj) -> (obj == null || obj.toString().equals("null")));
        for(Iterator<Temp> it = argList.iterator(); it.hasNext();){
            Temp obj = it.next();
            // Проверяем частоту появления единицы данных среди списка
            if(frequency(argList, obj) > 1)
                it.remove();
        }
    }

    private <Temp> int frequency(Collection<Temp> c, Temp o) {
        int result = 0;
        for (Temp e : c)
            if (e != null && o.toString().equals(e.toString()))
                result++;
        return result;
    }
}
