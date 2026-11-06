package o;

import android.os.Build;
import android.util.Size;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Observer;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.nativelivedatalib.NativeLiveDataWrapper;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewlib.preferences.DyngateIDPreference;
import com.teamviewer.remotecontrolviewlib.preferences.TVConnectionTypePreference;
import com.teamviewer.remotecontrolviewlib.preferences.TVSessionDurationPreference;
import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.Resolution;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Observer {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ p(AppCompatImageView appCompatImageView, q qVar) {
        this.m = (byte) 0;
        this.n = appCompatImageView;
    }

    @Override // androidx.lifecycle.Observer
    public final void a(Object obj) {
        int i;
        int i2;
        RCClientActivity rCClientActivity;
        int i3;
        RCClientActivity rCClientActivity2;
        byte b = this.m;
        byte b2 = 2;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj2;
                m93 m93Var = (m93) obj;
                m93Var.getClass();
                if (appCompatImageView != null) {
                    int iOrdinal = m93Var.ordinal();
                    if (iOrdinal == 0) {
                        i = R.drawable.online_indicator;
                    } else if (iOrdinal == 1) {
                        i = R.drawable.away_indicator;
                    } else if (iOrdinal == 2) {
                        i = R.drawable.busy_indicator;
                    } else {
                        if (iOrdinal != 3) {
                            gk0.s();
                            return;
                        }
                        i = R.drawable.offline_indicator;
                    }
                    appCompatImageView.setImageResource(i);
                    return;
                }
                return;
            case 1:
                String str = (String) obj;
                int i4 = wb0.B0;
                str.getClass();
                TextInputLayout textInputLayout = ((wb0) obj2).t0;
                if (textInputLayout == null) {
                    im3.e0("passwordField");
                    throw null;
                }
                EditText editText = textInputLayout.getEditText();
                if (editText != null) {
                    editText.setText(str);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                ((DyngateIDPreference) obj2).v(str2);
                return;
            case 3:
                ((gt5) obj2).b(obj);
                return;
            case 4:
                ((px4) obj2).setValue(obj);
                return;
            case 5:
                NativeLiveDataWrapper.nativeValueObserver$lambda$0((NativeLiveDataWrapper) obj2, obj);
                return;
            case 6:
                Size size = (Size) obj;
                size.getClass();
                ((bz4) obj2).s = new j22(size.getWidth(), size.getHeight(), 32, 60);
                return;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                ((cz4) obj2).f570o.setValue(str3);
                return;
            case 8:
                m30 m30Var = (m30) obj2;
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                l97 l97Var = (l97) m30Var.p;
                vd5 vd5Var = new vd5(Float.valueOf(m30Var.m), f);
                l97Var.getClass();
                l97Var.l(null, vd5Var);
                m30Var.m = fFloatValue;
                return;
            case ep1.b /* 9 */:
                String str4 = (String) obj;
                str4.getClass();
                ((ez4) obj2).f754o.setValue(str4);
                return;
            case ep1.c /* 10 */:
                Integer num = (Integer) obj;
                num.getClass();
                ((nz4) obj2).r.setValue(Integer.valueOf(it1.H(num)));
                return;
            case 11:
                Resolution resolution = (Resolution) obj;
                resolution.getClass();
                ((zz4) obj2).s.setValue(IChangeResolutionViewModelSWIGJNI.Resolution_width_get(resolution.a, resolution) + "x" + IChangeResolutionViewModelSWIGJNI.Resolution_height_get(resolution.a, resolution));
                return;
            case ep1.d /* 12 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((a05) obj2).r.setValue(bool);
                return;
            case 13:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ((b05) obj2).r.setValue(bool2);
                return;
            case 14:
                d16 d16Var = (d16) obj2;
                n72 n72Var = (n72) obj;
                n72Var.getClass();
                if (Build.VERSION.SDK_INT <= 29) {
                    int iOrdinal2 = n72Var.ordinal();
                    if (iOrdinal2 == 0) {
                        i3 = R.layout.toast_mouse_activated;
                    } else {
                        if (iOrdinal2 != 1) {
                            gk0.s();
                            return;
                        }
                        i3 = R.layout.toast_touch_activated;
                    }
                    WeakReference weakReference = d16Var.z;
                    if (weakReference == null || (rCClientActivity2 = (RCClientActivity) weakReference.get()) == null) {
                        return;
                    }
                    rCClientActivity2.runOnUiThread(new jq(b2, i3, rCClientActivity2));
                    return;
                }
                int iOrdinal3 = n72Var.ordinal();
                if (iOrdinal3 == 0) {
                    i2 = R.string.interaction_mode_mouse_on;
                } else {
                    if (iOrdinal3 != 1) {
                        gk0.s();
                        return;
                    }
                    i2 = R.string.interaction_mode_touch_on;
                }
                WeakReference weakReference2 = d16Var.z;
                if (weakReference2 == null || (rCClientActivity = (RCClientActivity) weakReference2.get()) == null) {
                    return;
                }
                f37.g(rCClientActivity.findViewById(R.id.clientImage), rCClientActivity.getString(i2), 0).i();
                return;
            case 15:
                b26 b26Var = (b26) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                b26Var.s.a0();
                return;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((TVConnectionTypePreference) obj2).v((String) obj);
                return;
            default:
                ((TVSessionDurationPreference) obj2).v((String) obj);
                return;
        }
    }

    public /* synthetic */ p(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
