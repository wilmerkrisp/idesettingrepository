#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end




#parse("File Header.java")


/**                             
*   class static (usual class with static properties and methods)
*   !CHANGE_ME_DESCRIPTION!
*

*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft


* <pre>{@code
*
*
* example 1
*
*              ${NAME}.fs_method();
*
*

*
*
*
* }</pre>
*/
public final class ${NAME}  
    {


    ##parse("constants.java")


    #parse("log.java")


 
   	 
    private static String  stringOne_ = new String("Test string.");

 
 
	
    private static String  stringTwo = new String("Test string.");

	/**              
	*   get some property
	*   !CHANGE_ME_DESCRIPTION!
	*           
    * <pre>{@code
	*      		            
    * example 1
    *
    *           String v_stringTwo=v_objectTwo.getStringTwo();
    *
    *
    * }</pre>
    */
    public static final String getStringTwo()
		{
		return stringTwo;
		}
	
   /**              
	*   set some properrty
	*   !CHANGE_ME_DESCRIPTION! 
	*           
    * <pre>{@code
	*      		            
    * example 1
    *
	*		   v_objectTwo.setStringTwo("Test string.");
    *
    *
    * }</pre>
    */
	public static final void setStringTwo(@NotNull  final String string )
		{
		stringTwo = Objects.requireNonNull( string );;
		}
		
	 
  	
    static
        {
       
 
		stringTwo="test";
        }
        
        
    
    private ${NAME}()
		{   
        super();

        #parse("throwdontuse")
		}
	

    
    
  
  
    
  	 	
    private static final void    fs_method1_()
        {
      
        stringTwo="test";
      
        return;
        } 
    
    
    
    
    
  	
    /**                         
    *   PUBLC static method test
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           ${NAME}.fs_method();
    *
    *
    * }</pre>
    */
    public static final void    fs_method2()
        {
         
        
        stringTwo="test";
      
        return;
        } 
        
        
        

     

    #parse("methodarggeneric.java")
   
        
        
        
    
    }
