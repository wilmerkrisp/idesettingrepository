#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")



/**



- общие константы помещены во вспомогательный класс 
    - с private конструкторами чтобы его нельзя было создать
    - данный класс будет сокртыт (от доступа извне) модульной системой Java

     1) константой допускается 
        - примитивное значение  
        - ссылка на немутабельный объект
    
     2) рекомендуется вместо констант использовать функции возвращающие константное значение
        - чтобы более гибко потом можно было поменять возвращаемое значение  
     
     3) рекомендуется использовать перечисления вместо статических констант
    

*/
public class ${NAME} 
    {
    
    private ${NAME}()
		{   
        super();

        #parse("throwdontuse")
		}
    
    private static final String ELEMENT_IS_NULL_MESSAGE_ = "Element is null: ";
    private static final String ELEMENT_IS_DEFAULT_MESSAGE_ = "Element is empty/default: ";
    private static final String EMPTY_COLLECTION_MESSAGE_ ="Collection should not be empty.";
    
        
    public static final String  elementIsNullMessage(String ...messages)
        {
        return ELEMENT_IS_NULL_MESSAGE_;
        }
    public static final String  elementIsDefaultMessage(String ...messages)
        {
        return ELEMENT_IS_DEFAULT_MESSAGE_;
        }
    public static final String  emptyCollectionMessage(String ...messages)
        {
        return EMPTY_COLLECTION_MESSAGE_;
        }  
        
    }
