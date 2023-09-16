package jenkins.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("spring/")
public class JenkinsDockerController {

    @GetMapping("jenkins")
    public String dockerApplication() {
        System.out.println("젠킨스 콜링");
        // 
        return "spring/jenkins";
    }
}
