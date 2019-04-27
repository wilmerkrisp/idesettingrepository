#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

 


#parse("File Header.java")



/**                             
*   interface simple
*   !CHANGE_ME_DESCRIPTION!

*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft
*
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
public interface ${NAME} extends Collection< KEY > 
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
 

	public void compute(@NotNull final String p_1 );
	
 
    
    }
