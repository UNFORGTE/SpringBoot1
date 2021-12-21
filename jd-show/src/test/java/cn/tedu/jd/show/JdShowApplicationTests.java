/*package cn.tedu.jd.show;

import cn.tedu.jd.show.mapper.DogMapper;
import cn.tedu.jd.show.vo.dogtype;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JdShowApplicationTests {
    //从spring容器中获得对象，按type获取
    @Autowired(required = false)
    DogMapper dogMapper;
    @Test
    void contextLoads() {
        //查询dog表中的价格和分数
        dogtype dogType =dogMapper.selectById(1);
        System.out.println(dogType);
    }

}*/
