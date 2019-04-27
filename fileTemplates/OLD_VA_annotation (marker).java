#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.lang.annotation.*;

#parse("File Header.java")

/**                             annotation
* <pre>{@code
*
*
* example 1
*               
*               @${NAME}              //marker annotation
*
*
*
* example 2
*               
*               hashCode ( ) , equals ( ) , toString ( ) ,  annotationType ( )
*
*
* example 3
*
*               no extends, no inheritance
*
*
* example 5
*
*       test marker annotation
*           Method v_m = v_ob.getClass( ).getMethod("MyMethod" );
*           if(v_m.isAnnotationPresent(${NAME}.class))
*			    log.debug( "marker annotation present");
*
*
*
* }</pre>
*/
@Inherited /*all subclasses inherit this annotation*/
@Target( { ElementType.ANNOTATION_TYPE, ElementType .CONSTRUCTOR, ElementType .FIELD, ElementType .LOCAL_VARIABLE, ElementType .METHOD, ElementType .PACKAGE, ElementType .PARAMETER, ElementType .TYPE, ElementType .TYPE_PARAMETER, ElementType .TYPE_USE})
@Retention( RetentionPolicy.RUNTIME /*SOURCE CLASS RUNTIME*/)
@interface ${NAME} /*NO INHERITANCE*/
	{
	 //////////////////////////////////////////////////////////////////////////////////
    //
    //                              no methods or properties
    //
    //////////////////////////////////////////////////////////////////////////////////  

	}