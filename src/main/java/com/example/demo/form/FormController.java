package com.example.demo.form;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.SampleDao;
import com.example.demo.entity.EntForm;

@Controller
public class FormController {
    // SampleDaoの用意
    private final SampleDao sampledao;

    @Autowired
    public FormController(SampleDao sampledao) {
        this.sampledao = sampledao;
    }

    @RequestMapping("/keijiban")
    public String keijiban(Model model) {
        // データベースからリストを取得してモデルに追加
        List<EntForm> list = sampledao.searchDb();
        model.addAttribute("dbList", list);
        model.addAttribute("title", "掲示板");
        return "form/keijiban";
    }

    @RequestMapping("/boardgame")
    public String bordgame(Form form) {
        return "form/boardgame";
    }

    @RequestMapping("/karaoke")
    public String karaoke(Form form) {
        return "form/karaoke";
    }

    @RequestMapping("/basketball")
    public String basketball(Form form) {
        return "form/basketball";
    }

    @RequestMapping("/football")
    public String football(Form form) {
        return "form/football";
    }

    @RequestMapping("/snowboard")
    public String snowboard(Form form) {
        return "form/snowboard";
    }

    @RequestMapping("/add")
    public String add(Model model, Form form) {
        EntForm entform = new EntForm();
        entform.setName(form.getName());
        entform.setComment(form.getComment());
        entform.setDatetime(new Date());
        sampledao.insertDb(entform);

        List<EntForm> list = sampledao.searchDb();
        model.addAttribute("dbList", list);
        model.addAttribute("title", "一覧ページ");
        return "redirect:/keijiban";
    }

    // 削除(DELETE)
    @RequestMapping("/del/{id}")
    public String destroy(@PathVariable Long id) {
        sampledao.deleteDb(id);
        return "redirect:/keijiban";
    }

    @RequestMapping("/form")
    public String requestform(Form form1) {
        return "form/input";
    }

    @RequestMapping("/top")
    public String top1(Form form2) {
        return "form/top1"; // HTMLファイルの名前を返す
    }
    
    @RequestMapping("/complete")
    public String complete(Form form3) {
        return "form/complete";
    }
}
