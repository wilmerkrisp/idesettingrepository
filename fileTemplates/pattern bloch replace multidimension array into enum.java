
// Using a nested EnumMap to associate data with enum pairs public enum Phase { SOLID, LIQUID, GAS;

//EnumMap<откуда, EnumMap<куда, переход>>
public enum Phase
	{
		SOLID,
		LIQUID,
		GAS;
	
	
	
	
	
	
	
	
	
	public enum Transition
		{
			
			MELT( SOLID ,
			      LIQUID ),
			FREEZE( LIQUID ,
			        SOLID ),
			BOIL( LIQUID ,
			      GAS ),
			CONDENSE( GAS ,
			          LIQUID ),
			SUBLIME( SOLID ,
			         GAS ),
			DEPOSIT( GAS ,
			         SOLID );
		
		
		
		private final Phase from;
		
		
		
		private final Phase to;
		
		
		
		Transition( Phase from ,
		            Phase to )
			{
			this.from = from;
			this.to = to;
			}
		
		
		
		// Initialize the phase transition map
		private static final Map< Phase, Map< Phase, Transition > > m = Stream.of( values() ).collect( groupingBy( t -> t.from ,
		                                                                                                           () -> new EnumMap<>( Phase.class ) ,
		                                                                                                           toMap( t -> t.to ,
		                                                                                                                  t -> t ,
		                                                                                                                  ( x , y ) -> y ,
		                                                                                                                  () -> new EnumMap<>( Phase.class ) ) ) );
		
		
		
		public static Transition from( Phase from ,
		                               Phase to )
			{
			return m.get( from ).get( to );
			}
			
		}
		
	}