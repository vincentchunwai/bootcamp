package book;

import java.util.List;

public class FictionLibrary extends Library {

    public FictionLibrary(String name) {
        super(name);
    }

    // You can define additional methods or override existing methods specific to FictionLibrary

    public void borrowFictionBook(Fiction fictionBook) {
        removeBook(fictionBook);
    }

    public void returnFictionBook(Fiction fictionBook) {
        addBook(fictionBook);
    }
}

