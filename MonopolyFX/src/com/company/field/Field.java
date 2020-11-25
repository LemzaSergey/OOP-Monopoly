package com.company.field;

import java.util.ArrayList;

public class Field {
    private String name;
    private int numberOfField;

    public Field(String name, int numberOfField) {
        this.name = name;
        this.numberOfField = numberOfField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfField() {
        return numberOfField;
    }

    public void setNumberOfField(int numberOfField) {
        this.numberOfField = numberOfField;
    }

    public static Field searchFieldByName(String nameOfField, ArrayList<Field> field) {
        for (Field fields : field) {

            if (fields.getName().equals(nameOfField)) {
                return fields;
            }
        }
        return null;
    }

    public static Field searchFieldByNumber(int numberOfField, ArrayList<Field> field) {
        for (Field fields : field) {
            if (fields.getNumberOfField() == (numberOfField)) {
                return fields;
            }
        }
        return null;
    }


}


