package com.udemy.springmvc.learning.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // указывает что применимо только к полям класса
@Retention(RetentionPolicy.RUNTIME) // тоесть должно выполняться во время выполнения кода
@Constraint(validatedBy = CheckEmailValidator.class)
// указываем класс который будет обрабатывать
// тоесть содержать логику обработки нашей аннотации @CheckEmail
public @interface CheckEmail {
  public String value() default "xyz.com";

  public String message() default "email must ends with xyz.com";

  public Class<?>[] groups() default {};

  public Class<? extends Payload>[] payload() default {};
}
