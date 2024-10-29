package com.example.Digital_Library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Digital_Library implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(Digital_Library.class);
//	@Autowired
//	AdminService adminService;


	public static void main(String[] args) {
		log.info("Here in main");
		SpringApplication.run(Digital_Library.class, args);
		log.info("Here after run");
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Here while run");
//		Admin admin = Admin.builder()
//				.name("Gagan")
//				.email("manishgupta1@gmail.com")
//				.user(User.builder()
//						.username("gagan")
//						.password("123456789")
//						.build())
//				.build();
//		adminService.createAdmin(admin);
	}
}
