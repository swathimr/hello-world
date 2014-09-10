package hello

import org.springframework.web.bind.annotation.{RequestMapping, RestController}
import org.springframework.stereotype.Controller
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration


/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author saung
 * @since 1.0
 */
 
@RestController
@EnableAutoConfiguration
class HelloConfig {
	
	@RequestMapping(value=Array("/"))
     def test():String = {
	 "HelloWorld"
    }
}