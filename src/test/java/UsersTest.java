import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import pojo.Users;
import utils.MybatisUtils;

public class UsersTest {
    @Test
    public void testFindUserAndOrdersByUid(){
        SqlSession session = MybatisUtils.getSession();
        Users user=session.selectOne("mapper.UsersMapper.findUserAndOrdersByUid",1);
        System.out.println(user);
    }
}
