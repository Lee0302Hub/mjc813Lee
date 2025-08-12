package com.examplecoop.springexam.Service;

import com.examplecoop.springexam.Repository.ContactDTO;
import com.examplecoop.springexam.Repository.searchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/spInf")
public class ContactController {
    @Autowired
    private ContactService cs;

    /// insert
    @PostMapping("/insert")
    public String inData(@ModelAttribute ContactDTO ct) {

        cs.inData(ct);
        return "redirect:/spInf/select?cntPage=2&curPage=1";
    }

    ///select
    @GetMapping("/select")
    public String selData(@RequestParam("cntPage") int cntPage, @RequestParam("curPage") int curPage, Model m) {
        searchDTO sdt = new searchDTO((cntPage <= 0 ? 2 : cntPage), 0, curPage);

        m.addAttribute("list",cs.selData(sdt));
        m.addAttribute("curPage", curPage);
        return "spInf";
    }

    ///delete
    @GetMapping("/delete")
    public String delData(@RequestParam Long id) {
        cs.delData(id);

        return "redirect:/spInf/select?cntPage=2&curPage=1";
    }

    ///update
    @GetMapping("/update")
    public String upData(@RequestParam Long id, @RequestParam String col, @RequestParam String modify) {
        cs.upData(id, col, modify);
        return "redirect:/spInf/select?cntPage=2&curPage=1";
    }
}
