package GPL; 

import java.util.Iterator; 
import java.util.LinkedList; 

//dja: add for performance reasons
import java.util.HashMap; 
import java.util.Map; 

import java.lang.Integer; 

// ***********************************************************************
 
public   class  Graph {
	
    public LinkedList vertices;

	
    public static boolean isDirected = false;

	
      
    //dja: add for performance reasons
    private Map verticesMap;

	

    //__feature_mapping__ [UndirectedWithNeighbors] [21:28]
	public Graph( ) 
    {
        vertices = new LinkedList();

	  //dja: add for performance reasons
        verticesMap = new HashMap( );

    }

	
 
    // Fall back method that stops the execution of programs
     //__feature_mapping__ [UndirectedWithNeighbors] [31:33]
	private void  run__wrappee__UndirectedWithNeighbors( Vertex s )
    {
    }

	
    // Executes Number Vertices
     //__feature_mapping__ [Number] [8:13]
	private void  run__wrappee__Number( Vertex s )
     {
       	System.out.println("Number");
        NumberVertices( );
        run__wrappee__UndirectedWithNeighbors( s );
    }

	
    // Executes Connected Components
     //__feature_mapping__ [Connected] [8:13]
	private void  run__wrappee__Connected( Vertex s )
    {
	     	System.out.println("Connected");
        ConnectedComponents( );
        run__wrappee__Number( s );
    }

	

    // Executes Cycle Checking
    //__feature_mapping__ [Cycle] [12:16]
	public void run( Vertex s )
     {
        System.out.println( "Cycle? " + CycleCheck() );
        run__wrappee__Connected( s );
    }

	

    // Adds an edge without weights if Weighted layer is not present
     //__feature_mapping__ [UndirectedWithNeighbors] [36:41]
	private void  addEdge__wrappee__UndirectedWithNeighbors( Vertex start,   Neighbor theNeighbor ) 
    {
        start.addEdge( theNeighbor );
        Vertex end = theNeighbor.neighbor;
        end.addEdge( new  Neighbor( start ) );
    }

	
      
    //__feature_mapping__ [WeightedWithNeighbors] [12:26]
	public void addEdge( Vertex start,  Neighbor theNeighbor )
    {
        addEdge__wrappee__UndirectedWithNeighbors( start,theNeighbor );
          
        // At this point the edges are added.
        // If there is an adorn like weight it has to be added to
        // the neighbor already present there
        if ( isDirected==false ) 
      {
            // It has to add ONLY the weight object to the neighbor
            Vertex end = theNeighbor.neighbor;
            end.addWeight( end,theNeighbor.weight );
        
        } // of else
    }

	

        
    //__feature_mapping__ [UndirectedWithNeighbors] [44:50]
	public void addVertex( Vertex v ) 
    {
        vertices.add( v );

	  //dja: add for performance reasons
	  verticesMap.put( v.name, v );
    }

	
   
    // Finds a vertex given its name in the vertices list
    //__feature_mapping__ [UndirectedWithNeighbors] [53:75]
	public  Vertex findsVertex( String theName )
    {
        Vertex theVertex;
        
        // if we are dealing with the root
        if ( theName == null )
            return null;

	  //dja: removed for performance reasons
//        for( VertexIter vxiter = getVertices( ); vxiter.hasNext( ); )
//        {
//            theVertex = vxiter.next( );
//            if ( theName.equals( theVertex.getName( ) ) )
//            {
//               return theVertex;
//            }
//        }
//        return null;

	  //dja: add for performance reasons
	  return ( Vertex ) verticesMap.get( theName );

    }

	

    //__feature_mapping__ [UndirectedWithNeighbors] [77:91]
	public VertexIter getVertices( ) 
    {
        return new VertexIter( ) 
        {
            private Iterator iter = vertices.iterator( );
            public Vertex next( ) 
            { 
                return ( Vertex )iter.next( ); 
            }
            public boolean hasNext( ) 
            { 
                return iter.hasNext(); 
            }
        };
    }

	

