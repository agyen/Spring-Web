package io.turntabl.Spring.Web.controller;

import com.sun.media.sound.SF2InstrumentRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {
    @Autowired
    private Maths calc;

    @RequestMapping("/add")
    public Number addition(@RequestParam(value = "a") String a, @RequestParam(value = "b") String b)
    {
        Integer num1 = Integer.parseInt(a);
        Integer num2 = Integer.parseInt(b);
        return new Number(this.calc.add(num1, num2));
    }

    @RequestMapping("/subtract")
    public Number subtraction(@RequestParam(value = "a") String a, @RequestParam(value = "b") String b){
        Integer num1 = Integer.parseInt(a);
        Integer num2 = Integer.parseInt(b);
        return new Number(this.calc.subtract(num1, num2));
    }

}
