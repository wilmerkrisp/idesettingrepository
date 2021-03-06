#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.util.Comparator;

#parse("headerCollection.java")


#parse("File Header.java")

 

/**                             
*   class
    my IMmutable list
*
    

    Make class simple without generic:
    1) reformat code
    2) replace all < TKey > with ""  ,besides replaceAll( UnaryOperator< TKey > operator )
    3) replace all <> with ""       (click MATCH CASE)
    4) uncomment < Type1 >
    5) replace all TKey with Type1


*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft

    #parse("inheritanceComposition.java")


* <pre>{@code
*
* example 1
*
*   ${NAME} v_obj = new ${NAME}();
*   v_obj.oneCompute();

* example 2

    ${NAME} v2 = new ${NAME}("one","two","th3");
    
* example 3
    
    ${NAME} v2 = new ${NAME}(coll);
    
* example 4    
    ${NAME} v2 =  ${NAME}.of("one","two","th3");
    
* example 5    
    ${NAME} v2 =  ${NAME}.of(coll);
*
*
* }</pre>
*/         
/*@Immutable*/                                                
public final class ${NAME} < TKey >
    extends ArrayList< TKey > /*< Type1 >*/ 
   
	{
	
	#parse("constantsForList.java")
	
    #parse("log.java")
	    
	    
	    
	private TKey  defaultElement_()         {         return null;         }
	
    	
    #parse("constantsImmutable.java")

 
			
 
	private ${NAME}()
		{        
		 
        
		super();
		
		#parse("throwdontuse")
		        
		}
	
	 
	private ${NAME}( int initialCapacity )
		{
		super( initialCapacity );

        #parse("throwdontuse")

		}
	
 
	private ${NAME}(@NotNull  Iterator< ? extends TKey > iterator )
		{
		this();
		
		while( iterator.hasNext() )
			{
			super.add( iterator.next() );
			}
			
		assertForNullProperties_( );	
        assertForValidProperties_( );
		assertForConsistencyProperties_( );		
		}
	
	
	
	
#parse("checkimmutable.java")
	
	
	/**                         
	*   constructor with object(collection)
	*   Analogically to usual collections  
	*           
	    (!) SHALLOW COPYING OF OBJECT IN CONSTRUCTOR

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(someCollection);
    *
    *
    * }</pre>
    */ 
	public ${NAME}(@NotNull  Collection< ? extends TKey > collection )
		{
		super(   collection );
		
		assertForNullProperties_( );
        assertForValidProperties_( );
		assertForConsistencyProperties_( );		
		}

  
	
	/**                         
	*   fabric with ALL PARAMS vararg
	*   Analogically to List.of    
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.of("one","two","th3");
    *
    *
    * }</pre>
    */ 
	public static  <TKey>  ${NAME}<TKey> of(@NotNull  TKey... elements )
		{
		return new ${NAME}<>( (Collection) List.of( elements ) );
		}
	
	
	
	/**                         
	*   fabric with object(collection)
	*   Analogically to usual collections  
	*            
	    (!) SHALLOW copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	             
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.copyOf(someCollection);
    *
    *
    * }</pre>
    */ 
	public static  <TKey>  ${NAME}<TKey> copyOf(@NotNull Collection< ? extends TKey > collection )
		{ 
		return new ${NAME}<>( collection );
		}	
	
	
	
	
	
	/**                         
	*   fabric with OBJECTdeep (collection)
  
	*           
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.deepCopyOf(someCollection);
    *
    *
    * }</pre>
    */ 	
	public static <  TKey,E extends Collection< ? extends TKey > & Serializable > ${NAME}<TKey> deepCopyOf(@NotNull  E collection )
		{
		return copyOf( (E) SerializationUtils.clone( collection ) );
		}
	

	 

	/**                         
	*   fabric with parameter = Iterable type
  
	*           
	    (!) SHALLOW copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 


	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.copyOf(someCollection);
    *
    *
    * }</pre>
    */ 	
	public static <TKey>  ${NAME}<TKey> copyOf(@NotNull  Iterable< ? extends TKey > iterable )
		{
		return iterable instanceof Collection ? copyOf( (Collection) iterable ) : copyOf( iterable.iterator() );
		}
	
	
	/**                         
	*   fabric with parameter = Iterable type
  
	*           
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.deepCopyOf(someCollection);
    *
    *
    * }</pre>
    */ 	
	public static < TKey, E extends Iterable< ? extends TKey > & Serializable > ${NAME}<TKey> deepCopyOf(@NotNull  E iterable )
		{
		return copyOf( (E) SerializationUtils.clone( iterable ) );
		}
	
 
	
	/**                         
	*   fabric with parameter = Iterator type
  
	*           
	    (!) SHALLOW copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.copyOf(someCollection.iterator());
    *
    *
    * }</pre>
    */ 	
	public static <TKey>  ${NAME}<TKey> copyOf(@NotNull  Iterator< ? extends TKey > iterator )
		{ 
		return new ${NAME}<>( iterator );
		}
	
	
	/**                         
	*   fabric with parameter = Iterator type
  
	*           
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.deepCopyOf(someCollection.iterator());
    *
    *
    * }</pre>
    */ 		
	public static <TKey, E extends Iterator< ? extends TKey > & Serializable > ${NAME}<TKey> deepCopyOf(@NotNull  E iterator )
		{
		return copyOf( (E) SerializationUtils.clone( iterator ) );
		}
		
	 
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public boolean add( TKey e )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public boolean addAll( Collection< ? extends TKey > c )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public boolean addAll( int index ,
	                       Collection< ? extends TKey > c )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public void clear()
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */	
	@Override
	@Deprecated
	final public boolean remove( Object o )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public boolean removeAll( Collection< ? > c )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public boolean removeIf( Predicate< ? super TKey > filter )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public void replaceAll( UnaryOperator< TKey > operator )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public boolean retainAll( Collection< ? > c )
		{
		throw exception_();
		}
	
	
	/**                         
	*   unsupported for immutable
    */ 	
	@Override
	@Deprecated
	final public void sort( Comparator< ? super TKey > c )
		{
		throw exception_();
		}
	
 	
	
	
    #parse("implementation.java")



    #parse("checkLogAssertCollectionGeneric.java")
	
	
	 
    
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

	public void compute(@NotNull  final String p_1 )
		{
		
		
        #parse("methodcompute.java")
        
        
 
        Objects.requireNonNull( p_1 );

		return;
		}
		
		
	}
