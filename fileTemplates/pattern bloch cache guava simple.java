		
		//https://github.com/google/guava/wiki/CachesExplained
		LoadingCache< String, Computer > graphs = CacheBuilder.newBuilder().maximumSize( 1000 ).build( new CacheLoader< String, Computer >()
			{
			@Override
			public Computer load( String k )
				{
				Computer o = new Computer();
				o.one = k;
				return o;
				}
			} );
		
 
		
		try
			{
			System.out.println( "cached " + graphs.get( "one" ) );
			;
			}
		catch( ExecutionException e )
			{
			System.out.println( "exception" );
			}