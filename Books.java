import java.util.Scanner;

public class Books {
    static Scanner user_input = new Scanner(System.in);
    static String[] books = { "java", "C", "python" };
    static final double Teacher = 0.6;
    static final double Student = 0.4;
    static final double Other = 0.2;
    static double java_book = 400;
    static double c = 300;
    static double python = 200;

    public static void main(String[] args) {

        prln("---------wellcome to Books Store-------- ");
        prln("Which Books do you like??");
        books_item();
        prln("Please enter a book name");

        String books_name = user_input.nextLine();
        if (books[0].toLowerCase().equals(books_name)) {
            prln("ok you'r choice book name in " + books[0] + "books");

            price_dec();

        } else if (books[1].toLowerCase().equals(books_name)) {
            prln("Ok you'r choice book name in " + books[1] + "books");

            price_dec();

        } else if (books[2].toLowerCase().equals(books_name)) {
            prln("Ok you'r choice books name in " + books[2] + "books");

            price_dec();

        } else {
            prln("invalid Books name");
        }
    }

    static void price_dec() {

        double price = 200;
        person();
        prln("Please enter the symbol");
        String name = user_input.nextLine();

        if (name.toLowerCase().equals("teacher")) {

            price = price - (price * Teacher);
            show_mess(price);

        } else if (name.toLowerCase().equals("student")) {
            price = price - (price * Student);
            show_mess(price);
        } else if (name.toLowerCase().equals("other")) {
            price = price - (price * 0);
            show_mess(price);
        }
    }

    static void show_mess(double price) {
        prln("your to totle cost in " + price);
        prl("Your are most WellCome");
    }

    static void person() {
        prln("who are you??");
        prln("1.Teacher\n2.Student\n3.Other");
    }

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

    static void prl(Object anyObject) {
        System.out.print(anyObject);
    }

    static void books_item() {
        prln("1.java\n2.C\n3.python");
    }

}
