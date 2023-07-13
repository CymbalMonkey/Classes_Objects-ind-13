package course_1.objects_and_classes;

public class Main {
    public static void main(String[] args) {

        Author hemingway = new Author("Ernest", "Hemingway");
        Author hemingwayCopy = new Author("Ernest", "Hemingway");
        //System.out.println(hemingway.getFirstName());
        //System.out.println(hemingway.getLastName());

        Book arms = new Book("A Farewell To Arms", hemingway, 1929);
        Book armsCopy = new Book("A Farewell To Arms", hemingway, 2000);
        //System.out.println(arms.getName());
        //System.out.println(arms.getPubYear());

        System.out.println();

        Author heller = new Author("Joseph", "Heller");
        //System.out.println(heller.getFirstName());
        //System.out.println(heller.getLastName());

        Book catch_22 = new Book("Catch-22", heller, 1961);
        //System.out.println(catch_22.getName());
        //System.out.println(catch_22.getPubYear());

        //Решил попробовать всеми тремя способами :)
        Author author = arms.getAuthor();
        String fullName1 = author.getFirstName() + " " + author.getLastName();
        System.out.println(fullName1);

        String fullName2 = catch_22.getAuthor().getFirstName() + " " + catch_22.getAuthor().getLastName();
        System.out.println(fullName2);

        System.out.println(arms.getAuthor().getFirstName() + " " + arms.getAuthor().getLastName());

        //catch_22.setPubYear(1968);
        //System.out.println(catch_22.getPubYear());
        System.out.println();

        System.out.println(hemingway);
        System.out.println(heller);

        System.out.println(arms);
        System.out.println(catch_22);

        System.out.println(hemingway.equals(hemingwayCopy));
        System.out.println(arms.equals(armsCopy));
    }
}