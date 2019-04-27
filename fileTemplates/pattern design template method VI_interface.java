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
*              VCG_somesubclass< T >        implements ${NAME}
*              VIG_somesubinterface< T >    extends    ${NAME}
*              
*
*              NO NEW(). Need implementation.
*              NO constructors 
*              NO propertes  (only constants allowed)
*              static methods allowed
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
//  implements VI_, VI_                                                           
//  implements VIG_<String>
//  public interface ${NAME}< T > implements VIG_< T >   
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
    *      
    *     
    *
    * }</pre>
    */  
    //      throws Exception  
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
    /**                         final template f_method
    * <pre>{@code                   
    *
    *
    * example 1 
    *
 *              1) do not implements this method
 *              2) CREATE SUBPROGRAMM: call f_stepOne, f_stepTwo from template method
 *              3) implement f_stepOne, f_stepTwo in the subclass
    *
    * example 2
    *   
    *        
    *
    * }</pre>
    */
    //      throws Exception
    //      @Override  
    public default void    f_optional()
        {
        //for impemented class or inherited interface
        //${NAME}.super.f_optional()  
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_optional: " );
        //call private method
        //this.f_common();
        
        
        //DEFINE SUBPROGRAMM HERE
	    f_stepOne("step one");
	    f_stepTwo("step two");
        
        return;
        } 
    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods for implementation
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                        method 1 default stub
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *               0) copy paste this methods, uncoment @Override, uncoment body, delete 'abstract' word
    *               1) method1 overrided in the subclass
    *               2) called from template method from superclass
    *
    *
    * example 2
    *    
    *       
    *
    * }</pre>
    */
    //      throws Exception
    //      @Override  
    public abstract void    f_stepOne(final String p_1);  /*throws Exception*/
//        {
//        log.error   ("step one : "+p_1);
//        return;
//        }
        
    /**                        method 2 default stub
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *               0) copy paste this methods, uncoment @Override, uncoment body, delete 'abstract' word
    *               1) method1 overrided in the subclass
    *               2) called from template method from superclass
    *
    *
    * example 2
    *    
    *       
    *
    * }</pre>
    */
    //      throws Exception
    //      @Override  
    public abstract void    f_stepTwo(final String p_1);  /*throws Exception*/
//        {
//        log.error   ("step two : "+p_1);
//        return;
//        }
    
    
    
    }
