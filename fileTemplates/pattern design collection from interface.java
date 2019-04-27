#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;


#parse("File Header.java")







/**
 * my collection extended from abstract
 * <pre>{@code
 *
 * example1
 *                      1) change String to myType
 *                      2) remove or change c_fake property
 *
 * example2
 *
 *
 * }</pre>
 *
 *
 * //@param p_1 parameter
 *
 * //@return nothing
 */


public class ${NAME} implements Collection< String >
	{
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              my props and methods
	//
	//////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * fake array
	 * <pre>{@code
	 *
	 * example1
	 *
	 *
	 * example2
	 *
	 *
	 * }</pre>
	 */
	private String[] c_fake =
		{
			"one" ,
			"two" ,
			"three" ,
			"four"
		};
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              MUST implemented for collection
	//
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 *                      MAIN FUNCTION
	 *
	 * }</pre>
	 */
	
	public int size( )
		{
		return c_fake.length;
		}
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 *                      MAIN FUNCTION
	 *
	 * example 2
	 *
	 *
	 *
	 * }</pre>
	 */
	public Iterator< String > iterator( )
		{
		return new Iterator< String >( )
			{
			//my oun properties and methods
			private int c_index = 0;
			
			
			
			
			//implemented methods from interface
			public boolean hasNext( )
				{
				return c_index < c_fake.length;
				}
			
			
			
			
			public String next( )
				{
				return c_fake[c_index++];
				}
			
			
			
			
			public void remove( )
				{
				throw new UnsupportedOperationException( );
				}
				
				
			};
		}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              dependent functions uses
	//                              size() and interator()
	//
	//                              copy pase from AbstractCollection<E>
	//
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 * example1
	 *
	 *
	 * example2
	 *
	 *
	 * }</pre>
	 */
	public boolean add( String p_object )
		{
		// unsupported
		throw new UnsupportedOperationException( );
		}
	
	
	/**
	 * <pre>{@code
	 *
	 * example1
	 *
	 *
	 * example2
	 *
	 *
	 * }</pre>
	 *
	 *
	 */
	//public boolean equals( Object o ) {return true;}
	
	
	/**
	 * <pre>{@code
	 *
	 * example1
	 *
	 *
	 * example2
	 *
	 *
	 * }</pre>
	 *
	 *
	 */
	//public int hashCode( ) {return 1;}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              require FIND
	//
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	/**
	 * <pre>{@code                  simple iterate all elements until find
	 *
	 * using
	 *              iterator()
	 *
	 *
	 *
	 * }</pre>
	 */
	public boolean contains( Object p_object )
		{
		
		//get my array()
		Iterator< String > v_iterator = iterator( );
		// empty argument
		if( p_object == null )
			{
			while( v_iterator.hasNext( ) )
				{
				if( v_iterator.next( ) == null )
					{
					return true;
					}
				}
			}
		else
			{
			//find obj in array
			while( v_iterator.hasNext( ) )
				{
				if( p_object.equals( v_iterator.next( ) ) )
					{
					return true;
					}
				}
			}
		//default return 'not found'
		return false;
		}
	
	
	
	
	/**
	 * <pre>{@code                  simple iterate all elements until find
	 *
	 * using
	 *              iterator()
	 *
	 *
	 *
	 *
	 *
	 * }</pre>
	 */
	public boolean remove( Object p_object )
		{
		//get my array
		Iterator< String > v_iterator = iterator( );
		if( p_object == null )
			{
			while( v_iterator.hasNext( ) )
				{
				if( v_iterator.next( ) == null )
					{
					v_iterator.remove( );
					return true;
					}
				}
			}
		else
			{
			//find my element
			while( v_iterator.hasNext( ) )
				{
				if( p_object.equals( v_iterator.next( ) ) )
					{
					//remove
					v_iterator.remove( );
					return true;
					}
				}
			}
		
		//cant find
		return false;
		}
	
	
	
	
	/**
	 * <pre>{@code                          simple iterate all elements until find
	 *
	 * using
	 *              iterator()
	 *              remove()
	 *
	 *
	 * }</pre>
	 */
	public boolean retainAll( Collection< ? > p_collection )
		{
		Objects.requireNonNull( p_collection );
		boolean            v_modified = false;
		Iterator< String > v_iterator = iterator( );
		while( v_iterator.hasNext( ) )
			{
			if( p_collection.contains( v_iterator.next( ) ) )
				{
				v_iterator.remove( );
				v_modified = true;
				}
			}
		return v_modified;
		
		}
	
	
	
	
	/**
	 * <pre>{@code                  simple iterate all elements until find
	 *
	 * using
	 *              iterator()
	 *              remove()
	 *
	 *
	 * }</pre>
	 */
	public boolean removeAll( Collection< ? > p_collection )
		{
		Objects.requireNonNull( p_collection );
		boolean       v_modified = false;
		Iterator< ? > v_iterator = iterator( );
		while( v_iterator.hasNext( ) )
			{
			if( p_collection.contains( v_iterator.next( ) ) )
				{
				v_iterator.remove( );
				v_modified = true;
				}
			}
		return v_modified;
		}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              require full iterate
	//
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 * using
	 *              size(), iterator()
	 *
	 * using helpers
	 *              finishToArray(), hugeCapacity()
	 *
	 * }</pre>
	 */
	@SuppressWarnings( "unchecked" )
	public < T > T[] toArray( T[] p_array )
		{
		// Estimate size of array; be prepared to see more or fewer elements
		int size = size( );
		//create new array
		T[] v_result = p_array.length >= size ? p_array :
			               (T[]) java.lang.reflect.Array
				                     .newInstance( p_array.getClass( )
				                                          .getComponentType( ) ,
				                                   size );
		//get my array
		Iterator< String > v_iterator = iterator( );
		
		for( int v_i = 0 ;
		     v_i < v_result.length ;
		     v_i++ )
			{
			if( !v_iterator.hasNext( ) )
				{ // fewer elements than expected
				if( p_array == v_result )
					{
					v_result[v_i] = null; // null-terminate
					}
				else if( p_array.length < v_i )
					{
					return Arrays.copyOf( v_result ,
					                      v_i );
					}
				else
					{
					System.arraycopy( v_result ,
					                  0 ,
					                  p_array ,
					                  0 ,
					                  v_i );
					if( p_array.length > v_i )
						{
						p_array[v_i] = null;
						}
					}
				return p_array;
				}
			v_result[v_i] = (T) v_iterator.next( );
			}
		// more elements than expected
		return v_iterator.hasNext( ) ? finishToArray( v_result ,
		                                              v_iterator ) : v_result;
			
		}
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 * using
	 *              size(), iterator()
	 *
	 * using helpers
	 *              finishToArray(), hugeCapacity()
	 *
	 * }</pre>
	 */
	public Object[] toArray( )
		{
		//create new array
		Object[] v_result = new Object[size( )];
		//get my array
		Iterator< String > v_iterator = iterator( );
		
		for( int i = 0 ;
		     i < v_result.length ;
		     i++ )
			{
			if( !v_iterator.hasNext( ) ) // fewer elements than expected
				{
				return Arrays.copyOf( v_result ,
				                      i );
				}
			//copy element from my collection to result
			v_result[i] = v_iterator.next( );
			}
		return v_iterator.hasNext( ) ? finishToArray( v_result ,
		                                              v_iterator ) : v_result;
		}
	
	
	//  String conversion
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 * example1
	 *
	 *
	 * example2
	 *
	 *
	 * }</pre>
	 */
	public String toString( )
		{
		Iterator< String > v_iterator = iterator( );
		if( !v_iterator.hasNext( ) )
			{
			return "[]";
			}
		
		StringBuilder v_stringBuilder = new StringBuilder( );
		v_stringBuilder.append( '[' );
		for( ; ; )
			{
			String v_next = v_iterator.next( );
			v_stringBuilder.append(/* v_next == this */false ? "(this Collection)" : v_next );
			if( !v_iterator.hasNext( ) )
				{
				return v_stringBuilder.append( ']' )
				                      .toString( );
				}
			v_stringBuilder.append( ',' )
			               .append( ' ' );
			}
		}
	
	
	
	
	/**
	 * <pre>{@code                  simple iterate all elements
	 *
	 * using
	 *              iterator()
	 *              remove()
	 *
	 *
	 * }</pre>
	 */
	public void clear( )
		{
		Iterator< String > v_iterator = iterator( );
		while( v_iterator.hasNext( ) )
			{
			v_iterator.next( );
			v_iterator.remove( );
			}
		}
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              other dependent  functions
	//
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 * using
	 *              size()
	 *
	 *
	 * example2
	 *
	 *
	 * }</pre>
	 */
	public boolean isEmpty( )
		{
		return size( ) == 0;
		}
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 * example1
	 *              contains()
	 *
	 * example2
	 *
	 *
	 * }</pre>
	 */
	public boolean containsAll( Collection< ? > p_collection )
		{
		for( Object v_i : p_collection )
			{
			if( !contains( v_i ) )
				{
				return false;
				}
			}
		return true;
		}
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 * example1
	 *              add()
	 *
	 * example2
	 *
	 *
	 * }</pre>
	 */
	public boolean addAll( Collection< ? extends String > p_collection )
		{
		boolean v_modified = false;
		for( String v_i : p_collection )
			{
			if( add( v_i ) )
				{
				v_modified = true;
				}
			}
		return v_modified;
		}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              helper functions
	//
	//////////////////////////////////////////////////////////////////////////////////
	
	
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 * example1
	 *
	 *
	 * example2
	 *
	 *
	 * }</pre>
	 */
	@SuppressWarnings( "unchecked" )
	private static < T > T[] finishToArray( T[] p_array ,
	                                        Iterator< ? > p_iterator )
		{
		int i = p_array.length;
		while( p_iterator.hasNext( ) )
			{
			int v_length = p_array.length;
			if( i == v_length )
				{
				int v_newLength = v_length + ( v_length >> 1 ) + 1;
				// overflow-conscious code
				if( v_newLength - MAX_ARRAY_SIZE > 0 )
					{
					v_newLength = hugeCapacity( v_length + 1 );
					}
				p_array = Arrays.copyOf( p_array ,
				                         v_newLength );
				}
			p_array[i++] = (T) p_iterator.next( );
			}
		// trim if overallocated
		return ( i == p_array.length ) ? p_array : Arrays.copyOf( p_array ,
		                                                          i );
		}
	
	
	
	
	/**
	 * <pre>{@code
	 *
	 * example1
	 *
	 *
	 * example2
	 *
	 *
	 * }</pre>
	 */
	private static int hugeCapacity( int p_minLength )
		{
		if( p_minLength < 0 ) // overflow
			{
			throw new OutOfMemoryError
				      ( "Required array size too large" );
			}
		return ( p_minLength > MAX_ARRAY_SIZE ) ?
			       Integer.MAX_VALUE :
			       MAX_ARRAY_SIZE;
		}
		
		
	}

















































