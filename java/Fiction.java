package ME;

public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 24.99;
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "title='" + super.getTitle() + '\'' +
                "price=" + price +
                '}';
    }
}
