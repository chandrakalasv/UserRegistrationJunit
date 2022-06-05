import com.bl.java.UserValidator;
import org.junit.Assert;
import org.junit.Test;

public class UserNameValidatorTest {
    @Test
    public void givenFirstName_WhenProperFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidName("Ashaaa");
        Assert.assertEquals(true, result);
    }
}
