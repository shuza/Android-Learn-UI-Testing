package me.shuza.android_learn_ui_testing;

import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Rule;
import org.junit.Test;

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

    @Test
    public void validateCounterResultTextView() {
        int count = 0;
        onView(withId(R.id.btnIncreaseCounter)).perform(click());
        onView(withId(R.id.tvCounterResult)).check(matches(withText(String.valueOf(++count))));
        onView(withId(R.id.btnIncreaseCounter)).perform(click());
        onView(withId(R.id.tvCounterResult)).check(matches(withText(String.valueOf(++count))));
    }

    @Test
    public void validateCounterResultBusinessLogic() {
        int count = 0;
        onView(withId(R.id.btnIncreaseCounter)).perform(click());
        onView(withId(R.id.tvCounterResult)).check(matches(withText(String.valueOf(count))));
    }
}
