#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             class static (usual class with static properties and methods)
* <pre>{@code
*
*
* example 1
*
*              ${NAME}.fs_method();
*
*
* example 2
*
*               (THIS not allowed)
*
*
* example 4
*
*            No inheritance for static methods/properties (NO override)
*            static methods allowed (public or private)
*
*
*
* }</pre>
*/
//  public _package_ final                          
//  extends VS_                 implements VI_, VI_        
//  extends VSG_<String>        implements VIG_<String>       
public final class ${NAME}  
    {
    
    
    
    
    
    
    
    
    #parse("fields.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              static variables
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

    /**                         static variable test
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           s_test  (THIS not allowed)
    *
    *
    * example 2
    *
    *           static property not overrided
    *
    * }</pre>
    */  
    private static String  s_test = new String("test string"); 
    
    
    
    
    
    
    
    
    #parse("constructors.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              static constructors/initializers
    //
    //////////////////////////////////////////////////////////////////////////////////
    //<editor-fold descr="initializer default ">  
    /**                         static initializer default                       
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *
    *           initializer called before methods
    *
    *
    * example 2
    *
    *
    *
    * }</pre>
    */
    //</editor-fold>  
    static
        {
        //example
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  INITIALIZER: " );
        s_test="test";
        }
    
    /**                         PRIVATE constructor default: NO objects allowed
    *                           otherwise java autogenerate PUBLIC default constructor
    *
    */
     //      throws Exception, VX_myxception   
    private ${NAME} ()                           
        {
        //super();  OR this("")
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  NO PUBLIC CONSTRUCTOR ALLOWED: " );
        
        }
    
    
    
    
    
    
    
    
    
    
    
    
    #parse("methods.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              static methods
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         static method test
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           ${NAME}.fs_method();
    *
    *
    * example 2
    *       
    *           static method not overrided
    *    
    *
    * }</pre>
    */
    //      public privateFinal _package_ 
    //      throws Exception, VX_myxception   
    public static final void    fs_method()
        {
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  g_method: " );
        //
        s_test="test";
        //
        return;
        } 
        
        
     /**
     *                          STATIC method test with argument of ANYTYPE
     *                          STATIC generic methods allowed
     * <pre>{@code
     *
     *
     * example 1
     *
     *           ${NAME}.f_testanyarg("stroka");
     *           ${NAME}.f_testanyarg(12);
     *
     *
     *
     * example 2
     *
     *          static method not overrided
     *
     * }</pre>
     */
    //      public privateFinal _package_
    //      throws Exception, VX_myxception 
    static public final < E   /* extends super VC_ & VI_ */ /* extends super VCG_<?> & VIG_<?> */ /* extends super VCG_< E > & VIG_< E > */ /* extends super VCG_<String> & VIG_<String> */ >void fg_testanyarg(final  E  p_1 )
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
