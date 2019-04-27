#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
 


#parse("File Header.java")

 
/**                             
*   interface GENERIC
*   !CHANGE_ME_DESCRIPTION!
*
*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft


    #parse("iclassforinheritance.java") 

* <pre>{@code
*
*
* example 1    
*     
*              VC_somesubclass                  implements ${NAME}<String>   
*              VI_somesubinterface              extends    ${NAME}<String> 
*              VCG_somesubclass< T >        implements ${NAME}< T > 
*              VIG_somesubinterface< T >    extends    ${NAME}< T >
*              
*                       
*                    
*
*
* example 3 
*
*               boolean v_check = v_obj instanceof ${NAME}<?> ;
*               !no instanceof ${NAME}<String>
* 
*
*
* }</pre>
*/              
public interface ${NAME}< T  /* extends super VCG_< T > & VIG_< T >*//* extends super VC_ & VI_ *//* extends super VCG_<String> & VIG_<String> */> 
    {  
     

#parse("imethodprivate.java")


#parse("imethodoptional.java")
    
    
  
   	
    /**                         
    *   method need implementation (with GENERIC parameter GENERIC result)
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           String v_string = v_obj.f_test("str");
    *
    *  
    *
    * }</pre>
    */  
    public   T     f_test(@NotNull final  T  p_1) ;

   
   	
    /**                   
    *   method test with argument of GENERIC<anyclass>    
    *                                     <not only T as uppers methods>
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code
    *
    *
    * example 1
    *
    *              ${NAME}< Long >   v_obj1 = new ${NAME}<  >( 12L );
    *              ${NAME}< String > v_obj2 = new ${NAME}<  >( 12L );
    *              v_.f_test_genericlass(v_obj2);
    *              v_.f_test_genericlass(v_obj1);
    *

    *
    *
    *
    *
    * }</pre>
    */ 
    public void fg_test_genericlass(@NotNull final ${NAME}< ? /* extends super VC_ & VI_ *//* extends super VCG_< T > & VIG_< T >*//* extends super VCG_<String> & VIG_<String> */ > p_1 ) ;
  
 
    
    
    
    }
