package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//롬복에서 지원해 주는 어노테이션
//@Slf4j
// 리턴타입 문자가 HTTP 바디에 반환이 된다.
@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        //순서대로 로그 레벨
        log.trace("trace log= {}", name);
        log.debug("debug log= {}", name);
        log.info("info log= {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        //로그를 사용하지 않아도 a+b 계산 로직이 먼저 실행됨, 이런 방식으로 사용하면 X
        log.debug("String concat log=" + name);

        return "ok";
    }
}
