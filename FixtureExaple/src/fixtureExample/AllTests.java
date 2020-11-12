package fixtureExample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FixtureExampleTest.class, FixtureExampleTest2.class })
public class AllTests {

}
