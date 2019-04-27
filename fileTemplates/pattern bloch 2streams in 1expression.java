
// Tasteful use of streams enhances clarity and conciseness
public class Anagrams
	{
	
	
	
	public static void main( String[] args )
	throws IOException
		{
		Path dictionary   = Paths.get( args[0] );
		int  minGroupSize = Integer.parseInt( args[1] );
		
		try( Stream< String > words = Files.lines( dictionary ) )
			{
			words.collect( groupingBy( word -> alphabetize( word ) ) ).values().stream().filter( group -> group.size() >= minGroupSize ).forEach( g -> System.out.println( g.size() + ": " + g ) );
			}
			
		}
	
	
	
	// alphabetize method is the same as in original version
	private static String alphabetize( String s )
		{
		char[] a = s.toCharArray();
		Arrays.sort( a );
		return new String( a );
		}
		
	}