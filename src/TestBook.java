public class TestBook {

    public static void main(String[] args) {


        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()

        Book dummyBook = new Book("Java for dummy", ahTeck,19.95,99);
        System.out.println(dummyBook);  // Test Book's toString()
        dummyBook.setPrice(29.95);
        dummyBook.setQty(29);

        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java",
        new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()
        System.out.println();

    }
}
