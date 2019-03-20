package com.dev10000.springbootwar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 示例控制器
 */
@Controller
@RequestMapping()
public class HelloController {

    /**
     * 返回Json
     * @return
     */
    @ResponseBody
    @RequestMapping("testJson")
    public Map<String,Object> testJson(){
        Map<String,Object> result=new HashMap<>();
        result.put("name","app");
        return result;
    }
    /**
     * 返回界面
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
