package cz.donarus.testplugin;

import cz.cuni.mff.d3s.been.pluger.IPluginActivator;
import cz.cuni.mff.d3s.been.pluger.IServiceRegistrator;

public class PluginActivator implements IPluginActivator {
    @Override
    public void activate(IServiceRegistrator registry) {
        System.out.println("activating");
    }

    @Override
    public void initialize() {
        System.out.println("initializing");
    }

    @Override
    public void start() {
        System.out.println("starting");
    }
}
