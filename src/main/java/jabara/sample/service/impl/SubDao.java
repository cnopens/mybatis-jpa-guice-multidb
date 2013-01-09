/**
 * 
 */
package jabara.sample.service.impl;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

/**
 * @author jabaraster
 */
@BindingAnnotation
@Target({ FIELD, PARAMETER, METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SubDao {
    //
}
