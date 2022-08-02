package com.example.demo.entity;

//import 你自己的父类实体,没有就不用设置!;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;
/*实体类对应的是一张表 核新配置：如何连接数据  映射文件：sQL语句如何操作数据库*/
/**
 * <p>
 *
 * </p>
 *
 * @author jobob
 * @since 2022-07-27
 */
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
//@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class UE {

    private static final long serialVersionUID = 1L;
    @TableField("id")
    private Integer id;

    @TableField("user_id")
    private String user_id;

    @TableField("event_id")
    private Integer event_id;

    @TableField("flag")
    private String flag;

    @TableField("vote")
    private String vote;



}
