package org.dxworks.metrixppWrapper;

import org.dxworks.metrixppWrapper.DockerRunner.DockerLizardRunner;
import org.dxworks.metrixppWrapper.DockerRunner.DockerMetrixppRunner;
import org.dxworks.metrixppWrapper.Entity.UnifiedOutput;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestDockerMetrixpp {
    public static void main(String[] args) throws FileNotFoundException {
        Path input = Paths.get("/Users/denisfeier/Documents/IEP");

        Path output = Paths.get("/Users/denisfeier/Documents/metrixPP-wrapper/res");

        List<UnifiedOutput> outputs = DockerMetrixppRunner.runMetrixpp(input, output, "50207117a4dc");

        outputs.forEach(System.out::println);
    }
}
