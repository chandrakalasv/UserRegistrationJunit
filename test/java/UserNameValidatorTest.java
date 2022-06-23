import com.bl.java.UserValidator;
import org.junit.Assert;
import org.junit.Test;

public class UserNameValidatorTest {
    @Test
    public void givenFirstName_WhenProperFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userFirstName.test("Ashaaa");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_WhenImProperFormat_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userFirstName.test("ashaaa");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenProperFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userLastName.test("Ushaaa");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenImProperFormat_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userLastName.test("gshaaa");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidMailId.test("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail_WhenInValid_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidMailId.test("abc.xyz@bl.c.in");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenMobileNumber_WhenValidFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidMobileNumber.test("91 9875674839");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenMobileNumber_WhenInValidFormat_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidMobileNumber.test("91 987567483");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidPassword.test("DJ89i&ot");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenInValid_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidPassword.test("DJ89i&o");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenSampleMail_WhenValid_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidSampleMail.test("abc@yahoo.com");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenSampleMail_WhenInValid_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidSampleMail.test("ab@.yahoo.com");
        Assert.assertEquals(false, result);
    }
}
