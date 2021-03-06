package org.processmining.contexts.uitopia.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface UITopiaVariant {

	public final static String USEPLUGIN = "Use Plugin Name";
	public final static String USEVARIANT = "Use Variant Name";

	public final static String EHV = "Netherlands";
	public final static String POSTECH = "Pohang University of Science and Technology";

	String uiLabel() default USEPLUGIN;

	String uiHelp() default USEPLUGIN;

	String affiliation();

	String email();

	String author();

	String website() default "http://www.processmining.org";

	String pack() default "";
}
