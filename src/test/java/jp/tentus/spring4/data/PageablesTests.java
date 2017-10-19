package jp.tentus.spring4.data;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.domain.Pageable;

public class PageablesTests {

    /**
     * fromOffset の挙動を確認します。
     */
    @Test
    public void testFromOffset() {
        Pageable pageable = Pageables.fromOffset(1, 10, null);

        Assert.assertEquals(pageable.getOffset(), 1);
        Assert.assertEquals(pageable.getPageSize(), 10);
    }

}
