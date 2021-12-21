package cn.tedu.jd.show.mapper;

import cn.tedu.jd.show.model.Dogtype;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* <p>
    *  Mapper 接口
    * </p>
*
* @author tedu.cn
* @since 2021-12-15
*/
    //将当前对象保存到spring容器中，限定数据访问层
    //Component注解与这个作用相同
    @Repository
    public interface DogtypeMapper extends BaseMapper<Dogtype> {
        @Select("select * from dogtype where dog_id=#{dogId};")
        List selectBydogId(Integer dogId);

}
