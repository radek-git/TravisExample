import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void checkSum() {
        MatcherAssert.assertThat(2 + 2, CoreMatchers.is(4));
    }


    @Test
    public void checkSubstract() {
        Assert.assertThat(10-2, CoreMatchers.is(8));
    }

    
}
