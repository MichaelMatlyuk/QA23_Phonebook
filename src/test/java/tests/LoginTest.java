package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void preCondition(){
        //if SignOut present --->logout
        if(app.getHelperUser().isLogged()){
            app.getHelperUser().logout();
        }
    }

    @Test
    public void loginSuccess() {
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("misha123@gmail.com", "Polaris@!090300");
        app.getHelperUser().submitLogin();


        Assert.assertTrue(app.getHelperUser().isLogged());
//        Assert.assertEquals();
//        Assert.assertTrue();
//        Assert.assertNotEquals();
//        Assert.assertFalse();

    }

    @Test
    public void loginSuccessModel() {
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("misha123@gmail.com", "Polaris@!090300");
        app.getHelperUser().submitLogin();


        Assert.assertTrue(app.getHelperUser().isLogged());
    }
}
