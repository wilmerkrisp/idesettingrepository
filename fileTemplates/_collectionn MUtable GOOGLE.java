#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#parse("headerCollection.java")


#parse("File Header.java")



/**
*   class
    my mutable list
*

 0) пожалуйста подавайте на вход МУтабельный тип



*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft

    #parse("inheritanceComposition.java")

* <pre>{@code
*
* example 1
*

*
*
* }</pre>
*/

public final class ${NAME}
	extends Forwarding${CollectionType}< ${KEY} >
	{
	#parse("log.java")
	
	
	private final ${CollectionType}< ${KEY} > delegate; // backing list
	@Override
	protected ${CollectionType}< ${KEY} > delegate()
		{
		return delegate;
		}

	private ${NAME}()
		{
		super();
		
		#parse("throwdontuse")
		}
		
	/**
	@throws NullPointerException if argument nullable
	*/
	public ${NAME}(@NotNull  ${CollectionType}< ${KEY} > backingList )
		{
		checkNotNull( backingList,"You must set backing list." );
		this.delegate = backingList;
		}
	
	
	public static ${NAME} of(@NotNull  ${CollectionType}< ${KEY} > backingMutableCollection )
        {
        return new  ${NAME}(backingMutableCollection);
        }
	
	
	public static ${NAME} deepCopyOf(@NotNull  ${CollectionType}< ${KEY} > backingMutableCollection )
		{

		return  new ${NAME}( deepCopyOfObject(backingMutableCollection,${CollectionType}.class) );

		}
	
	

	
	
	
	
	@Override
	public String toString()
		{
		return "${NAME} (" + delegate.size() + " ${KEY}s)";
		}
	
	private void checkConsistency_()
	    {
	    //notBlank();
	  	}
	private void isConsistent_()
	    {
	    //return !this.isBlank();
	    return true;
	  	}
	  	
	
	/**
	 * method f_method
	 *
	 *
	 	  *  1) no method args, because all inside props
 *
 *  2) количество параметров должно быть не более 4-х, иначе:
 *   	- разбить метод на несколько (как например в NEW-SET-CALL для каждого параметра отдельный сетер)
 *   	- вынести группу параметров в value-класс (nested static) (helper class)
 *   	- все параметры зашить в паттерн билдер, где параметры можно присваивать по-очереди (так что билдер применим и на мутабельном объекте)
 *

	 *
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *            - генерирую runtime ошибки программирования
	 *            - генерирую runtime ошибки выполнения метода, если метод не вернет то что должен
	 *
	 *
	 * example 2
	 *
	 *           v_obj.f_method("test");
	 *
	 * example 3
	 *
	 *           - covariance: this overrided method can return subclass unstead class:
	 *                  resultSomeSuperclass f_method()
	 *                  resultSomeSubclass   f_overrided_method()
	 *
	 *
	 * }</pre> ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
	 
	    @throws NullPointerException if argument nullable
        @throws IllegalStateException if some object's property null or empty (or if one collection's element is empty)
        @return empty value if input argument empty
	 
	 */
	public Optional<String> compute(@NotNull final String string )
		{
        //checkNotNull( string,"Argument should not be null." );
        if (string==null|| string.isBlank() ||!isConsistent()_ )
            return Optional.empty();
 		
		
        #parse("checkmutable.java")


        #parse("methodcompute.java")
        
        
        
        
        
		return Optional.ofNullable(string);
		}
	
		
		
	}

 