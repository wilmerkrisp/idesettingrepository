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
	 *   some method
	 *   
	 *
	 * <pre>{@code
	 *
	 *
	 *
	 * }</pre>
	 */ 
    public void compute(@NotNull final String p_1 );
    
    ##parse("methodarggeneric.java")
    
    }
