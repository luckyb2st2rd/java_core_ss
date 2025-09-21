package basics;

public class Lines {
    public static void main(String[] args) {
        String sentence = "Java is cool and very popular.";
        boolean containsCool = sentence.contains("cool");
        System.out.println("Содержит 'cool'? " + containsCool);

        String[] words = sentence.split(" ");
        System.out.println("Количество слов: " + words.length);

        String replaced = sentence.replace("Java", "Kotlin");
        System.out.println("Замена слов: " + replaced);
    }
}
