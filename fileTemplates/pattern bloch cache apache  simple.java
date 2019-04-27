public class Computer
	{
	public String one;
	public String two;
	public String three;
	}
    

public class MyFactory
	extends BasePooledObjectFactory< Computer >
	{

	@Override
	public Computer create()
	throws Exception
		{
		
		return new Computer();
		}
	
	
	@Override
	public PooledObject< Computer > wrap( final Computer computer )
		{
		return new DefaultPooledObject< Computer >( computer );
		}

	}
	
	 
		GenericObjectPool< Computer > p = new GenericObjectPool<>( new MyFactory() );
		System.out.println( "pooll " + p.getNumActive() + " " + p.getNumIdle() );
		try
			{
			Computer o1 = p.borrowObject();
			Computer o2 = p.borrowObject();
			}
		catch( final Exception exception )
			{
			System.out.println("some error" );
			}


		System.out.println( "pooll " + p.getNumActive() + " " + p.getNumIdle() );
		p.close();	    