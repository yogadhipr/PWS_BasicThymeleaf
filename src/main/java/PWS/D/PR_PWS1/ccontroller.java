/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PWS.D.PR_PWS1;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author TUF GAMING
 */
@Controller
public class ccontroller {
    @RequestMapping("/hasil")
    public String openHasil(HttpServletRequest data, 
                            @RequestParam (value="vara") String newVara,
                            @RequestParam (value="varb") String newVarb,
                            Model modelHasil){
        
         
        modelHasil.addAttribute("fromIndexA", newVara);
        modelHasil.addAttribute("fromIndexB", newVarb);
        
        String iVara = data.getParameter("vara");
        String iVarb = data.getParameter("varb");
        
        Double inputVara = Double.valueOf(iVara);
        Double inputVarb = Double.valueOf(iVarb);
        
        Double hasiltambah = inputVara + inputVarb;
        
        modelHasil.addAttribute("hasil", hasiltambah);
        return "Hasil";
    }               
}
