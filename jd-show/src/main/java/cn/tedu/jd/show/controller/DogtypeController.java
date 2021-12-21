package cn.tedu.jd.show.controller;


import cn.tedu.jd.show.service.IDogtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tedu.cn
 * @since 2021-12-15
 */
@RestController
@RequestMapping("/show/dogtype")
public class DogtypeController {
    //企业开放中，一般会指定当前控制器方法相应的get请求还是
    //post请求，分别使用GetMapping和PostMapping设置路径
    //localhost:8080/show/dogtype/get
    @Autowired
    private IDogtypeService dogtypeService;
    @GetMapping("/dog_detail")
    public List getData(){
        return dogtypeService.getData();
    }
    @GetMapping("/{dogId}/dog_home")
    public List getDog(@PathVariable Integer dogId){
       // System.out.println(dogId+"--------------------------------");
        System.out.println(dogtypeService.getDog(dogId));
        return dogtypeService.getDog(dogId);
    }
}
