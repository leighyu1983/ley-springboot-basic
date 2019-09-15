package com.ley.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                //get，set
@NoArgsConstructor   //无参构造
@AllArgsConstructor  //有参构造
@TableName("account")
public class Account {

    //@TableId(value = "id",type = IdType.AUTO)//指定自增策略
    @TableId(value = "id")
    private String id;
    @TableField("name")
    private String name;
    @TableField("address")
    private String address;
}
