/**
 * This is a custom annotation
 */
package com.epam.customAnnotation;
/**
 * @author Ananya_Goel
 */
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME) 
public @interface BookAnnotation {
	String authorName();
	String title();
	String publisher();
}
