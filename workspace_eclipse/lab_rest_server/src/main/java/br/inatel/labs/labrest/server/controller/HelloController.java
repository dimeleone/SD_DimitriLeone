package br.inatel.labs.labrest.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @autor dimitri.leone
 * @since 06.05.2023
 */


@RestController
@RequestMapping("hello")
public class HelloController {

	@GetMapping
	public MyMessage processarGetHello() {
		MyMessage msg = new MyMessage();
		msg.setInfo("Olá mundo REST");
		return msg;
	}
}
