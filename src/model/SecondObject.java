package model;

import java.math.BigDecimal;

public class SecondObject {
    private Long id; //первичный ключ - ищем по нему
    private String value;
    private String anotherValue;


    public SecondObject(Long id, String value, String anotherValue) {
        this.setId(id);
        this.setValue(value);
        this.setAnotherValue(anotherValue);
    }

    public Long getId() {
        return id;
    }

    // Перегрузили метод для проверки значения при создании объекта ComparisonResult
    public Integer checkAndGetId(){
        if(id > (long) Integer.MAX_VALUE)
            System.out.println("ПРЕДУПРЕЖДЕНИЕ!\nЗначение id превышает int. \n Возможна потеря данных!");
        return (int)(long)id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAnotherValue() {
        return anotherValue;
    }

    public void setAnotherValue(String anotherValue) {
        this.anotherValue = anotherValue;
    }

    // Дополнительные методы
    @Override
    public String toString(){
        String id = this.getId().toString(),
                value = this.getValue(),
                another = this.getAnotherValue();
        if(!id.equals("") && !(value + another).equals("")){
            return String.format("%s;%s;%s;", id, value, another);
        }
        return "null";
    }

    public String idValue(){
        return String.format("%s;%s;", this.id.toString(), this.value);
    }

    public String idAvalue(){
        return String.format("%s;%s;", this.id.toString(), this.anotherValue);
    }

    @Override
    public boolean equals(Object obj){
        SecondObject resObj = (SecondObject) obj;
        return this.toString().equals(resObj.toString());
    }
}
