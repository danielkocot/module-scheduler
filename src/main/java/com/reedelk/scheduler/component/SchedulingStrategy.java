package com.reedelk.scheduler.component;

import com.reedelk.runtime.api.annotation.DisplayName;

public enum SchedulingStrategy {

    @DisplayName("Fixed Frequency")
    FIXED_FREQUENCY,
    @DisplayName("Cron")
    CRON
}
