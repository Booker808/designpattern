package Interfacesegregation.source;

public class DataSource {

    private String ipAddress;

    private String port;

    private String userName;

    private String password;

    public DataSource(String ipAddress, String port, String userName, String password) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.userName = userName;
        this.password = password;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
