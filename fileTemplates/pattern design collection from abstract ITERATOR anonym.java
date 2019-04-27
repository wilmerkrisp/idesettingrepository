#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.AbstractCollection;
import java.util.Iterator;


#parse("File Header.java")







/**                             my collection extended from abstract
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



public class ${NAME} extends AbstractCollection<String>
	{
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              my props and methods
	//
	//////////////////////////////////////////////////////////////////////////////////  
	
	/**                             fake array
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
	 * //@param p_1 parameter
	 *
	 * //@return nothing
	 *
	 */
	private String[] c_fake =
	{
	"one" , "two" , "three" , "four"
	};
	
	//////////////////////////////////////////////////////////////////////////////////
	//
	//                              MUST implemented for collection
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
	 *
	 *
	 * //@param p_1 parameter
	 *
	 * //@return nothing
	 */
	@Override
	final public  int size()
		{
		return c_fake.length;
		}
	
	
	
	
	/**
	 * method iterator (adapter2collection)
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *           0) add to class declaration
	 *              implements Iterable< elements >
	 *           1) change c_fake property to something useful
	 *           2) use iterator in LOOPs
	 *              for( Integer v_i : new thisclass( ) )
	 *                  log.debug   ("mainclass main for: "+v_i);
	 *
	 * example 2
	 *
	 *
	 *
	 * }</pre>
	 */
	 @Override
	final public Iterator< String > iterator( )
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
	
	
	
		
		
		
		
		
		
		
		
		
	}

















































