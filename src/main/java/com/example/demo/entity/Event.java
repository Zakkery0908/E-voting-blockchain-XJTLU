package com.example.demo.entity;

//import 你自己的父类实体,没有就不用设置!;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2022-07-27
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
//@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Event {

    private static final long serialVersionUID = 1L;

    private String candidatename;

    @TableField("eventID")
    private Integer eventID;

    @TableId("userID")
    private String userID;

    @TableField("Major")
    private String Major;

    @TableField("Grade")
    private Integer Grade;


}
