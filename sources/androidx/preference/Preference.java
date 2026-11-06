package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.a65;
import o.be8;
import o.br5;
import o.dr5;
import o.gq5;
import o.hk0;
import o.hq5;
import o.ku2;
import o.l47;
import o.mt8;
import o.o6;
import o.rq5;
import o.su2;
import o.ua5;
import o.uf0;
import o.uq5;
import o.ut2;
import o.w10;
import o.wz5;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public boolean A;
    public boolean B;
    public boolean C;
    public final String D;
    public final Object E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public int P;
    public final int Q;
    public uq5 R;
    public ArrayList S;
    public PreferenceGroup T;
    public boolean U;
    public gq5 V;
    public hq5 W;
    public final o6 X;
    public final Context m;
    public br5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f22o;
    public boolean p;
    public a65 q;
    public int r;
    public CharSequence s;
    public CharSequence t;
    public int u;
    public Drawable v;
    public final String w;
    public Intent x;
    public final String y;
    public Bundle z;

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.r = Integer.MAX_VALUE;
        this.A = true;
        this.B = true;
        this.C = true;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = true;
        this.L = true;
        this.O = true;
        this.P = R.layout.preference;
        this.X = new o6(this, (byte) 9);
        this.m = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wz5.g, i, i2);
        this.u = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.w = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.s = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.t = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.r = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.y = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.P = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.Q = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.A = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        this.B = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.C = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.D = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.I = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, this.B));
        this.J = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, this.B));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.E = n(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.E = n(typedArrayObtainStyledAttributes, 11);
        }
        this.O = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.K = zHasValue;
        if (zHasValue) {
            this.L = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.M = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.H = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.N = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void u(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                u(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        String str = this.w;
        if (TextUtils.isEmpty(str) || (parcelable = bundle.getParcelable(str)) == null) {
            return;
        }
        this.U = false;
        p(parcelable);
        if (this.U) {
            return;
        }
        hk0.l("Derived class did not call super.onRestoreInstanceState()");
    }

    public void b(Bundle bundle) {
        String str = this.w;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.U = false;
        Parcelable parcelableQ = q();
        if (!this.U) {
            hk0.l("Derived class did not call super.onSaveInstanceState()");
        } else if (parcelableQ != null) {
            bundle.putParcelable(str, parcelableQ);
        }
    }

    public long c() {
        return this.f22o;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.r;
        int i2 = preference2.r;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.s;
        CharSequence charSequence2 = preference2.s;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.s.toString());
    }

    public final String d(String str) {
        return !x() ? str : this.n.e().getString(this.w, str);
    }

    public CharSequence e() {
        hq5 hq5Var = this.W;
        return hq5Var != null ? hq5Var.i(this) : this.t;
    }

    public boolean f() {
        return this.A && this.F && this.G;
    }

    public void g() {
        int iIndexOf;
        uq5 uq5Var = this.R;
        if (uq5Var == null || (iIndexOf = uq5Var.e.indexOf(this)) == -1) {
            return;
        }
        uq5Var.a.d(iIndexOf, 1, this);
    }

    public void h(boolean z) {
        ArrayList arrayList = this.S;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.F == z) {
                preference.F = !z;
                preference.h(preference.w());
                preference.g();
            }
        }
    }

    public void i() {
        PreferenceScreen preferenceScreen;
        String str = this.D;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        br5 br5Var = this.n;
        Preference preferenceY = null;
        if (br5Var != null && (preferenceScreen = (PreferenceScreen) br5Var.g) != null) {
            preferenceY = preferenceScreen.y(str);
        }
        if (preferenceY == null) {
            StringBuilder sbP = ua5.p("Dependency \"", str, "\" not found for preference \"");
            sbP.append(this.w);
            sbP.append("\" (title: \"");
            sbP.append((Object) this.s);
            sbP.append("\"");
            throw new IllegalStateException(sbP.toString());
        }
        ArrayList arrayList = preferenceY.S;
        if (arrayList == null) {
            arrayList = new ArrayList();
            preferenceY.S = arrayList;
        }
        arrayList.add(this);
        boolean zW = preferenceY.w();
        if (this.F == zW) {
            this.F = !zW;
            h(w());
            g();
        }
    }

    public final void j(br5 br5Var) {
        long j;
        this.n = br5Var;
        if (!this.p) {
            synchronized (br5Var) {
                j = br5Var.b;
                br5Var.b = 1 + j;
            }
            this.f22o = j;
        }
        if (x()) {
            br5 br5Var2 = this.n;
            if ((br5Var2 != null ? br5Var2.e() : null).contains(this.w)) {
                r(null);
                return;
            }
        }
        Object obj = this.E;
        if (obj != null) {
            r(obj);
        }
    }

    public void k(dr5 dr5Var) {
        Integer numValueOf;
        View view = dr5Var.m;
        view.setOnClickListener(this.X);
        view.setId(0);
        TextView textView = (TextView) dr5Var.r(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceE = e();
            if (TextUtils.isEmpty(charSequenceE)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceE);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) dr5Var.r(android.R.id.title);
        if (textView2 != null) {
            CharSequence charSequence = this.s;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.K) {
                    textView2.setSingleLine(this.L);
                }
                if (!this.B && f() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) dr5Var.r(android.R.id.icon);
        boolean z = this.M;
        if (imageView != null) {
            int i = this.u;
            if (i != 0 || this.v != null) {
                Drawable drawableP = this.v;
                if (drawableP == null) {
                    drawableP = uf0.p(this.m, i);
                    this.v = drawableP;
                }
                if (drawableP != null) {
                    imageView.setImageDrawable(drawableP);
                }
            }
            if (this.v != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z ? 4 : 8);
            }
        }
        View viewR = dr5Var.r(R.id.icon_frame);
        if (viewR == null) {
            viewR = dr5Var.r(android.R.id.icon_frame);
        }
        if (viewR != null) {
            if (this.v != null) {
                viewR.setVisibility(0);
            } else {
                viewR.setVisibility(z ? 4 : 8);
            }
        }
        if (this.O) {
            u(view, f());
        } else {
            u(view, true);
        }
        boolean z2 = this.B;
        view.setFocusable(z2);
        view.setClickable(z2);
        dr5Var.J = this.I;
        dr5Var.K = this.J;
        boolean z3 = this.N;
        if (z3 && this.V == null) {
            this.V = new gq5(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.V : null);
        view.setLongClickable(z3);
        if (!z3 || z2) {
            return;
        }
        WeakHashMap weakHashMap = be8.a;
        view.setBackground(null);
    }

    public void l() {
    }

    public void m() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.D;
        if (str != null) {
            br5 br5Var = this.n;
            Preference preferenceY = null;
            if (br5Var != null && (preferenceScreen = (PreferenceScreen) br5Var.g) != null) {
                preferenceY = preferenceScreen.y(str);
            }
            if (preferenceY == null || (arrayList = preferenceY.S) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public Object n(TypedArray typedArray, int i) {
        return null;
    }

    public void p(Parcelable parcelable) {
        this.U = true;
        if (parcelable == AbsSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        hk0.g("Wrong state class -- expecting Preference State");
    }

    public Parcelable q() {
        this.U = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void r(Object obj) {
    }

    public void s(View view) {
        ut2 ut2Var;
        String str;
        if (f() && this.B) {
            l();
            a65 a65Var = this.q;
            if (a65Var != null) {
                ((PreferenceGroup) a65Var.n).d0 = Integer.MAX_VALUE;
                uq5 uq5Var = (uq5) a65Var.f302o;
                Handler handler = uq5Var.g;
                mt8 mt8Var = uq5Var.h;
                handler.removeCallbacks(mt8Var);
                handler.post(mt8Var);
                return;
            }
            br5 br5Var = this.n;
            if (br5Var == null || (ut2Var = (rq5) br5Var.h) == null || (str = this.y) == null) {
                Intent intent = this.x;
                if (intent != null) {
                    this.m.startActivity(intent);
                    return;
                }
                return;
            }
            for (ut2 ut2Var2 = ut2Var; ut2Var2 != null; ut2Var2 = ut2Var2.I) {
            }
            ut2Var.C();
            v0.j("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            su2 su2VarG = ut2Var.G();
            Bundle bundle = this.z;
            if (bundle == null) {
                bundle = new Bundle();
                this.z = bundle;
            }
            ku2 ku2VarJ = su2VarG.J();
            ut2Var.p0().getClassLoader();
            ut2 ut2VarA = ku2VarJ.a(str);
            ut2VarA.u0(bundle);
            ut2VarA.x0(ut2Var);
            w10 w10Var = new w10(su2VarG);
            w10Var.k(((View) ut2Var.s0().getParent()).getId(), ut2VarA, null);
            w10Var.c();
            w10Var.f();
        }
    }

    public final void t(String str) {
        if (x() && !TextUtils.equals(str, d(null))) {
            SharedPreferences.Editor editorD = this.n.d();
            editorD.putString(this.w, str);
            if (this.n.a) {
                return;
            }
            editorD.apply();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.s;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceE = e();
        if (!TextUtils.isEmpty(charSequenceE)) {
            sb.append(charSequenceE);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void v(CharSequence charSequence) {
        if (this.W != null) {
            hk0.l("Preference already has a SummaryProvider set.");
        } else {
            if (TextUtils.equals(this.t, charSequence)) {
                return;
            }
            this.t = charSequence;
            g();
        }
    }

    public boolean w() {
        return !f();
    }

    public final boolean x() {
        return (this.n == null || !this.C || TextUtils.isEmpty(this.w)) ? false : true;
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l47.n(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle), 0);
    }
}
