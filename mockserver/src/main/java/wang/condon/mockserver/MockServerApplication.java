package wang.condon.mockserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class MockServerApplication {

    @RequestMapping(value = "/api/{pathVariable}",
            method = RequestMethod.POST,
            headers = {"Content-Type=application/json"})
    ResponseModel dealPost(
            @PathVariable String pathVariable,
            @RequestBody ResponseModel responseModel,
            @RequestHeader("AccessToken") String accessToken) {
        return new ResponseModel(pathVariable, responseModel.getName(), accessToken);
    }


    @RequestMapping(value = "/api/{pathVariable}",method = RequestMethod.GET)
    ResponseModel dealGet(@PathVariable String pathVariable) {
        return new ResponseModel(pathVariable, null, null);
    }
    

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MockServerApplication.class, args);
    }
}
