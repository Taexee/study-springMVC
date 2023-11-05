package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {
        String name = "spring";

        System.out.println("name = " + name); // 시스템 콘솔 이용

        log.trace(" trace log={}", name);
        log.debug(" trace log={}", name);
        log.info(" info log={}", name);
        log.warn(" info log={}", name);
        log.error(" info log={}", name);

        return "ok";
    }
}
