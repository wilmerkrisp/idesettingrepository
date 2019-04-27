#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             interface static
* <pre>{@code
*
*
* example 1    
*
*               use only for constants (static final) and serives
*               NO final methods
*
*
* example 2
*
*               ${NAME}.fs_service();
*               v_1=${NAME}.s_const;
*
*
* example 3
*
*            No inheritance for static methods/properties (NO override)
*            static methods allowed (public or private)
*
*
* example 4
*
*            (THIS not allowed)
*
*
*
* example 5
*
*            generic parameter not allowed in static methods and properties
*
*
*
*
* }</pre>
*/
//  public _package_ final                             
//  extends VIG_<String>                   
public final interface ${NAME} 
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

    /**                         constants
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           s_const (THIS not allowed)
    *
    *
    * example 2
    *
    *           not overrided
    *
    * }</pre>
    */  
    public static final String s_const = new String("test string");                     
 
 
 
    
    
    
    
    #parse("methods.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods static
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method NO implementation   NO inheritance
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           ${NAME}.fs_service();  (THIS not allowed)
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
    //      private public  
    public static final void    fs_service() 
        {
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_algo: " );
        //
        
        //
        return;
        } 
    
 
     
     /**
     *                      STATIC method test with argument of ANYTYPE
     *                      STATIC generic methods allowed
     *                      method NO implementation   NO inheritance
     * <pre>{@code
     *
     *
     * example 1
     *
     *           ${NAME}.fg_service("stroka");
     *           ${NAME}.fg_service(12);
     *
     *
     * example 2
     *
     *          not overrided
     *
     *
     * }</pre>
     */
    //      throws Exception, VX_myxception 
    //      private public
    public static final < E   /* extends super VC_ & VI_ */ /* extends super VCG_<?> & VIG_<?> */ /* extends super VCG_< E > & VIG_< E > */ /* extends super VCG_<String> & VIG_<String> */ >void fg_service(final  E  p_1 )
        {
        //throw new VX_exception( "vError" );
        //super.fg_testanyarg(p_1);
        //log.debug( "argument type: " + (( p_1 instanceof VV_ ) ? "VV_" : "no") );
        //log.debug( "$class$  f_testanyarg: "+p_1 );
        //!NO new  E ()
        
   
        //
        return;
        }
    
    
    
    
    }
