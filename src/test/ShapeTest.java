import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class ShapeTest {
    @Test
    void ShapeByNumberTest(){
        ShapeFactory shape1 = new ShapeFactory(18);
        Assertions.assertEquals(shape1.paint, Color.RED);
        ShapeFactory shape2 = new ShapeFactory(77);
        Assertions.assertEquals(shape2.paint.getClass(),GradientPaint.class);
    }
}
