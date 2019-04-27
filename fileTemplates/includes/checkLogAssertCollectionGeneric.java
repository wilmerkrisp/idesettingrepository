	
	/**
	 * Check properties of object for null value
	 * return true if object is valid and properties is NOT null
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForNullProperties(  )
		{
		assertForNullProperties_(   );
		return true;
		}
	
	
	
	/**
	 * Check properties of object for valid value
	 * return true if object is valid and properties is valid
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForValidProperties(  )
		{
		assertForValidProperties_(   );
		return true;
		}
	
	
	
	/**
	 * Check consistency of properties of object
	 * return true if object is valid
	 *
	 * <pre>{@code
	 *
	 *
	 * }</pre>
	 */
	public boolean checkForConsistencyProperties(  )
		{
		assertForConsistencyProperties_(   );
		return true;
		}
	
	 

	private ${NAME}< ? extends TKey > assertForNullProperties_(  )
		{
		for(var e : this )
			{
			Objects.requireNonNull( e );
			}
        return this;    
		}
	
	 
	
	private ${NAME}< ? extends TKey > assertForValidProperties_( )
		{
		int i=0;
		for( var e : this )
			{
			if( e.equals( defaultElement_()) )
				{
				throw new IllegalArgumentException(elementIsNullMessage_(i) );
				}
			i++;
			}
		return this;	
		}
	
	

	private ${NAME}< ? extends TKey > assertForConsistencyProperties_( )
		{
		if(  this.isEmpty() )
			{
			throw new IllegalStateException( emptyCollectionMessage_() );
			}
        return this;    
		}
	
	 
	
	private ${NAME}< ? extends TKey > logForNullProperties_(  )
		{
 
		int i=0;
		for( var e : this )
			{
			if( e == null )
				{
				log_.info( elementIsNullMessage_(i)  );
				}
			i++;	
			}
        return this;    
		}
	 
	
	private ${NAME}< ? extends TKey > logForValidProperties_( )
		{
		int i=0;
		for( var e : this )
			{
			if( e.equals(defaultElement_()) )
				{
				log_.info( elementIsDefaultMessage(i)  );
				}
			i++;	
			}
        return this;    
		}
	
	 
	
	private ${NAME}< ? extends TKey > logForConsistencyProperties_( )
		{
		 
        return this;    
		}
	
	private void setDefaultValuesForUnsettedProperties_()
	    {
 
	    }