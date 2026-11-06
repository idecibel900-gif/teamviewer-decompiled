package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class rq5 extends ut2 {
    public br5 q0;
    public RecyclerView r0;
    public boolean s0;
    public boolean t0;
    public final qq5 p0 = new qq5(this);
    public int u0 = R.layout.preference_list_fragment;
    public final kd v0 = new kd(this, Looper.getMainLooper(), 3);
    public final mt8 w0 = new mt8((Object) this, (byte) 14);

    public final void A0(int i) {
        br5 br5Var = this.q0;
        if (br5Var == null) {
            hk0.o("This should be called after super.onCreate.");
            return;
        }
        Context contextR0 = r0();
        PreferenceScreen preferenceScreen = (PreferenceScreen) this.q0.g;
        br5Var.a = true;
        vq5 vq5Var = new vq5(contextR0, br5Var);
        XmlResourceParser xml = contextR0.getResources().getXml(i);
        try {
            PreferenceGroup preferenceGroupC = vq5Var.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceGroupC;
            preferenceScreen2.j(br5Var);
            SharedPreferences.Editor editor = (SharedPreferences.Editor) br5Var.e;
            if (editor != null) {
                editor.apply();
            }
            br5Var.a = false;
            br5 br5Var2 = this.q0;
            PreferenceScreen preferenceScreen3 = (PreferenceScreen) br5Var2.g;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.m();
                }
                br5Var2.g = preferenceScreen2;
                this.s0 = true;
                if (this.t0) {
                    kd kdVar = this.v0;
                    if (kdVar.hasMessages(1)) {
                        return;
                    }
                    kdVar.obtainMessage(1).sendToTarget();
                }
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public abstract void B0(Bundle bundle);

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        TypedValue typedValue = new TypedValue();
        r0().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        r0().getTheme().applyStyle(i, false);
        br5 br5Var = new br5(r0());
        this.q0 = br5Var;
        br5Var.j = this;
        Bundle bundle2 = this.r;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        B0(bundle);
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = r0().obtainStyledAttributes(null, wz5.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.u0 = typedArrayObtainStyledAttributes.getResourceId(0, this.u0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(r0());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.u0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            hk0.l("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!r0().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            r0();
            recyclerView.setLayoutManager(new LinearLayoutManager(0));
            recyclerView.setAccessibilityDelegateCompat(new cr5(recyclerView));
        }
        this.r0 = recyclerView;
        qq5 qq5Var = this.p0;
        recyclerView.i(qq5Var);
        if (drawable != null) {
            qq5Var.getClass();
            qq5Var.b = drawable.getIntrinsicHeight();
        } else {
            qq5Var.b = 0;
        }
        qq5Var.a = drawable;
        rq5 rq5Var = qq5Var.d;
        RecyclerView recyclerView2 = rq5Var.r0;
        if (recyclerView2.B.size() != 0) {
            androidx.recyclerview.widget.a aVar = recyclerView2.z;
            if (aVar != null) {
                aVar.m("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView2.S();
            recyclerView2.requestLayout();
        }
        if (dimensionPixelSize != -1) {
            qq5Var.b = dimensionPixelSize;
            RecyclerView recyclerView3 = rq5Var.r0;
            if (recyclerView3.B.size() != 0) {
                androidx.recyclerview.widget.a aVar2 = recyclerView3.z;
                if (aVar2 != null) {
                    aVar2.m("Cannot invalidate item decorations during a scroll or layout");
                }
                recyclerView3.S();
                recyclerView3.requestLayout();
            }
        }
        qq5Var.c = z;
        if (this.r0.getParent() == null) {
            viewGroup2.addView(this.r0);
        }
        this.v0.post(this.w0);
        return viewInflate;
    }

    @Override // o.ut2
    public final void b0() {
        mt8 mt8Var = this.w0;
        kd kdVar = this.v0;
        kdVar.removeCallbacks(mt8Var);
        kdVar.removeMessages(1);
        if (this.s0) {
            this.r0.setAdapter(null);
            PreferenceScreen preferenceScreen = (PreferenceScreen) this.q0.g;
            if (preferenceScreen != null) {
                preferenceScreen.m();
            }
        }
        this.r0 = null;
        this.S = true;
    }

    @Override // o.ut2
    public void h0(Bundle bundle) {
        PreferenceScreen preferenceScreen = (PreferenceScreen) this.q0.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        br5 br5Var = this.q0;
        br5Var.h = this;
        br5Var.i = this;
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        br5 br5Var = this.q0;
        br5Var.h = null;
        br5Var.i = null;
    }

    @Override // o.ut2
    public final void k0(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = (PreferenceScreen) this.q0.g) != null) {
            preferenceScreen2.a(bundle2);
        }
        if (this.s0 && (preferenceScreen = (PreferenceScreen) this.q0.g) != null) {
            this.r0.setAdapter(new uq5(preferenceScreen));
            preferenceScreen.i();
        }
        this.t0 = true;
    }
}
