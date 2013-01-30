package com.englishcentral.app;

import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void shouldHaveHappySmiles() throws Exception {
        String app_name = new MainActivity_().getResources().getString(R.string.app_name);
        assertThat(app_name, equalTo("EnglishCentral"));
    }
}