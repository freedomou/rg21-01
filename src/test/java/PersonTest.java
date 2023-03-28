import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Customer;
import pojo.IdCard;
import pojo.Person;
import utils.MybatisUtils;

import java.util.List;

public class PersonTest {
    @Test
    public void test1(){
        SqlSession session = MybatisUtils.getSession();
        Person person =session.selectOne("mapper.PersonMapper.findPersonById",1);
        System.out.println(person);
        session.close();
    }
    @Test
    public void test2(){
        SqlSession session = MybatisUtils.getSession();
        IdCard card =session.selectOne("mapper.IdCardMapper.findIdCardById",1);
        System.out.println(card);
        session.close();
    }
}
