package com.task.mgn.auth.controller;

import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/400")
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	public String bedRequest() {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		return "/errors/400";
	}

	@GetMapping("/401")
	// @ResponseStatus(HttpStatus.UNAUTHORIZED)
	public String unAuthorized() {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		return "/errors/401";
	}

	@GetMapping("/402")
	// @ResponseStatus(HttpStatus.PAYMENT_REQUIRED)
	public String paymentRequired() {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		return "/errors/402";
	}

	@GetMapping("/403")
	// @ResponseStatus(HttpStatus.FORBIDDEN)
	public String forbidden() {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		return "/errors/403";
	}

	@GetMapping("/404")
	// @ResponseStatus(HttpStatus.NOT_FOUND)
	public String notFound() {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		return "/errors/404";
	}

	@GetMapping("/500")
	// @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String internalServerError() {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		return "/errors/500";
	}

	@GetMapping("/501")
	// @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	public String notImplemented() {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		return "/errors/501";
	}

	@GetMapping("/502")
	// @ResponseStatus(HttpStatus.BAD_GATEWAY)
	public String bedGateway() {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		return "/errors/502";
	}

	@GetMapping("/503")
	// @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
	public String serviceUnavailable() {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		return "/errors/503";
	}

	@GetMapping("/504")
	// @ResponseStatus(HttpStatus.GATEWAY_TIMEOUT)
	public String getwayTimeout() {
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
		return "/errors/504";
	}

}
