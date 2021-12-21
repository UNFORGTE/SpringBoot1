package cn.tedu.jd.show.service.impl;

import cn.tedu.jd.show.model.Users;
import cn.tedu.jd.show.mapper.UsersMapper;
import cn.tedu.jd.show.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tedu.cn
 * @since 2021-12-15
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
