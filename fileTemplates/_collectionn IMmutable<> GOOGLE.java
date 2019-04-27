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

  Every constructor/fabric can raise the exceptions:
 @throws NullPointerException if argument nullable (or one of collection's element null)
 @throws IllegalArgumentException if argument empty (or one of collection's element empty)

*/

@Immutable
public final class ${NAME}<T extends Comparable<T>>
	extends Forwarding${CollectionType}< T >
	implements Comparable< ${NAME}<T> >
	{
	#parse("log.java")
	
	
	private final ${CollectionType}< T > delegate; // backing list
	@Override
	protected ${CollectionType}< T > delegate()
		{
		return delegate;
		}

	private ${NAME}()
		{
		super();
		
		#parse("throwdontuse")
		}
	
	private ${NAME}(@NotNull  ${CollectionType}< T > backingImmutableCollection )
		{
        checkNotNull(backingImmutableCollection);
		this.delegate = backingImmutableCollection;
		
		
	    /*
	    - если на вход подана мутабельная версия то ее лучше скопировать в немутабельную коллекцию
	        this.delegate =  deepCopyOfObject(backingImmutableCollection, Map.class);
	    - если элементы Key, Value мутабельного типа, то их в цикле лучше скопировать в немутабельные версии
		*/
		}
	
    public static  <E extends Comparable<E>> ${NAME}<E> of(@NotNull  ${CollectionType}< E > backingImmutableCollection )
        {
        return new  ${NAME}<E>(backingImmutableCollection);
        }
	
	
	
	@Override
	public String toString()
		{
		return "${NAME} (" + delegate.size() + " Ts)";
		}
		
	@Override
	public int compareTo( ${NAME}<T> o )
		{
		
		return ComparisonChain.start().compare( this.delegate() ,
		                                        o.delegate() ,
		                                        Ordering.< T > natural().lexicographical() ).result();
		}
	

	
	/**
	 * method f_method
	 *
	 *
	 
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
      @throws IllegalArgumentException if argument empty
	 
	 */
	public void compute(@NotNull final String string )
		{
		//checkNotNull( string,"Nullable argument" );
	    notBlank(string);

		
        #parse("checkmutable.java")


        #parse("methodcompute.java")
        
        
        
        
		return;
		}
	
		
		
	}

 