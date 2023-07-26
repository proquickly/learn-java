package com.andykmiles;
import lombok.Data;
import lombok.NonNull;

@Data public class Job {
    @NonNull String jobName;
    @NonNull Person jobOwner;
}
