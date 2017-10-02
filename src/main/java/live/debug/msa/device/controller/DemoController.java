package live.debug.msa.device.controller;

import live.debug.msa.device.model.mapper.DeviceMapper;
import live.debug.msa.device.model.entity.Device;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {
    @Resource
    private DeviceMapper deviceMapper;

    @GetMapping("/list")
    List<Device> getDeviceList() {
        return deviceMapper.selectByExample(null);
    }
}
