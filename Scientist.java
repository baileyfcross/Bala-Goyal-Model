
/**
 * The Scientist class represents a Scientist as a node in the
 * Model
 *
 * @author (Bailey Cross)
 * @version (0.1)
 */
public class Scientist extends Node
{
    private int credenceValue;    
    /**
     * Constructor for objects of class Scientist
     */
    public Scientist()
    {
       this.credenceValue = initalRm.nextInt(11);
       connectedEdges = new Edge[4];
    }
    
    public int getcredenceValue(){
        return credenceValue;
    }
}
