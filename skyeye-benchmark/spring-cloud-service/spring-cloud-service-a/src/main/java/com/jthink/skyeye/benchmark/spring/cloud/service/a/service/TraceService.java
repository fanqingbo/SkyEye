package com.jthink.skyeye.benchmark.spring.cloud.service.a.service;

import com.jthink.skyeye.benchmark.spring.cloud.service.client.iface.ServiceB;
import com.jthink.skyeye.benchmark.spring.cloud.service.client.iface.ServiceC;
import com.jthink.skyeye.benchmark.spring.cloud.service.client.iface.ServiceD;
import com.jthink.skyeye.benchmark.spring.cloud.service.client.iface.ServiceE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * JThink@JThink
 *
 * @author JThink
 * @version 0.0.1
 * @desc 跟踪的service
 * @date 2017-08-28 09:06:53
 */
@Service
public class TraceService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TraceService.class);

    @Autowired
    private ServiceB serviceB;
    @Autowired
    private ServiceC serviceC;
    @Autowired
    private ServiceD serviceD;
    @Autowired
    private ServiceE serviceE;

    public String trace1() {
        LOGGER.info("调用服务B");
        return this.serviceB.invokeB();
    }

    public String trace2() {
        LOGGER.info("调用服务C");
        return this.serviceC.invokeC();
    }

    public String trace3() {
        LOGGER.info("调用服务D");
        return this.serviceD.invokeD();
    }

    public String trace4() {
        LOGGER.info("调用服务E");
        return this.serviceE.invokeE();
    }

    public String trace5() {
        LOGGER.info("调用服务C和D");
        return this.serviceC.invokeC() + this.serviceD.invokeD();
    }

    public String trace6() {
        LOGGER.info("调用服务B、C、E");
        return this.serviceB.invokeB() + this.serviceC.invokeC() + this.serviceE.invokeE();
    }

}
