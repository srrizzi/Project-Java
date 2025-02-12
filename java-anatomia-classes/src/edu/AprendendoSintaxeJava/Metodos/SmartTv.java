package edu.AprendendoSintaxeJava.Metodos;

public class SmartTv 
{
    boolean statusTv = false;
    int channel = 1;
    int volume = 10;

    public void tvOn()
    {
        statusTv = true;
    }

    public void tvOff()
    {
        statusTv = false;
    }

    public int numberChannel(int Channel)
    {
        channel = Channel;

        return channel;
    }

    public void increaseVolume()
    {
        volume++;

    }

    public void decreaseVolume()
    {
        volume--;

    }
}
