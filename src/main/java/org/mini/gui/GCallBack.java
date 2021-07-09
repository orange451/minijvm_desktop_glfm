/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mini.gui;

/**
 * @author Gust
 */
public abstract class GCallBack {

    static GCallBack instance;

    public static GCallBack getInstance() {
        if (instance == null) {

            try {
                Class<?> glfw = Class.forName("org.mini.glfw.Glfw");
                System.out.println("load gui native " + glfw);
                Class<?> glfm = Class.forName("org.mini.glfm.Glfm");
                System.out.println("load gui native " + glfm);
                Class<?> c = Class.forName(System.getProperty("gui.driver"));
                instance = (GCallBack) c.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    public abstract String getAppSaveRoot();

    public abstract String getAppResRoot();

    public abstract long getNvContext();

    public abstract void setDisplayTitle(String title);

    public abstract long getDisplay();

    public abstract int getFrameBufferHeight();

    public abstract int getDeviceWidth();

    public abstract int getDeviceHeight();

    public abstract float getDeviceRatio();

    public abstract int getFrameBufferWidth();

    public abstract void init(int w, int h);

    public abstract void destroy();

    public abstract void setDisplay(long winContext);

    public abstract void setFps(float fpsExpect);

    public abstract float getFps();

}
