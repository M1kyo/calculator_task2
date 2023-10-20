package com.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.entity.Expression;
import com.demo.mapper.ExpressionMapper;
import com.demo.service.ExpressionService;
@Service
public class ExpressionServiceImpl extends ServiceImpl<ExpressionMapper, Expression> implements ExpressionService{

    @Override
    public List<Expression> getDescList(Integer size) {
        return baseMapper.getDescList(size);
    }
}
