
##import org.apache.logging.log4j.LogManager;
##import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.*;                     //@NotNull
import com.google.errorprone.annotations.Immutable;     //@Immutable

##import com.google.common.flogger.FluentLogger;          //log
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.text.MessageFormat.format;           //format string
import java.util.ResourceBundle;

import com.google.common.collect.*;                     //ImmutableList

import static com.google.common.base.Preconditions.*;   //checkArgument
//import static life.expert.common.base.Preconditions.*;  //checkCollection
import static org.apache.commons.lang3.Validate.*;      //notEmpty(collection)
import static life.expert.common.base.Objects.*;        //deepCopyOfObject

import java.util.function.*;                            //producer supplier
import static cyclops.function.Memoize.*;               //memoizeSupplier
import static java.util.stream.Collectors.*;            //toList streamAPI
import static java.util.function.Predicate.*;           //isEqual streamAPI

import java.util.Optional;

##import com.google.gson.Gson;
##import static com.google.common.truth.Truth.*;
##import static com.google.common.truth.Truth8.*;

##import static life.expert.common.reactivex.LogUtils.*;
##import static io.reactivex.Observable.*;
##import static io.reactivex.schedulers.Schedulers.*;

##import static reactor.core.publisher.Flux.*;
import static reactor.core.publisher.Mono.*;
import static reactor.core.scheduler.Schedulers.*;
import static life.expert.common.async.LogUtils.*;

import static io.vavr.API.*;
import static io.vavr.Predicates.*;
import io.vavr.collection.List;

//@Header@
//--------------------------------------------------------------------------------
//
//                          ${PROJECT_NAME}  ${PACKAGE_NAME}
//                           ${USER} ${YEAR}/${MONTH}/${DAY}
// 
//--------------------------------------------------------------------------------



 