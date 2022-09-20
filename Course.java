/**
 * course.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Short, one-line description of course class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Course
{
    private String courseName;
    private String instructor;
    private TextBook textBook;
    private double grades;
    private String name;
    /**
     * @param courseName a
     * @param instructor a
     * @param textBook a 
     */
    public Course(String courseName, String instructor, TextBook textBook)
    {
        
        if (courseName == null)
        {
            courseName = "";
        }
        else
        {
            this.courseName = courseName;
        }
        if (instructor == null)
        {
            instructor = "";
        }
        else
        {
            this.instructor = instructor;
        }
    }
    public String getName()
    {
        return courseName;
    }
    public  String getCourseName()
    {
        return courseName;
    }
    
    public String getInstructor()
    {
        return instructor;
    }
    
    public TextBook getTextBook()
    {
        return textBook;
    }
    
    public String toString()
    {
        String str ="";
        return str;
    }
    
    public void setGrades(double[] grades)
    {
        
    }
    
    public double getMinimum()
    {
        
        return 0;
    }
    public double getMaximum()
    {
        
        return 0;
    }
    
    public double getAverage()
    {
        
        return 0;
    }
    
}
