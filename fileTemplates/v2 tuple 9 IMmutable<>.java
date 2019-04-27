#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.util.Comparator;

#parse("File Header.java")


  

/**
 * class-value nonmutable
 * !CHANGE_ME_DESCRIPTION!
 *
 
    ${uncomment1}
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
/*@Immutable*/ 
public final class ${NAME} 	< 
#if (${T1} != "")	      T1 extends Comparable< T1 >#end
#if (${T2} != "")	 ,    T2 extends Comparable< T2 >#end
#if (${T3} != "")    ,    T3 extends Comparable< T3 >#end
#if (${T4} != "")    ,    T4 extends Comparable< T4 >#end
#if (${T5} != "")    ,    T5 extends Comparable< T5 >#end
#if (${T6} != "")    ,    T6 extends Comparable< T6 >#end
#if (${T7} != "")    ,    T7 extends Comparable< T7 >#end
#if (${T8} != "")    ,    T8 extends Comparable< T8 >#end
#if (${T9} != "")    ,    T9 extends Comparable< T9 >#end 
                    >
	implements Comparable< ${NAME}< 
#if (${T1} != "")   T1 #end
#if (${T2} != "") , T2 #end
#if (${T3} != "") , T3 #end
#if (${T4} != "") , T4 #end
#if (${T5} != "") , T5 #end
#if (${T6} != "") , T6 #end
#if (${T7} != "") , T7 #end
#if (${T8} != "") , T8 #end
#if (${T9} != "") , T9 #end
	    > > , Serializable
	{
	
    #parse("log.java")

    #parse("constants.java")




    #parse("constantsImmutable.java")











#if (${T1} != "")

   private static final String ITEM1_MESSAGE_ = "item1";       
    private String  item1Message_(String ...messages)
        {
        return ITEM1_MESSAGE_;
        }
          	 
	private T1  item1DefaultValue_() {return null;}	 
	
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
		
	#end






#if (${T2} != "")
    private static final String ITEM2_MESSAGE_ = "item2";       
    private String  item2Message_(String ...messages)
        {
        return ITEM2_MESSAGE_;
        }

	private T2  item2DefaultValue_() {return null;}
 
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
		
	 #end





#if (${T3} != "")
    private static final String ITEM3_MESSAGE_ = "item3";       
    private String  item3Message_(String ...messages)
        {
        return ITEM3_MESSAGE_;
        }

	private T3  item3DefaultValue_() {return null;}
	
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
		
#end




#if (${T4} != "")

    private static final String ITEM4_MESSAGE_ = "item4";       
    private String  item4Message_(String ...messages)
        {
        return ITEM4_MESSAGE_;
        }

	private T4  item4DefaultValue_() {return null;}
 	 	
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
	#end





#if (${T5} != "")
    private static final String ITEM5_MESSAGE_ = "item5";       
    private String  item5Message_(String ...messages)
        {
        return ITEM5_MESSAGE_;
        }
        
 	private T5  item5DefaultValue_() {return null;}
	  
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
	#end






#if (${T6} != "")
    private static final String ITEM6_MESSAGE_ = "item6";       
    private String  item6Message_(String ...messages)
        {
        return ITEM6_MESSAGE_;
        }
        
	private T6  item6DefaultValue_() {return null;}
	
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
		
#end



#if (${T7} != "")
   private static final String ITEM7_MESSAGE_ = "item7";       
    private String  item7Message_(String ...messages)
        {
        return ITEM7_MESSAGE_;
        }
    
 	private T7  item7DefaultValue_() {return null;}
  
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
		
	#end


#if (${T8} != "")
   private static final String ITEM8_MESSAGE_ = "item8";       
    private String  item8Message_(String ...messages)
        {
        return ITEM8_MESSAGE_;
        }

	private T8  item8DefaultValue_() {return null;}
 	
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
	#end




#if (${T9} != "")
   private static final String ITEM9_MESSAGE_ = "item9";       
    private String  item9Message_(String ...messages)
        {
        return ITEM9_MESSAGE_;
        }
  
  	private T9  item9DefaultValue_() {return null;}	     
	
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
	#end
	
	
	 
	
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
	public ${NAME}(
#if (${T1} != "") @NotNull final T1 item1 #end
#if (${T2} != ""), @NotNull final T2 item2 #end
#if (${T3} != ""), @NotNull final T3 item3 #end
#if (${T4} != ""), @NotNull final T4 item4 #end
#if (${T5} != ""), @NotNull final T5 item5 #end
#if (${T6} != ""), @NotNull final T6 item6 #end
#if (${T7} != ""), @NotNull final T7 item7 #end
#if (${T8} != ""), @NotNull final T8 item8 #end
#if (${T9} != ""), @NotNull final T9 item9 #end
	            )
		{
        super();
		
        #parse("checkimmutable.java")



#parse("tuple9constructorallparams.java")

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
	public ${NAME}(@NotNull final ${NAME}< 
#if (${T1} != "")   ? extends T1 #end
#if (${T2} != "") , ? extends T2 #end
#if (${T3} != "") , ? extends T3 #end
#if (${T4} != "") , ? extends T4 #end
#if (${T5} != "") , ? extends T5 #end
#if (${T6} != "") , ? extends T6 #end
#if (${T7} != "") , ? extends T7 #end
#if (${T8} != "") , ? extends T8 #end
#if (${T9} != "") , ? extends T9 #end
	    > tuple )
		{
		
		
		#parse("constructorwithobject.java")
		
		
		this( 
		 #if (${T1} != "")      (T1) tuple.getItem1() #end
		 #if (${T2} != "") ,    (T2) tuple.getItem2() #end
		 #if (${T3} != "") ,    (T3) tuple.getItem3() #end
		 #if (${T4} != "") ,    (T4) tuple.getItem4() #end
		 #if (${T5} != "") ,    (T5) tuple.getItem5() #end
		 #if (${T6} != "") ,    (T6) tuple.getItem6() #end
		 #if (${T7} != "") ,    (T7) tuple.getItem7() #end
		 #if (${T8} != "") ,    (T8) tuple.getItem8() #end
		 #if (${T9} != "") ,    (T9) tuple.getItem9() #end
		      );
		
		assertForNullProperties_();
        assertForValidProperties_();
		assertForConsistencyProperties_();			
		}
	
	

	/**
	 * fabric with  ALL PARAMS
	 *
	<pre>{@code
	 *
	 * }</pre>
	 *
	 * @param item1
	 */
	 public static < 
#if (${T1} != "")	      E1 extends Comparable< E1 >#end
#if (${T2} != "")	 ,    E2 extends Comparable< E2 >#end
#if (${T3} != "")    ,    E3 extends Comparable< E3 >#end
#if (${T4} != "")    ,    E4 extends Comparable< E4 >#end
#if (${T5} != "")    ,    E5 extends Comparable< E5 >#end
#if (${T6} != "")    ,    E6 extends Comparable< E6 >#end
#if (${T7} != "")    ,    E7 extends Comparable< E7 >#end
#if (${T8} != "")    ,    E8 extends Comparable< E8 >#end
#if (${T9} != "")    ,    E9 extends Comparable< E9 >#end 
        > ${NAME}< 
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
        > of(
              #if (${T1} != "")     @NotNull  final E1 item1  #end
	          #if (${T2} != "") ,   @NotNull  final E2 item2 #end
	          #if (${T3} != "") ,   @NotNull  final E3 item3 #end
	          #if (${T4} != "") ,   @NotNull  final E4 item4 #end
	          #if (${T5} != "") ,   @NotNull  final E5 item5 #end
	          #if (${T6} != "") ,   @NotNull  final E6 item6 #end
	          #if (${T7} != "") ,   @NotNull  final E7 item7 #end
	          #if (${T8} != "") ,   @NotNull  final E8 item8 #end
	          #if (${T9} != "") ,   @NotNull  final E9 item9 #end)
		{
		return new ${NAME}<> ( 
#if (${T1} != "") item1 #end
#if (${T2} != ""),item2 #end
#if (${T3} != ""),item3 #end
#if (${T4} != ""),item4 #end
#if (${T5} != ""),item5 #end
#if (${T6} != ""),item6 #end
#if (${T7} != ""),item7 #end
#if (${T8} != ""),item8 #end
#if (${T9} != ""),item9 #end
		    );
		}
	
	

	
	/**
	 * fabric with object
	 *
	    (!) SHALLOW copying of IMMUTABLE-property-objects in constructor
	 *
	 
	 8) копирующие фабрики: для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 
	 
	 
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
	 public static < 
#if (${T1} != "")	      E1 extends Comparable< E1 > #end
#if (${T2} != "")	 ,    E2 extends Comparable< E2 > #end
#if (${T3} != "")    ,    E3 extends Comparable< E3 >#end
#if (${T4} != "")    ,    E4 extends Comparable< E4 >#end
#if (${T5} != "")    ,    E5 extends Comparable< E5 >#end
#if (${T6} != "")    ,    E6 extends Comparable< E6 >#end
#if (${T7} != "")    ,    E7 extends Comparable< E7 >#end
#if (${T8} != "")    ,    E8 extends Comparable< E8 >#end
#if (${T9} != "")    ,    E9 extends Comparable< E9 > #end 
        > ${NAME}< 
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
        > copyOf(@NotNull final ${NAME}< 
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
            > tuple )
		{
		return new ${NAME}<>  (tuple);	
		}
		
		
	/**
	 * fabric with object (deep copy)
	 *
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor
	 *
	 
	 8) копирующие фабрики: для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 
	 
	 
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
	 public static < 
#if (${T1} != "")	      E1 extends Comparable< E1 > & Serializable#end
#if (${T2} != "")	 ,    E2 extends Comparable< E2 > & Serializable#end
#if (${T3} != "")    ,    E3 extends Comparable< E3 > & Serializable#end
#if (${T4} != "")    ,    E4 extends Comparable< E4 > & Serializable#end
#if (${T5} != "")    ,    E5 extends Comparable< E5 > & Serializable#end
#if (${T6} != "")    ,    E6 extends Comparable< E6 > & Serializable#end
#if (${T7} != "")    ,    E7 extends Comparable< E7 > & Serializable#end
#if (${T8} != "")    ,    E8 extends Comparable< E8 > & Serializable#end
#if (${T9} != "")    ,    E9 extends Comparable< E9 > & Serializable#end 
        > ${NAME}< 
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
        > deepCopyOf(@NotNull final ${NAME}< 
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
            > tuple )
		{
        //we uses Apache Commons library for deep copy
		return new ${NAME} <> ((${NAME}< 
#if (${T1} != "")   E1 #end
#if (${T2} != "") , E2 #end
#if (${T3} != "") , E3 #end
#if (${T4} != "") , E4 #end
#if (${T5} != "") , E5 #end
#if (${T6} != "") , E6 #end
#if (${T7} != "") , E7 #end
#if (${T8} != "") , E8 #end
#if (${T9} != "") , E9 #end
		    >) SerializationUtils.clone( tuple ));	
		}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  implementations                              
	//////////////////////////////////////////////////////////////////////////////////
	  
	
	/**
	 * classic overrided method
	 * equals
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	@Override
	public boolean equals(@Nullable final Object obj )
		{

    	if( this == obj )
			{
			return true;
			}
		if( !( obj instanceof ${NAME} ) )
			{
			return false;
			}

		 
		
		var  tuple = (${NAME}< 
		  #if (${T1} != "")   T1 #end
		  #if (${T2} != "") , T2 #end
		  #if (${T3} != "") , T3 #end
		  #if (${T4} != "") , T4 #end
		  #if (${T5} != "") , T5 #end
		  #if (${T6} != "") , T6 #end
		  #if (${T7} != "") , T7 #end
		  #if (${T8} != "") , T8 #end
		  #if (${T9} != "") , T9 #end
		    > ) obj;
		
		#parse("tuple9equals.java")
	

		return true;

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
	public final int compareTo(@NotNull final ${NAME}< 
#if (${T1} != "")   T1 #end
#if (${T2} != "") , T2 #end
#if (${T3} != "") , T3 #end
#if (${T4} != "") , T4 #end
#if (${T5} != "") , T5 #end
#if (${T6} != "") , T6 #end
#if (${T7} != "") , T7 #end
#if (${T8} != "") , T8 #end
#if (${T9} != "") , T9 #end 
	> o )
		{
		#parse("tuple9compare.java")  
		}
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  check methods
	//////////////////////////////////////////////////////////////////////////////////
	
	
    #parse("checkLogAssertGeneric.java")
	
	
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





	//////////////////////////////////////////////////////////////////////////////////
	//  builder                              
	//////////////////////////////////////////////////////////////////////////////////
		
		
public static class Builder< 
#if (${T1} != "")	      T1 extends Comparable< T1 >#end
#if (${T2} != "")	 ,    T2 extends Comparable< T2 >#end
#if (${T3} != "")    ,    T3 extends Comparable< T3 >#end
#if (${T4} != "")    ,    T4 extends Comparable< T4 >#end
#if (${T5} != "")    ,    T5 extends Comparable< T5 >#end
#if (${T6} != "")    ,    T6 extends Comparable< T6 >#end
#if (${T7} != "")    ,    T7 extends Comparable< T7 >#end
#if (${T8} != "")    ,    T8 extends Comparable< T8 >#end
#if (${T9} != "")    ,    T9 extends Comparable< T9 >#end 
                    >
    {	
		
	#if (${T1} != "")
 

	private  T1 item1;
	

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
	public Builder<
    #if (${T1} != "")   T1 #end
    #if (${T2} != "") , T2 #end
    #if (${T3} != "") , T3 #end
    #if (${T4} != "") , T4 #end
    #if (${T5} != "") , T5 #end
    #if (${T6} != "") , T6 #end
    #if (${T7} != "") , T7 #end
    #if (${T8} != "") , T8 #end
    #if (${T9} != "") , T9 #end >
     item1(@Nullable  final T1 item )
		{
		this.item1 = item;
		return this;
		}
	#end









#if (${T2} != "")

 	private  T2 item2;
	
	
		/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem2("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public Builder<
    #if (${T1} != "")   T1 #end
    #if (${T2} != "") , T2 #end
    #if (${T3} != "") , T3 #end
    #if (${T4} != "") , T4 #end
    #if (${T5} != "") , T5 #end
    #if (${T6} != "") , T6 #end
    #if (${T7} != "") , T7 #end
    #if (${T8} != "") , T8 #end
    #if (${T9} != "") , T9 #end >
	 item2(@Nullable  final T2 item )
		{
		this.item2 = item;
		return this;
		}
	#end










#if (${T3} != "")

	private  T3 item3;

	
	  	/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem3("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public Builder<
    #if (${T1} != "")   T1 #end
    #if (${T2} != "") , T2 #end
    #if (${T3} != "") , T3 #end
    #if (${T4} != "") , T4 #end
    #if (${T5} != "") , T5 #end
    #if (${T6} != "") , T6 #end
    #if (${T7} != "") , T7 #end
    #if (${T8} != "") , T8 #end
    #if (${T9} != "") , T9 #end >
	 item3(@Nullable  final T3 item )
		{
		this.item3 = item;
		return this;
		}
	
 #end






#if (${T4} != "")
 	
	private  T4 item4;

	
	   	/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem4("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public Builder<
    #if (${T1} != "")   T1 #end
    #if (${T2} != "") , T2 #end
    #if (${T3} != "") , T3 #end
    #if (${T4} != "") , T4 #end
    #if (${T5} != "") , T5 #end
    #if (${T6} != "") , T6 #end
    #if (${T7} != "") , T7 #end
    #if (${T8} != "") , T8 #end
    #if (${T9} != "") , T9 #end >
	 item4(@Nullable  final T4 item )
		{
		this.item4 = item;
		return this;
		}
	
#end





#if (${T5} != "")
 		
	private  T5 item5;
	
	
	    	/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem5("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public Builder<
    #if (${T1} != "")   T1 #end
    #if (${T2} != "") , T2 #end
    #if (${T3} != "") , T3 #end
    #if (${T4} != "") , T4 #end
    #if (${T5} != "") , T5 #end
    #if (${T6} != "") , T6 #end
    #if (${T7} != "") , T7 #end
    #if (${T8} != "") , T8 #end
    #if (${T9} != "") , T9 #end >
	 item5(@Nullable  final T5 item )
		{
		this.item5 = item;
		return this;
		}
	#end






#if (${T6} != "")

 	
	private  T6 item6;
	
	
	  	/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem6("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public Builder<
    #if (${T1} != "")   T1 #end
    #if (${T2} != "") , T2 #end
    #if (${T3} != "") , T3 #end
    #if (${T4} != "") , T4 #end
    #if (${T5} != "") , T5 #end
    #if (${T6} != "") , T6 #end
    #if (${T7} != "") , T7 #end
    #if (${T8} != "") , T8 #end
    #if (${T9} != "") , T9 #end >
	 item6(@Nullable  final T6 item )
		{
		this.item6 = item;
		return this;
		}    
        
#end



#if (${T7} != "")
 	
	private  T7 item7;
	
	
	  	/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem7("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public Builder<
    #if (${T1} != "")   T1 #end
    #if (${T2} != "") , T2 #end
    #if (${T3} != "") , T3 #end
    #if (${T4} != "") , T4 #end
    #if (${T5} != "") , T5 #end
    #if (${T6} != "") , T6 #end
    #if (${T7} != "") , T7 #end
    #if (${T8} != "") , T8 #end
    #if (${T9} != "") , T9 #end >
	 item7(@Nullable  final T7 item )
		{
		this.item7 = item;
		return this;
		}    
	#end






#if (${T8} != "")

 	
	private  T8 item8;
	
	
	   	/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem8("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public Builder<
    #if (${T1} != "")   T1 #end
    #if (${T2} != "") , T2 #end
    #if (${T3} != "") , T3 #end
    #if (${T4} != "") , T4 #end
    #if (${T5} != "") , T5 #end
    #if (${T6} != "") , T6 #end
    #if (${T7} != "") , T7 #end
    #if (${T8} != "") , T8 #end
    #if (${T9} != "") , T9 #end >
     item8(@Nullable  final T8 item )
		{
		this.item8 = item;
		return this;
		}

#end






#if (${T9} != "")

 	
	private  T9 item9;
	
	  	/**
	 *   set some properrty
	 *   !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 *		   v_objectTwo.setItem9("Test string.");
	 *
	 *
	 * }</pre>
	 */
	public Builder<
    #if (${T1} != "")   T1 #end
    #if (${T2} != "") , T2 #end
    #if (${T3} != "") , T3 #end
    #if (${T4} != "") , T4 #end
    #if (${T5} != "") , T5 #end
    #if (${T6} != "") , T6 #end
    #if (${T7} != "") , T7 #end
    #if (${T8} != "") , T8 #end
    #if (${T9} != "") , T9 #end >
	 item9(@Nullable  final T9 item )
		{
		this.item9 = item;
		return this;
		}
	
	 #end
		
		public ${NAME}<
#if (${T1} != "")   T1 #end
#if (${T2} != "") , T2 #end
#if (${T3} != "") , T3 #end
#if (${T4} != "") , T4 #end
#if (${T5} != "") , T5 #end
#if (${T6} != "") , T6 #end
#if (${T7} != "") , T7 #end
#if (${T8} != "") , T8 #end
#if (${T9} != "") , T9 #end >	
		 build()
		    {
		    return new ${NAME}<>(this);
		    }
		
		
		}
		
	
	
	/** Constrictor with  Builder 
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}("Test");
	 *
	 * }</pre>
	 *
	 * @param builder
	 */
	public ${NAME}(@NotNull Builder<
#if (${T1} != "")   T1 #end
#if (${T2} != "") , T2 #end
#if (${T3} != "") , T3 #end
#if (${T4} != "") , T4 #end
#if (${T5} != "") , T5 #end
#if (${T6} != "") , T6 #end
#if (${T7} != "") , T7 #end
#if (${T8} != "") , T8 #end
#if (${T9} != "") , T9 #end >
	 builder)
		{
        super();
		
        #parse("checkimmutable.java")


#if (${T1} != "")       this.item1 = builder.item1;#end
#if (${T2} != "")		this.item2 = builder.item2;#end
#if (${T3} != "")		this.item3 = builder.item3;#end
#if (${T4} != "")		this.item4 = builder.item4;#end
#if (${T5} != "")		this.item5 = builder.item5;#end
#if (${T6} != "")		this.item6 = builder.item6;#end
#if (${T7} != "")		this.item7 = builder.item7;#end
#if (${T8} != "")		this.item8 = builder.item8;#end
#if (${T9} != "")		this.item9 = builder.item9;#end

		assertForNullProperties_();
        assertForValidProperties_();
		assertForConsistencyProperties_();		
		}









		
		
	}
