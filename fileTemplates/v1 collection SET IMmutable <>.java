#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.io.Serializable;
import java.util.HashSet;
import java.util.function.Predicate;
 
//import java.util.*;

#parse("File Header.java")


//////////////////////////////////////////////////////////////////////////////////
//  class                              
//////////////////////////////////////////////////////////////////////////////////
//<editor-fold desc="class mutable">
/*


*               VC_somesubclass             extends ${NAME} implements VI_, VI_
*               VC_somesubclass< T >    extends ${NAME} implements VI_, VI_


#parse("classimmutable.java")



extends VC_             implements VI_, VI_                                           
extends VCG_<String>    implements VIG_<String>
public class ${NAME}< T >     extends VCG_< T >   implements VIG_< T >                                                                                      
@Override @Deprecated
public _package_ final
*/
//</editor-fold>


/**
 * class
 * my IMmutable set
 *
    Make class simple without generic:
    1) reformat code
    2) replace all < KEY > with "" ,besides replaceAll( UnaryOperator< KEY > operator )
    3) replace all <> with ""       (click MATCH CASE)
    4) uncomment < Type1 >
    5) replace all KEY with Type1

 * <pre>{@code
 *
 *
 *
 * example 2
 *
 * ${NAME} v2 = new ${NAME}("one","two","th3");
 *
 * example 3
 *
 * ${NAME} v2 = new ${NAME}(coll);
 *
 * example 4
 * ${NAME} v2 =  ${NAME}.of("one","two","th3");
 *
 * example 5
 * ${NAME} v2 =  ${NAME}.of(coll);
 *
 *
 * }</pre>
 */
public class ${NAME} < KEY >
	extends HashSet < KEY > /* <Type1> */
	implements Serializable
	{
	
	
	
    #parse("log.java")
	
	
	
	private static final UnsupportedOperationException exception_()
		{
		return new UnsupportedOperationException( "The collection is immutable. Don't use CrUD methods." );
		}
	
	
	/**
	 * Returns flag that the class is read only.
	 *
	 * @return Returns flag that the class is read only.
	 */
	public boolean isReadOnly()
		{
		return true;
		}
	
	//////////////////////////////////////////////////////////////////////////////////
	//  "override" static constructors and fabric of collections
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * constructor default
	 * it's no use, because you cant add elements after
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}();
	 *
	 *
	 * }</pre>
	 */
	public ${NAME}()
		{
		super();
		}
	
	
	
	/**
	 * constructor with capacity
	 * it's no use, because you cant add elements after
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}(12);
	 *
	 *
	 * }</pre>
	 */
	public ${NAME}( int initialCapacity )
		{
		super( initialCapacity );
		}
	
	/**                         
	*   constructor with capacity and loadfactor
	*   Analogically to usual set  
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(12,11);
    *
    *
    * }</pre>
    */ 
	public ${NAME}( int initialCapacity,float loadFactor )
		{
		super( initialCapacity, loadFactor );
		}
	
    /**                         
	*   constructor with capacity and loadfactor and dummy
	*   Analogically to usual set  
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(12,11);
    *
    *
    * }</pre>
    */ 
	public ${NAME}( int initialCapacity,float loadFactor,boolean dummy )
		{
		super( initialCapacity, loadFactor );
		}
    
    
    #parse("checkimmutable.java")
    
    

	
	
	/**
	 * constructor with vararg
	 * Analogically to List.of
	 *
	  *   uses ADD method ot SUPER class
	 
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}("one","two","th3");
	 *
	 *
	 * }</pre>
	 */
	public ${NAME}( KEY... elements )
		{
		super(elements.length);
		for( KEY element : elements )
			{
			/* super. is necessary because we should not call overrided methods in constructor*/
			super.add( Objects.requireNonNull( element ) );
			}
		 
		
		}
	
	
	
	/**
	 * fabric with vararg
	 * Analogically to List.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj =  ${NAME}.of("one","two","th3");
	 *
	 *
	 * }</pre>
	 */
	public static < KEY > ${NAME}< KEY > of( KEY... elements )
		{
		
		return new ${NAME}<>( elements );
		}
	

	/**
	 * constructor with parameter(collection)
	 * Analogically to usual collections
	 *
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor
	 
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}(someCollection);
	 *
	 *
	 * }</pre>
	 */
	public ${NAME}( Collection< ? extends KEY > collection )
		{
		super( collection );
		}
		
	
	/**
	 * fabric with parameter(collection)
	 * Analogically to usual collections
	 *
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor
	 
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj =  ${NAME}.of(someCollection);
	 *
	 *
	 * }</pre>
	 */
	public static < KEY > ${NAME}< KEY > newSet( Collection< ? extends KEY > collection )
		{
		
		return new ${NAME}<>( collection );
		}
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  override methods for immutability
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**                         
	*   unsupported for immutable
    */ 
	@Override
	@Deprecated
	final public boolean add( KEY element )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public boolean addAll( Collection< ? extends KEY > collection )
		{
		throw exception_();
		}
	
	
	

	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public void clear()
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public boolean remove( Object object )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public boolean removeAll( Collection< ? > collection )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public boolean removeIf( Predicate< ? super KEY > filter )
		{
		throw exception_();
		}
	
	
	

	
	
		/**                         
	*   unsupported for immutable
    */ 
	@Override
	@Deprecated
	final public boolean retainAll( Collection< ? > collection )
		{
		throw exception_();
		}
	
	
	
	
	
	
    #parse("implementation.java")
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  add your own methods
	//////////////////////////////////////////////////////////////////////////////////
	

	
	
	 //<editor-fold desc="some method">
    /* 
    
    public privateFinal protectedPackage _package_ final
    throws Exception, VX_myxception
    @Override
    */
    //</editor-fold>
    
    
	/**
	 * method
	 * !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *
	 *              v_obj.f_method("1","2","3");
	 *
	 *
	 * example 2
	 *
	 *              pass array instead vararg
	 *              v_obj.f_method(new String[]{ new String("1"), new String("2"), new String("3") });
	 *
	 * example 3
	 *
	 *           - covariance: this overrided method can return subclass unstead class:
	 *                  resultSomeSuperclass f_method()
	 *                  resultSomeSubclass   f_overrided_method()
	 *
	 *
	 *
	 * }</pre> ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
	 */
	public void compute( final String p_1 )
		{
        //<editor-fold desc="additionally">
        /* 
        
        log_.debug( "MyList f_method: " + p_1 );
        super.f_method(p_1);
        
        */
        //</editor-fold>
        
        
		return;
		}
		
	}
