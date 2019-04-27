#if(${uncomment1}==1)
        //////////////////////////////////////////////////////////////////////////////////
        //  implementations                              
        //////////////////////////////////////////////////////////////////////////////////
        //<editor-fold desc=".">
        /* implementations
        
        (1) Base class AbstractList already has a good implementation of
            - EQUALS,
            - HASHCODE,
            - shallow CLONE
        
        (2) Do not use default clone, use copy deep constructor and fabric
        
    
        */
        //</editor-fold>
#end

        /**
         * classic overrided method
         * toString
         *
         
         *    для больших объектов или объектов, состояние которых трудно представить в виде строки. 
 *      	  В таких случаях метод toString должен возвращать такие резюме, как «MyClass (1487536 peoples)»

         
         * <pre>{@code
         *
         *
         * }</pre>
         */
        @Override
        public String toString()
            {
            var addr=Integer.toHexString(System.identityHashCode(this));
            return "${NAME}@"+addr+" "+ super.toString()  ;
            }