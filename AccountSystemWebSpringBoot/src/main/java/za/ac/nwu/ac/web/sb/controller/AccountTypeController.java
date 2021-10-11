package za.ac.nwu.ac.web.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nuw.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.domain.service.GeneralResponse;


@RestController
public class AccountTypeController {
    @GetMapping("/all")
    public GeneralResponse<String> getAll(){return new GeneralResponse<String>(successful: true, payload: "No types found");
    }
}

