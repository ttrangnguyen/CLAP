// This is a mutant program.
// Author : ysma

package GPL;


import java.util.LinkedList;


public class Neighbor implements NeighborIfc
{

    public Vertex end;

    public Edge edge;

    public Neighbor()
    {
        edge = null;
    }

    public Neighbor( Vertex v, Edge e )
    {
        end = v;
        edge = e;
    }

}