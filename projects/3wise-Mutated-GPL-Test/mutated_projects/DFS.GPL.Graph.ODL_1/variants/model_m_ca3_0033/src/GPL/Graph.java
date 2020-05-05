// This is a mutant program.
// Author : ysma

package GPL; 

import java.util.Iterator; 
import java.util.LinkedList; 
//dja: added to fix compile problems when doing the performance improvements
import java.util.Comparator; 
import java.util.Collections; 

import java.lang.Integer; 


public   class  Graph {
	
    public LinkedList vertices;

	
    public static boolean isDirected = true;

	

    //__feature_mapping__ [DirectedWithNeighbors] [17:19]
	public Graph() {
        vertices = new LinkedList();
    }

	
 
    // Fall back method that stops the execution of programs
     //__feature_mapping__ [DirectedWithNeighbors] [22:23]
	private void  run__wrappee__DirectedWithNeighbors( Vertex s )
      { }

	

    // Executes Cycle Checking
    //__feature_mapping__ [Cycle] [12:16]
	public void run( Vertex s )
     {
        System.out.println( "Cycle? " + CycleCheck() );
        run__wrappee__DirectedWithNeighbors( s );
    }

	

    //dja: fix for compile problems during performance improvements
    //__feature_mapping__ [DirectedWithNeighbors] [26:28]
	public void sortVertices(Comparator c) {
        Collections.sort(vertices, c);
    }

	


    // Adds an edge without weights if Weighted layer is not present
//    public void addAnEdge( Vertex start,  Vertex end, int weight )
  //    {
    //    addEdge( start, new  Neighbor( end ) );
//    }

    // Adds an edge without weights if Weighted layer is not present
    //__feature_mapping__ [DirectedWithNeighbors] [38:43]
	public EdgeIfc addEdge( Vertex start,  Vertex end )
    {
	  Neighbor e = new Neighbor( end );
        addEdge( start, e );
        return e;
    }

	

        
    //__feature_mapping__ [DirectedWithNeighbors] [46:48]
	public void addVertex( Vertex v ) {
        vertices.add( v );
    }

	
   
    //__feature_mapping__ [DirectedWithNeighbors] [50:52]
	public void addEdge( Vertex start,  Neighbor theNeighbor ) {
        start.addEdge( theNeighbor );
    }

	
    
    // Finds a vertex given its name in the vertices list
    //__feature_mapping__ [DirectedWithNeighbors] [55:75]
	public  Vertex findsVertex( String theName )
      {
        Vertex theVertex = null;

        // if we are dealing with the root
        if ( theName==null )
        {
            return null;
        }

        for(VertexIter vxiter = getVertices( ); vxiter.hasNext( ); )
        {
            theVertex = vxiter.next( );
            if ( theName.equals( theVertex.getName( ) ) )
            {
                return theVertex;
            }
        }

        return theVertex;
    }

	

    //__feature_mapping__ [DirectedWithNeighbors] [77:91]
	public VertexIter getVertices( ) 
    {
        return new VertexIter( ) 
        {
                private Iterator iter = vertices.iterator( );
                public Vertex next( ) 
                { 
                    return (Vertex)iter.next( ); 
                }
                public boolean hasNext( ) 
                { 
                    return iter.hasNext( ); 
                }
            };
    }

	

    
    //__feature_mapping__ [DirectedWithNeighbors] [94:104]
	public void display( ) 
    {
        System.out.println( "******************************************" );
        System.out.println( "Vertices " );
        for ( VertexIter vxiter = getVertices( ); vxiter.hasNext( ) ; )
        {
            vxiter.next( ).display( );
        }
        System.out.println( "******************************************" );

    }

	
              
    //__feature_mapping__ [Cycle] [18:22]
	public boolean CycleCheck() {
        CycleWorkSpace c = new CycleWorkSpace( isDirected );
        GraphSearch( c );
        return c.AnyCycles;
    }

	

    //__feature_mapping__ [DFS] [10:27]
	public  void GraphSearch( WorkSpace w )
    {
        VertexIter vxiter = getVertices();
        if (vxiter.hasNext()) {
            return;
        }
        while (vxiter.hasNext()) {
            Vertex v = vxiter.next();
            v.init_vertex( w );
        }
        for (vxiter = getVertices(); vxiter.hasNext();) {
            Vertex v = vxiter.next();
            if (!v.visited) {
                w.nextRegionAction( v );
                v.nodeSearch( w );
            }
        }
    }


}