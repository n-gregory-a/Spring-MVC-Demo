package gn.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

   private String[] coursePrefixes;

   public void initialize(CourseCode constraint) {
      coursePrefixes = constraint.value();
   }

   public boolean isValid(String code, ConstraintValidatorContext context) {

      boolean result = false;

      if (code != null) {
          //
          // loop thru course prefixes
          //
          //check to see if code matches any of the course prefixes
          //
          for (String tempPrefix: coursePrefixes
               ) {
              result = code.startsWith(tempPrefix);

              // if we found a match then break out of the loop
              if (result) {
                  break;
              }
          }

      } else {
         return true;
      }

      return result;
   }
}
