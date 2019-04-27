#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             enum simple
* <pre>{@code
*
*
* example 1
*
*	        ${NAME} v_enum = ${NAME}.ONE;
*	        v_enum.c_test = "newvalue";
*           ${NAME}.TWO.c_test = "newvalue";
*	        v_enum.f_test();
*
*
*  example 2
*
*		    switch( v_enum )
*                       {
*                       case ONE:
*                               log.debug( "${NAME} main switch 1: " );
*                               break;
*                       case TWO:
*                               log.debug( "${NAME} main switch 2: " );
*                               break;
*                       case THREE:
*                               log.debug( "${NAME} main switch 3: " );
*                               break;
*                       case FOUR:
*                               log.debug( "${NAME} main switch 4: " );
*                               break;
*                       default:
*                               log.debug( "${NAME} main DEFAULT: " );
*                       }
*
*
*
*  example 3
*
*               for( ${NAME} v_i : ${NAME}.values( ) )
*                       {
*                       log.debug( "${NAME} main for: " + v_i +" "+v_i.c_test );
*                       }
*
*
*
*
*   example 4
*
*               no inheritance
*
*
*
*
* }</pre>
*/
//  public _package_                                                        
//  NO INHERITANCE!!!                                                               
public enum ${NAME} 
    {
    
    
    #parse("fields.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              enum-objects-not_deep_constants
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         enumerations
    * <pre>{@code                   
    *
    *
    *
    * }</pre>
    */  

    ONE("a"),TWO("b"),THREE("c"),FOUR("d"),FIVE ;
    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              variables
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
    private final Logger log = LogManager.getLogger( ${NAME}.class );

    /**                         variable test
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           ${NAME}.TWO.c_test = "newvalue";
    *
    *
    * example 2
    *
    *           - property not overrided, instead use getters/seters
    *
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ finalImmutable   
    public String  c_test = new String("test string");                     
    
    
    
    
    
    #parse("constructors.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              constructors/initializers
    //
    ////////////////////////////////////////////////////////////////////////////////// 
    //<editor-fold descr="initializer default "> 
    /**                         initializer default                        
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *
    *           initializer called before constructors
    *
    * example 2
    *
    *
    *
    *
    * }</pre>
    */
    //</editor-fold>  
        {
        //example
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  INITIALIZER: " );
        
        }
        
        
    /**                         constructor default                         
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *
    *           - constructor is a static method
    *           - constructor is not template method, inside constructor CALL only final,private,super methods
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
    //      public privateFinal protectedPackage _package_ 
    //      throws Exception, VX_myxception   
    private ${NAME} ()                          
        {
        
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  CONSTRUCTOR: "  +this.ordinal());
        this.c_test="novalue";
        
        
        }
    
    /**                         constructor with parameter                         
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}("param");
    *
    *
    * example 2
    *
    *           - constructor is a static method
    *           - constructor is not template method, inside constructor CALL only final,private,super methods
    *
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_  
    //      throws Exception, VX_myxception   
    private ${NAME} (final String p_1)                 
        {
        
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  CONSTRUCTOR: " );
        this.c_test = p_1;
        }

    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method test
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
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ 
    //      throws Exception, VX_myxception   
    public  void    f_test()                    
        {
        //throw new VX_exception( "vError" );
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_test: " );
        //
        
        //
        return;
        } 
    
    }
