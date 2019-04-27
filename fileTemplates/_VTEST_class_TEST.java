#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.*;
//import static org.junit.Assert.*;
import org.junit.jupiter.api.*;
import static  org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import static com.google.common.truth.Truth.*;

#parse("File Header.java")

//<editor-fold desc=".">
/* test class

*/
//</editor-fold>
	
	
/**                             class for testing
* <pre>{@code
*
*
* example 1
*           
*   
*
* }</pre>
*/
@DisplayName("description of the testFILE")
public class ${NAME}_TEST
	{
	
	
	
	##parse("fields.java")
	
	
	//////////////////////////////////////////////////////////////////////////////////
    //
    //                              variables
    //
    //////////////////////////////////////////////////////////////////////////////////  

    //<editor-fold desc=".">
    /*  variable
    
    privateFinal public protectedPackage _package_ NOFINAL
    
    */
    //</editor-fold>
    
  	/**
	 * variable test
	 * <pre>{@code
	 *
	 *
	 *      1) создать макет класса
	 *              @RunWith( MockitoJUnitRunner.class ) не может быть испоьзован одновременно с mock()
	 *              @Mock
	 *
	 *
	 *
	 *
	 * }</pre>
	 */
    
    private String  c_test ;           



    
    
    
    
    
    
    
    ##parse("constructors.java")
    
    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              static initializers
    //
    //////////////////////////////////////////////////////////////////////////////////  

	@BeforeAll
	public static void before( )
		{
		System.out.println( "_BEFORE_" );
		}
	@AfterAll
	public static void after( )
		{
		System.out.println( "_AFTER_" );
		}
	
	
	
	
	
	
	
	
	
	
	##parse("methods.java")
	//////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods
    //
    //////////////////////////////////////////////////////////////////////////////////  

    //<editor-fold desc=".">
    /*  before
    
    	 *
	 *      1) создать макет класса
	 *              VC_one v_obj2=mock(VC_one.class);
	 *
    
    */
    //</editor-fold>
    
    
	/**
	 * test method
	 * <pre>{@code
	 *

	 *
	 * }</pre>
	 */
	@BeforeEach
	public void method_before( )
		{
		//<editor-fold desc=".">
        /*  additionally
        
        System.out.println( "_before_" );
		
		init all class variables here
        
        */
        //</editor-fold>
        
        

		c_test= new String("test string"); 
		}
	
	
	
	
	
    //<editor-fold desc=".">
    /*  test method
    
    	 *      1) используем проверки
	 *              assertEquals( a,b );          assertNotEquals( a,b );
	 *              assertTrue( true );           assertFalse( false );
	 *              assertNull( null );           assertNotNull( null );
	 *
	 *
	 *
	 *
	 *      2) when-then pattern
	 *              ЕСЛИ на вход методу придет аргумент 10 ТО метод вернет 12
	 *              when( v_obj2.f_method1("10"  ) ).thenReturn( "12" );
	 *
	 *         when(i.next()).thenReturn("Hello").thenReturn("World");
	 *              Если Вы укажете более одного возвращаемого значения, они будут возвращены методом последовательно,
	 *              пока не вернётся последнее, после этого при последующих вызовах будет возвращаться только последнее значение
	 *
	 *         when (anyString())
	 *              любая строка
	 	 *         when (any(VV.class))
	 *              любой объект класса
	 *
	 *         @Test(expected=Exception.class)
	 *         doThrow(new Exception () ).when(v_obj2).f_test();
	 *              вернуть эксепшен у пустого метода
	 *
	 *
	 *      3) мы проверяем что в макете был реально вызван данный метод, иначе тест провалится
	 *              verify( v_obj2 ).f_test();
	 *
	 *
	 *      4) узнать параметр переданный вызванному методу макета
	 *              //создаем шпион для Item
	 *               ArgumentCaptor<Item> v_zahvat=ArgumentCaptor.forClass( Item.class );
	 *               //создаем макет для некого класса
	 *               mySessionStorage v_1=mock( mySessionStorage.class);
	 *               //где то в коде методу макета передадут Item
	 *               v_1.storeTop( new myItem() );
	 *               //узнаем в тесте что было передано при вызове storeTop
	 *               verify( v_1 ).storeTop( v_zahvat.capture() );
	 *               System.out.println( v_zahvat.getValue());
    
    
    
    @Test(expected=Exception.class)
    */
    //</editor-fold>
        
        
	/**
	 *                             test method
	 * <pre>{@code
	 *

	 *
	 *
	 * }</pre>
	 */
	
	@Test
	@DisplayName("description of the test")
	public void method_test( )
		{
		//<editor-fold desc=".">
        /*  additionally
        
        
        
        */
        //</editor-fold>
        
		assertThat( "none" ).startsWith( "none" );
		
		assertEquals( c_test,"test string" );
		}
	
	
	
	
//	@AfterEach
//	public void method_after( )
//		{
//		//System.out.println( "_after_" );		
//		}
		
		
	}
