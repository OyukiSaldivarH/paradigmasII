package ProjectBooks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntroduction {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The alchemis", "Paulo Coelho", "Adventure", 4.4));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.1));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.6));
        books.add(new Book("House of Leaves", "Mark danielewski", "Horror", 4.0));
        System.out.println();
        // how do you print the list of books
        //books.forEach(System.out::println);
        books.forEach(book -> System.out.println(book));
        List<Book> pupularRomanticBooks = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Romance"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList());
        System.out.println();
        pupularRomanticBooks.forEach(book -> System.out.println(pupularRomanticBooks));
        List<Book>popularHorrorBooks = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating()<3)
                .collect(Collectors.toList());
        System.out.println();
        popularHorrorBooks.forEach(book -> System.out.println(popularHorrorBooks));
        List<Book> AuthorPauloCoelho = books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase("Paulo Coelho"))
                        .collect(Collectors.toList());
        System.out.println();
        AuthorPauloCoelho.forEach(book -> System.out.println(AuthorPauloCoelho));

        books.stream()
                .filter(book -> book.getRating()> 3)
                .map(book -> book.getAuthor())
                .forEach(System.out::println);

        double maxRating = books.stream()
                .mapToDouble(book-> book.getRating())
                .max().getAsDouble();
        System.out.printf("Max Rating %.2f", maxRating);

        double averageRating=books.stream()
                .mapToDouble(book->book.getRating())
                .max().getAsDouble();
        System.out.printf("Max Rating: %.2f", maxRating);

    }


    }


