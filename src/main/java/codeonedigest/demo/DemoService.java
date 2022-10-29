package codeonedigest.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String myServiceMethod() {
        throw new RuntimeException("Demo Exception");
    }
}
