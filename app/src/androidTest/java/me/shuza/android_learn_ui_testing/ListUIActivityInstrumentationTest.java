package me.shuza.android_learn_ui_testing;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

/**
 * :=  created by:  Shuza
 * :=  create date:  12/21/2017
 * :=  (C) CopyRight Shuza
 * :=  www.shuza.me
 * :=  shuza.sa@gmail.com
 * :=  Fun  :  Coffee  :  Code
 **/
public class ListUIActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<ListUIActivity> activityTestRule = new ActivityTestRule<ListUIActivity>(ListUIActivity.class);

    @Test
    public void clickOnItemWithTextTen() {
        onView(withId(R.id.rvList))
                .perform(RecyclerViewActions.actionOnItemAtPosition(10, click()));
    }
}
