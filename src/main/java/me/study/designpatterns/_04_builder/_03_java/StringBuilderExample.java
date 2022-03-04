package me.study.designpatterns._04_builder._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("sample").append("string").toString();
        System.out.println(result);
    }

}