    // Finds an Edge given both of its vertices
    //__feature_mapping__ [UndirectedWithNeighbors] [94:124]
	public  EdgeIfc findsEdge( Vertex theSource,
                    Vertex theTarget )
       {
	  //dja: performance improvement
        //for( VertexIter vertexiter = getVertices(); vertexiter.hasNext(); )
        // {
	  //	Vertex v1 = vertexiter.next( );
	  //	for( EdgeIter edgeiter = v1.getEdges(); edgeiter.hasNext(); )
        //    {
	  //          EdgeIfc theEdge = edgeiter.next();
	  //		Vertex v2 = theEdge.getOtherVertex( v1 );
        //	      if ( ( v1.getName().equals( theSource.getName() ) &&
        //    	       v2.getName().equals( theTarget.getName() ) ) ||
        //         	     ( v1.getName().equals( theTarget.getName() ) &&
        //          	 v2.getName().equals( theSource.getName() ) ) )
        //        	return theEdge;
        //    }
        //}
		Vertex v1 = theSource;
		for( EdgeIter edgeiter = v1.getEdges(); edgeiter.hasNext(); )
            {
	            EdgeIfc theEdge = edgeiter.next();
			Vertex v2 = theEdge.getOtherVertex( v1 );
      	      if ( ( v1.getName().equals( theSource.getName() ) &&
            	       v2.getName().equals( theTarget.getName() ) ) ||
                 	     ( v1.getName().equals( theTarget.getName() ) &&
                  	 v2.getName().equals( theSource.getName() ) ) )
                	return theEdge;
            }
        return null;
    }

	


     //__feature_mapping__ [UndirectedWithNeighbors] [127:137]
	private void  display__wrappee__UndirectedWithNeighbors( ) 
    {
        System.out.println( "******************************************" );
        System.out.println( "Vertices " );
        for ( VertexIter vxiter = getVertices( ); vxiter.hasNext( ) ; )
        {
            vxiter.next( ).display( );
        }

        System.out.println( "******************************************" );
    }

	
    
    //__feature_mapping__ [WeightedWithNeighbors] [28:31]
	public void display() 
    {
        display__wrappee__UndirectedWithNeighbors();
    }

	

    // Adds an edge without weights if Weighted layer is not present
    //__feature_mapping__ [UndirectedWithNeighbors] [140:145]
	public EdgeIfc addEdge( Vertex start,  Vertex end )
      {
	  Neighbor e = new Neighbor( end );
        addEdge( start, e );
        return e;
    }

	

    //__feature_mapping__ [Number] [15:18]
	public void NumberVertices( ) 
    {
        GraphSearch( new NumberWorkSpace( ) );
    }

	

    //__feature_mapping__ [Connected] [15:18]
	public void ConnectedComponents( ) 
    {
        GraphSearch( new RegionWorkSpace( ) );
    }

	
              
    //__feature_mapping__ [Cycle] [18:22]
	public boolean CycleCheck() {
        CycleWorkSpace c = new CycleWorkSpace( isDirected );
        GraphSearch( c );
        return c.AnyCycles;
    }

	
    //__feature_mapping__ [DFS] [7:33]
	public void GraphSearch( WorkSpace w ) 
    {
        // Step 1: initialize visited member of all nodes
        VertexIter vxiter = getVertices( );
        if ( vxiter.hasNext( ) == false )
        {
            return; // if there are no vertices return
        }

        // Initializing the vertices
        while( vxiter.hasNext( ) ) 
        {
            Vertex v = vxiter.next( );
            v.init_vertex( w );
        }

        // Step 2: traverse neighbors of each node
        for( vxiter = getVertices( ); vxiter.hasNext( ); ) 
        {
            Vertex v = vxiter.next( );
            if ( !v.visited ) 
            {
                w.nextRegionAction( v );
                v.nodeSearch( w );
            }
        } 
    }

	
    // Adds an edge with weights
    //__feature_mapping__ [WeightedWithNeighbors] [7:10]
	public void addAnEdge( Vertex start,  Vertex end, int weight )
    {
        addEdge( start, new  Neighbor( end, weight ) );
    }


}