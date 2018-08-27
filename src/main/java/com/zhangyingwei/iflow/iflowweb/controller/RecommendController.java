package com.zhangyingwei.iflow.iflowweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangyw
 * @date: 2018/08/27
 * @desc: 为您推荐
 */

@Controller
@RequestMapping("/recommend")
public class RecommendController {

    @GetMapping
    public String index() {
        return "recommend";
    }
}
