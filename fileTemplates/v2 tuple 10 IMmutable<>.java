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
  *     1) replace < T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  to NOTHING  (click MATCH CASE)
        2)  replace < ?, ?, ?, ?, ?, ?, ?, ?, ?, ? >            to NOTHING
 *      3) remove generic from:    public class Tuple10a        to NOTHING
        4)  and remove from static fabrics                      to NOTHING
        5) replace each generic parameter T10 ..T1              to String
 *      6) rename properties names and getters
 
*
*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft
 *
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
public final class ${NAME}< T1 extends Comparable< T1 >, 
                    T2 extends Comparable< T2 >, 
                    T3 extends Comparable< T3 >, 
                    T4 extends Comparable< T4 >, 
                    T5 extends Comparable< T5 >, 
                    T6 extends Comparable< T6 >, 
                    T7 extends Comparable< T7 >, 
                    T8 extends Comparable< T8 >, 
                    T9 extends Comparable< T9 >, 
                    T10 extends Comparable< T10 > >
	implements Comparable< ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 > > , Serializable
	{
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  constants                              
	//////////////////////////////////////////////////////////////////////////////////
	
	##parse("constants.java")
	
    #parse("log.java")


 
	
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
	 
	
	private final T2 item2;
	
	
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
String v_stringTwo=v_objectTwo.getItem2();

	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T2 getItem2()
		{
		return item2;
		}
	 	 	 
	 
	
	private final T3 item3;
	
	
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 *String v_stringTwo=v_objectTwo.getItem3();

	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T3 getItem3()
		{
		return item3;
		}
		 	 
	 
	
	private final T4 item4;
	
	
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem4();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T4 getItem4()
		{
		return item4;
		}
	 	 	 
	 
	
	private final T5 item5;
	
	
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem5();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T5 getItem5()
		{
		return item5;
		}
		 	 
 
	
	private final T6 item6;
	
	
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem6();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T6 getItem6()
		{
		return item6;
		}
		 	 
	 
	
	private final T7 item7;
	
	
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem7();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T7 getItem7()
		{
		return item7;
		}
	 	 	 
	 
	
	private final T8 item8;
	
	
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem8();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T8 getItem8()
		{
		return item8;
		}
		 	 
	 
	private final T9 item9;
	
	
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem9();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T9 getItem9()
		{
		return item9;
		}
	
	 	 	 
	 
	private final T10 item10;
	
	
	
	/**
	 * get some property
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *           String v_stringTwo=v_objectTwo.getItem10();
	 *
	 *
	 * }</pre>
	 *
	 * @return tuple item
	 */
	public T10 getItem10()
		{
		return item10;
		}
	   	 	 
	 
	
	private ${NAME}()
		{
 
 
        super();

        #parse("throwdontuse")
 
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
	public ${NAME}(@NotNull final T1 item1 ,
	               @NotNull final T2 item2 ,
	               @NotNull final T3 item3 ,
	               @NotNull final T4 item4 ,
	               @NotNull final T5 item5 ,
	               @NotNull final T6 item6 ,
	               @NotNull final T7 item7 ,
	               @NotNull final T8 item8 ,
	               @NotNull final T9 item9 ,
	               @NotNull final T10 item10 )
		{
        super();
 

        #parse("checkimmutable.java")  
		
		
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.item8 = item8;
		this.item9 = item9;
		this.item10 = item10;
		assertForNullProperties_(this);
		assertForValidProperties_(this);
		assertForConsistencyProperties_(this);
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
	public ${NAME}(@NotNull final ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 > tuple )
		{
		
		
		#parse("constructorwithobject.java")
		
		
		this( (T1) tuple.getItem1() ,
		      (T2) tuple.getItem2() ,
		      (T3) tuple.getItem3() ,
		      (T4) tuple.getItem4() ,
		      (T5) tuple.getItem5() ,
		      (T6) tuple.getItem6() ,
		      (T7) tuple.getItem7() ,
		      (T8) tuple.getItem8() ,
		      (T9) tuple.getItem9() ,
		      (T10) tuple.getItem10() );
		      
		assertForNullProperties_(this);	
        assertForValidProperties_(this);
		assertForConsistencyProperties_(this);		
		}
	
	

//////////////////////////////////////////////////////////////////////////////////
//  fabrics
//////////////////////////////////////////////////////////////////////////////////	


	
	
	/**
	 * fabric with  ALL PARAMS
	 *
	<pre>{@code
	 *
	 * }</pre>
	 *
	 * @param item1
	 */
	public static < T1 extends Comparable< T1 >, T2 extends Comparable< T2 >,
    T3 extends Comparable< T3 >, T4 extends Comparable< T4 >, T5 extends Comparable< T5 >, T6 extends Comparable< T6 >, T7 extends Comparable< T7 >, T8 extends Comparable< T8 >, T9 extends Comparable< T9 >, T10 extends Comparable< T10 > > ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 > of(@NotNull final T1 item1 ,
	              @NotNull  final T2 item2 ,
	              @NotNull  final T3 item3 ,
	              @NotNull  final T4 item4 ,
	              @NotNull  final T5 item5 ,
	              @NotNull  final T6 item6 ,
	              @NotNull  final T7 item7 ,
	              @NotNull  final T8 item8 ,
	              @NotNull  final T9 item9 ,
	              @NotNull  final T10 item10 )
		{
		return new ${NAME}< > ( item1,item2,item3,item4,item5,item6,item7,item8,item9,item10 );
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
	public static < T1 extends Comparable< T1 >, T2 extends Comparable< T2 >, T3 extends Comparable< T3 >, T4 extends Comparable< T4 >,
    T5 extends Comparable< T5 >, T6 extends Comparable< T6 >, T7 extends Comparable< T7 >, T8 extends Comparable< T8 >, 
    T9 extends Comparable< T9 >, T10 extends Comparable< T10 > > ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 > copyOf(@NotNull final ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 > tuple )
		{
		return new ${NAME}< > ( tuple );	
		}
	
	
	
	
	/**
	 * fabric with object (deep copy)
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
	public static < T1 extends Comparable< T1 >, T2 extends Comparable< T2 >, T3 extends Comparable< T3 >, T4 extends Comparable< T4 >,
    T5 extends Comparable< T5 >, T6 extends Comparable< T6 >, T7 extends Comparable< T7 >, T8 extends Comparable< T8 >, 
    T9 extends Comparable< T9 >, T10 extends Comparable< T10 > > ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 > deepCopyOf(@NotNull final ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 > tuple )
		{
         //we uses Apache Commons library for deep copy
		return new ${NAME}< > ( (${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >) SerializationUtils.clone( tuple ) );
		}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  implementations                              
	//////////////////////////////////////////////////////////////////////////////////
	 
	 
	
	/**
	 * classic overrided method
	 * equals
	 *
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

		 
		
		var tuple = (${NAME}< ?, ?, ?, ?, ?, ?, ?, ?, ?, ? >) object;
		
		if( !item1.equals( tuple.getItem1() ) )
			{
			return false;
			}
		if( !item2.equals( tuple.getItem2() ) )
			{
			return false;
			}
		if( !item3.equals( tuple.getItem3() ) )
			{
			return false;
			}
		if( !item4.equals( tuple.getItem4() ) )
			{
			return false;
			}
		if( !item5.equals( tuple.getItem5() ) )
			{
			return false;
			}
		if( !item6.equals( tuple.getItem6() ) )
			{
			return false;
			}
		if( !item7.equals( tuple.getItem7() ) )
			{
			return false;
			}
		if( !item8.equals( tuple.getItem8() ) )
			{
			return false;
			}
		if( !item9.equals( tuple.getItem9() ) )
			{
			return false;
			}
		return item10.equals( tuple.getItem10() );
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
 
		return Objects.hash(Objects.hashCode( item1 ),Objects.hashCode( item2 ),Objects.hashCode( item3 ),Objects.hashCode( item4 ),Objects.hashCode( item5 ),Objects.hashCode( item6 ),Objects.hashCode( item7 ),Objects.hashCode( item8 ),Objects.hashCode( item9 ),Objects.hashCode( item10 ) );

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
	public final int compareTo(@NotNull final ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 > tuple )
		{
		var c = 0;
		
		c = item1.compareTo( tuple.getItem1() );
		
		if( c != 0 )
			{
			return c;
			}
		
		c = item2.compareTo( tuple.getItem2() );
		
		if( c != 0 )
			{
			return c;
			}
		
		c = item3.compareTo( tuple.getItem3() );
		
		if( c != 0 )
			{
			return c;
			}
		
		c = item4.compareTo( tuple.getItem4() );
		
		if( c != 0 )
			{
			return c;
			}
		c = item5.compareTo( tuple.getItem5() );
		
		if( c != 0 )
			{
			return c;
			}
		c = item6.compareTo( tuple.getItem6() );
		
		if( c != 0 )
			{
			return c;
			}
		c = item7.compareTo( tuple.getItem7() );
		
		if( c != 0 )
			{
			return c;
			}
		c = item8.compareTo( tuple.getItem8() );
		
		if( c != 0 )
			{
			return c;
			}
		
		c = item9.compareTo( tuple.getItem9() );
		
		if( c != 0 )
			{
			return c;
			}
		
		return item10.compareTo( tuple.getItem10() );
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
		return "Tuple("+addr+": "  + item1 + ", " + item2 + ", " + item3 + ", " + item4 + ", " + item5 + ", " + item6 + ", " + item7 + ", " + item8 + ", " + item9 + ", " + item10 + ')';
		}
	
	
	

	
	
	
	
	
	 
	
	
	
	
	
    //////////////////////////////////////////////////////////////////////////////////
	//  check methods
	//////////////////////////////////////////////////////////////////////////////////
	
	
	/**
	 * Check properties of object for null value
	 * return true if object is valid and properties is NOT null
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForNullProperties(   )
		{
		assertForNullProperties_( this );
		return true;
		}
	
	
	
	/**
	 * Check properties of object for valid value
	 * return true if object is valid and properties is valid
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForValidProperties(   )
		{
		assertForValidProperties_( this );
		return true;
		}
	
	
	
	/**
	 * Check consistency of properties of object
	 * return true if object is valid
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForConsistencyProperties( )
		{
		assertForConsistencyProperties_( this );
		return true;
		}
	
	 
	
	private ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  assertForNullProperties_(@NotNull ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  object )
		{
		Objects.requireNonNull( object );
		Objects.requireNonNull( object.item1 );
        Objects.requireNonNull( object.item2 );
        Objects.requireNonNull( object.item3 );
        Objects.requireNonNull( object.item4 );
        Objects.requireNonNull( object.item5 );
        Objects.requireNonNull( object.item6 );
        Objects.requireNonNull( object.item7 );
        Objects.requireNonNull( object.item8 );
        Objects.requireNonNull( object.item9 );
        Objects.requireNonNull( object.item10 );
		
		return object;
		}
	
	 
	
	private ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  assertForValidProperties_(@NotNull ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  object )
		{
	    
 	    return object;
		}
	
	 
	
	private ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  assertForConsistencyProperties_(@NotNull ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  object )
		{
		//throw new IllegalStateException( "Collection should not be empty." );
		return object;
		}
	
	 
	
	private ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  logForNullProperties_(@NotNull ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  object )
		{
		if( object == null )
			{
			log_.info( "Input object is null." );
			}
		
		if( object.item1 == null || object.item2 == null  || object.item3 == null || object.item4 == null || object.item5 == null || object.item6 == null || object.item7 == null || object.item8 == null || object.item9 == null || object.item10 == null  )
			{
			log_.info( "Parameter is null." );
			}
		
		return object;
		}
	
	
	 
	
	private ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  logForValidProperties_(@NotNull ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  object )
		{
	    
		
		return object;
		}
	
	
	 
	
	private ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  logForConsistencyProperties_(@NotNull ${NAME}< T1, T2, T3, T4, T5, T6, T7, T8, T9, T10 >  object )
		{
		//log_.info( "Object inconsistent." );
		return object;
		}
	
	
	
	
	
	
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
