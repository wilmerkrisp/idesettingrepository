#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end




/**                         usual interface for provide functionality
 * <pre>{@code
 *
 * }</pre>
 */  
public interface VI_${NAME} 
    {
    public  void    f_test();
    }



/**                         usual class for implements functionality in interface
 * <pre>{@code
 *
 * 
 * example 1
 *              
 *              1) uncoment public word fedore each class and interface
 *              2) class mast implements _SERVICE interface
 *              3) explitly create _PACKAGE_ default constructor, otherwise java autogenerate PUBLIC default constructor
 *              4) all another constructors make _PACKAGE_
 *              5) use VARIANT1) FACTORY IMPLEMENTATION as class
 *                  VI_${NAME}_FACTORY v_fac=new VC_${NAME}_FACTORY1();
 *                  VI_${NAME}_STRATEGY.fs_service(v_fac);
 *             
 *               
 *
 * example 2 
 *
 *              1) use VARIANT2) FACTORY IMPLEMENTATION as static property 
 *              2) VI_${NAME}_STRATEGY.fs_service(VC_${NAME}.defaultFactory);
 *
 *
 * example 3
 *
 *              0) make constructor public!
 *              1) use VARIANT3) FACTORY IMPLEMENTATION as lambda 
 *              2) VI_${NAME}_STRATEGY.fs_service(()->{return new VC_${NAME}();});
*
*
 *
 * }</pre>
 */                                                  
public class VC_${NAME} implements VI_${NAME}
    {
    /**                        VARIANT 2 FACTORY IMPLEMENTATION
    *                          singleton anonim class factory
    */ 
    public static VI_${NAME}_FACTORY defaultFactory = new VI_${NAME}_FACTORY(){public  VI_${NAME} get${NAME} (){return new VC_${NAME}();}  };
    
    /**                         _PACKAGE_ constructor default: NO objects allowed
    *                          otherwise java autogenerate PUBLIC default constructor
    */
    VC_${NAME} ()                           
        {
        //super();  OR this("")
        
        }
        
        
 
    /**                         method implemented from interface
    * <pre>{@code                   
    *
    *
    * }</pre>
    */
    @Override  
    public  void    f_test()                   
        {
        //System.out.println( "f_test( )" );
        return;
        } 
    
    }

    
    
 /**                         interface for factory
 * <pre>{@code
 *
 * }</pre>
 */  
public interface VI_${NAME}_FACTORY 
    {
    public VI_${NAME} get${NAME} ();
    }
    
 


/**                         service strategy
 * <pre>{@code              using factory
 *
 * }</pre>
 */  
public interface VI_${NAME}_STRATEGY
    {
      public static void    fs_service(VI_${NAME}_FACTORY p_1) 
        {

 		VI_${NAME} v_obj= p_1.get${NAME}();
 		v_obj.f_test();
        
        return;
        } 
    }

 /**                         VARIANT1) FACTORY IMPLEMENTATION
 * <pre>{@code               separate class for factory
 *
 * }</pre>
 */  
public class VC_${NAME}_FACTORY1 implements VI_${NAME}_FACTORY
    {
    @Override
    public  VI_${NAME} get${NAME} (){return new VC_${NAME}();};
    }


    
 