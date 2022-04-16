
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
    private String name;
    /**
     * Constructor for objects of class Scientist
     */
    public Scientist(String name)
    {
       this.credenceValue = initalRm.nextInt(11);
       connectedEdges = new Edge[4];
       this.name = name;
    }
    
    public int getcredenceValue(){
        return credenceValue;
    }
    
    public String getName(){
        return name;
    }
}
