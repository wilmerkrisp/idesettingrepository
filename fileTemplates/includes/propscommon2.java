	/**
	 * Returns {@code true} if this object contains only null elements.
	 *
	 * @return {@code true}
	 */
	public boolean isEmpty()
		{
		for( var i = 0 ;
		     i < size() ;
		     i++ )
			{
			if( get( i ) != null )
				{
				return false;
				}
			}
		return true;
		}
	



