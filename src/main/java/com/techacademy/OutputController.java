package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class OutputController {

        @PostMapping("/output")
        public String postOutput(@RequestParam(name = "val", required = false) String val, Model model) {
            // フォームから送信されてきた値をModelに登録
            model.addAttribute("val", val);
            // output.htmlに画面遷移
            return "output";
        }
        @PostMapping("/input")
        public String previous(@RequestParam(name = "val", required = false) String val, Model model) {
            // フォームから送信されてきた値をModelに登録
            model.addAttribute("val", val);
            // output.htmlに画面遷移
            return "output";
        }
}
