#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

 
 
 
#parse("File Header.java")

 


/**                             class exception
* <pre>{@code
*
*
* example 1
*
*              throw new ${NAME}(  );
*              throw new ${NAME}(" my exception data"  );
*             
*
* example 2
*         
*               this is RuntimeException 
*               exception up strategy
*               withowt intermediate THROWS
*
*     
* }</pre>
*/
public class ${NAME} extends RuntimeException 
    {
 
 
 
 
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


              
    
    
    
    ##parse("constructors.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              constructors
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         constructor                          
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
    * }</pre>
    */  
    public ${NAME} ()                 
        {
     	super( "${NAME} default description" );
		//log exception during creation
		logMessage( "Raise exception." );
        }
        
        
    /**
	 * constructor with DESCRIPTION
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
	 *
	 *
	 * }</pre>
	 */  
	public ${NAME}(@NotNull  final String message )
		{
		super( message );
		//log exception during creation
		logMessage( "Raise exception." );
		}
	
	
	
	/**
	 * constructor with DESCRIPTION + CAUSE
	 * <pre>{@code
	 *
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}("param",p_upperException);
	 *
	 *
	 * example 2
	 *
	 *
	 *
	 * }</pre>
	 */
	public ${NAME}(@NotNull  final String message,@NotNull  Throwable cause)
		{
		super( message,cause );
		//log exception during creation
		logMessage( "Rethrow exception." );
		}
	
	/**
	 * constructor with CAUSE
	 * <pre>{@code
	 *
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}(p_upperException);
	 *
	 *
	 * example 2
	 *
	 *
	 *
	 * }</pre>
	 */
	public ${NAME}(@NotNull  final Throwable cause)
		{
		super( cause );
		//log exception during creation
		logMessage( "Rethrow exception." );
		}
	
		
		
		
		
		
		
		
		
	##parse("implementations.java")	
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         override toString
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           print(v_obj)
    *
    *
    * example 2
    *
    *       
    *
    *
    * }</pre>
    */
    //      private public protected _package_ final  
    //      throws Exception, VX_myxception 
    @Override   
    public  String    toString()                    
        {
        return messageBuilder( "" );
        } 
    
    
    
    
    
    
    
    
    
    
    
     ##parse("methods.java")
     /**
	 *                              construct msg: NEW, RETHROW, RESOLVE
	 * <pre>{@code
	 *
	 
	 *
	 *
	 * }</pre> ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
	 */
	private String messageBuilder(@NotNull  final String p_do )
		{
		String v_do=(p_do!=null)?p_do+": ":" ";;
		String v_id= Integer.toHexString(hashCode());
		String v_name=getClass().getName();
		String v_cause=(getCause()!=null)?Integer.toHexString(getCause().hashCode()):"";
		String v_msg=getLocalizedMessage();
		
		return String.format( "%saddr(%s) cause(%s) msg(%s) type(%s) ", v_do,v_id, v_cause, v_msg,v_name);
		}
	
	/**
	 *                              log msg short (only msg id)
	 * <pre>{@code
	 *

	 *
	 *
	 * }</pre> ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
	 */
	private void logMessage(@NotNull  final String p_do )
		{
		log.error( messageBuilder( p_do ) );
		}
    
    
    
    
    
    
    
    
    }
