package addis.learning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    @RequestMapping("/")
    /*public String sayHello(){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
    }*/
    public void grading(){
        System.out.println("Enter your test score: ")
        Scanner scanner=new Scanner(System.in);
        int testScore=scanner.nextLine();

        System.out.println(input);
    }
}