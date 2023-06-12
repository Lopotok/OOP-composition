public class TestAuthor {

    public static void main(String[] args) {

        Author ahTech = new Author("Tan Ah Tech", "ahteck@nowhere.com", 'm');
        System.out.println(ahTech);
        ahTech.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTech.getName());
        System.out.println("email is: " + ahTech.getEmail());
        System.out.println("gender is: " + ahTech.getGender());


    }
}
