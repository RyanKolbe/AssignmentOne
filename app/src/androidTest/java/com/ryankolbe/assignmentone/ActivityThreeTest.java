package com.ryankolbe.assignmentone;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class ActivityThreeTest {

    @Test
    public void onCreate() {
        try (ActivityScenario scenario = ActivityScenario.launch(ActivityThree.class)) {
            Assert.assertNotNull(scenario);
        }
    }
}