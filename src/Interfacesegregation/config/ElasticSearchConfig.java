package Interfacesegregation.config;

import Interfacesegregation.Updater;
import Interfacesegregation.source.DataSource;

public class ElasticSearchConfig implements Updater {

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
        return "ElasticSearchConfig{" +
                "ipAddress='" + ipAddress + '\'' +
                ", port='" + port + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
