package ME;

public class UseBook {
    public static void main(String[] args) {
        Book book1 = new Fiction("lordOfRing");
        System.out.println("book1...> " + book1.toString());
        Book book2 = new Fiction("HarryPotter");
        System.out.println("book2...> " + book2.toString());
        Book book3 = new Fiction("Narnia");
        System.out.println("book3...> " + book3.toString());
        Book book4 = new Fiction("Galaxi");
        System.out.println("book4...> " + book4.toString());
        Book book5 = new Fiction("Avengers");
        System.out.println("book5...> " + book5.toString());
        Book book6 = new NonFiction("The Compound Effect");
        System.out.println("book6...> " + book6.toString());
        Book book7 = new NonFiction("Napelon");
        System.out.println("book7...> " + book7.toString());
        Book book8 = new NonFiction("when niccie cry");
        System.out.println("book8...> " + book8.toString());
        Book book9 = new NonFiction("java");
        System.out.println("book9...> " + book9.toString());
        Book book10 = new NonFiction("How program");
        System.out.println("book10...> " + book10.toString());

    }
}