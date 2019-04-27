#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end


#parse("File Header.java")

//<editor-fold desc=".">
/* exception class

*/
//</editor-fold>


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
public class ${NAME} extends ApplicationException 
    {
    
    //<editor-fold desc=".">
    /* variable
    
    
    
    */
    //</editor-fold>
    
    
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
    *
    *
    * }</pre>
    */
    private String  c_test = new String("test string");                     
  










    
    /**                         constructor                          
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}();
    *
    *
     * }</pre>
    */  
    public ${NAME} ()                 
        { 
        //log.debug   ( "CONSTRUCTOR: " );
        super( "${NAME} default description" );
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
	 *
	 * }</pre>
	 */
	public ${NAME}(@NotNull  final String message )
		{
		//log.debug   ( "CONSTRUCTOR: " );
		super( message ); 
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
	 *
	 * }</pre>
	 */
	public ${NAME}(@NotNull  final String message, Throwable cause)
		{
		//log.debug   ( "CONSTRUCTOR: " );
		super( message,cause );  
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
	 *
	 * }</pre>
	 */
	public ${NAME}(@NotNull  final Throwable cause)
		{
		//log.debug   ( "CONSTRUCTOR: " );
		super( cause );  
		}
	

	/**
	 * constructor with CUSTOM PARAM
	 * <pre>{@code
	 *
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}("param","someparam");
	 *
	 *
	 * }</pre>
	 */
	public ${NAME}(@NotNull  final String message,@NotNull  final String p_additionalParam )
		{
		//log.debug   ( "CONSTRUCTOR: " );
		super( message ); 
		
		//initialize my params
		this.c_test = p_additionalParam;
		}
		
		
		
		
		
		
		
		
		
		
		
    //<editor-fold desc=".">
    /* method
    
     private public protected _package_ final  
     throws Exception, VX_myxception 
    
    */
    //</editor-fold>
    
    /**                         method test
    * <pre>{@code                   
    *
    *
    *       
    *
    *
    * }</pre>
    */

    @Override   
    public  String    toString()                    
        {
        return String.format( "%s param(%s)",super.toString(),this.c_test);
        } 
        
   
        
    	
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods
    //
    //////////////////////////////////////////////////////////////////////////////////
        
    
    }
