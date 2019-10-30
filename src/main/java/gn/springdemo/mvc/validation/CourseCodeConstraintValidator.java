package gn.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

   private String corsePrefix;

   public void initialize(CourseCode constraint) {
      corsePrefix = constraint.value();
   }

   public boolean isValid(String code, ConstraintValidatorContext context) {

      boolean result;
      if (code != null) {
         result = code.startsWith(corsePrefix);
      } else {
         return true;
      }

      return result;
   }
}
