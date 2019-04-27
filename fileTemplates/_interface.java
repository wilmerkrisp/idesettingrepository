#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

 


#parse("File Header.java")

 

/**                             
*   interface simple
*   !CHANGE_ME_DESCRIPTION!
*

*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft


#parse("iclassforinheritance.java") 


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
public interface ${NAME} 
    {   
     

#parse("imethodprivate.java")


#parse("imethodoptional.java")
  
   
    /**                         
    *   method need implementation
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           v_obj.f_test();
    *
    *       
    *
    * }</pre>
    */
    public abstract void    f_test(); 

    
   
    
    }
