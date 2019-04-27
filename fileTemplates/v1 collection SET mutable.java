#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;
import java.util.HashSet;
import java.util.function.Predicate;

import java.util.*;


#parse("File Header.java")


//////////////////////////////////////////////////////////////////////////////////
//  class                              
//////////////////////////////////////////////////////////////////////////////////
//<editor-fold desc="class mutable">
/*


*               VC_somesubclass             extends ${NAME} implements VI_, VI_
*               VC_somesubclass< T >    extends ${NAME} implements VI_, VI_


#parse("classmutable.java")


extends VC_             implements VI_, VI_                                           
extends VCG_<String>    implements VIG_<String>
public class ${NAME}< T >     extends VCG_< T >   implements VIG_< T >                                                                                      
@Override @Deprecated
public _package_ final
*/
//</editor-fold>


/**                             
*   class
    my mutable set
*
    Make class simple without generic:
    1) reformat code
    5) replace all KEY with Type1       (click MATCH CASE)

* <pre>{@code
*
* example 1
*
*   ${NAME} v_obj = new ${NAME}();
*   v_obj.oneCompute();

* example 2

    ${NAME} v2 = new ${NAME}("one","two","th3");
    
* example 3
    
    ${NAME} v2 = new ${NAME}(coll);
    
* example 4    
    ${NAME} v2 =  ${NAME}.of("one","two","th3");
    
* example 5    
    ${NAME} v2 =  ${NAME}.of(coll);
*
*
* }</pre>
*/                                                            
public class ${NAME} 
    extends HashSet < KEY >
    implements Serializable  
	{
	
	
    #parse("log.java")
    
	
	/**
	 * Returns flag that the class is read only.
	 *
	 * @return Returns flag that the class is read only.
	 */
	public boolean isReadOnly()
		{
		return false;
		}
	
    //////////////////////////////////////////////////////////////////////////////////
    //  "override" static constructors and fabric of collections                              
    //////////////////////////////////////////////////////////////////////////////////
    
    
    #parse("checkmutableconstructor.java")
    
    
	/**                         
	*   constructor default
	*      
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
	*   constructor with capacity
	*   Analogically to usual collections  
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
    
    

	
	
	/**                         
	*   constructor with vararg
	*   Analogically to List.of   
	*          
	 *   uses ADD method ot THIS class
	                        
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
	*   fabric with vararg
	*   Analogically to List.of    
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
	public static   ${NAME} of( KEY... elements )
		{
		
		return new ${NAME} ( elements );
		}


	/**                         
	*   constructor with parameter(collection)
	*   Analogically to usual collections  
	*   
	    (!) DEEP copying of MUTABLE-property-objects in constructor
	   
	                         
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(someCollection);
    *
    *
    * }</pre>
    */ 
	public <T extends Collection< ? extends KEY > & Serializable >  ${NAME}( T collection )
		{
		//we uses Apache Commons library for deep copy
		super(   (T) SerializationUtils.clone( collection )  );
		}
	
	/**                         
	*   fabric with parameter(collection)
	*   Analogically to usual collections  
	*                  
	    (!) DEEP copying of MUTABLE-property-objects in constructor 
	       
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.of(someCollection);
    *
    *
    * }</pre>
    */ 
	public static  <T extends Collection< ? extends KEY > & Serializable >  ${NAME} newSet(T collection )
		{
		
		return new ${NAME} ( collection );
		}
	
	
	
	
	
	
#parse("implementation.java")




#parse("checkmutableequals.java")
	
	
	
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
	 * method f_method
	 *
	 *
	 * !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *            - генерирую runtime ошибки программирования
	 *            - генерирую runtime ошибки выполнения метода, если метод не вернет то что должен
	 *
	 *
	 * example 2
	 *
	 *           v_obj.f_method("test");
	 *
	 * example 3
	 *
	 *           - covariance: this overrided method can return subclass unstead class:
	 *                  resultSomeSuperclass f_method()
	 *                  resultSomeSubclass   f_overrided_method()
	 *
	 *
	 * }</pre> ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
	 */
	public void compute( final String p_1 )
		{
        #parse("checkmutable.java")


        //<editor-fold desc="additionally">
        /* 
        
        log_.debug( "MyList f_method: " + p_1 );
        super.f_method(p_1);
        
        */
        //</editor-fold>
        
        
		return;
		}
		
		
	}
