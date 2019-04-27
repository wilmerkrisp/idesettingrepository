#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             class thread (autorun)
*

*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft

* <pre>{@code
*
* example 1
*       ${NAME} v_obj = new ${NAME}("thread one");
*
* example 2
*		${NAME} v_thread1 = new ${NAME}( "thread one" );
*		${NAME} v_thread2 = new ${NAME}( "thread two" );
*		try
*			{
*			do
*				{
*				Thread.sleep( 100 );
*				log.info( "VV_class info main thread" );
*				}
*			while( v_thread1.c_thread.isAlive() || v_thread2.c_thread.isAlive() );
*			}
*		catch( final Exception p_exception )
*			{
*			
*			System.out.println( "______________________Thread interrupted: " );
*			}
*
*
* example 3
*           VV_somesubclass             extends ${NAME} implements VI_, Runnable
*           VV_somesubclass<g_param>    extends ${NAME} implements VI_, Runnable
*
* }</pre>
*
*
*
*/

//  public protected _package_ final                     
//  extends VC_          implements VI_          , Runnable      
//  extends VCG_<String> implements VIG_<String> , Runnable 
//  public interface ${NAME}<g_param> implements VIG_<g_param> ,Runnable     
public class ${NAME} implements Runnable 
    {


    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              variables
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         log4j debug massage
    *
    * <pre>{@code                   
    *
    * example 1
    *           log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.info    ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.warn    ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.error   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
    *
    * example 2
    *
    *
    * }</pre>
    *
    *
    */  
    private static final Logger log = LogManager.getLogger( ${NAME}.class );

    /**                         variable thread
    *
    * <pre>{@code                   
    *
    * example 1
    *           this.c_test
    *
    * example 2
    *
    *
    * }</pre>
    *
    *
    */
    //      private public protected _package_ final   
    public final Thread  c_thread;                    
    
	/**
	 * stop thread
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 * example 2
	 *
	 *
	 * }</pre>
	 */
	private  boolean c_stop = false;
	
	synchronized public  void setC_stop( )
		{
		this.c_stop = true;
		this.c_pause = false;
		notify( );
		}
	
	
	/**
	 * pause thread
	 *
	 * <pre>{@code
	 *
	 * example 1
	 *
	 * example 2
	 *
	 *
	 * }</pre>
	 */
	private  boolean c_pause = false;
	
	synchronized public  void setC_pause( boolean p_pause )
		{
		this.c_pause = p_pause;
		if( !p_pause )
			{
			notify( );
			}
		}
	
	public  boolean isC_pause( )
		{
		
		return c_pause;
		}

    
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              constructors
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         constructor default
    *                           
    * <pre>{@code                   
    *
    * exapmle 1
    *           ${NAME} v_obj = new ${NAME}();
    *
    * example 2
    *
    *
    * }</pre>
    *
    *
    */
    //      private public protected  _package_
    //      throws Exception  
    public ${NAME} ()                           
        {
        this("vova thread");
        }
    
    /**                         constructor with parameter: thread name
    *                           
    * <pre>{@code                   
    *
    * exapmle 1
    *           ${NAME} v_obj = new ${NAME}("param");
    *
    * example 2
    *
    *
    * }</pre>
    *
    *
    */
    //      private public protected _package_  
    //      throws Exception  
    public ${NAME} (final String p_threadName)                 
        {
        //super(p_1);   OR this(p_1,"")
        this.c_thread = new Thread(this,p_threadName);
        this.c_thread.start();
        }


    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method run (main cycle)
    *
    * <pre>{@code                   
    *
    * example 1
    *           v_obj.f_test();
    *
    * example 2
    *           
    *
    * }</pre>
    *
    *
    */
    //      private public protected _package_ final  
    //      throws Exception  
    public  void    run()                    
        {
        try
			{
			//                              LOOP FOR
			for( int v_i = 1 ;
			     v_i <= 1_0 && c_stop == false ;
			     v_i++ )
				{
				//break continue
				//System.out.println(v_i);
				this.f_test();
								
				synchronized( this )
					{
					while( this.c_pause )
						{
						this.wait( );
						}
					if( this.c_stop )
						{
						break;
						}
					}

				}

			}
		catch( final InterruptedException p_exception )
			{
			//again interrupt thread
			Thread.currentThread.interrupt();
			
			log.error   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  Thread interrupted: " +c_thread.getName());
			}
        
        return;
        } 


    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method test
    *
    * <pre>{@code                   
    *
    * example 1
    *           v_obj.f_test();
    *
    * example 2
    *           
    *
    * }</pre>
    *
    *
    */
    //      private public protected _package_ final  
    //      throws Exception  
    public  void    f_test()  throws InterruptedException                    
        {
        //throw new Exception( "vError" );
        log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_test: "+c_thread.getName() );
        //
        Thread.sleep(400);
        //
        return;
        } 
    
    }
