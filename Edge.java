
/**
 * The Edge class represents an edge between one node to another
 *
 * @author (Bailey Cross)
 * @version (0.1)
 */
public class Edge
{
    protected Node n1;
    protected Node n2;
    /**
     * Constructor for objects of class Edge
     */
    public Edge(Node n1, Node n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public Node getOrigin(){
        return n1;
    }
    
    public Node getDest(){
        return n2;
    }
}
