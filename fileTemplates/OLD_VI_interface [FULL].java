#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             interface simple
* <pre>{@code
*
*
* example 1  
*  
*              VC_somesubclass                  implements ${NAME}
*              VI_somesubinterface              extends    ${NAME}    
*              VCG_somesubclass<g_param>        implements ${NAME}
*              VIG_somesubinterface<g_param>    extends    ${NAME}
*              
*
*              NO NEW(). Need implementation.
*              NO constructors 
*              NO propertes  (only static final constants allowed)
*              NO final methods
*              static methods allowed (public or private)
*              
*
*
* example 2
*         
*               
*      
*                
*
* }</pre>
*/                                                 
//  extends VI_, VI_                                                           
//  extends VIG_<String>
//  public interface ${NAME}<g_param> extends VIG_<g_param>   
//  public _package_ final                                                      
public interface ${NAME} 
    {   
    
    
    #parse("fields.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              constants  (public static final)
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         log4j debug massage
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.info    ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.warn    ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.error   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
    *
    *
    * example 2
    *
    *
    *
    *
    * }</pre>
    */  
    private static final Logger log = LogManager.getLogger( ${NAME}.class );


    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods private only for use inside the interface
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method NO implementation
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           this.f_algo();
    *
    *
    * example 2
    *           No inheritance for private methods/properties (NO override)
    *     
    *
    * }</pre>
    */  
    //      throws Exception, VX_myxception   
    //private void    f_common()
        //{
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_common: " );
        //
     //   
        //
        //return;
        //} 
    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods for optional implementation
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method optional implementation
    * <pre>{@code                   
    *
    *
    * example 1 
    *
    *           call from impemented class or inherited interface
    *           ${NAME}.super.f_optional() 
    *
    * example 2
    *   
    *           - covariance: this overrided method can return subclass unstead class:
    *                  resultSomeSuperclass f_method()
    *                  resultSomeSubclass   f_overrided_method()
    *
    *        
    *
    * }</pre>
    */
    //      throws Exception, VX_myxception 
    //      @Override  
    public default void    f_optional()
        {
        //for impemented class or inherited interface
        //${NAME}.super.f_optional()  
        
        //call private method
        //this.f_common();
        
        
        //test
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_optional: " );
        return;
        } 
    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods for implementation
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method need implementation
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           v_obj.f_test();
    *
    *
    * example 2
    *    
    *           - covariance: this overrided method can return subclass unstead class:
    *                  resultSomeSuperclass f_method()
    *                  resultSomeSubclass   f_overrided_method()
    *
    *       
    *
    * }</pre>
    */
    //      throws Exception, VX_myxception 
    //      @Override  
    public abstract void    f_test(); 

    
    
    
    
    }
