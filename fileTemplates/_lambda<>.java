#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

 


#parse("File Header.java")
 
/**                             
*   interface for lambda GENERIC
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
*              VI_somesubinterface              extends    ${NAME}<String> 
*              VIG_somesubinterface< T >    extends    ${NAME}< T >
*
*
*                  
*
*
* example 2 
*
*               boolean v_check = v_obj instanceof ${NAME}<?> ;
*               !no instanceof ${NAME}<String>
* 
*
*
*
* example 1 expression
*
*	${NAME}<String> l_1=( p_1)->( p_1+" no ");
*
*
*
* example 2 block
*
*    ${NAME}<String> l_one = ( p_1 ) ->
*	{
*   //throw new Exception(  );
*	//this.f_method("test");        //this is avialable
*	//v_obj;                        //locals FINAL variables is avialable
*	return p_1 + " no ";
*	};
*
* 
*  example 3 
*    
*   expression as method argument  f_method(${NAME}<String> p_1)
*	v_object.f_method( ( p_1)->( p_1+" no ") );
*
*
*
* example 4 =static method of class or interface
*
*	${NAME}<String> l_1 = VS_::fs_test;
*
*
*
* example 5 =object method
*
*	${NAME}<String> l_1 = v_obj:f_test;
*
*
*
* example 6 = object method THIS and SUPER
*
*   ${NAME}<String> l_1 = this::f_test;
*   ${NAME}<String> l_1 = super::f_test;
*
*
*
* example 7  = object method (with argument of ANYTYPE)
*
*   flg_lambda( T  p_1)                //define functional interface    
*   public <  E  >  E  f_method(  E  p_1 ) //define VC_ method
*   ${NAME}<String> l_1 = v_obj::f_method; //get reference to the VC_ method
*   v_obj=new VC_();
*   l_1.flg_lambda("string");              //call lambda 
*
*
*
*
*
*
*
*   interface Function<T, R>
*       R apply(T t);
* 
*   interface UnaryOperator<T>
*       T apply(T t);
* 
*   interface BiFunction<T, U, R>
*       R apply(T t, U u);
*
*   interface BinaryOperator<T>
*       T apply(T t, T u);
*
*   interface Predicate<T>
*       boolean test(T t);
*
*   interface Consumer<T>
*       void accept(T t);
*
*   interface Supplier<T>
*       T get();
*
*
*
*
* }</pre>
*
*
*
*/                
@FunctionalInterface
public interface ${NAME}< T  /* extends super VCG_< T > & VIG_< T > *//* extends super VC_ & VI_ *//* extends super VCG_<String> & VIG_<String> */  > 
    {  
    
     

#parse("imethodprivate.java")


#parse("imethodoptional.java")

 
    /**                         
    *   method need implementation in lambda expression/block 
    *                            (with GENERIC parameter GENERIC result)
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code                   
    *
    * example 1
    *
    *
    *
    * }</pre>
    */  
    public abstract  T     flg_lambda(@NotNull final  T  p_1);

 
    
    }
