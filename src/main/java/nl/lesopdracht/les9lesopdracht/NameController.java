package nl.lesopdracht.les9lesopdracht;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NameController {
    //variabelen
    private List<String> names = new ArrayList<>();

    //endpoint post mapping
    @PostMapping("/add")
    public String addName(@RequestParam String name){
        names.add(name);
        return "De naam: " + name + " is toegevoegd aan de lijst.";
    }

    //endpoint get mapping lijst met individuele namen
    //endpoint get mapping
    @GetMapping("/show")
    public String showNames(){
        StringBuilder allNames = new StringBuilder();
        for (String name : names) {
            allNames.append("Hallo ").append(name).append("\n");
        }
        return allNames.toString();
    }
}
