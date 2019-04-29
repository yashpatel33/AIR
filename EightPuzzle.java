import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EightPuzzle {

    /**
     * @param args the command line arguments
     */
    private int gn=0;                                                    // Initialize gn ie. no. of moves to 0
    private Board start;
    private Board goal;
    
    public void initStart()                                              //Accept and display start board
    {
        System.out.println("\n\n Enter start Board : ");
        start=new Board();
        start.initBoard();
        System.out.println("\n\nThe given start board is : ");
        start.display();
    }
    
    public void initGoal()                                               //Accept and display goal board
    {
        System.out.println("\n\n Enter goal Board : ");
        goal=new Board();
        goal.initBoard();
        System.out.println("\n\nThe given goal board is : ");
        goal.display();
    }
 
    
    public void solve()                                           // Solve puzzle using A* algorithm
    {
        Board cur = start;
        while(true)
        {
            System.out.println("\n\nBoard after "+gn+" moves : ");
            cur.display();
            if(cur.equals(goal))                                 //Check if goal is achieved nad return
            {
                System.out.println("\nGoal state achieved.");
                return;
            }
            
            gn++;                                                // Increment gn as per moves
            
            
            cur = cur.nextMove(gn, goal);                        // get the board after next move
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        EightPuzzle ep = new EightPuzzle();                      // Instantiate and solve the puzzle
        ep.initStart();
        ep.initGoal();
        
        System.out.println("\n\nThe board is solved as : \n");
        ep.solve();
        
        
        
    }
}
