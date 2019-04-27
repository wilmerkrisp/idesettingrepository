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
	extends ForwardingList< ${KEY} >
	{
	#parse("log.java")
	
	
	private final List< ${KEY} > delegate; // backing list
	@Override
	protected List< ${KEY} > delegate()
		{
		return delegate;
		}

	private ${NAME}()
		{
		super();
		
		#parse("throwdontuse")
		}
		
	
	public ${NAME}(@NotNull  List< ${KEY} > backingList )
		{
		checkNotNull( backingList,"You must set backing list." );
		this.delegate = backingList;
		}
	
	
	public static ${NAME} of(@NotNull  List< ${KEY} > backingList )
        {
        return new  ${NAME}(backingList);
        }
	
	
	public static ${NAME} deepCopyOf(@NotNull  List< ${KEY} > list )
		{
		Gson gson = new Gson();
		List<${KEY}> l=  gson.fromJson(gson.toJson(list), List.class);
		return  new ${NAME}( l );
		}
	
	

	
	
	
	
	@Override
	public String toString()
		{
		return "${NAME} (" + delegate.size() + " ${KEY}s)";
		}
	
	private void checkForConsistency_(@NotNull  List< ${KEY} > collection)
	    {
	    checkNotNull( collection );
		checkArgument(!collection.isEmpty(),"Empty collection." );
		checkArgument(!collection.stream().anyMatch( x->x.isEmpty() ),"Empty element");
		checkArgument(!collection.stream().anyMatch( x->x==null ),"Nullable element");
	    }
	
	/**
	 * method f_method
	 *
	 *
	 * !CHANGE_ME_DESCRIPTION!
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
	 */
	public void compute(@NotNull final String string )
		{
		checkNotNull( string,"Nullable argument" );
	    checkArgument( !string.isEmpty(),"Empty argument" );

		checkForConsistency_(this);
		
		
        #parse("checkmutable.java")


        #parse("methodcompute.java")
        
        
        
        
        
		return;
		}
	
		
		
	}

 