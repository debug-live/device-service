package live.debug.msa.device;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("live.debug.msa.device.model.mapper")
@SpringBootApplication
public class DeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceApplication.class, args);
	}
}
