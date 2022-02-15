package com.dio.base;

public record Order(String code) {

    @Override
    public String toString() {
        return "Order={" +
                "code=" + code + "'" +
                "}";
    }
}
