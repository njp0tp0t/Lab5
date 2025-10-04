import java.util.Set;
import java.util.HashMap;
import java.util.Map;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder

{    private Map<String, String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses = new HashMap<>();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(Set<String> words)
    {
        for (String word : words) {
            if (responses.containsKey(word)) {
                return responses.get(word);
            }
        }
        return "That sounds interesting. Tell me more...";
    }
}

