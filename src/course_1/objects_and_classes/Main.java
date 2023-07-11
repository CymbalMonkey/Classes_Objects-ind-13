package course_1.objects_and_classes;

public class Main {
    public static void main(String[] args) {

        Author hemingway = new Author("Ernest", "Hemingway");
        System.out.println(hemingway.getFirstName());
        System.out.println(hemingway.getLastName());

        Book arms = new Book("A Farewell To Arms", hemingway, 1929);
        System.out.println(arms.getName());
        System.out.println(arms.getAuthor());
        System.out.println(arms.getPubYear());

        System.out.println();

        Author heller = new Author("Joseph", "Heller");
        System.out.println(heller.getFirstName());
        System.out.println(heller.getLastName());

        Book catch_22 = new Book("Catch-22", heller, 1961);
        System.out.println(catch_22.getName());
        System.out.println(catch_22.getAuthor());
        System.out.println(catch_22.getPubYear());

        catch_22.setPubYear(1968);
        System.out.println(catch_22.getPubYear());
    }
}