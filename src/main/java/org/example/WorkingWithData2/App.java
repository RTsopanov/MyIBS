package org.example.WorkingWithData2;

public class App {

    public static void main(String[] args) {
        String input = "I like Java!!!";

        boolean containsJava = input.contains("Java");
        boolean startsWithILike = input.startsWith("I like");
        boolean endsWithExclamation = input.endsWith("!!!");

        if (containsJava && startsWithILike && endsWithExclamation) {
            System.out.println(input.toUpperCase());
        }

        String replacedString = input.replace('a', 'o');
        String substringJovo = replacedString.substring(replacedString.indexOf("Jovo"), replacedString.indexOf("Jovo") + 4);
        System.out.println(substringJovo);
    }


}
