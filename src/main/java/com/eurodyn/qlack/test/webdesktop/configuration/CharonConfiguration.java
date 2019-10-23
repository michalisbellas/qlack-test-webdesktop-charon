package com.eurodyn.qlack.test.webdesktop.configuration;

/**
 * @author European Dynamics SA.
 */
import static com.github.mkopylec.charon.configuration.CharonConfigurer.charonConfiguration;
import static com.github.mkopylec.charon.configuration.RequestMappingConfigurer.requestMapping;
import static com.github.mkopylec.charon.forwarding.interceptors.rewrite.RegexRequestPathRewriterConfigurer.regexRequestPathRewriter;
import static com.github.mkopylec.charon.forwarding.interceptors.rewrite.RequestServerNameRewriterConfigurer.requestServerNameRewriter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.mkopylec.charon.configuration.CharonConfigurer;

@Configuration
class CharonConfiguration {

    @Bean
    CharonConfigurer charonConfigurer() {
        return charonConfiguration()
                .add(requestMapping("Applications").set(requestServerNameRewriter().outgoingServers("localhost:8082"))
                .pathRegex("/applications")
                    .set(regexRequestPathRewriter().paths("/applications", "/apps/all")))
                .add(requestMapping("WdApplications").set(requestServerNameRewriter().outgoingServers("localhost:8083"))
                .pathRegex("/wdapps")
                    .set(regexRequestPathRewriter().paths("/wdapps", "/apps/app")));
    }
}
