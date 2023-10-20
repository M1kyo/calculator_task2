package com.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "expression")
public class Expression {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 显示的表达式
     */
    @TableField(value = "expression")
    private String expression;

    /**
     * 计算出来的结果
     */
    @TableField(value = "result_number")
    private String resultNumber;

    /**
     * 展示
     */
    @TableField(value = "demonstrate")
    private String demonstrate;

    public static final String COL_ID = "id";

    public static final String COL_EXPRESSION = "expression";

    public static final String COL_RESULT_NUMBER = "result_number";

    public static final String COL_DEMONSTRATE = "demonstrate";
}