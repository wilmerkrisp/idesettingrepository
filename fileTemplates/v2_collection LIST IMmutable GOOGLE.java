#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#parse("headerCollection.java")


#parse("File Header.java")



/**
*   class
    my mutable list
*


*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft

    #parse("inheritanceComposition.java")


    0) пожалуйста подавайте на вход НЕмутабельный тип


 	1) чтобы нельзя было отнаследовать и затереть данные подкласса ВЫБРАНЫ оба ВАРИАНТА
		вариант а) сделать класс final
		вариант  б) закрыть ВСЕ конструкторы и получать объекты только фабрикой
    
    2) Uses Guava ComparisonChain
    
     You can use mutable variant of the class (companien class) for batch operations
     
      	 8) копирующие фабрики: для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	   - для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	   - они называются conversion constructors / conversion factories
       
       
         b) тк должна быть одна точка входа,
       то поместите все проверки в конструктор
       
       

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
	implements Comparable< ${NAME} >
	{
	#parse("log.java")
	
	
	private final ${CollectionType}< ${KEY} > delegate; // backing list
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
	
	private ${NAME}(@NotNull  List< ${KEY} > backingList )
		{
		checkForConsistency_(backingList);
		this.delegate = backingList;
		
	    /* if ${KEY} is mutable type
		Gson gson = new Gson();
		this.delegate =  gson.fromJson(gson.toJson(list), List.class);
		*/
		}
	
    public static ${NAME} of(@NotNull  List< ${KEY} > backingList )
        {
        return new  ${NAME}(backingList);
        }
	
	
	
	
	@Override
	public String toString()
		{
		return "${NAME} (" + delegate.size() + " ${KEY}s)";
		}
		
		
	public int compareTo( ${NAME} that )
		{
		
		return ComparisonChain.start().compare( this.delegate() ,
		                                        that.delegate() ,
		                                        Ordering.< ${KEY} > natural().lexicographical() ).result();
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

		
        #parse("checkmutable.java")


        #parse("methodcompute.java")
        
        
        
        
		return;
		}
	
		
		
	}

 