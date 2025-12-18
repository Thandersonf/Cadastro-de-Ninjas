package Missoes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissaoController {

    @GetMapping("tb_missoes")
    public String tabMissoes(){
        return " Tabela de missoes";
    }
}
