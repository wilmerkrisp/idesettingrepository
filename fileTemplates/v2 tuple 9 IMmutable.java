#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.util.Comparator;

#parse("File Header.java")




/**
 * class-value nonmutable
 * !CHANGE_ME_DESCRIPTION!
 *
 * inner comments: ${uncomment1}  

*   ${T1} ${T2} ${T3} ${T4} ${T5} ${T6} ${T7} ${T8} ${T9}
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
public final class ${NAME} 	
implements Comparable< ${NAME}  > , Serializable
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
 
 	private static final ${T1} ITEM1_DEFAULT_VALUE_ = ${item1DefaultValue};     
	private ${T1}  item1DefaultValue_() {return ITEM1_DEFAULT_VALUE_;}
    
	private final ${T1} item1;
	
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
		
	#end





#if (${T2} != "")
	private static final String ITEM2_MESSAGE_ = "item2";       
    private String  item2Message_(String ...messages)
        {
        return ITEM2_MESSAGE_;
        }
        
	private static final ${T2} ITEM2_DEFAULT_VALUE_ = ${item2DefaultValue};     
	private ${T2}  item2DefaultValue_() {return ITEM2_DEFAULT_VALUE_;} 
 
	private final ${T2} item2;
	
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
	public ${T2} getItem2()
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

	private static final ${T3} ITEM3_DEFAULT_VALUE_ = ${item3DefaultValue};     
	private ${T3}  item3DefaultValue_() {return ITEM3_DEFAULT_VALUE_;}	 
	
	private final ${T3} item3;
	
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
	public ${T3} getItem3()
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

	private static final ${T4} ITEM4_DEFAULT_VALUE_ = ${item4DefaultValue};     
	private ${T4}  item4DefaultValue_() {return ITEM4_DEFAULT_VALUE_;}
	 	
	private final ${T4} item4;
	
	
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
	public ${T4} getItem4()
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
        
    private static final ${T5} ITEM5_DEFAULT_VALUE_ = ${item5DefaultValue};     
	private ${T5}  item5DefaultValue_() {return ITEM5_DEFAULT_VALUE_;}
 	  
	private final ${T5} item5;
		
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
	public ${T5} getItem5()
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
        
	private static final ${T6} ITEM6_DEFAULT_VALUE_ = ${item6DefaultValue};     
	private ${T6}  item6DefaultValue_() {return ITEM6_DEFAULT_VALUE_;}
	 	
	private final ${T6} item6;
	
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
	public ${T6} getItem6()
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
    
    private static final ${T7} ITEM7_DEFAULT_VALUE_ = ${item7DefaultValue};     
	private ${T7}  item7DefaultValue_() {return ITEM7_DEFAULT_VALUE_;}
 
	private final ${T7} item7;
	
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
	public ${T7} getItem7()
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
	private static final ${T8} ITEM8_DEFAULT_VALUE_ = ${item8DefaultValue};     
	private ${T8}  item8DefaultValue_() {return ITEM8_DEFAULT_VALUE_;}
    	
	private final ${T8} item8;
	
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
	public ${T8} getItem8()
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
   	private static final ${T9} ITEM9_DEFAULT_VALUE_ = ${item9DefaultValue};     
	private ${T9}  item9DefaultValue_() {return ITEM9_DEFAULT_VALUE_;}	     
	
	private final ${T9} item9;	
	
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
	public ${T9} getItem9()
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
	public ${NAME}(#if (${T1} != "") @NotNull final ${T1} item1 #end 
	               #if (${T2} != ""), @NotNull final ${T2} item2 #end
	               #if (${T3} != ""), @NotNull final ${T3} item3 #end
	               #if (${T4} != ""), @NotNull final ${T4} item4 #end
	               #if (${T5} != ""), @NotNull final ${T5} item5 #end
	               #if (${T6} != ""), @NotNull final ${T6} item6 #end
	               #if (${T7} != ""), @NotNull final ${T7} item7 #end
	               #if (${T8} != ""), @NotNull final ${T8} item8 #end
	               #if (${T9} != ""), @NotNull final ${T9} item9 #end)
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
	public ${NAME}(@NotNull final ${NAME} tuple )
		{
		
		
		#parse("constructorwithobject.java")
		
		
		this(
             #if (${T1} != "") (${T1})  tuple.getItem1() #end
		     #if (${T2} != ""), (${T2}) tuple.getItem2() #end
		     #if (${T3} != ""), (${T3}) tuple.getItem3() #end
		     #if (${T4} != ""), (${T4}) tuple.getItem4() #end
		     #if (${T5} != ""), (${T5}) tuple.getItem5() #end
		     #if (${T6} != ""), (${T6}) tuple.getItem6() #end
		     #if (${T7} != ""), (${T7}) tuple.getItem7() #end
		     #if (${T8} != ""), (${T8}) tuple.getItem8() #end
		     #if (${T9} != ""), (${T9}) tuple.getItem9() #end 
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
	public static  ${NAME} of(
	            #if (${T1} != "")    @NotNull final ${T1} item1 #end
	            #if (${T2} != ""),   @NotNull final ${T2} item2 #end
	            #if (${T3} != ""),   @NotNull final ${T3} item3 #end
	            #if (${T4} != ""),   @NotNull final ${T4} item4 #end
	            #if (${T5} != ""),   @NotNull final ${T5} item5 #end
	            #if (${T6} != ""),   @NotNull final ${T6} item6 #end
	            #if (${T7} != ""),   @NotNull final ${T7} item7 #end
	            #if (${T8} != ""),   @NotNull final ${T8} item8 #end
	            #if (${T9} != ""),   @NotNull final ${T9} item9 #end)
		{
		return new ${NAME} ( 
#if (${T1} != "")item1 #end 
#if (${T2} != ""),item2 #end 
#if (${T3} != ""),item3 #end 
#if (${T4} != ""),item4 #end 
#if (${T5} != ""),item5 #end 
#if (${T6} != ""),item6 #end 
#if (${T7} != "") ,item7 #end 
#if (${T8} != ""),item8 #end 
#if (${T9} != ""),item9 #end 
);
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
	public static ${NAME} copyOf(@NotNull final ${NAME} tuple )
		{
		return new ${NAME}  (tuple);	
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
	public static ${NAME} deepCopyOf(@NotNull final ${NAME} tuple )
		{
        //we uses Apache Commons library for deep copy
		return new ${NAME}  ((${NAME}) SerializationUtils.clone( tuple ));	
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

		 
		
		var  tuple = (${NAME} ) obj;
		
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
	public final int compareTo(@NotNull final ${NAME} o )
		{
		#parse("tuple9compare.java")  
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


        #parse("methodcompute.java")
        
        
        Objects.requireNonNull( p_1 );

        
		return;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	//////////////////////////////////////////////////////////////////////////////////
	//  builder                              
	//////////////////////////////////////////////////////////////////////////////////
		
		
public static class Builder
    {	
		
	#if (${T1} != "")
 

	private  ${T1} item1;
	

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
	public Builder item1(@Nullable  final ${T1} item )
		{
		this.item1 = item;
		return this;
		}
	#end









#if (${T2} != "")

 	private  ${T2} item2;
	
	
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
	public Builder item2(@Nullable  final ${T2} item )
		{
		this.item2 = item;
		return this;
		}
	#end










#if (${T3} != "")

	private  ${T3} item3;

	
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
	public Builder item3(@Nullable  final ${T3} item )
		{
		this.item3 = item;
		return this;
		}
	
 #end






#if (${T4} != "")
 	
	private  ${T4} item4;

	
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
	public Builder item4(@Nullable  final ${T4} item )
		{
		this.item4 = item;
		return this;
		}
	
#end





#if (${T5} != "")
 		
	private  ${T5} item5;
	
	
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
	public Builder item5(@Nullable  final ${T5} item )
		{
		this.item5 = item;
		return this;
		}
	#end






#if (${T6} != "")

 	
	private  ${T6} item6;
	
	
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
	public Builder item6(@Nullable  final ${T6} item )
		{
		this.item6 = item;
		return this;
		}    
        
#end



#if (${T7} != "")
 	
	private  ${T7} item7;
	
	
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
	public Builder item7(@Nullable  final ${T7} item )
		{
		this.item7 = item;
		return this;
		}    
	#end






#if (${T8} != "")

 	
	private  ${T8} item8;
	
	
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
	public Builder item8(@Nullable  final ${T8} item )
		{
		this.item8 = item;
		return this;
		}

#end






#if (${T9} != "")

 	
	private  ${T9} item9;
	
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
	public Builder item9(@Nullable  final ${T9} item )
		{
		this.item9 = item;
		return this;
		}
	
	 #end
		
		public ${NAME} build()
		    {
		    return new ${NAME}(this);
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
	public ${NAME}(@NotNull Builder builder)
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
