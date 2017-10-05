package live.debug.msa.device;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("live.debug.msa.device.model.mapper")
public class DeviceApplication implements CommandLineRunner {

	@Value("${abc}")
	public String abc;

	public static void main(String[] args) {
		SpringApplication.run(DeviceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println(abc);
	}
}
