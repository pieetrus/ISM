package aspects;

import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
@EnableLoadTimeWeaving(aspectjWeaving = AspectJWeaving.ENABLED)
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableSpringConfigured
@ComponentScan(basePackages = { "aspects", "io.swagger.model" })
public class AspectConfiguration {
	@Bean
    public MyAspect myLogicLoggingAspect() {
        return Aspects.aspectOf(MyAspect.class);
	}
}
