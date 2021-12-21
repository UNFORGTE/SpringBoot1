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
@TableName("users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 手机号码
     */
    @TableField("phone_no")
    private String phoneNo;

    @TableField("password")
    private String password;

    @TableField("nickname")
    private String nickname;

    /**
     * 更新时间
     */
    @TableField("createtime")
    private LocalDateTime createtime;

    @TableField("enable")
    private Integer enable;

    @TableField("locked")
    private Integer locked;

    @TableField("user_id")
    private Integer userId;


}
