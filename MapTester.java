
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.HashMap;
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> phoneBook;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        phoneBook = new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enterNumber(String name, String number)
    {
        // put your code here
        phoneBook.put(name, number);
    }
    
    public String lookupNumber(String name){
        return phoneBook.get(name);
    }
    
    
}