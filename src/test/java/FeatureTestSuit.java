import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import testRunner.BookingTest;
import testRunner.LoggingToTheSiteTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        BookingTest.class,
        LoggingToTheSiteTest.class
})

public class FeatureTestSuit {

    // the class remains empty,
    // used only as a holder for the above annotations
}

