
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
@Controller
public class JavaController {
    @RequestMapping("/tampil")
    public String getData (Model model, HttpServletRequest param){
        String data = param.getParameter("tampilkan");
        tampil hitung = new tampil ();
//        double hrg_byr = hitung.pembayaran(Double.parseDouble(data));
//        
//        model.addAttribute("data1", hrg_byr);
        
        return "";
    }
}
