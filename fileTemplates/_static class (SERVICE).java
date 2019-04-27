#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

 


#parse("File Header.java")

 

/**                             
*   interface static
*   !CHANGE_ME_DESCRIPTION!
*
- сервисные методы делать статик методами на классе с private конструктором а не на интерфейсе тк методы обработки могут содержать состояние и кеши
- интрфейсы использовать только для задания типа


* <pre>{@code
*
*
*
*
* example 2
*
*               ${NAME}.fs_service();
*               v_1=${NAME}.s_const;
*
*
*
*
* }</pre>
*/            
public final class ${NAME} 
    {  
    
    
    ##parse("constants.java")


    ##parse("log.java")


     private ${NAME}()
		{   
        super();

        #parse("throwdontuse")
		}
    
   	 
   	/**                         
    *   constants
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           s_const (THIS not allowed)
    *
    *
    * }</pre>
    */ 
    public static final String  stringOne = new String("Test string.");

 
 
 
    
    
    
     
   	 
    private static  void    fs_service1_() 
        {
        
           
        return;
        } 
        
    
    
   	 
    /**                         
    *   method public
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           ${NAME}.fs_service();  (THIS not allowed)
    *
    *       
    *
    * }</pre>
    */ 
    public static  void    fs_service2() 
        {
               
        
        return;
        } 
    
 
   
     /**
     *   STATIC method test with argument of ANYTYPE
     *    STATIC generic methods allowed
     *  !CHANGE_ME_DESCRIPTION!
     *
     * <pre>{@code
     *
     *
     * example 1
     *
     *           ${NAME}.fg_service("stroka");
     *           ${NAME}.fg_service(12);
     *
     *
     *
     * }</pre>
     */
    public static  < E   /* extends super VC_ & VI_ */ /* extends super VCG_<?> & VIG_<?> */ /* extends super VCG_< E > & VIG_< E > */ /* extends super VCG_<String> & VIG_<String> */ >void fg_service(@NotNull final  E  p_1 )
        {
        
        
       
           
        return;
        }
    
    
    
    
    }
