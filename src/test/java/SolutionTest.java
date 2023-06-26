import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minSwapsTest1(){
        String s = "111000";
        int expected = 1;
        int actual = new Solution().minSwaps(s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minSwapsTest2(){
        String s = "010";
        int expected = 0;
        int actual = new Solution().minSwaps(s);

        Assert.assertEquals(expected, actual);
    }

}
