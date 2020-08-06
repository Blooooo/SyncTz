package model;

import java.math.BigDecimal;

public class FirstObject {
    private String id; //первичный ключ - ищем по нему
    private String value;
    private BigDecimal anotherValue;

    public FirstObject(String id, String value, BigDecimal anotherValue) {
        this.setId(id);
        this.setValue(value);
        this.setAnotherValue(anotherValue);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BigDecimal getAnotherValue() {
        return anotherValue;
    }

    public void setAnotherValue(BigDecimal anotherValue) {
        this.anotherValue = anotherValue;
    }

    // Дополнительные методы
    @Override
    public String toString(){
        String id = this.getId(),
                value = this.getValue(),
                another = this.getAnotherValue().toString();
        if(!id.equals("") && !(value + another).equals("")){
            return String.format("%s;%s;%s;", id, value, another);
        }
        return "null";
    }

    public String idValue(){
        return String.format("%s;%s;", this.id, this.value);
    }

    public String idAvalue(){
        return String.format("%s;%s;", this.id, this.anotherValue.toString());
    }

    @Override
    public boolean equals(Object obj){
        SecondObject resObj = (SecondObject) obj;
        return this.toString().equals(resObj.toString());
    }
}
