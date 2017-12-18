package com.biz.std.controller;

import com.biz.std.service.MarkService;
import com.biz.std.vo.MarkVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author serena
 * @date 2017/12/12
 */
@Controller
public class MarkController {
    @Autowired
    private MarkService markService;

    @RequestMapping(value = "/addScore", method = RequestMethod.POST)
    public String addScore(float[] scores, int[] subjectId, int studentId) {
        markService.addScore(subjectId, scores, studentId);
        return "redirect:/studentMain";
    }

    @RequestMapping("/studentAddSubject")
    public String addSubject(MarkVO markVO){
        markService.studentAddSubject(markVO);
        return "redirect:/studentMain?curPage=1";
    }
}