#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.lang.annotation.*;


#parse("File Header.java")



/**                             
*   marker annotation
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


-   нельзя создавать пустые маркерные интерфейсы без членов, вместо них нужно использовать маркерные аннотации

	- когда лучше использовать интерфейс
	 		 - тк интерфейс это тип,  то можно задавать параметры типа Serializable  и это позволяет заметить ошибки во время компиляции 
		- задайте себе вопрос, могу ли я захотеть написать один или более методов, которыепринимали бы только объекты такого интерфейса?
		- хочу ли я ограничить использование этого маркера элементами определенного интерфейса навсегда?

	- когда лучше использовать аннотацию
	если я хочу добавлять дополнительную информацию к маркеру в будущем?

*
* }</pre>
*/
@Inherited /*all subclasses inherit this annotation*/
@Target( { ElementType.ANNOTATION_TYPE, ElementType .CONSTRUCTOR, ElementType .FIELD, ElementType .LOCAL_VARIABLE, ElementType .METHOD, ElementType .PACKAGE, ElementType .PARAMETER, ElementType .TYPE, ElementType .TYPE_PARAMETER, ElementType .TYPE_USE})
@Retention( RetentionPolicy.RUNTIME /*SOURCE CLASS RUNTIME*/)
@interface ${NAME}  
	{
	
	}