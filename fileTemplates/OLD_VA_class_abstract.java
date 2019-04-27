#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             class abstract
*
* <pre>{@code
*
* example 1           
*              VA_somesubclass extends ${NAME}         
*
*              NEW denied. Need inheritance.
*              Class can include usual properties and methods (not only abstracts)
*              Constructors/static methods canNOT be abstract
*
* example 2
*
*
* }</pre>
*
*
*
*/
//  extends VA_             implements VI_, VI_          
//  extends VCG_<String>    implements VCG_<String>     
public abstract class ${NAME}  
    {
    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              variables
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         log4j debug massage
    *
    * <pre>{@code                   
    *
    * example 1
    *           log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.info    ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.warn    ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.error   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
    *
    * example 2
    *
    *
    * }</pre>
    *
    *
    */  
    private static final Logger log = LogManager.getLogger( ${NAME}.class );
    
    /**                         variable test
    *
    * <pre>{@code                   
    *
    * example 1
    *           this.c_test
    *
    * example 2
    *
    *
    * }</pre>
    *
    *
    */
    // public privateFinal protectedPackage _package_ 
    private String  c_test = new String("test string");                         
 
 
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              constructors
    //
    //////////////////////////////////////////////////////////////////////////////////  

    /**                         constructor default
    *                           
    * <pre>{@code                   
    *
    * exapmle 1
    *           add super(); to sublcalss
    *
    * example 2
    *          constructor is a static method
    *
    * }</pre>
    *
    *
    */
    //      public privateFinal protectedPackage _package_   
    //      throws Exception
    public ${NAME} ()                           
        {
        //super();  OR this("")
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  init: " );
        }
    
    /**                         constructor with parameter
    *                           
    * <pre>{@code                   
    *
    * exapmle 1
    *           add super(p_1); to sublcalss
    *
    * example 2
    *
    *
    * }</pre>
    *
    *
    */ 
    //      public privateFinal protectedPackage _package_ 
    //      throws Exception
    public ${NAME} (final String p_1)                 
        {
        //super(p_1);   OR this(p_1,"")
        this.c_test = p_1;
        }

    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method abstract
    *
    * <pre>{@code                   
    *
    * example 1
    *           v_obj.f_test();
    *
    * example 2
    *           
    *
    * }</pre>
    *
    *
    */
    //      public privateFinal protectedPackage _package_ 
    //      throws Exception  
    public  abstract void  f_test();                

    /**                         method final
    *
    * <pre>{@code                   
    *
    * example 1
    *           v_obj.f_test1();
    *
    * example 2
    *           
    *
    * }</pre>
    *
    *
    */
    //      public privateFinal protectedPackage _package_ final   
    //      throws Exception  
    public  final void  f_test1()                   
        {
        //throw new Exception( "vError" );
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_test1: " );
        //
        
        //
        return;
        }



    
    }
