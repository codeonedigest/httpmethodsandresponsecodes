package codeonedigest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping(value = "/testresponsecode")
    public String exceptionTest() {
        return demoService.myServiceMethod();
    }


    @RequestMapping
    public String defaultMapping(){
        return "Welcome to Springboot Demo!!";
    }






    @GetMapping(value = "/getuser/{user}")
    @ResponseBody
    public String getUser(@PathVariable String user){
        System.out.println("Fetching user - " + user);
        // call service or repo class.
        return "Hello "  + user;
    }

    @PostMapping(value = "/createuser")
    @ResponseBody
    public String createUser(@RequestBody DemoUser user) {
        System.out.println("Creating User - " + user.getName() + " " + user.getAge());
        //call service or repo class
        return user.getName() + " user is created";
    }


    @PutMapping(value = "/updateuser")
    @ResponseBody
    public String updateUser(@RequestBody DemoUser user) {
        System.out.println("Updating User - " + user.getName() + " " + user.getAge());
        //call service or repo class
        return user.getName() + " user is updated";
    }


    @DeleteMapping(value = "/deleteuser/{user}")
    @ResponseBody
    public String deleteUser(@PathVariable String user) {
        System.out.println("Deleting User - " + user);
        //call service or repo class
        return user + " is deleted";
    }


}
