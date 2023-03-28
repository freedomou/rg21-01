import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Customer;
import utils.MybatisUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerTest {
    @Test
    public void testCustomer() {
        SqlSession session = MybatisUtils.getSession();
        Customer c = new Customer();
        c.setUsername("jack");
        c.setJobs("");

        List<Customer> list = session.selectList("mapper.CustomerMapper.findCustomerByNameAndJobs", c);
        System.out.println(list);

        session.close();
    }

    @Test
    public void testCustomer2() {
        SqlSession session = MybatisUtils.getSession();
        Customer c = new Customer();
        c.setUsername("joy");
        c.setJobs("teacher");
        c.setId(1);

       session.update("mapper.CustomerMapper.updateCustomerBySet",c);
        session.commit();
        session.close();
    }

    @Test
    public void testCustomer3() {
        SqlSession session = MybatisUtils.getSession(); // 获取SqlSession
        List<Integer> roleIds =new ArrayList<>(); // 创建数组，封装查询id
        roleIds.add(2);
        roleIds.add(3);
        Map<String,List> myids=new HashMap<>();
        myids.put("ids",roleIds);
        // 执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("mapper.CustomerMapper.findByArray", myids);
        for (Customer customer : customers)
        {System.out.println(customer);}
        session.close();


    }






}
