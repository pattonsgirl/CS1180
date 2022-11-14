public class Book {
    private String name;
    private int published;
    private String content;

    public Book() {
        this.name = "";
        this.published = 1565;
        this.content = "...";
    }

    public Book(String name, int published) {
        this.name = name;
        this.published = published;
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
        return this.name + " " + this.published + " " + this.content;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals() {
        return false;
    }
}
