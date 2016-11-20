package com.dosypchuk;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class bigdApplication extends Application<bigdConfiguration> {

    public static void main(final String[] args) throws Exception {
        new bigdApplication().run(args);
    }

    @Override
    public String getName() {
        return "bigd";
    }

    @Override
    public void initialize(final Bootstrap<bigdConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final bigdConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
