package com.bootcamp.week3.Ejercicios.Seis;

public record PageResult(String url, int statusCode, String title, long responseTimeMs) {
    @Override
    public String toString() {
        return String.format("[%d] %s (%dms)", statusCode, title, responseTimeMs);
    }
}