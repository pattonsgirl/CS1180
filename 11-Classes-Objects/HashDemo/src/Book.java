public class Book {
    private String name;
    private int published;
    private String content;

    public Book() {
        this.name = "NotSet";
        this.published = 1565;
        this.content = "...";
    }

    public Book(String name, int published) {
        this.name = name;
        this.published = published;
        this.content = "...";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int date) {
        published = date;
    }

    public String toString() {
        return this.name + " " + this.published + " \n" + this.content;
    }

    // hashMaps use hashCodes when keys are added.
    // to generate a unique code for our key, which is an object,
    // we define the properties that generate the value
    @Override
    public int hashCode() {
        // if book name is null, base hashcode on year published
        if (this.name == null) {
            return this.published;
        }

        // else return (hash of name + year published)
        System.out.println("Unique hash is: " + this.name.hashCode() + " + " + this.published + " = " + (this.published
                + this.name.hashCode()));
        return this.published + this.name.hashCode();
    }

    // a proper equals - why?
    // for use by .contains and hashMap methods, like get
    @Override
    public boolean equals(Object b) {
        // if the variables are located in the same place, they're the same
        /*
         * This could be set up by
         * Book myBook = new Book();
         * Book myOtherBook = myBook;
         */
        if (this == b) {
            // System.out.println("Clones");
            return true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if (!(b instanceof Book)) {
            // System.out.println("This isn't even a book!");
            return false;
        }

        // convert the object to a Book-object
        Book comparedBook = (Book) b;

        // if the instance variables of the objects are the same, so are the objects
        if (this.name.equals(comparedBook.name) &&
                this.published == comparedBook.published) { // && this.content.equals(comparedBook.content)) {
            return true;
        }

        return false;
    }

    // this one is not a real override of .equals... see the good one above
    public boolean equals(Book b) {
        if (this.name.equals(b.name) && this.published == b.published) {
            return true;
        }
        return false;
    }
}
