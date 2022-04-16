
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
         * 
         * This implentation is obviously static (Hard Coded).
         * If I wanted to create a dynamic array with a user input
         * for Scientists I could import arraylist or doubly linked
         * list then use the dynamic aspect of those classes.
         */

        Scientist[] scientists = new Scientist[5];
        Scientist s1 = new Scientist("s1");
        scientists[0] = s1;

        Scientist s2 = new Scientist("s2");
        scientists[1] = s2;

        Scientist s3 = new Scientist("s3");
        scientists[2] = s3;

        Scientist s4 = new Scientist("s4");
        scientists[3] = s4;

        Scientist s5 = new Scientist("s5");
        scientists[4] = s5;

        /*
         *  Next we can have 2 Law Makers
         */

        Lawmaker[] lawmakers = new Lawmaker[2];
        Lawmaker l1 = new Lawmaker();
        lawmakers[0] = l1;
        Lawmaker l2 = new Lawmaker();
        lawmakers[1] = l2;

        /*
         * Finally, we will now incorperate the propagandist
         */

        Propagandist p1 = new Propagandist();

        /*
         * The reason we have redundant edges is because
         * that will represent two way edges.
         * In the more complex aspects of the model
         * the lawmakers are only one way listeners
         * So in order to model that, I will use redundant edge
         * objects
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

        /*
         * Print out the Inital Credence Values
         * For each Scientist
         */

        System.out.println("Scientist Inital Credence Values:");
        for(Scientist s: scientists){
            System.out.println("Scientist "+ s.getName() +" Credence Value: "
                + s.getcredenceValue());
                
            System.out.println("Is the node Light?: " 
                + s.colorNode());
        }
        
        /*
         * This is the roll iterations. We want to do the feedbac
         * loop inside of the iterations as well.
         */
        int iteration = 1;
        while (iteration < 4){
            Spacer();
            System.out.println("Rolling Iteration " + iteration +
            " for Scientists");
            for(Scientist s: scientists){
                int roll = s.roll();
                System.out.println("Scientist "+ s.getName() +" Roll Value: "
                    + roll);
                if(roll < 5){
                    
                } else {
                    
                }
            }
            
            iteration++;
        }
    }

    public static void Spacer(){
        System.out.println();
    }
}
