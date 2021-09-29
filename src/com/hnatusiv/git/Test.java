package com.hnatusiv.git;

public class Test {
    String name;

    public Test(String name) {
        this.name = name;
    }

    public Test() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }
}
;