package cn.tedu.jd.show.service.impl;

import cn.tedu.jd.show.model.Dogtype;
import cn.tedu.jd.show.mapper.DogtypeMapper;
import cn.tedu.jd.show.service.IDogtypeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tedu.cn
 * @since 2021-12-15
 */
@Service
public class DogtypeServiceImpl extends ServiceImpl<DogtypeMapper, Dogtype> implements IDogtypeService {

    @Autowired
    private DogtypeMapper dogtypeMapper;

    @Override
    public List getData() {
        List dogType=dogtypeMapper.selectList(null);

        return dogType;
    }

    @Override
    public List getDog(Integer dogId) {
        //System.out.println(dogId+"--------------------------------");
        QueryWrapper<Dogtype> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("dog_id",dogId);
        List dog =dogtypeMapper.selectList(queryWrapper);
        //System.out.println(dog);
        return dog;
    }
}
