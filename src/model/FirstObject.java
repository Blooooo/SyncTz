package model;

import java.math.BigDecimal;

public class FirstObject {
    private String id; //первичный ключ - ищем по нему
    private String value;
    private BigDecimal anotherValue;

    public FirstObject(String id, String value, BigDecimal anotherValue) {
        this.id = id;
        this.value = value;
        this.anotherValue = anotherValue;
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
}
