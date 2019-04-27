#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

 


#parse("File Header.java")
 
/**                             
*   interface simple
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
*              VC_somesubclass                  implements ${NAME}
*              VI_somesubinterface              extends    ${NAME}    
*              VCG_somesubclass< T >        implements ${NAME}
*              VIG_somesubinterface< T >    extends    ${NAME}
*
*          
*
* }</pre>
*/                                                                                                   
public interface ${NAME} 
    {   
     



#parse("imethodprivate.java")


#parse("imethodoptional.java")
 
   	
    /**                         
    *   method need implementation
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           v_obj.f_test();
    *
    *       
    *
    * }</pre>
    */
    public abstract void    f_test(); 

  
    
    }
 
/**                             
*   interface for lambda
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
*              VI_somesubinterface              extends    ${NAME}    
*              VIG_somesubinterface< T >    extends    ${NAME}        
*
*
*
* example 1 expression
*
*	${NAME} l_1=( p_1)->( p_1+" no ");
*
*
* example 2 block
*
*    ${NAME} l_one = ( p_1 ) ->
*	{
*   //throw new Exception(  );
*	//this.f_method("test");        //this is avialable
*	//v_obj;                        //locals FINAL variables is avialable
*	return p_1 + " no ";
*	};
*
*
* example 3 expression as method argument  f_method(${NAME} p_1)
*
*	v_object.f_method( ( p_1)->( p_1+" no ") );
*
*
* example 4 =static method of class or interface
*
*	${NAME} l_1 = VS_::fs_test;
*
*
* example 5 = object method
*
*	${NAME} l_1 = v_obj::f_test;
*
*
* example 6 = object method THIS and SUPER
*
*   ${NAME} l_1 = this::f_test;
*   ${NAME} l_1 = super::f_test;
*
*
*
* example 7  = object method (with argument of ANYTYPE)
*
*   ${NAME} l_1 = v_obj::<String>fg_testanyarg;
*
*
*
*
* }</pre>
*/                   
@FunctionalInterface
public interface ${NAME} 
    {   
    
    
#parse("constants.java")


#parse("log.java")






#parse("imethodprivate.java")


#parse("imethodoptional.java")
 
    /**                         
    *   method need implementation in lambda expression/block
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code                   
    *
    * example 1
    *
    *
    *
    *
    * }</pre>
    */  
    public abstract String    fl_lambda(@NotNull final String p_1);

 
    
    }
