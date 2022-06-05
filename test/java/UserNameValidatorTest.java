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

}
