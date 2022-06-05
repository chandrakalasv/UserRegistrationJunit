import com.bl.java.UserValidator;
import org.junit.Assert;
import org.junit.Test;

public class UserNameValidatorTest {
    @Test
    public void givenFirstName_WhenProperFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidFirstName("Ashaaa");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenProperFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidLastName("Ushaaa");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidMailId("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenMobileNumber_WhenValidFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidMobileNumber("91 9875674839");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenMinimum8Char_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidPassword("9AA56&od");
        Assert.assertEquals(true, result);
    }


}
