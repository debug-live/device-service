package live.debug.msa.device;

import live.debug.msa.device.model.entity.Device;
import live.debug.msa.device.model.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${abc}")
    private String abc;

    @GetMapping("/list")
    public List<Device> getDeviceList() {
        return deviceMapper.selectByExample(null);
    }

    @GetMapping("/abc")
    public String getAbc() {
        return this.abc;
    }
}
