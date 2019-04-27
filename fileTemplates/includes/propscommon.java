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
	


   /**
	 * Returns the property at the specified position in this object.
	 *
	 * @param index
	 * 	index of the property to return
	 *
	 * @return the property at the specified position in this object
	 *
	 * @throws IndexOutOfBoundsException
	 * 	{@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
    public <E> E get(int index) 
        {
        Objects.checkIndex(index, size() );
        
         #if(${uncomment1}==1)
        //<editor-fold desc=".">
        /*
        switch (index)
                {
                    case 0:
                        return (E)item1;
                    case 1:
                        return (E)item2;
                    default:
                        return (E)item3;
                }
        */        
        //</editor-fold>
        #end        
        
        return (E)stringTwo;        
        }
    
    /**
	 * Returns the number of elements in this object.
	 *
	 * @return the number of elements in this object
	 */
	public int size()
		{
		return size_;
		}
