package interfacesegregation.config;

import interfacesegregation.source.DataSource;

public class RedisConfig {

    private String ipAddress;

    private String port;

    private String userName;

    private String password;

    public RedisConfig(DataSource dataSource) {
        this.ipAddress = dataSource.getIpAddress();
        this.port = dataSource.getPort();
        this.userName = dataSource.getUserName();
        this.password = dataSource.getPassword();
    }
}
