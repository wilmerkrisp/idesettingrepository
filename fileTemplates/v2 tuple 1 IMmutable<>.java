#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils; 
import static java.util.stream.Collectors.*;
##import javax.annotation.concurrent.Immutable;

#parse("File Header.java")


  


//////////////////////////////////////////////////////////////////////////////////
//  class value                              
//////////////////////////////////////////////////////////////////////////////////
 

/**
 * class-value nonmutable
 * simple tuple object-value class for own use
 *
  *     1) replace < T1     >                                   to NOTHING  (click MATCH CASE)
        2)  replace < ?   >                                     to NOTHING
 *      3) remove generic from:    public class Tuple9a         to NOTHING
        4)  and remove from static fabrics                      to NOTHING
        5) replace each generic parameter T1                    to String
 *      6) rename properties names and getters
 

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
/*@Immutable*/
public final class ${NAME}< T1 extends Comparable< T1 >     >
	implements Comparable< ${NAME}< T1  > > , Serializable
	{
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  constants                              
	//////////////////////////////////////////////////////////////////////////////////
	
	
    #parse("log.java")


    private static final argumentIsNullMessage_ = "Argument is null: ";
    private static final argumentIsDefaultMessage_ = "Argument is empty/default: ";
    private static final item1Message_ = "first";
    private static final item1DefaultValue_=${item1DefaultValue};
 
	
	private static final UnsupportedOperationException exception_()
		{
		return new UnsupportedOperationException( "The class-value is immutable. Don't use CrUD methods." );
		}
	
 

        

        
	//////////////////////////////////////////////////////////////////////////////////
	//  properties                              
	//////////////////////////////////////////////////////////////////////////////////
	
	

 
	private final T1 item1;
	
	
	
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
	public T1 getItem1()
		{
		return item1;
		}
	
	
	 
	
	
//////////////////////////////////////////////////////////////////////////////////
//  constructors                              
//////////////////////////////////////////////////////////////////////////////////
	
	
	
	 
	
	private ${NAME}()
		{
       

        super();

        #parse("throwdontuse")        
        
		//item1 = null; 		 
		}

  
	
	 

	/** Constrictor with  ALL PARAMS
	
	
    #parse("constructorallparams.java")
    
    
	 *
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
	public ${NAME}(@NotNull final T1 item1    )
		{
 		super();
 		 
        #parse("checkimmutable.java")  
		
		
		this.item1 = item1;
		
		assertForNullProperties_();
        assertForValidProperties_();
		assertForConsistencyProperties_();		
		}
	
	
 
	
	/**
	 * constructor with object
	 * 
	    (!) SHALLOW copying of IMMUTABLE-property-objects in constructor
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
	public ${NAME}(@NotNull final ${NAME}<T1> tuple )
		{ 		
		
		#parse("constructorwithobject.java")
		
		
		
		this( (T1) tuple.getItem1() );
		
		assertForNullProperties_();	
        assertForValidProperties_();
		assertForConsistencyProperties_();        	
		}
	
	
//////////////////////////////////////////////////////////////////////////////////
//  fabrics
//////////////////////////////////////////////////////////////////////////////////	
	
	/**
	 * fabric  with  ALL PARAMS
	 *<pre>{@code
	
	 *
	 * }</pre>
	 *
	 * @param item1
	 */
	public static < T1 extends Comparable< T1 >> ${NAME}<T1> of(@NotNull final T1 item1   )
		{
		return new ${NAME}<> ( item1   );
		
		}
	
	
	

	
	
	/**
	 * fabric with object
	 *
	    (!) SHALLOW copying of IMMUTABLE-property-objects in constructor
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
	public static < T1 extends Comparable< T1 >> ${NAME}<T1> copyOf(@NotNull final ${NAME}<T1> tuple )
		{
		return new ${NAME}<> (  (${NAME}<T1>)tuple     );
		}
	
	/**
	 * fabric with object_deep
	 *
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor
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
	public static < T1 extends Comparable< T1 >> ${NAME}<T1> deepCopyOf(@NotNull final ${NAME}<T1> tuple )
		{
		 //we uses Apache Commons library for deep copy
		return new ${NAME}<> (  (${NAME}<T1>) SerializationUtils.clone( tuple )    );
		}
	
	//////////////////////////////////////////////////////////////////////////////////
	//  implementations                              
	//////////////////////////////////////////////////////////////////////////////////
	 
 
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  implementations
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * classic overrided method
	 * equals
	 
	 #parse("tuple9equalsnote.java")
	 
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

		 
		
		var tuple = (${NAME}< ?    >) object;
		
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
		  
		 
		return Objects.hash( Objects.hashCode( item1 ) );
		}
	
	
	/**
	 * classic overrided method
	 * compareTo
	 *
	   (!) FINAL - because single for all subclasses (strategy)
	 
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	@Override
	public final int compareTo(@NotNull final ${NAME}< T1> tuple )
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
	
	
     #parse("checkLogAssertGenericT1.java")
	
	
	
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

        #parse("methodcompute.java")


         Objects.requireNonNull( p_1 );
        
		return;
		}
		
		
	}
