package ru.mgts.checkcams.model;

/**
 * Created by Dummy on 08.03.2017.
 */
public class Camera
{
    private String name;
    private String ipAddress;
    private String type;
    private String camPort;

    public Camera(String name, String ipAddress, String type, String camPort)
    {
        this.name = name;
        this.ipAddress = ipAddress;
        this.type = type;
        this.camPort = camPort;
    }

    public String getName()
    {
        return name;
    }

    public String getIpAddress()
    {
        return ipAddress;
    }

    public String getType()
    {
        return type;
    }

    public String getCamPort()
    {
        return camPort;
    }
}
