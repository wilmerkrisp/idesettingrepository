		//https://github.com/ben-manes/caffeine
		LoadingCache< String, Computer > cache = Caffeine.newBuilder().maximumSize( 3 ).expireAfterWrite( 10 ,
		                                                                                                  TimeUnit.MINUTES ).recordStats().build( k -> new Computer( k ) );
		// Lookup and compute an entry if absent, or null if not computable
		Computer o1 = cache.get( "one" );
		Computer o2 = cache.get( "one" );
		
		
		System.out.println( "stats " + cache.stats() );
