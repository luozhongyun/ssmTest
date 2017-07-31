package com.huikedu.app.action;

import com.huikedu.app.entity.Actor;
import com.huikedu.app.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * @author dhc
 * @version V1.0
 * @date 17/7/21
 */
@Controller
@Scope("prototype")
@RequestMapping("/actorAction")
public class ActorAction {

    @Autowired
    private IActorService actorService;

    @RequestMapping("/showAllActors")
    public String showAllActors(Model model) {
        //1 调用业务逻辑层方法查询出所有的演员
        List<Actor> actorList = actorService.showAllActors();
        //2 把集合存放request范围之内
        model.addAttribute("actorList", actorList);
        //3 转发到下一个页面
        return "forward:/index.jsp";
    }
}
