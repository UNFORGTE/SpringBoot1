package cn.tedu.jd.show.service;

import cn.tedu.jd.show.model.Dogtype;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tedu.cn
 * @since 2021-12-15
 */
public interface IDogtypeService extends IService<Dogtype> {

    //获取所有狗的信息
    List getData();
    //通过dogId获得单个狗子的信息
    List getDog(Integer dogId);
}
