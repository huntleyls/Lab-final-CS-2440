/**
 * Textbook.java
 * 
 */

//Put any imports below this line.

/**
 * Short, one-line description of Textbook class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TextBook
{

    private String title;
    private String author;
    private String publisher;

    public TextBook(String title,String author,String publisher)
    {   
        this.title=title;
        this.author=author;
        this.publisher=publisher;

    }
    public TextBook(TextBook object2)
    {
        return;
    }
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPublisher()
    {
        return publisher;
    } 

    public void set(String title, String author, String publisher)
    {
        this.title=title;
        this.author= author;
        this.publisher = publisher;
    }

    

    public String toString()
    {
        return "The details of the book are: " + title + ", " + author + ", " + publisher;
    }

}