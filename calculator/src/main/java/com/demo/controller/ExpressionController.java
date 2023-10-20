package com.demo.controller;

import com.demo.common.Result;
import com.demo.entity.Expression;
import com.demo.service.ExpressionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expression")
public class ExpressionController {

    @Autowired
    private ExpressionService expressionService;

    @GetMapping("/list")
    public Result<List<Expression>> list(
            @RequestParam(defaultValue = "10") Integer size){
        return Result.success(expressionService.getDescList(size));
    }

    @PostMapping("/add")
    public void save(@RequestBody Expression expression){
        expressionService.save(expression);
    }

}
