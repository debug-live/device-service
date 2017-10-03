package live.debug.msa.device;

import live.debug.msa.device.interfaces.DeviceMapper;
import live.debug.msa.device.model.Device;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by nancy on 10/3/17.
 */
@RestController
public class DeviceListController {
    @Resource
    DeviceMapper deviceMapper;

    @GetMapping("/list")
    public List<Device> getDeviceList() {
        return deviceMapper.selectByExample(null);
    }
}
