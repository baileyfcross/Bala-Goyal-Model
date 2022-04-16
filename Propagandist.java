
/**
 * The Propagandist class represents a Propagandist as a node in the
 * Model
 *
 * @author (Bailey Cross)
 * @version (0.1)
 */
public class Propagandist extends Node
{  
    /**
     * Constructor for objects of class Propagandist
     */
    public Propagandist()
    {
        credenceValue = initalRm.nextInt();
    }
    
    public int roll(){
        
        return 1;
    }
}
