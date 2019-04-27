#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             interface GENERIC
* <pre>{@code
*
*
* example 1    
*     
*              VC_somesubclass                  implements ${NAME}<String>   
*              VI_somesubinterface              extends    ${NAME}<String> 
*              VCG_somesubclass<g_param>        implements ${NAME}<g_param> 
*              VIG_somesubinterface<g_param>    extends    ${NAME}<g_param>
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
* example 3 
*
*               boolean v_check = v_obj instanceof ${NAME}<?> ;
*               !no instanceof ${NAME}<String>
* 
*
*
* }</pre>
*/
//  public _package_ final          
//  extends VIG_<g_param>                 
//  extends VI_, VI_                    
//  extends VIG_<String>                   
public interface ${NAME}<g_param /* extends super VCG_<g_param> & VIG_<g_param>*//* extends super VC_ & VI_ *//* extends super VCG_<String> & VIG_<String> */> 
    {  
    
    
    
    
    #parse("fields.java") 
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              constants (public static final)
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
    *           
    *           not overrided
    *
    * }</pre>
    */  
    //      throws Exception, VX_myxception   
    //private void    f_common()
    //    {
    //    log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_common: " );
        //
    //    
        //
     //   return;
     //   } 
    
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
    /**                         method need implementation (with GENERIC parameter GENERIC result)
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           String v_string = v_obj.f_test("str");
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
    *
    * }</pre>
    */  
    //      throws Exception, VX_myxception 
    //      @Override  
    public  g_param    f_test(final g_param p_1) ; 

    
    /**
    *                              method test with argument of GENERIC<anyclass>    
    *                                     <not only T as uppers methods>
    * <pre>{@code
    *
    *
    * example 1
    *
    *              ${NAME}< Long >   v_obj1 = new ${NAME}<  >( 12L );
    *              ${NAME}< String > v_obj2 = new ${NAME}<  >( 12L );
    *              v_.f_test_genericlass(v_obj2);
    *              v_.f_test_genericlass(v_obj1);
    *
    * example 2
    *
    *           - covariance: this overrided method can return subclass unstead class:
    *                  resultSomeSuperclass f_method()
    *                  resultSomeSubclass   f_overrided_method()
    *
    *
    *
    *
    * }</pre>
    */ 
    //      throws Exception, VX_myxception 
    //      @Override
    public void fg_test_genericlass(final ${NAME}< ? /* extends super VC_ & VI_ *//* extends super VCG_<g_param> & VIG_<g_param>*//* extends super VCG_<String> & VIG_<String> */ > p_1 ) ;                  
  
    
    
    }
