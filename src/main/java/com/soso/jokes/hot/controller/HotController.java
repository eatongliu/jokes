package com.soso.jokes.hot.controller;

import com.soso.jokes.hot.entity.Joke;
import com.soso.jokes.hot.service.HotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by liuyutong on 2018/7/12.
 */
@Controller
public class HotController {

    @Autowired
    private HotService hotService;

    @RequestMapping("hot/")
    public String hotJokes(Model model) {
        Long totalCount = hotService.totalCount();
        if (totalCount > 3000) totalCount = 3000L;
        model.addAttribute("totalCount", totalCount);
        model.addAttribute("hotJokes", null);
        return "hot/list";
    }

    @RequestMapping("hot/page")
    @ResponseBody
    public List<Joke> hotPageJokes(@RequestParam Integer offset, @RequestParam Integer limit) {
        return hotService.hotJokePage(offset, limit);
    }
}
