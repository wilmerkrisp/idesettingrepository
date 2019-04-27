    private static final String ARGUMENT_IS_DEFAULT_MESSAGE_ = "Argument is empty/default: ";       

    private static final String UNSUPPORTED_OPERATION_EXCEPTION_MESSAGE_= "The class is immutable. Don't use CrUD methods.";
	
	private static final UnsupportedOperationException exception_()
		{
		return new UnsupportedOperationException( UNSUPPORTED_OPERATION_EXCEPTION_MESSAGE_ );
		}

    
    
    
    
    