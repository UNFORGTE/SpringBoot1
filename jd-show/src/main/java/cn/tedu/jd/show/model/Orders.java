package cn.tedu.jd.show.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author tedu.cn
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("order_no")
    private Integer orderNo;

    @TableField("user_id")
    private Integer userId;

    @TableField("dog_id")
    private Integer dogId;

    @TableField("phone_no")
    private String phoneNo;

    @TableField("note")
    private String note;

    @TableField("state_no")
    private Integer stateNo;

    @TableField("address")
    private String address;

    @TableField("name")
    private String name;

    /**
     * 更新时间
     */
    @TableField("createtime")
    private LocalDateTime createtime;


}
