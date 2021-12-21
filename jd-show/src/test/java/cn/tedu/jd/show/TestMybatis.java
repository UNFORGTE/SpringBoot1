package cn.tedu.jd.show;

import cn.tedu.jd.show.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//必须添加这个注解才能测试SpringBoot项目，否则空指针异常
@SpringBootTest
public class TestMybatis {
    @Autowired
    UsersMapper usersMapper;

}
