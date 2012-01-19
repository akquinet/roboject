/*

This file is part of Roboject

Copyright (c) 2010-2011 akquinet A.G.

Contact:  http://www.akquinet.de/en

GNU General Public License Usage
This file may be used under the terms of the GNU General Public License version 3.0 as published by the Free Software Foundation and appearing in the file LICENSE included in the packaging of this file.  Please review the following information to ensure the GNU General Public License version 3.0 requirements will be met: http://www.gnu.org/copyleft/gpl.html.

If you are unsure which license is appropriate for your use, please contact the sales department at http://www.akquinet.de/en.

*/
package de.akquinet.android.robojecttest;

import de.akquinet.android.marvin.ActivityTestCase;
import de.akquinet.android.robojecttest.activities.DummySupportFragmentActivity;
import de.akquinet.android.robojecttest.fragments.InjectViewTestSupportFragment;

import static org.hamcrest.CoreMatchers.notNullValue;


public class InjectViewSupportFragmentTest extends ActivityTestCase<DummySupportFragmentActivity> {
    public InjectViewSupportFragmentTest() {
        super(DummySupportFragmentActivity.class);
    }

    public void testInjectViewsByMemberName() {
        InjectViewTestSupportFragment fragment = (InjectViewTestSupportFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.viewSupportFragment);

        assertThat(fragment.theTextView, notNullValue());
        assertThat(fragment.theImageView, notNullValue());
        assertThat(fragment.theLinearLayout, notNullValue());
    }

    public void testInjectViewsById() {
        InjectViewTestSupportFragment fragment = (InjectViewTestSupportFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.viewSupportFragment);

        assertThat(fragment.theTextViewExplicitId, notNullValue());
        assertThat(fragment.theImageViewExplicitId, notNullValue());
        assertThat(fragment.theLinearLayoutExplicitId, notNullValue());
    }
}
