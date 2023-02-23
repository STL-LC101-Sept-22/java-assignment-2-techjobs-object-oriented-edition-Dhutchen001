package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    public int id;

    public static int nextId = 1;

    public String value;

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
