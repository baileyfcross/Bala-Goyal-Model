
/**
 * The Scientist class represents a Scientist as a node in the
 * Model
 *
 * @author (Bailey Cross)
 * @version (0.1)
 */
public class Scientist extends Node
{
    private String name;

    //The value that is associated with the Node
    private double credenceValue;    

    // Is a list for all of the successess in an iteration
    protected boolean successList[] = new boolean[3];

    // Determines if node does action A or B  
    private boolean isLight;

    private int successRate;
    /**
     * Constructor for objects of class Scientist'
     * 
     * @param name - the name of the Scientist Object
     */
    public Scientist(String name)
    {
        this.credenceValue = initalRm.nextInt(11);
        connectedEdges = new Edge[4];
        this.name = name;
    }

    public double setCredenceValue(double value){
        return credenceValue += value;
    }

    public double getCredenceValue(){
        return credenceValue;
    }

    public boolean colorNode(){
        if(credenceValue < 5){
            isLight = true;
            return true;
        }
        isLight = false;
        return false;
    }

    public int returnSR(){
        int totalSum = 0;
        for(int i = 0; i < successList.length; i++){
            if(successList[i])
            {
                totalSum++;
            }
        }
        successRate = totalSum/successList.length;
        return successRate;
    }

    public boolean getLight(){
        return isLight;
    }

    public String getName(){
        return name;
    }
}
