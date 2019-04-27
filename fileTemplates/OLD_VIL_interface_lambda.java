#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             interface for lambda
* <pre>{@code
*
*
* example 1    
*
*              VI_somesubinterface              extends    ${NAME}    
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
    * example 1 expression
    *
	*	${NAME} l_1=( p_1)->( p_1+" no ");
    *
    *
    * example 2 block
    *
    *    ${NAME} l_one = ( p_1 ) ->
	*	{
	*   //throw new Exception(  );
	*	//this.f_method("test");        //this is avialable
	*	//v_obj;                        //locals FINAL variables is avialable
	*	return p_1 + " no ";
	*	};
	*
	*
    * example 3 expression as method argument  f_method(${NAME} p_1)
    *
	*	v_object.f_method( ( p_1)->( p_1+" no ") );
    *
    *
    * example 4 =static method
    *
	*	${NAME} l_1 = VS_::fs_test;
	*
    *
    * example 5 = object method
    *
	*	${NAME} l_1 = v_obj::f_test;
	*
	*
	* example 6 = object method THIS and SUPER
	*
	*   ${NAME} l_1 = this::f_test;
	*   ${NAME} l_1 = super::f_test;
    *
    *
    *
    * example 7  = object method (with argument of ANYTYPE)
    *
    *   ${NAME} l_1 = v_obj::<String>fg_testanyarg;
    *
    *
   	*
    *


*
*
*
* }</pre>
*/
//  public _package_ final                               
//  extends VIG_<String>                    
@FunctionalInterface
public interface ${NAME} 
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
    *
    * }</pre>
    */
 
    //      throws Exception, VX_myxception   
    //private void    f_common()
   //     {
    //    log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_common: " );
        //
    //    
        //
    //    return;
    //    } 
    
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
    //                              method lambda
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method need implementation in lambda expression/block
    * <pre>{@code                   
    *
    * example 1
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
    public abstract String    fl_lambda(final String p_1);  

    
    /**                         reference to class method, then call with object instalce
    * <pre>{@code                   
   	*
   	*
    * example 8 
    *    
    *   class method, then call with object instalce
    *   fl_lambda(VC_ p_1,String p_2)               //define functional interface      (2 parameters)
    *   f_method(String p_2)                     //define VC_ method                (1 parameter )
    *   ${NAME} l_1=VC_::f_method                //get reference to the VC_ method
    *   v_obj=new VC_();
    *   l_1.fl_lambda(v_obj,"string");           //call lambda                      (2 parameters)
    *
    *
    *
    *
    *
    * }</pre>
    */  
    //      throws Exception, VX_myxception  
    //public abstract String    fl_lambda(VC_ p_obj,String p_1);  

    
    
    }
