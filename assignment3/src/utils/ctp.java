package utils;

import java.awt.*;

public class ctp {
    private final Color base;
    private final Color mantle;
    private final Color text;
    private final Color sky;
    private final Color surface;
    private final Color crust;
    private final Color surface2;
    private final Color surface0;
    private final Color subtext;

    public Color getSurface0() {
        return surface0;
    }

    public Color getSurface2() {
        return surface0;
    }

    public Color getSurface() {
        return surface;
    }

    public Color getSubtext() {
        return subtext;
    }

    public Color getCrust() {
        return crust;
    }

    public ctp() {
        this.base = new Color(0x1e1e2e);
        this.mantle = new Color(0x181825);
        this.crust = new Color(0x11111b);
        this.text = new Color(0xcdd6f4);
        this.surface = new Color(0x585b70);
        this.sky = new Color(0x89dceb);
        this.surface2 = new Color(0x585b70);
        this.surface0 = new Color(0x313244);
        this.subtext = new Color(0xa5adcb);
    }

    public Color getBase() {
        return base;
    }

    public Color getMantle() {
        return mantle;
    }

    public Color getText() {
        return text;
    }

    public Color getSky() {
        return sky;
    }
}