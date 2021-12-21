package cn.tedu.jd.show.service.impl;

import cn.tedu.jd.show.model.Orders;
import cn.tedu.jd.show.mapper.OrdersMapper;
import cn.tedu.jd.show.service.IOrdersService;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
