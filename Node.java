import java.util.Random;
/**
 * This abstract node class helps us put all of the common
 * values for each node in them without retyping them all out
 *
 * @author (Bailey Cross)
 * @version (0.1)
 */
public abstract class Node
{
    protected int credenceValue;
    protected Edge[] connectedEdges;
    protected boolean isLight;
    Random rm = new Random();
    Random initalRm = new Random();
    public int roll(){
        return rm.nextInt(21);
    }
    public double feedback(){
        return 0.0;
    }   
}
