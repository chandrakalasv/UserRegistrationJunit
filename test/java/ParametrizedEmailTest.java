import com.bl.java.UserValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

//public class ParametrizedEmailTest {
//    class EmailVerification {
//        public boolean validateEmail(final String gmail) {
//            return Pattern.matches("^(abc)([+-.]?[\\da-z])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$", gmail);
//        }
//    }

    @RunWith(Parameterized.class)
    public class ParametrizedEmailTest {
        private  String email;
        private  boolean expectedResult;

        public ParametrizedEmailTest(String  email, Boolean expectedResult){
            this.email = email;
            this.expectedResult = expectedResult;
        }
        @Parameterized.Parameters
        public static Collection input() {
            return Arrays.asList(new Object[][] {{"abc@yahoo.com", true},
                    {"abc-100@yahoo.com", true},
                    {"abc.100@yahoo.com", true},
                    {"abc111@abc.com", true},
                    {"abc-100@abc.net", true},
                    {"abc@1.com", true},
                    {"abc.100@abc.com.au", true},
                    {"abc@gmail.com.com", true},
                    {"abc+100@gmail.com", true},

                    {"abccom", false},
                    {".abc@.com.my", false},
                    {"abc123@gmail.a", false},
                    {"abc123@.com", false},
                    {"abc123@.com.com", false},
                    {"abc()*@gmail.com", false},
                    {"abc@%*.com", false},
                    {"abc.@gmail.com", false},
                    {"abc@abc@gmail.com", false},
            });
        }

        @Test
        public void givenEmail_WhenProper_ShouldReturnAsPerCondition() {
            UserValidator obj = new UserValidator();
            boolean result = obj.userValidSampleMail.test(email);
            Assert.assertEquals(this.expectedResult, result );
        }
    }

