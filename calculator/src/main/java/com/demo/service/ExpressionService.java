package com.demo.service;

import com.demo.entity.Expression;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ExpressionService extends IService<Expression>{


    List<Expression> getDescList(Integer size);
}
