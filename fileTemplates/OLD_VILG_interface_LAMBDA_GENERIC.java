#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             interface for lambda GENERIC
* <pre>{@code
*
*
* example 1    
*             
*              VI_somesubinterface              extends    ${NAME}<String> 
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
* example 2 
*
*               boolean v_check = v_obj instanceof ${NAME}<?> ;
*               !no instanceof ${NAME}<String>
* 
*
*
*
   * example 1 expression
   *
	*	${NAME}<String> l_1=( p_1)->( p_1+" no ");
    *
    *
    *
    * example 2 block
    *
    *    ${NAME}<String> l_one = ( p_1 ) ->
	*	{
	*   //throw new Exception(  );
	*	//this.f_method("test");        //this is avialable
	*	//v_obj;                        //locals FINAL variables is avialable
	*	return p_1 + " no ";
	*	};
    *
    * 
    *  example 3 
    *    
    *   expression as method argument  f_method(${NAME}<String> p_1)
	*	v_object.f_method( ( p_1)->( p_1+" no ") );
    *
    *
    *
    * example 4 =static method
    *
	*	${NAME}<String> l_1 = VS_::fs_test;
   *
    *
    *
    * example 5 =object method
    *
	*	${NAME}<String> l_1 = v_obj:f_test;
    *
    *
    *
    * example 6 = object method THIS and SUPER
    *
	*   ${NAME}<String> l_1 = this::f_test;
	*   ${NAME}<String> l_1 = super::f_test;
*
*
*
    * example 7  = object method (with argument of ANYTYPE)
    *
    *   flg_lambda(g_param p_1)                //define functional interface    
    *   public < g_1 > g_1 f_method( g_1 p_1 ) //define VC_ method 
    *   ${NAME}<String> l_1 = v_obj::f_method; //get reference to the VC_ method
    *   v_obj=new VC_();
    *   l_1.flg_lambda("string");              //call lambda 
*
*
*
*
*
*
*
*   interface Function<T, R>
*       R apply(T t);
* 
*   interface UnaryOperator<T>
*       T apply(T t);
* 
*   interface BiFunction<T, U, R>
*       R apply(T t, U u);
*
*   interface BinaryOperator<T>
*       T apply(T t, T u);
*
*   interface Predicate<T>
*       boolean test(T t);
*
*   interface Consumer<T>
*       void accept(T t);
*
*   interface Supplier<T>
*       T get();
*
*
*
*
* }</pre>
*
*
*
*/
//  public _package_ final          
//  extends VIG_<g_param>                 
//  extends VI_, VI_                    
//  extends VIG_<String>                  
@FunctionalInterface
public interface ${NAME}<g_param /* extends super VCG_<g_param> & VIG_<g_param> *//* extends super VC_ & VI_ *//* extends super VCG_<String> & VIG_<String> */  > 
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





  
  
    
    
    
    
    
    #parse("methods.java")
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
    //    return;
    //    } 
    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods optional
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
    
    /**                         method need implementation in lambda expression/block 
    *                            (with GENERIC parameter GENERIC result)
    * <pre>{@code                   
    *
    * example 1
    *
    *
    * exemple 2
    *
    *           - covariance: this overrided method can return subclass unstead class:
    *                  resultSomeSuperclass f_method()
    *                  resultSomeSubclass   f_overrided_method()
    *
    *
    * }</pre>
    */  
    //      throws Exception, VX_myxception   
    public abstract g_param    flg_lambda(final g_param p_1);  


   /**                         reference to class method, then call with object instalce
    * <pre>{@code                   
   	*
   	*
    *   example 7 
    *
    *           class method, then call with object instalce
    *           flg_lambda(VC_ p_1,String p_2)           //define functional interface      (2 parameters)
    *           f_method(String p_2)                     //define VC_ method                (1 parameter )
    *           ${NAME}<String> l_1=VC_::f_method        //get reference to the VC_ method
    *           v_obj=new VC_();
    *           l_1.flg_lambda(v_obj,"string");           //call lambda                      (2 parameters)
   *
    *
    *
    * }</pre>
    */   
    //      throws Exception, VX_myxception  
    //public abstract g_param    flg_lambda(VC_ p_obj,g_param p_1);  

    
    }
