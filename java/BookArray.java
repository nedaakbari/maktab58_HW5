package ME;

public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new Fiction("lordOfRing");
        books[1] = new Fiction("HarryPotter");
        books[2] = new Fiction("Narnia");
        books[3] = new Fiction("Galaxi");
        books[4] = new Fiction("Avengers");
        books[5] = new NonFiction("The Compound Effect");
        books[6] = new NonFiction("Napelon");
        books[7] = new NonFiction("when niccie cry");
        books[8] = new NonFiction("java");
        books[9] = new NonFiction("How program");
        for (Book item : books) {
            System.out.println(item);
        }
    }
}