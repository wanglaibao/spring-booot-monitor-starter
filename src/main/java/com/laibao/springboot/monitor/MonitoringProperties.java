package com.laibao.springboot.monitor;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author laibao wang
 *  eg:
 * the @ConfigurationProperties indicates that this POJO will be used for all configuration properties prefixed with monitoring.
 * the property names on the other hand should have the same name as in the POJO.
 * so in this case, monitoring.path would match the path property in the MonitoringProperties class.
 * if you use camelcase in your property names, you can either use monitoring.camelCase=... or monitoring.camel-case=... to match.
 */

@ConfigurationProperties(prefix = "monitoring")
public class MonitoringProperties {

    private String path = "/prometheus";

    private int interval = 10;

    private List<MonitoringPathMatcher> matchers;

    public MonitoringProperties() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public List<MonitoringPathMatcher> getMatchers() {
        return matchers;
    }

    public void setMatchers(List<MonitoringPathMatcher> matchers) {
        this.matchers = matchers;
    }
}
