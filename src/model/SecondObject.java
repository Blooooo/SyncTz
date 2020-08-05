package model;

import java.math.BigDecimal;

public class SecondObject {
    private Long id; //первичный ключ - ищем по нему
    private String value;
    private String anotherValue;


    public SecondObject(Long id, String value, String anotherValue) {
        this.id = id;
        this.value = value;
        this.anotherValue = anotherValue;
    }

    public Long getId() {
        return id;
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
}
