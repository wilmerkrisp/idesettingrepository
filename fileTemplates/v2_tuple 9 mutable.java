#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end





#parse("File Header.java")



/**
 * class-value mutable
 * !CHANGE_ME_DESCRIPTION!
 *
    ${uncomment1}
 
        1) этот класс final так как не предназанчен для наследования
 
        5) replace each generic parameter              to String   (click MATCH CASE)
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
public final class ${NAME} 	
implements  Serializable
	{
	
		
    #parse("log.java")

    #parse("constants.java")	
	
	
		
      
   
 
 
 
 
 
 
 
 
	#if (${T1} != "")
 
	    private static final String ITEM1_MESSAGE_ = "item1";       
    private String  item1Message_(String ...messages)
        {
        return ITEM1_MESSAGE_;
        }
 
 	private static final ${T1} ITEM1_DEFAULT_VALUE_ = ${item1DefaultValue};     
	private ${T1}  item1DefaultValue_() {return ITEM1_DEFAULT_VALUE_;}
	 
	private  ${T1} item1;
	
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
	public void setItem1(@Nullable  final ${T1} item )
		{
		 
		if ( item==null) log_.info( argumentIsNullMessage_( item1Message_()) );
		this.item1 = item;
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
		
	private  ${T2} item2;
	
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
	public void setItem2(@Nullable  final ${T2} item )
		{
		if ( item==null) log_.info( argumentIsNullMessage_( item2Message_() ));
		this.item2 = item;
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
		
	private  ${T3} item3;
	
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
	public void setItem3(@Nullable  final ${T3} item )
		{
		if ( item==null) log_.info(argumentIsNullMessage_( item3Message_() ));
		this.item3 = item;
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
	
	private  ${T4} item4;

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
	public void setItem4(@Nullable  final ${T4} item )
		{
		if ( item==null) log_.info( argumentIsNullMessage_( item4Message_() ));
		this.item4 = item;
		}
	
#end





#if (${T5} != "")
    private static final String ITEM7_MESSAGE_ = "item7";       
    private String  item7Message_(String ...messages)
        {
        return ITEM7_MESSAGE_;
        }
    
    private static final ${T7} ITEM7_DEFAULT_VALUE_ = ${item7DefaultValue};     
	private ${T7}  item7DefaultValue_() {return ITEM7_DEFAULT_VALUE_;}
		
	private  ${T5} item5;
	
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
	public void setItem5(@Nullable  final ${T5} item )
		{
		if ( item==null) log_.info( argumentIsNullMessage_( item5Message_() ));
		this.item5 = item;
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
	
	private  ${T6} item6;
	
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
	public void setItem6(@Nullable  final ${T6} item )
		{
		if ( item==null) log_.info( argumentIsNullMessage_( item6Message_() ));
		this.item6 = item;
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
	
	private  ${T7} item7;
	
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
	public void setItem7(@Nullable  final ${T7} item )
		{
		if ( item==null) log_.info( argumentIsNullMessage_( item7Message_() ));
		this.item7 = item;
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
	
	private  ${T8} item8;
	
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
	public void setItem8(@Nullable  final ${T8} item )
		{
		if ( item==null) log_.info(argumentIsNullMessage_( item8Message_() ));
		this.item8 = item;
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
	
	private  ${T9} item9;
	
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
	public void setItem9(@Nullable  final ${T9} item )
		{
		if ( item==null) log_.info( argumentIsNullMessage_( item9Message_() ));
		this.item9 = item;
		}
	
	 #end
	
	
//////////////////////////////////////////////////////////////////////////////////
//  constructors                              
//////////////////////////////////////////////////////////////////////////////////
	
 
	 
	/**
	 * default constructor 
	 
	 * pattern new-set-call:
	 * please use default constructor or constructor with very simple generic params
	 
	 *<pre>{@code
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
#if (${T1} != "") @Nullable final ${T1} item1 #end
#if (${T2} != ""), @Nullable final ${T2} item2 #end
#if (${T3} != ""), @Nullable final ${T3} item3 #end
#if (${T4} != ""), @Nullable final ${T4} item4 #end
#if (${T5} != ""), @Nullable final ${T5} item5 #end
#if (${T6} != ""), @Nullable final ${T6} item6 #end
#if (${T7} != ""), @Nullable final ${T7} item7 #end
#if (${T8} != ""), @Nullable final ${T8} item8 #end
#if (${T9} != ""), @Nullable final ${T9} item9 #end
	               )
		{
		super();
		
#parse("tuple9constructorallparams.java")
		 
		
		logForNullProperties_();
        logForValidProperties_();
        logForConsistencyProperties_();			
		}


 
	/**
	 * constructor with object
	 * 
	    (!) SHALLOW copying of MUTABLE-property-objects in constructor
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


#if (${T1} != "") this.item1 = tuple.getItem1();#end
#if (${T2} != "") this.item2 = tuple.getItem2();#end
#if (${T3} != "") this.item3 = tuple.getItem3();#end
#if (${T4} != "") this.item4 = tuple.getItem4();#end
#if (${T5} != "") this.item5 = tuple.getItem5();#end
#if (${T6} != "") this.item6 = tuple.getItem6();#end
#if (${T7} != "") this.item7 = tuple.getItem7();#end
#if (${T8} != "") this.item8 = tuple.getItem8();#end
#if (${T9} != "") this.item9 = tuple.getItem9();#end
		 
		 

		 
		
		logForNullProperties_();
        logForValidProperties_();
        logForConsistencyProperties_();			
		}
	
	
	
	/**
	 * fabric with parameter
	 *
	<pre>{@code
	 *
	 * }</pre>
	 *
	 * @param item1
	 */
	public static  ${NAME} of(
#if (${T1} != "")    @Nullable final ${T1} item1 #end
#if (${T2} != ""),   @Nullable final ${T2} item2 #end
#if (${T3} != ""),   @Nullable final ${T3} item3 #end
#if (${T4} != ""),   @Nullable final ${T4} item4 #end
#if (${T5} != ""),   @Nullable final ${T5} item5 #end
#if (${T6} != ""),   @Nullable final ${T6} item6 #end
#if (${T7} != ""),   @Nullable final ${T7} item7 #end
#if (${T8} != ""),   @Nullable final ${T8} item8 #end
#if (${T9} != ""),   @Nullable final ${T9} item9 #end
	               )
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
	    (!) SHALLOW copying of MUTABLE-property-objects in constructor
	 *
	  серийные номеры и идентификаторы копировать ненадо
	 
	 
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
		return new ${NAME}  ( tuple);	
		}
	
	/**
	 * fabric with object (deep copy)
	 *
	    (!) DEEP copying of MUTABLE-property-objects in constructor
	    
	     серийные номеры и идентификаторы копировать ненадо
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
	    return new ${NAME}  ( (${NAME}) SerializationUtils.clone( tuple ));	
		}
	
	 	
	
    #parse("checkmutableequals.java")
    
    
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
	public boolean equals(@Nullable  final Object obj )
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
	
	
	

	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  check methods
	//////////////////////////////////////////////////////////////////////////////////
	
	
    #parse("checkLogAssert.java")

    #parse("tuple9mutable.java") 
	
	
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
