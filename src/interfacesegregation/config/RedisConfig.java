package interfacesegregation.config;

import interfacesegregation.Viewer;
import interfacesegregation.source.DataSource;

public class RedisConfig implements Viewer {

    private String ipAddress;

    private String port;

    private String userName;

    private String password;

    @Override
    public void updateSource(DataSource dataSource) {
        this.ipAddress = dataSource.getIpAddress();
        this.port = dataSource.getPort();
        this.userName = dataSource.getUserName();
        this.password = dataSource.getPassword();
    }

    @Override
    public String toString() {
        return "RedisConfig{" +
                "ipAddress='" + ipAddress + '\'' +
                ", port='" + port + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
