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
@TableName("dogtype")
public class Dogtype implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("dogtype")
    private String dogtype;

    @TableField("from_area")
    private String fromArea;

    @TableField("nature")
    private String nature;

    @TableField("price")
    private Double price;

    @TableField("dog_id")
    private Integer dogId;

    @TableField("score")
    private Double score;

    /**
     * 更新时间
     */
    @TableField("createtime")
    private LocalDateTime createtime;

    @TableField("dog_no")
    private Integer dogNo;

    @TableField("img_url")
    private String imgUrl;

    @TableField("detail_img")
    private String detailImg;


}
