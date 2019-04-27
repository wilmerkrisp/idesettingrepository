#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             class mutable
* <pre>{@code
*
*
* example 1
*
*               ${NAME} v_obj = new ${NAME}();
*               v_obj.f_test();
*
* example 2
*
*               VC_somesubclass             extends ${NAME} implements VI_, VI_
*               VC_somesubclass<g_param>    extends ${NAME} implements VI_, VI_
*   
*
* }</pre>
*/
      
//  extends VC_             implements VI_, VI_                                           
//  extends VCG_<String>    implements VIG_<String>
//  public class ${NAME}<g_param>     extends VCG_<g_param>   implements VIG_<g_param>                                                                                      
//  @Override @Deprecated
//  public _package_ final                                                             
public class ${NAME} 
    {
 
    #parse("fields.java")
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
    * example 2
    *
    *
    *
    *
    * }</pre>
    */  
    private static final Logger log = LogManager.getLogger( ${NAME}.class );

    /**                         variable test
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           this.c_test
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
    //      privateFinal public protectedPackage _package_ NOFINAL   
    private String  c_test = new String("test string");                     
    
    
    
    
    
    
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
        c_test = new String("test string");
        }
    
    
    
    /**                         constructor default                         
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}();
    *
    * example 2
    *
    *           - constructor is a static method
    *           - constructor is not template method, inside constructor CALL only final,private,super methods
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_
    //      throws Exception, VX_myxception   
    public ${NAME} ()                           
        {
        //super();  OR this("")
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  CONSTRUCTOR: " );
        
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
    public ${NAME} (final String p_1)                 
        {
        //super(p_1);   OR this(p_1,"")
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  CONSTRUCTOR: " );
        
        this.c_test = p_1;
        
        }

	//////////////////////////////////////////////////////////////////////////////////
    //
    //                 generate EQUALS, HASHCODE,TOSTRING, COPYCONSTRUCTOR, ASSIGNMENT
    //                 ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
    //
    //////////////////////////////////////////////////////////////////////////////////  
        
    
    
    

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
    *           - covariance: this overrided method can return subclass unstead class:
    *                  resultSomeSuperclass f_method()
    *                  resultSomeSubclass   f_overrided_method()
    *     
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ final 
    //      throws Exception, VX_myxception 
    //      @Override  
    public  void    f_test()                   
        {
        //throw new VX_exception( "vError" );
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_test: " );
        //
        
        //
        return;
        } 
    
    }
