package codes.gorillu.earthquakeapp;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import androidx.appcompat.app.AppCompatActivity;

import androidx.preference.PreferenceFragmentCompat;

public class SettingsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
    }


    public static class EarthquakePreferenceFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.settings_main);
        }

    }

//    public static class EarthquakePreferenceFragment extends PreferenceFragmentCompat {
//
//        @Override
//        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
//
//        }
//
//        @Override
//        public void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            addPreferencesFromResource(R.xml.settings_main);
//        }
//    }

}



