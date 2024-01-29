package com.karelys.karelysspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServ calculatorServ;

    public CalculatorController(CalculatorServ calculatorServ) {
        this.calculatorServ = calculatorServ;
    }

    @GetMapping
    public String hello() {
        return calculatorServ.hello();
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculatorServ.calculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String sumCalculator(@RequestParam(value = "num1", required = false) int num1,
                                @RequestParam(value = "num2", required = false) int num2) {
        return calculatorServ.sumCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam(value = "num1", required = false) int num1,
                                  @RequestParam(value = "num2", required = false) int num2) {
        return calculatorServ.minusCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam(value = "num1", required = false) int num1,
                                     @RequestParam(value = "num2", required = false) int num2) {
        return calculatorServ.multiplyCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam(value = "num1", required = false) int num1,
                                   @RequestParam(value = "num2", required = false) int num2) {
        return calculatorServ.divideCalculator(num1, num2);
    }
}
