// This is a mutant program.
// Author : ysma

package GPL;


public class Vertex
{

    public  void addWeight( Vertex end, int theWeight )
    {
        Neighbor the_neighbor = (Neighbor) end.adjacentNeighbors.removeLast();
        the_neighbor.weight = theWeight;
        end.adjacentNeighbors.add( the_neighbor );
    }

    public  void adjustAdorns( Neighbor sourceNeighbor )
    {
        Neighbor targetNeighbor = (Neighbor) adjacentNeighbors.getLast();
        original( sourceNeighbor );
    }

    public  void display()
    {
        original();
    }

}