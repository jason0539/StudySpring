package lzh.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author daoming.lzh
 * @Date: 2021/12/10 下午1:40
 */
@Controller
public class UserController {
    @RequestMapping(value = "/user/detail")
    @ResponseBody
    public Object userDetail() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1001);
        map.put("username", "张起灵");
        return map;
    }

    @RequestMapping(value = "/user/detail/page")
    public String userPageDetail(Model model) {
        model.addAttribute("id", 1001);
        model.addAttribute("username", "小哥");
        return "userDetail";
    }
}
