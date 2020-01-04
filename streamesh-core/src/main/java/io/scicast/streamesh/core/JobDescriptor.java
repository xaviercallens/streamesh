package io.scicast.streamesh.core;

import io.scicast.streamesh.core.crypto.CryptoUtil;
import lombok.*;

@Getter
@Setter
@Builder
@With
@EqualsAndHashCode(of = "id")
public class JobDescriptor {

    private String id;
    private JobStatus status;
    private String containerId;
    private String errorMessage;
    private CryptoUtil.WrappedAesGCMKey key;

    public enum JobStatus {
        FAILED, RUNNING, COMPLETE
    }

}
