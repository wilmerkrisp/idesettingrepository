#if(${uncomment1}==1) 
        //<editor-fold desc=".">
        /*
        Вывод сообщений логов log4j
        log_.debug   ( "msg" );     use for default
        log_.info    ( "msg" );
        log_.warn    ( "msg" );
        log_.error   ( "msg" );
        */
        //</editor-fold>	
#end

##private static final Logger log_ = LogManager.getLogger( ${NAME}.class );
        
        
        private static final ResourceBundle bundle_=ResourceBundle.getBundle( "messages");
	    private static final String HELLO_MESSAGE_ = bundle_.getString( "hello" );
	
			
	private static final Logger logger_= LoggerFactory.getLogger( ${NAME}.class );
	
	private static final void log_( String format ,
	                                Object... arguments )
		{
		logger_.info( format , arguments );
		}
	
	
	
	private static final void logAtError_( String format ,
	                                Object... arguments)
		{
		logger_.error( format , arguments );
		}
	
 #if(${uncomment1}==1)    
        //<editor-fold desc=".">
        /*
        Версия класса
            - Используется при десиариализации
            - При каждом добавлении сериализуемых свойств, увеличиваем  serialVersionUID = текущей дате
        */
        //</editor-fold>
#end
        
        ////private static final long serialVersionUID = ${YEAR}${MONTH}${DAY}L;
    
    

    