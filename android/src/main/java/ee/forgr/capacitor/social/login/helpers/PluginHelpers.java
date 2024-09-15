package ee.forgr.capacitor.social.login.helpers;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.Nullable;

import java.util.Map;

public interface PluginHelpers {
    void runOnUiThread(Runnable runnable);

    FunctionResult<Object, String> notifyListener(String name, Map<String, Object> data);

    void putSharedPreferencePrivate(String key, String value);

    @Nullable
    public String getSharedPreferencePrivate(String key);

    @Nullable
    Activity getActivity();

    @Nullable
    Context getContext();
}
