#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;
import static java.util.stream.Collectors.*;

#parse("File Header.java")

 
/**                             
*   class mutable withGENERIC
*   !CHANGE_ME_DESCRIPTION!

*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft
*
* <pre>{@code
*
*
* example 1
*
*              ${NAME}<String> v_obj = new ${NAME}<>();
*              String v_string = v_obj.f_test("str");
*
*     
*
*          
* }</pre>
*/                                                  
public class ${NAME}< T  /* extends super VCG_< T > & VIG_< T >*//* extends super VC_ & VI_ *//* extends super VCG_<String> & VIG_<String> */ > 
implements Serializable
    {
 
 
    #parse("constants.java")


    #parse("log.java")

   	private static final stringOneDefaultValue_="";
   	private static final stringTwoDefaultValue_="";
   	
    private transient  T   stringOne_  ;

    private  T   stringTwo  ;

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
    public  T  getStringTwo()
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
	public void setStringTwo( @Nullable final  T  stringTwo )
		{
		if ( stringTwo==null) log_.info( argumentIsNullMessage_ +argumentTwoMessage_ );
	    this.stringTwo =  stringTwo ;
		}
                



 	/**                         
	*   constructor default
	*   !CHANGE_ME_DESCRIPTION!   
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME}<String> v_obj = new ${NAME}<>();
    *
    *
    * }</pre>
    */ 
    public ${NAME} ()                           
        {
        
        super();

        }
   
   
   
    #parse("checkmutableconstructor.java")


    #parse("constructorwithparametergenericMU.java")



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
	public ${NAME}(@NotNull final ${NAME}< T > object )
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
	
	

     #parse("checkLogAssertGeneric.java")
    
    
    #parse("checkmutableequals.java")


    #parse("checkmutable.java")


    #parse("methodgenericMU.java")



    #parse("methodarggeneric.java")
    
    
    }
