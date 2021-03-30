package com.example;

import me.coley.recaf.plugin.api.BasePlugin;
import org.plugface.core.annotations.Plugin;

@Plugin(name = "Recaf Example Plugin")
public class RecafExamplePlugin implements BasePlugin {
    @Override
    public String getName() {
        return "Recaf Example Plugin";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String getDescription() {
        return "An example plugin for Recaf";
    }
}
