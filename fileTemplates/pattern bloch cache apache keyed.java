public class Computer
	{
	public String one;
	public String two;
	public String three;
	}
    
    
public class MyFactory2 extends BaseKeyedPooledObjectFactory<String, Computer >
	{
    @Override
	public Computer create( final String k )
	throws Exception
		{
		Computer c= new Computer();
		c.one=k;
		return  c;
		}
	
	
	
	@Override
	public PooledObject< Computer > wrap( final Computer computer )
		{
		return new DefaultPooledObject< Computer >( computer );
		}
	}
	
	


		GenericKeyedObjectPool<String,Computer> p1=new GenericKeyedObjectPool<>( new MyFactory2() );
		System.out.println( "pooll " + p1.getNumActive() + " " + p1.getNumIdle() );
		try
			{
			Computer o1 = p1.borrowObject("one");
			Computer o2 = p1.borrowObject("two");
			}
		catch( final Exception exception )
			{
			System.out.println("some error" );
			}
		System.out.println( "pooll " + p1.getNumActive() + " " + p1.getNumIdle() );
		p1.close();	
	    