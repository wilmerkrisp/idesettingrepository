#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")


/**                             class mutable
*
* <pre>{@code
*
* example 1
*              ${NAME} v_obj=${NAME}.getInstance();
*              v_obj.f_test();
*
* example 2
*               VC_somesubclass             extends ${NAME} implements VI_, VI_
*               VC_somesubclass< T >    extends ${NAME} implements VI_, VI_
*   
* example 3
*               you can NEW in property declaration or inside initializator
*
*
* }</pre>
*
*
*
*/
      
//  extends VC_             implements VI_, VI_                                           
//  extends VCG_<String>    implements VIG_<String>
//  public class ${NAME}< T >     extends VCG_< T >   implements VIG_< T >                                                                                      
//  @Override @Deprecated
//  public protected-default _package_ final                                                             
public class ${NAME} 
    {
 
    
    
    #parse("fields.java")
    
    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              variables
    //
    //////////////////////////////////////////////////////////////////////////////////  
  
  
  #parse("log.java")
	
	
	
	//<editor-fold desc=".">
	/* unsuppirted exception method
	 *
	 * */
	//</editor-fold>
	
	private static final UnsupportedOperationException exception_()
		{
		return new UnsupportedOperationException( "The class-value is immutable. Don't use CrUD methods." );
		}
		
		

   /**                         variable singleton object
    *
    * <pre>{@code                   
    *
    * example 1
    *           use only inside ${NAME} class
    *
    * example 2
    *           ALTERNATIVE REALIZATON: delete FINAL and NEW  and use initialization block
    *
    * }</pre>
    *
    *
    */
    //      private public protected _package_ final   
    private static final ${NAME}  instance ;          
    

   
    
    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              constructors/initializers
    //
    //////////////////////////////////////////////////////////////////////////////////  

    
    //<editor-fold desc=".">
	/* constructors
	
	 0) не следует вызывать конструктор без параметров, тк значения свойств обязательно должны быть инициализированы явно 
	*/
	//</editor-fold>
	
	private ${NAME}()
		{   
       //<editor-fold desc=".">
        /* constructors
    
        super()
        throw new UnsupportedOperationException( "Please use constructor with parameters." );
        */
        //</editor-fold>
        
        
        ##parse("throwdontuse")
        
		//item1 = null;
		}
		
    
  
    
 /**                         factory method 
 *                           LAZY INITIALIZATION
 * <pre>{@code
 *
 * example 1
 *              $class$ v_obj=$class$.getInstance();
 *              v_obj.f_test();
 *
 * example 2
 *              
 *              1) explitly create PRIVATE default constructor, otherwise java autogenerate PUBLIC default constructor
 *              2) all another constructors make PRIVATE
 *               
 *
 * }</pre>
 *
 *                      
 */
//      private public protected final  
//      throws Exception
public static ${NAME} getInstance()
    {
    if(instance==null)
        {
        synchronized(${NAME}.class)
            {
            if(instance==null)
                instance=new ${NAME}();
            }
        }
    
    return instance;
    }


        

    
    }
