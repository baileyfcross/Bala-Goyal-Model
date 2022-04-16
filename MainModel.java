
/**
 * This is where we bring all of our classes together and start
 * doing the iterations
 *
 * @author (Bailey Cross)
 * @version (0.1)
 */
public class MainModel
{
    public static void main(String args[]){
        /*
         * Lets start with 5 Scientists
         */
        int numberOfS = 5;
        Scientist s1 = new Scientist();
        Scientist s2 = new Scientist();
        Scientist s3 = new Scientist();
        Scientist s4 = new Scientist();
        Scientist s5 = new Scientist();
        
        /*
         *  Next we can have 2 Law Makers
         */
        
        Lawmaker l1 = new Lawmaker();
        Lawmaker l2 = new Lawmaker();
        
        /*
         * Finally, we will now incorperate the propagandist
         */
        
        Propagandist p1 = new Propagandist();
        
        /*
         * The reason we have redundant edges is because
         * that will represent two way edges
         */
        s1.connectedEdges[0] = new Edge(s1,s2);
        s1.connectedEdges[1] = new Edge(s1,s3);
        s1.connectedEdges[2] = new Edge(s1,s4);
        s1.connectedEdges[3] = new Edge(s1,s5);
        
        s2.connectedEdges[0] = new Edge(s2,s1);
        s2.connectedEdges[1] = new Edge(s2,s3);
        s2.connectedEdges[2] = new Edge(s2,s4);
        s2.connectedEdges[3] = new Edge(s2,s5);
        
        s3.connectedEdges[0] = new Edge(s3,s1);
        s3.connectedEdges[1] = new Edge(s3,s2);
        s3.connectedEdges[2] = new Edge(s3,s4);
        s3.connectedEdges[3] = new Edge(s3,s5);
        
        s4.connectedEdges[0] = new Edge(s4,s1);
        s4.connectedEdges[1] = new Edge(s4,s2);
        s4.connectedEdges[2] = new Edge(s4,s3);
        s4.connectedEdges[3] = new Edge(s4,s5);
        
        s5.connectedEdges[0] = new Edge(s5,s1);
        s5.connectedEdges[1] = new Edge(s5,s2);
        s5.connectedEdges[2] = new Edge(s5,s3);
        s5.connectedEdges[3] = new Edge(s5,s4);
        
        System.out.println("Scientist 1 Credence Value: "+ 
            s1.getcredenceValue());
        System.out.println("Scientist 2 Credence Value: "+ 
            s2.getcredenceValue());
        System.out.println("Scientist 3 Credence Value: "+ 
            s3.getcredenceValue());
        System.out.println("Scientist 4 Credence Value: "+ 
            s4.getcredenceValue());
        System.out.println("Scientist 5 Credence Value: "+ 
            s5.getcredenceValue());        
    }
    
    
}
