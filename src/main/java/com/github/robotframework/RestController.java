package com.github.robotframework;


import com.github.robotframework.domain.SquareRoot;
import com.github.robotframework.utils.SquareRootCalcer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/calc")
public class RestController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<SquareRoot> sayHello(@RequestParam(value = "inputValue", required = true) double input) {
        double output = SquareRootCalcer.calc(input);
        if(Double.isNaN(output)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.ok(new SquareRoot(input, output));
    }
}
