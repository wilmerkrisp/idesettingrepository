#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.util.Comparator;

#parse("headerCollection.java")


#parse("File Header.java")

 
/**                             
*   class
    my IMmutable map "EntryImmutableMap"
    
          
    
    Make class simple without generic:
    1) reformat code
    2) replace all < TKey,TValue > with "" ,besides replaceAll( UnaryOperator< TKey > operator )
    3) replace all <> with ""           (click MATCH CASE)
    4) uncomment < Type1,Type2 >
    5) replace all TKey with Type1
    6) replace all TValue with Type2
    

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

example 1a
		Map.Entry<String,String> v_e1 = Map.entry("01k","01v");
		Map.Entry<String,String> v_e2 = Map.entry("02k","02v");
		My2Map< String, String > m1 = new My2Map<String,String> (v_e1,v_e2);
		m1.put( "03k","03v" );
		My2Map< String, String > m2 = new My2Map<String,String> ("k1","v1","k2","v2");
		m2.put( "03k","03v" );
		

		for( Map.Entry< String, String > i : m2.entrySet() )
			{
			log_.debug   ("Main main for: "+i);
			}


* example 2

     ${NAME} v_obj = new ${NAME}(Map.entry("1",1),Map.entry("2",2));
    
* example 3
    
    ${NAME} v_obj = new ${NAME}(someMap);
    
* example 4    
     ${NAME} v_obj =  ${NAME}.of(Map.entry("1",1),Map.entry("2",2));
    
* example 5    
     ${NAME} v_obj =  ${NAME}.of(someMap);
     
example 5

    ${NAME} v_obj = new ${NAME}("key1","value1");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9","key10","value10");
    

example 7

    ${NAME} v_obj = ${NAME}.of();
    ${NAME} v_obj = ${NAME}.of("key","value");
    ${NAME} v_obj = ${NAME}.of(("key1","value1","key2","value2");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9","key10","value10");
    
    
     
*
*
* }</pre>
*/    
/*@Immutable*/                                                 
public final class ${NAME} <TKey,TValue>
    extends HashMap< TKey,TValue > /*< Type1,Type2 >*/
    implements Serializable
	{
	
	#parse("constantsForMap.java")
	
	 #parse("log.java")
	    
	    
	
	   
	 private TValue  defaultValue_()         {         return null;         }
	
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
	
	 
    
	private ${NAME}( int initialCapacity,float loadFactor )
		{
		super( initialCapacity, loadFactor );

        #parse("throwdontuse")

		}
	
  
    
    #parse("checkimmutable.java")
    
    

	
	
   
   
	
	
	/**
	 * constructor with OBJECT(map)
	 * Analogically to usual collections
	 * <p>
	 * (!) DEEP copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}(someMap);
	 *
	 *
	 * }</pre>
	 */
	public ${NAME}(@NotNull  Map< ? extends TKey, ? extends TValue > map )
		{
		super(  map );
		
		assertForNullProperties_();
        assertForValidProperties_();
		assertForConsistencyProperties_();		
		}
	
	
	
  
	private ${NAME}(@NotNull  Iterator< Entry< ? extends TKey, ? extends TValue > > iterator )
		{
		this();
		Entry< ? extends TKey, ? extends TValue > e;
		while( iterator.hasNext() )
			{
			e = iterator.next();
			super.put( e.getKey() ,
			           e.getValue() );
			}
			
		assertForNullProperties_();
        assertForValidProperties_();
		assertForConsistencyProperties_();		
		}
		
	 
	
	/**
	 * fabric with ALL PARAMS (vararg of entries)
	 * Analogically to List.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj =  ${NAME}.of(Map.entry("1",1),Map.entry("2",2));
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > ofEntries(@NotNull  Entry< ? extends TKey, ? extends TValue >... entries )
		{
		return new ${NAME}<>((Map) Map.ofEntries( entries ) );
		}
	
	
	
	/**
	 * fabric with OBJECT(map)
	 * Analogically to usual collections
	 * <p>
	 * (!) SHALLOW copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj =  ${NAME}.copyOf(someMap);
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > copyOf(@NotNull  Map< ? extends TKey, ? extends TValue > map )
		{
		return new ${NAME}<>( map );
		}
	
	
	
	/**
	 * fabric with OBJECTdeep(map)
	 * <p>
	 * <p>
	 * (!) DEEP copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           TwoImmutableStringList v_obj =  TwoImmutableStringList.deepCopyOf(someMap);
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue, E extends Map< ? extends TKey, ? extends TValue > & Serializable > ${NAME}< TKey, TValue > deepCopyOf(@NotNull  E map )
		{ 
		return copyOf( (E) SerializationUtils.clone( map ) );
		}
	
	 
	
	
	/**
	 * fabric with paramter 0
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of();
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of()
		{
		return new ${NAME}<>();
		}
	
	
	
	/**
	 * fabric with paramter 1
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key","value");
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of(@NotNull  TKey k1 ,
	                                                          @NotNull   TValue v1 )
		{
		return new ${NAME}<>( Map.of( k1 ,
		                                   v1 ) );
		}
	
	
	
	/**
	 * fabric with paramter 2
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2");
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of(@NotNull  TKey k1 ,
	                                                          @NotNull   TValue v1 ,
	                                                          @NotNull   TKey k2 ,
	                                                          @NotNull   TValue v2 )
		{
 
		
		return new ${NAME}<>( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ) );
		}
	
	
	
	/**
	 * fabric with paramter 3
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *          ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3");
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of(@NotNull  TKey k1 ,
	                                                          @NotNull   TValue v1 ,
	                                                          @NotNull   TKey k2 ,
	                                                          @NotNull   TValue v2 ,
	                                                          @NotNull   TKey k3 ,
	                                                          @NotNull   TValue v3 )
		{
 
		
		return new ${NAME}<>( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ) );
		}
	
	
	
	/**
	 * fabric with paramter 4
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4");
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of(@NotNull  TKey k1 ,
	                                                          @NotNull   TValue v1 ,
	                                                          @NotNull   TKey k2 ,
	                                                          @NotNull   TValue v2 ,
	                                                          @NotNull   TKey k3 ,
	                                                          @NotNull   TValue v3 ,
	                                                          @NotNull   TKey k4 ,
	                                                          @NotNull   TValue v4 )
		{
 
		return new ${NAME}<>( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ) );
		}
	
	
	
	/**
	 * fabric with paramter 5
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *          ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of(@NotNull  TKey k1 ,
	                                                          @NotNull   TValue v1 ,
	                                                          @NotNull   TKey k2 ,
	                                                          @NotNull   TValue v2 ,
	                                                          @NotNull   TKey k3 ,
	                                                          @NotNull   TValue v3 ,
	                                                          @NotNull   TKey k4 ,
	                                                          @NotNull   TValue v4 ,
	                                                          @NotNull   TKey k5 ,
	                                                          @NotNull   TValue v5 )
		{
 
		
		return new ${NAME}<>( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ) );
		}
	
	
	
	/**
	 * fabric with paramter 6
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6");
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of(@NotNull  TKey k1 ,
	                                                          @NotNull   TValue v1 ,
	                                                          @NotNull   TKey k2 ,
	                                                          @NotNull   TValue v2 ,
	                                                          @NotNull   TKey k3 ,
	                                                          @NotNull   TValue v3 ,
	                                                          @NotNull   TKey k4 ,
	                                                          @NotNull   TValue v4 ,
	                                                          @NotNull   TKey k5 ,
	                                                          @NotNull   TValue v5 ,
	                                                          @NotNull   TKey k6 ,
	                                                          @NotNull   TValue v6 )
		{
 
		
		return new ${NAME}<>( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ,
		                                   k6 ,
		                                   v6 ) );
		}
	
	
	
	/**
	 * fabric with paramter 7
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *          ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7");
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of(@NotNull  TKey k1 ,
	                                                          @NotNull   TValue v1 ,
	                                                          @NotNull   TKey k2 ,
	                                                          @NotNull   TValue v2 ,
	                                                          @NotNull   TKey k3 ,
	                                                          @NotNull   TValue v3 ,
	                                                          @NotNull   TKey k4 ,
	                                                          @NotNull   TValue v4 ,
	                                                          @NotNull   TKey k5 ,
	                                                          @NotNull   TValue v5 ,
	                                                          @NotNull   TKey k6 ,
	                                                          @NotNull   TValue v6 ,
	                                                          @NotNull   TKey k7 ,
	                                                           @NotNull  TValue v7 )
		{
 
		
		return new ${NAME}<>( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ,
		                                   k6 ,
		                                   v6 ,
		                                   k7 ,
		                                   v7 ) );
		}
	
	
	
	/**
	 * fabric with paramter 8
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8");
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of(@NotNull  TKey k1 ,
	                                                          @NotNull   TValue v1 ,
	                                                          @NotNull   TKey k2 ,
	                                                          @NotNull   TValue v2 ,
	                                                          @NotNull   TKey k3 ,
	                                                          @NotNull   TValue v3 ,
	                                                          @NotNull   TKey k4 ,
	                                                          @NotNull   TValue v4 ,
	                                                          @NotNull   TKey k5 ,
	                                                          @NotNull   TValue v5 ,
	                                                          @NotNull   TKey k6 ,
	                                                          @NotNull   TValue v6 ,
	                                                          @NotNull   TKey k7 ,
	                                                          @NotNull   TValue v7 ,
	                                                          @NotNull   TKey k8 ,
	                                                          @NotNull   TValue v8 )
		{
 
		
		return new ${NAME}<>( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ,
		                                   k6 ,
		                                   v6 ,
		                                   k7 ,
		                                   v7 ,
		                                   k8 ,
		                                   v8 ) );
		}
	
	
	
	/**
	 * fabric with paramter 9
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9");
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of(@NotNull  TKey k1 ,
	                                                          @NotNull   TValue v1 ,
	                                                          @NotNull   TKey k2 ,
	                                                          @NotNull   TValue v2 ,
	                                                          @NotNull   TKey k3 ,
	                                                          @NotNull   TValue v3 ,
	                                                          @NotNull   TKey k4 ,
	                                                          @NotNull   TValue v4 ,
	                                                          @NotNull   TKey k5 ,
	                                                          @NotNull   TValue v5 ,
	                                                          @NotNull   TKey k6 ,
	                                                          @NotNull   TValue v6 ,
	                                                          @NotNull   TKey k7 ,
	                                                          @NotNull   TValue v7 ,
	                                                          @NotNull   TKey k8 ,
	                                                          @NotNull   TValue v8 ,
	                                                          @NotNull   TKey k9 ,
	                                                          @NotNull   TValue v9 )
		{

		
		return new ${NAME}<>( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ,
		                                   k6 ,
		                                   v6 ,
		                                   k7 ,
		                                   v7 ,
		                                   k8 ,
		                                   v8 ,
		                                   k9 ,
		                                   v9 ) );
		}
	
	
	
	/**
	 * fabric with paramter 10
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9","key10","value10");
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > of(@NotNull  TKey k1 ,
	                                                          @NotNull   TValue v1 ,
	                                                          @NotNull   TKey k2 ,
	                                                          @NotNull   TValue v2 ,
	                                                          @NotNull   TKey k3 ,
	                                                          @NotNull   TValue v3 ,
	                                                          @NotNull   TKey k4 ,
	                                                          @NotNull   TValue v4 ,
	                                                          @NotNull   TKey k5 ,
	                                                          @NotNull   TValue v5 ,
	                                                          @NotNull   TKey k6 ,
	                                                          @NotNull   TValue v6 ,
	                                                          @NotNull   TKey k7 ,
	                                                          @NotNull   TValue v7 ,
	                                                          @NotNull   TKey k8 ,
	                                                          @NotNull   TValue v8 ,
	                                                          @NotNull   TKey k9 ,
	                                                          @NotNull   TValue v9 ,
	                                                          @NotNull   TKey k10 ,
	                                                          @NotNull   TValue v10 )
		{
 
		return new ${NAME}<>( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ,
		                                   k6 ,
		                                   v6 ,
		                                   k7 ,
		                                   v7 ,
		                                   k8 ,
		                                   v8 ,
		                                   k9 ,
		                                   v9 ,
		                                   k10 ,
		                                   v10 ) );
		}
	
	 
	
	/**
	 * fabric with parameter = Iterable type
	 * <p>
	 * <p>
	 * (!) SHALLOW copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           TwoImmutableStringList v_obj =  TwoImmutableStringList.copyOf(someCollection);
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > copyOf(@NotNull  Iterable< Entry< ? extends TKey, ? extends TValue > > iterable )
		{ 
		return iterable instanceof Collection ? copyOf( (Collection) iterable ) : copyOf( iterable.iterator() );
		}
	
	
	
	/**
	 * fabric with parameter = Iterable type
	 * <p>
	 * <p>
	 * (!) DEEP copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           TwoImmutableStringList v_obj =  TwoImmutableStringList.deepCopyOf(someCollection);
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue, E extends Iterable< Entry< ? extends TKey, ? extends TValue > > & Serializable > ${NAME}< TKey, TValue > deepCopyOf(@NotNull  E iterable )
		{
		return copyOf( (E) SerializationUtils.clone( iterable ) );
		}
	

	
	
	
	/**
	 * fabric with parameter = Iterator type
	 * <p>
	 * <p>
	 * (!) SHALLOW copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           TwoImmutableStringList v_obj =  TwoImmutableStringList.copyOf(someCollection.iterator());
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue > ${NAME}< TKey, TValue > copyOf(@NotNull  Iterator< Entry< ? extends TKey, ? extends TValue > > iterator )
		{
		return new ${NAME}<>( iterator );
		}
	
	
	
	/**
	 * fabric with parameter = Iterator type
	 * <p>
	 * <p>
	 * (!) DEEP copying of IMMUTABLE-property-objects in constructor

	8) для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	- для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	- они называются conversion constructors / conversion factories 

	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           TwoImmutableStringList v_obj =  TwoImmutableStringList.deepCopyOf(someCollection.iterator());
	 *
	 *
	 * }</pre>
	 */
	public static < TKey, TValue, E extends Iterator< Entry< ? extends TKey, ? extends TValue > > & Serializable > ${NAME}< TKey, TValue > deepCopyOf(@NotNull  E iterator )
		{
		return copyOf( (E) SerializationUtils.clone( iterator ) );
		}
	
	
	
    
    
    
    

 
    
   

	/**                         
	*   unsupported for immutable
    */ 	
     @Override 
     @Deprecated
     public void clear() { throw exception_(); }

	/**                         
	*   unsupported for immutable
    */         
        @Override
        @Deprecated 
        final public TValue compute(TKey key, BiFunction<? super TKey,? super TValue,? extends TValue> rf) { throw exception_(); }
 
 	/**                         
	*   unsupported for immutable
    */        
        @Override 
        @Deprecated
        final public TValue computeIfAbsent(TKey key, Function<? super TKey,? extends TValue> mf) { throw exception_(); }
 
 	/**                         
	*   unsupported for immutable
    */        
        @Override 
        @Deprecated
        final public TValue computeIfPresent(TKey key, BiFunction<? super TKey,? super TValue,? extends TValue> rf) { throw exception_(); }

	/**                         
	*   unsupported for immutable
    */         
        @Override 
        @Deprecated
        final public TValue merge(TKey key, TValue value, BiFunction<? super TValue,? super TValue,? extends TValue> rf) { throw exception_(); }

	/**                         
	*   unsupported for immutable
    */         
        @Override 
        @Deprecated
        final public TValue put(TKey key, TValue value) { throw exception_();}
 
 	/**                         
	*   unsupported for immutable
    */        
        @Override
        @Deprecated
        final  public void putAll(Map<? extends TKey,? extends TValue> m) { throw exception_();}
 
 	/**                         
	*   unsupported for immutable
    */        
        @Override
        @Deprecated
        final  public TValue putIfAbsent(TKey key, TValue value) { throw exception_(); }

	/**                         
	*   unsupported for immutable
    */         
        @Override 
        @Deprecated
        final public TValue remove(Object key) { throw exception_(); }
 
 	/**                         
	*   unsupported for immutable
    */        
        @Override 
        @Deprecated
        final public boolean remove(Object key, Object value) { throw exception_();}
 
 	/**                         
	*   unsupported for immutable
    */        
        @Override
        @Deprecated
        final  public TValue replace(TKey key, TValue value) { throw exception_(); }

	/**                         
	*   unsupported for immutable
    */         
        @Override 
        @Deprecated
        final public boolean replace(TKey key, TValue oldValue, TValue newValue) { throw exception_(); }
 
 	/**                         
	*   unsupported for immutable
    */       
        @Override 
        @Deprecated
        final public void replaceAll(BiFunction<? super TKey,? super TValue,? extends TValue> f) { throw exception_(); }

    
	
	
	
    #parse("implementation.java")



    #parse("checkLogAssertMapGeneric.java")


	 

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
