package test.interfaces;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IdAnnotation {
	int id();

}
