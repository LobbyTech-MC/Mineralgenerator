package io.github.shixinzia.mineralgenerator;

import java.io.File;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPluginLoader;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.mooy1.infinitylib.metrics.bukkit.Metrics;
import io.github.mooy1.infinitylib.metrics.charts.SimplePie;
import io.github.shixinzia.mineralgenerator.categories.Groups;
import io.github.shixinzia.mineralgenerator.items.materials.Materials;


public final class Mineralgenerator extends AbstractAddon {

    public Mineralgenerator(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
                "shixinzia", "mineralgenerator", "master", "auto-update");
    }

    public Mineralgenerator() {
        super("shixinzia", "mineralgenerator", "master", "auto-update");
    }


    @Override
    protected void enable() {
        Metrics metrics = new Metrics(this, 8997);
        String autoUpdates = String.valueOf(false);
        metrics.addCustomChart(new SimplePie("auto_updates", () -> autoUpdates));


        Groups.setup(this);
        Materials.setup(this);

    }

    @Override
    public void disable() {
    }

}
