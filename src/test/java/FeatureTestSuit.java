import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import testRunner.BookingTest;
import testRunner.MainPageLoadedTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        BookingTest.class,
        MainPageLoadedTest.class
})

public class FeatureTestSuit {

    // the class remains empty,
    // used only as a holder for the above annotations
}

