/*
 * Scaffolded Book class.  Fill in with details per UML diagram
 */
public class Book {
    private String title;
    // declare other fields

    public Book() {
        // fix constructor per UML
    }

    public String getTitle() {
        // return book title
        return "";
    }

    public int getCondition() {
        // return book condition
        return 0;
    }

    public void setCondition(int num) {
        // set book condition
    }

    public void checkout() {
        // if available, set availability to false
        // else print "This title is not available"
    }

    public void checkin() {
        // set availability to true && decrease condition of book by 1
    }

    @Override
    public String toString() {
        /*
         * Converts book to String in format of
         * Title: The Three-Body Problem
         *  Author: Cixin Liu
         *  ISBN: 0765377063
         *  Available for checkout: true
         *  Condition: 10
         */
        return "";
    }

}
