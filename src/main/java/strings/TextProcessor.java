package strings;

public class TextProcessor {

    static void main(String[] args) {
        System.out.println("count words");
        countWords("I love java");

        System.out.println("reverse String");
        reverseString("Hello world");

        System.out.println("add spaces");
        addspaces("HelloWorldItsMeJuan");
        
    }

    private static void countWords(String iLoveJava) {
        var words = iLoveJava.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        // el %d significa que le estás pasando un dígito en este caso siendo "numberOfWords"
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void reverseString(String text) {
        for (int i = text.length()-1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    private static void addspaces(String text) {
        var  modifiedText = new StringBuilder(text);

        for (var i = 0; i < modifiedText.length(); i++) {

            if(i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i,' ');
                i++; // Se le añade uno a i porque estamos añadiendo un espacio
                //Lo que hace que el length() se vaya incrementando por la cantidad de espacios que estamos añadiendo
            }
        }

        System.out.println(modifiedText);

    }
}
