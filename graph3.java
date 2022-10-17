
import java.util.Arrays;
 


public class Ques_4
{
    private int V, pathCount;
    private int[] path;     
    private int[][] graph;
 
    
    public void HamiltonCycle(int[][] g)
    {
        V = g.length;
        path = new int[V];
 
        Arrays.fill(path, -1);
        graph = g;        
        try
        {            
            path[0] = 0;
            pathCount = 1;            
            solve(0);
            System.out.println("No solution");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            display();
        }
    }
    

    public boolean isPresent(int v)
    {
        for (int i = 0; i < pathCount - 1; i++)
            if (path[i] == v)
                return true;
        return false;                
    }
   
    public void display()
    {
        System.out.print("\nPath : ");
        for (int i = 0; i <= V; i++)
            System.out.print(path[i % V] +" ");
        System.out.println();
    }    
   
    public static void main (String[] args) 
    {
        
        System.out.println("Hamiltonian Cycle Algorithm Test\n");
        
        Ques_4 hc = new Ques_4();
 
        
        int graph[][] = {{0, 1, 1, 0, 0}, 
			{1, 0, 1, 1, 1}, 
			{1, 1, 0, 1, 1}, 
			{0, 1, 1, 0, 1}, 
			{0, 1, 1, 1, 0}, 
		}; 
 
        hc.HamiltonianCycle(graph);        
    }    
}
