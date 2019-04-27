	
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
	
	 

	private ${NAME} assertForNullProperties_(  )
		{
		for(var v : this.entrySet() )
			{
			Objects.requireNonNull( v.getValue() );
			}
        return this;    
		}
	
	 
	
	private ${NAME} assertForValidProperties_( )
		{
		
		for( var e : this.entrySet() )
			{
			if( e.getValue().equals( defaultValue_()) )
				{
				throw new IllegalArgumentException(elementIsNullMessage_(e) );
				}
			
			}
		return this;	
		}
	
	

	private ${NAME} assertForConsistencyProperties_( )
		{
		if(  this.isEmpty() )
			{
			throw new IllegalStateException( emptyCollectionMessage_() );
			}
        return this;    
		}
	
	 
	
	private ${NAME} logForNullProperties_(  )
		{
 
 
		for( var e : this.entrySet() )
			{
			if( e.getValue() == null )
				{
				log_.info( elementIsNullMessage_(e) );
				}
		 	
			}
        return this;    
		}
	 
	
	private ${NAME} logForValidProperties_( )
		{
	 
		for( var e : this.entrySet() )
			{
			if( e.getValue().equals(defaultValue_()) )
				{
				log_.info( elementIsDefaultMessage_(e) );
				}
		 	
			}
        return this;    
		}
	
	 
	
	private ${NAME} logForConsistencyProperties_( )
		{
		 
        return this;    
		}
	
	private void setDefaultValuesForUnsettedProperties_()
	    {
 
	    }