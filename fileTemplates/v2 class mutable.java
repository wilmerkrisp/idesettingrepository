#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;
import static java.util.stream.Collectors.*;


#parse("File Header.java")


/**                             
*   class mutable
*   !CHANGE_ME_DESCRIPTION!

*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft
*
* <pre>{@code
*
* example 1
*
*               ${NAME} v_obj = new ${NAME}();
*               v_obj.oneCompute();
*
*
* }</pre>
*/                                                            
public class ${NAME}  
implements Serializable
    {
 
 
    #parse("constants.java")


    #parse("log.java")

   	private static final stringOneDefaultValue_="";
   	private static final stringTwoDefaultValue_="";
   	
   	
    private transient String  stringOne_ = stringOneDefaultValue_;
	
    private String  stringTwo = stringTwoDefaultValue_;

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
    public String getStringTwo()
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
	public void setStringTwo( @Nullable final String stringTwo )
		{
		if ( stringTwo==null) log_.info( argumentIsNullMessage_+ argumentTwoMessage_);
		this.stringTwo =   stringTwo ;
		}
                
	
 	/**                         
	*   constructor default
	*   !CHANGE_ME_DESCRIPTION!   
	*                      
    * <pre>{@code                   
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
        super();
        }


    #parse("checkmutableconstructor.java")



    #parse("constructorwithparameterMU.java")
 	
		
		



	/**
	 * constructor with object
	 * 
	    (!) SHALLOW copying of MUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj1 = new ${NAME}("param");
	 *           ${NAME} v_obj2 = new ${NAME}(v_obj1);
	 *
	 *
	 *
	 *
	 *
	 * }</pre>
	 *
 
	 */
	public ${NAME}(@NotNull final ${NAME} object )
		{
     	super();
		
        #parse("checkimmutable.java")


        #parse("constructorwithobject.java")
        
        
		this.stringTwo = object.getStringTwo();
		
		logForNullProperties_();
        logForValidProperties_();
        logForConsistencyProperties_();			
		}

    



    #parse("implementation.java")


    #parse("checkLogAssert.java")
	


    #parse("checkmutableequals.java")



    #parse("checkmutable.java")


    #parse("methodMU.java")







    #parse("methodarggeneric.java")
    
   
    
    }
