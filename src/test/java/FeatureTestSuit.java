import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import testRunner.*;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        //BookingTest.class,
        //MainPageLoadedTest.class
        SearchProductsTest.class,
        PreSubmitProductTest.class,
        CheckPricesOnCartPageTest.class,
        SubmisionProductTest.class,
        CheckReturningCustomerPageTest.class
})

public class FeatureTestSuit {

    // the class remains empty,
    // used only as a holder for the above annotations
}

