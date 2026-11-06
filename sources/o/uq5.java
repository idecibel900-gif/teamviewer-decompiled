package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uq5 extends d66 {
    public final PreferenceGroup c;
    public ArrayList d;
    public ArrayList e;
    public final ArrayList f;
    public final mt8 h = new mt8((Object) this, (byte) 15);
    public final Handler g = new Handler(Looper.getMainLooper());

    public uq5(PreferenceGroup preferenceGroup) {
        this.c = preferenceGroup;
        preferenceGroup.R = this;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            boolean z = ((PreferenceScreen) preferenceGroup).e0;
            if (this.a.a()) {
                hk0.l("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
                throw null;
            }
            this.b = z;
        } else {
            if (this.a.a()) {
                hk0.l("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
                throw null;
            }
            this.b = true;
        }
        k();
    }

    @Override // o.d66
    public final int a() {
        return this.e.size();
    }

    @Override // o.d66
    public final long b(int i) {
        if (this.b) {
            return j(i).c();
        }
        return -1L;
    }

    @Override // o.d66
    public final int c(int i) {
        tq5 tq5Var = new tq5(j(i));
        ArrayList arrayList = this.f;
        int iIndexOf = arrayList.indexOf(tq5Var);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(tq5Var);
        return size;
    }

    @Override // o.d66
    public final void e(c76 c76Var, int i) {
        dr5 dr5Var = (dr5) c76Var;
        Preference preferenceJ = j(i);
        ColorStateList colorStateList = dr5Var.H;
        View view = dr5Var.m;
        Drawable background = view.getBackground();
        Drawable drawable = dr5Var.G;
        if (background != drawable) {
            WeakHashMap weakHashMap = be8.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) dr5Var.r(R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceJ.k(dr5Var);
    }

    @Override // o.d66
    public final c76 f(ViewGroup viewGroup, int i) {
        tq5 tq5Var = (tq5) this.f.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, wz5.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = uf0.p(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(tq5Var.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = be8.a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = tq5Var.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new dr5(viewInflate);
    }

    public final ArrayList h(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Preference> arrayList2 = new ArrayList();
        int size = preferenceGroup.Z.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            CharSequence string = null;
            if (i >= size) {
                int i3 = preferenceGroup.d0;
                if (i3 != Integer.MAX_VALUE && i2 > i3) {
                    Context context = preferenceGroup.m;
                    long j = preferenceGroup.f22o;
                    if2 if2Var = new if2(context, null);
                    if2Var.P = com.teamviewer.teamviewer.market.mobile.R.layout.expand_button;
                    Context context2 = if2Var.m;
                    Drawable drawableP = uf0.p(context2, com.teamviewer.teamviewer.market.mobile.R.drawable.ic_arrow_down_24dp);
                    if (if2Var.v != drawableP) {
                        if2Var.v = drawableP;
                        if2Var.u = 0;
                        if2Var.g();
                    }
                    if2Var.u = com.teamviewer.teamviewer.market.mobile.R.drawable.ic_arrow_down_24dp;
                    String string2 = context2.getString(com.teamviewer.teamviewer.market.mobile.R.string.expand_button_title);
                    if (!TextUtils.equals(string2, if2Var.s)) {
                        if2Var.s = string2;
                        if2Var.g();
                    }
                    if (999 != if2Var.r) {
                        if2Var.r = 999;
                        uq5 uq5Var = if2Var.R;
                        if (uq5Var != null) {
                            Handler handler = uq5Var.g;
                            mt8 mt8Var = uq5Var.h;
                            handler.removeCallbacks(mt8Var);
                            handler.post(mt8Var);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Preference preference : arrayList2) {
                        CharSequence charSequence = preference.s;
                        boolean z = preference instanceof PreferenceGroup;
                        if (z && !TextUtils.isEmpty(charSequence)) {
                            arrayList3.add((PreferenceGroup) preference);
                        }
                        if (arrayList3.contains(preference.T)) {
                            if (z) {
                                arrayList3.add((PreferenceGroup) preference);
                            }
                        } else if (!TextUtils.isEmpty(charSequence)) {
                            string = string == null ? charSequence : context2.getString(com.teamviewer.teamviewer.market.mobile.R.string.summary_collapsed_preference_list, string, charSequence);
                        }
                    }
                    if2Var.v(string);
                    if2Var.Y = j + 1000000;
                    if2Var.q = new a65((Object) this, (Object) preferenceGroup, (byte) 11);
                    arrayList.add(if2Var);
                }
                return arrayList;
            }
            Preference preferenceZ = preferenceGroup.z(i);
            if (preferenceZ.H) {
                int i4 = preferenceGroup.d0;
                if (i4 == Integer.MAX_VALUE || i2 < i4) {
                    arrayList.add(preferenceZ);
                } else {
                    arrayList2.add(preferenceZ);
                }
                if (preferenceZ instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceZ;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.d0 != Integer.MAX_VALUE && preferenceGroup2.d0 != Integer.MAX_VALUE) {
                            hk0.l("Nesting an expandable group inside of another expandable group is not supported!");
                            return null;
                        }
                        for (Preference preference2 : h(preferenceGroup2)) {
                            int i5 = preferenceGroup.d0;
                            if (i5 == Integer.MAX_VALUE || i2 < i5) {
                                arrayList.add(preference2);
                            } else {
                                arrayList2.add(preference2);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
            i++;
        }
    }

    public final void i(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.Z);
        }
        int size = preferenceGroup.Z.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceZ = preferenceGroup.z(i);
            arrayList.add(preferenceZ);
            tq5 tq5Var = new tq5(preferenceZ);
            if (!this.f.contains(tq5Var)) {
                this.f.add(tq5Var);
            }
            if (preferenceZ instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceZ;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    i(arrayList, preferenceGroup2);
                }
            }
            preferenceZ.R = this;
        }
    }

    public final Preference j(int i) {
        if (i < 0 || i >= this.e.size()) {
            return null;
        }
        return (Preference) this.e.get(i);
    }

    public final void k() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).R = null;
        }
        ArrayList arrayList = new ArrayList(this.d.size());
        this.d = arrayList;
        PreferenceGroup preferenceGroup = this.c;
        i(arrayList, preferenceGroup);
        this.e = h(preferenceGroup);
        d();
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }
}
