package com.example;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import jakarta.inject.Inject;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "demo", description = "...",
        mixinStandardHelpOptions = true)
public class DemoCommand implements Runnable {
    @Inject
    Service service;

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(DemoCommand.class, args);
    }

    public void run() {
        // business logic here
        System.out.println(service.service());

        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
