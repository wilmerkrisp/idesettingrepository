#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;
import static java.util.stream.Collectors.*;

#parse("File Header.java")


  


//////////////////////////////////////////////////////////////////////////////////
//  class value                              
//////////////////////////////////////////////////////////////////////////////////
 
/**
 * class-value mutable
 * simple tuple object-value class for own use
 *

 
  *   
        5) replace each generic parameter ${T1}                    to String   (click MATCH CASE)
 *      6) rename properties names and getters
  *
 *
*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft
 *
 * <pre>{@code
 *
 *
 * example 1
 *
 *               ${NAME} v_obj = new ${NAME}("param1");
 *               v_obj.oneCompute();
 *
 *
 *
 * }</pre>
 */
public class ${NAME}
	implements Comparable< ${NAME}  > , Serializable
	{
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  constants                              
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
    #parse("log.java")
	
	
	private static final argumentIsNullMessage_ = "Argument is null: ";
    private static final argumentIsDefaultMessage_ = "Argument is empty/default: ";
    private static final item1Message_ = "first";
     
 
	
	 

	 
	 
	
	//////////////////////////////////////////////////////////////////////////////////
	//  properties                              
	//////////////////////////////////////////////////////////////////////////////////
	
	
  
	
	private  ${T1} item1 ;
	
	
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem1();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public ${T1} getItem1()
		{
		return item1;
		}
	
	
	
	 
    /**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem1("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public void setItem1(@Nullable final ${T1} item )
		{
		if ( item==null) log_.info( "Input parameter is null." );
		this.item1 = item;
		}
	 
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//  constructors                              
//////////////////////////////////////////////////////////////////////////////////
	
 
     

	/**
	 * default constructor 
	 
	 * pattern new-set-call:
	 * please use default constructor or constructor with very simple generic params
	 
	 *
	 *          ${NAME} v_obj = new ${NAME}("Test");
	            ${NAME} v_obj = new ${NAME}();
	 *
	 * }</pre>
	 *
	 * @param 
	 */
	public ${NAME}()
		{ 	        
      
 
        super();
         
		}
	
	
	
    #parse("checkmutableconstructor.java")
    
    
	/** Constrictor with  ALL PARAMS
	
	
    #parse("constructorallparams.java")


     (!) Please change also constructor with object 
    
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}("Test");
	 *
	 * }</pre>
	 *
	 * @param item1
	 */
	public ${NAME}(@Nullable final ${T1} item1    )
		{
        super();
 
		this.item1 = item1;
		
		logForNullProperties_();
        logForValidProperties_();
        logForConsistencyProperties_();		
		}


 
		
	/**
	 * constructor with object
	 * 
	    (!) SHALOOW copying of MUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj1 = new ${NAME}("param");
	 *           ${NAME} v_obj2 = new ${NAME}(v_obj1);
	 *
	 *
	 *
	 *
	 *
	 * }</pre>
	 *
	 * @param tuple
	 */
	public ${NAME}(@NotNull final ${NAME} tuple )
		{
     		super();
     		
		
		#parse("checkimmutable.java")


        #parse("constructorwithobject.java")

	 	
	 
	 	
		this.item1 = tuple.getItem1();
		
		logForNullProperties_();
        logForValidProperties_();
        logForConsistencyProperties_();			
		}
		
		
//////////////////////////////////////////////////////////////////////////////////
//  fabrics
//////////////////////////////////////////////////////////////////////////////////	

	
	/**
	 * fabric with  ALL PARAMS
	 *<pre>{@code
	
	 *
	 * }</pre>
	 *
	 * @param item1
	 */
	public static  ${NAME} of(@Nullable final ${T1} item1   )
		{
		return new ${NAME} ( item1   );
		}
	

	
	
	
	/**
	 * fabric with object
	 *
	    (!) SHALLOW copying of MUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj1 = new ${NAME}("param");
	 *           ${NAME} v_obj2 =  ${NAME}.of(v_obj1);
	 *
	 * }</pre>
	 *
	 * @param tuple 
	 * @return
	 */
	public static   ${NAME} copyOf(@NotNull final ${NAME} tuple )
		{
		return new ${NAME}  ( (${NAME}) tuple     );
		}
	
	
	/**
	 * fabric with object (deep copy)
	 *
	    (!) DEEP copying of MUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj1 = new ${NAME}("param");
	 *           ${NAME} v_obj2 =  ${NAME}.of(v_obj1);
	 *
	 * }</pre>
	 *
	 * @param tuple 
	 * @return
	 */
	public static   ${NAME} deepCopyOf(@NotNull final ${NAME} tuple )
		{
        //we uses Apache Commons library for deep copy
		return new ${NAME}  ( (${NAME}) SerializationUtils.clone( tuple )   );	
		}
	

	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  implementations
	//////////////////////////////////////////////////////////////////////////////////
	
	
    #parse("checkmutableequals.java")
    
    
	 /**
	 * classic overrided method
	 * equals
	 
	 #parse("tuple9equalsnote.java")
	 
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	@Override
	public boolean equals(@Nullable final Object object )
		{
        if( this == object )
			{
			return true;
			}
		if( !( object instanceof ${NAME} ) )
			{
			return false;
			}
		
	 
		
		var  tuple = (${NAME} ) object;
		return item1.equals( tuple.getItem1() );
		}
	
	
	
	/**
	 * classic overrided method
	 * hashCode
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	@Override
	public int hashCode()
		{
		return Objects.hash(Objects.hashCode( item1 ) );
		}
	
	
	/**
	 * classic overrided method
	 * compareTo
	 *
	    (!) FINAL - because single for all subclasses (strategy)
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	@Override
	public final int compareTo(@NotNull final ${NAME} tuple )
		{
		var c = 0;
		return item1.compareTo( tuple.getItem1() );
		}
	
	
	/**
	 * classic overrided method
	 * toString
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	@Override
	public String toString()
		{
		var addr=Integer.toHexString(System.identityHashCode(this));
		return "Tuple("+addr+": "  + item1   +  ')';
		}
	
	
	

	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  check methods
	//////////////////////////////////////////////////////////////////////////////////
	
	
    #parse("checkLogAssert.java")
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  add your own methods                              
	//////////////////////////////////////////////////////////////////////////////////
	
   
	
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
	public void compute(@NotNull final String p_1 )
		{
        #parse("checkmutable.java")


        #parse("methodcompute.java")

    
        Objects.requireNonNull( p_1 );
	    
	    setDefaultValuesForUnsettedProperties_();
	    
	    assertForNullProperties_();
        assertForValidProperties_();
		assertForConsistencyProperties_();
		
		
        
		}
		
		
	}
