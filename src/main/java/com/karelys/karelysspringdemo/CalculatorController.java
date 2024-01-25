package com.karelys.karelysspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final HelloService helloService;

    public CalculatorController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/calculator")
        public String calculator(){
        return helloService.calculator();
    }
    @GetMapping(path = "/calculator/plus")
    public String sumCalculator(@RequestParam(value = "num1", required = false) int num1,
                                @RequestParam(value = "num2", required = false) int num2) {
        return helloService.sumCalculator(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam(value = "num1", required = false) int num1,
                                  @RequestParam(value = "num2", required = false) int num2) {
        return helloService.minusCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam(value = "num1", required = false) int num1,
                                     @RequestParam(value = "num2", required = false) int num2) {
        return helloService.multiplyCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam(value = "num1", required = false) int num1,
                                   @RequestParam(value = "num2", required = false) int num2) {
        return helloService.divideCalculator(num1, num2);
    }
}
