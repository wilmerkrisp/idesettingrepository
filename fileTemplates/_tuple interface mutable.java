#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

 


#parse("File Header.java")
 
/**                             
*   interface simple
*   !CHANGE_ME_DESCRIPTION!
*
*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft

* <pre>{@code
*
*
* example 1  
*  
*              VC_somesubclass                  implements ${NAME}
*              VI_somesubinterface              extends    ${NAME}    
*              VCG_somesubclass< T >        implements ${NAME}
*              VIG_somesubinterface< T >    extends    ${NAME}
*
*          
*
* }</pre>
*/                                                                                                   
public interface ${NAME}  extends Comparable< ${NAME}  >  
    {   
     
   	
 
 	/**
	 * Check properties of object for null value
	 * return true if object is valid and properties is NOT null
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForNullProperties(  );
	
	
	
	/**
	 * Check properties of object for valid value
	 * return true if object is valid and properties is valid
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForValidProperties(  );
	
	
	
	/**
	 * Check consistency of properties of object
	 * return true if object is valid
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForConsistencyProperties(  );


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
	public ${T1} getItem1();
	
	/**
	 *   set some properrty UNSUPPORTED in immutable object
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */
	public void setItem1(@Nullable final ${T1} item );
	
	
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
	public ${T2} getItem2();
	
	
	/**
	 *   set some properrty UNSUPPORTED in immutable object
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */   
    public void setItem2(@Nullable final ${T2} item );

	
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
	public ${T3} getItem3();
	
	
	/**
	 *   set some properrty UNSUPPORTED in immutable object
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */    
    public void setItem3(@Nullable final ${T3} item );

	
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
	public ${T4} getItem4();
	
	/**
	 *   set some properrty UNSUPPORTED in immutable object
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */       
	public void setItem4(@Nullable final ${T4} item );
	
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
	public ${T5} getItem5();
	
	
	/**
	 *   set some properrty UNSUPPORTED in immutable object
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */
	public void setItem5(@Nullable final ${T5} item );
	
	
	
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
	public ${T6} getItem6();
	
	
	
	/**
	 *   set some properrty UNSUPPORTED in immutable object
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */        
	public void setItem6(@Nullable final ${T6} item );
	
	
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
	public ${T7} getItem7();
	
	
	
	
	 /**
	 *   set some properrty UNSUPPORTED in immutable object
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */       
 	public void setItem7(@Nullable final ${T7} item );
	
	
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
	public ${T8} getItem8();
	
	
	/**
	 *   set some properrty UNSUPPORTED in immutable object
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */     
    public void setItem8(@Nullable final ${T8} item );
    
    
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
	public ${T9} getItem9();
	
	
	/**
	 *   set some properrty UNSUPPORTED in immutable object
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */       
    public void setItem9(@Nullable final ${T9} item );
    
    
    
	 
 
   /**
	 *   some method
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */ 
    public void compute(@NotNull  final String p_1 );
    
    ##parse("methodarggeneric.java")
    
    }
