#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             class-value nonmutable autocloseable
* <pre>{@code
*
*
* example 1
*
*              ${NAME} v_obj = new ${NAME}();
*              v_obj.f_test();
*
*
* example 2
*
*		//automaticly close resource
*		try( ${NAME} v_obj = new ${NAME}( ) )
*			{
*			v_obj.f_test ( );
*			}
*		catch( Exception p_exception )
*			{
*			System.out.println( p_exception );
*			//throw new Exception( "Chain exception", p_exception);
*			}
*
*
*
* example 3
*
*           VV_somesubclass             extends ${NAME} implements VI_, VI_
*           VV_somesubclass<g_param>    extends ${NAME} implements VI_, VI_
*
*
*
* }</pre>
*/
                                
//  extends VC_          implements VI_          , AutoCloseable      
//  extends VCG_<String> implements VIG_<String> , AutoCloseable
//  public class ${NAME}<g_param>     extends VCG_<g_param>   implements VIG_<g_param> , AutoCloseable  
//  @Override @Deprecated
//  public _package_ final                                        
public class ${NAME} implements AutoCloseable 
    {
    
    
    
    
    
    
    
    
    
    
    
    #parse("fields.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              all variables =FINAL
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

    /**                         FINAL variable test
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
    *           - property not overrided, initialize here or constructor
    *
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ ONLYFINAL
    private final String  c_test;                    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
    * }</pre>
    */
    //</editor-fold>  
        {
        //example
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  INITIALIZER: " );
        
        }
 

    /**                         constructor default (!!MUST INIT ALL INTERNAL FINAL VARIABLES)                           
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}();
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
    //      private public protected _package_  
    //      throws Exception, VX_myxception   
    public ${NAME} ()                           
        {
        //super();  OR this("")
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  CONSTRUCTOR: " );
        
        this.c_test="Default valuee"; //!!MUST INIT ALL INTERNAL FINAL VARIABLES
        //throw new VX_onCreation_exception( " specialno v kinstruktore " );
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
    //      private public protected _package_  
    //      throws Exception, VX_myxception   
    public ${NAME} (final String p_1)                 
        {
        //super(p_1);   OR this(p_1,"")
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  CONSTRUCTOR: " );

        this.c_test = p_1;
        //throw new VX_onCreation_exception( " specialno v kinstruktore " );
        }


	/**                 constructor with object
	 * <pre>{@code
	 *
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj1 = new ${NAME}("param");
	 *           ${NAME} v_obj2 = new ${NAME}(v_obj1);
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
	 //      private public protected  _package_ 
    //      throws Exception, VX_myxception 
	public ${NAME}( final ${NAME} p_1 )                 
		{
		//super(p_1);  // this() not allowed
		//log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  CONSTRUCTOR: " );
		
		this.c_test = p_1.c_test;
		//throw new VX_onCreation_exception( " specialno v kinstruktore " );
		}
















    #parse("implementations.java")
    /**                         AUTOCLOSE aka DEstructor                        
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *           
    *
    * example 2
    *
    *
    * }</pre>
    */  
	public void close() throws Exception //VX_onCloseException
		{
		//log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  AUTOCLOSE: " );
		//throw new VX_onClose_exception( " specialno v kinstruktore " );
		}
	
	//////////////////////////////////////////////////////////////////////////////////
    //
    //                              generate EQUALS, HASHCODE,TOSTRING
    //                 ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method copy deep
    * <pre>{@code                   
    *
    *
    * example 1
    *
	*           ${NAME} v_obj1 = new ${NAME}("param");
	*           ${NAME} v_obj2 = v_obj1.f_copy_deep();
    *
    *
    * example 2
    *           
    *
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ final
    //      throws Exception, VX_myxception 
    //      @Override   
    public  ${NAME}    f_copy_deep()                    
        {
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_copy_deep: " );
        //throw new VX_exception( "vError" );
        //
        
        //
        return new ${NAME}(this);
        } 
		
	
	/**                         method copy light
    * <pre>{@code                   
    *
    *
    * example 1
    *
	*           ${NAME} v_obj1 = new ${NAME}("param");
	*           ${NAME} v_obj2 = v_obj1.f_copy_light();
    *
    *
    * example 2
    *    
    *
    *       
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ final 
    //      throws Exception, VX_myxception 
    //      @Override   
    public  ${NAME}    f_copy_light()                    
        {
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_copy_light: " );
        //throw new VX_exception( "vError" );
        //
        
        //
        return new ${NAME}(this);
        } 

				
				











	#parse("methods.java")			
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
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ final 
    //      throws Exception, VX_myxception 
    //      @Override   
    public  void    f_test()                   
        {
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_test: " );
        //throw new VX_exception( "vError" );
        //
        
        //
        return;
        } 
    
    
    
    
    }
