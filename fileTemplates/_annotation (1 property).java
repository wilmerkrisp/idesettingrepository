#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.lang.annotation.*;


#parse("File Header.java")


/**                             
*   monomial annotation 
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
*               @${NAME} ("stroka3")             //monomial annotation, 1 argument value
*
*
*
* example 2
*               
*               hashCode ( ) , equals ( ) , toString ( ) ,  annotationType ( )
*
*
*
*
* example 4     
*          
*        validate all annotations inside class
*           Method v_m = v_ob.getClass( ).getMethod("MyMethod" );
*			${NAME} v_anno=v_m.getAnnotation(${NAME}.class)
*			log.debug( "VV_class f_method: "+ v_anno.value() );
*



 
	
*
*
* }</pre>
*/
@Inherited /*all subclasses inherit this annotation*/
@Target( { ElementType.ANNOTATION_TYPE, ElementType .CONSTRUCTOR, ElementType .FIELD, ElementType .LOCAL_VARIABLE, ElementType .METHOD, ElementType .PACKAGE, ElementType .PARAMETER, ElementType .TYPE, ElementType .TYPE_PARAMETER, ElementType .TYPE_USE})
@Retention( RetentionPolicy.RUNTIME /*SOURCE CLASS RUNTIME*/)
@interface ${NAME} 
	{
	
	
	/**                         
	*   parameter 3 (for monomial annotation, 1 argument value)
    *   !CHANGE_ME_DESCRIPTION!
    *
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           @${NAME} ("stroka3")  //monomial annotation, 1 argument value
    *
    *
    * }</pre>
    */  
	String value() default "stroka3";

	}