/**
 * 
 * 		var metka = new Metka();
 * 		metka.putFavorite( "vovan" );
 *
 * 		String s=metka.getFavorite(  String.class);
 * 		System.out.println(s );
 * 
 * */





public class Metka
	{
	
	
	
	private Map< Class< ? >, Object > favorites = new HashMap<>();
	
	
	
	public < T > void putFavorite( T instance )
		{
		favorites.put( Objects.requireNonNull( instance.getClass() ) ,
		               instance );
			
		}
	
	
	
	public < T > T getFavorite( Class< T > type )
		{
		return type.cast( favorites.get( type ) );
		}
		
	}