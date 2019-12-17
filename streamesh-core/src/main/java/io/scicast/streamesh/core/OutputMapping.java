package io.scicast.streamesh.core;

import lombok.*;

@Builder
@Getter
@With
@NoArgsConstructor
@AllArgsConstructor
public class OutputMapping {

    private OutputLocationType locationType = OutputLocationType.STDOUT;
    private String outputFilePath;

    enum OutputLocationType {

        STDOUT, FILE_SYSTEM;

    }

}
