package com.example.demo.entity;

//import 你自己的父类实体,没有就不用设置!;
import com.baomidou.mybatisplus.annotation.TableField;

import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;
import lombok.*;
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
public class User {

    private static final long serialVersionUID = 1L;
    @TableField("user_id")
    private Integer user_id;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("role_id")
    private String role_id;

    @TableField("reputation")
    private Integer reputation;

    @TableField("grade")
    private Integer grade;

    @TableField("major")
    private String major;


}
