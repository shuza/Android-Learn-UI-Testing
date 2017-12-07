package me.shuza.android_learn_ui_testing;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;

/**
 * :=  created by:  Shuza
 * :=  create date:  12/7/2017
 * :=  (C) CopyRight Shuza
 * :=  www.shuza.me
 * :=  shuza.sa@gmail.com
 * :=  Fun  :  Coffee  :  Code
 **/
public class CounterActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<CounterActivity> activityTestRule = new ActivityTestRule<CounterActivity>(CounterActivity.class);

}
