import org.junit.*;

public class Test {

    @org.junit.Test
    public void Res()
    {
        Multiply mul = new Multiply(3, 5);
        int result = mul.Result();

        Assert.assertEquals(15, result);
    }
}
