package com.mindtree.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Column 
{
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface column
{
	String name();
	String type();
}
}
