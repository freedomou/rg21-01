import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Product;
import utils.MybatisUtils;

import java.util.List;

public class OrdersTest {
    @Test
    public  void testp(){
        SqlSession session = MybatisUtils.getSession();
        List<Product> ls = session.selectList("mapper.ProductMapper.findProductsByOid", 1);
        System.out.println(ls);
        
    }
}
