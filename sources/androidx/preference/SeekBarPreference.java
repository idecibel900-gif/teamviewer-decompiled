package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.v0;
import o.dr5;
import o.in6;
import o.jn6;
import o.kn6;
import o.wz5;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public boolean c0;
    public SeekBar d0;
    public TextView e0;
    public final boolean f0;
    public final boolean g0;
    public final boolean h0;
    public final in6 i0;
    public final jn6 j0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.i0 = new in6(this);
        this.j0 = new jn6(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wz5.k, R.attr.seekBarPreferenceStyle, 0);
        this.Z = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.Z;
        i = i < i2 ? i2 : i;
        if (i != this.a0) {
            this.a0 = i;
            g();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.b0) {
            this.b0 = Math.min(this.a0 - this.Z, Math.abs(i3));
            g();
        }
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.g0 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.h0 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void k(dr5 dr5Var) {
        super.k(dr5Var);
        dr5Var.m.setOnKeyListener(this.j0);
        this.d0 = (SeekBar) dr5Var.r(R.id.seekbar);
        TextView textView = (TextView) dr5Var.r(R.id.seekbar_value);
        this.e0 = textView;
        if (this.g0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.e0 = null;
        }
        SeekBar seekBar = this.d0;
        if (seekBar == null) {
            v0.c("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.i0);
        this.d0.setMax(this.a0 - this.Z);
        int i = this.b0;
        SeekBar seekBar2 = this.d0;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.b0 = seekBar2.getKeyProgressIncrement();
        }
        this.d0.setProgress(this.Y - this.Z);
        int i2 = this.Y;
        TextView textView2 = this.e0;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.d0.setEnabled(f());
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(kn6.class)) {
            super.p(parcelable);
            return;
        }
        kn6 kn6Var = (kn6) parcelable;
        super.p(kn6Var.getSuperState());
        this.Y = kn6Var.m;
        this.Z = kn6Var.n;
        this.a0 = kn6Var.f1283o;
        g();
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.C) {
            return absSavedState;
        }
        kn6 kn6Var = new kn6();
        kn6Var.m = this.Y;
        kn6Var.n = this.Z;
        kn6Var.f1283o = this.a0;
        return kn6Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (x()) {
            iIntValue = this.n.e().getInt(this.w, iIntValue);
        }
        y(iIntValue, true);
    }

    public final void y(int i, boolean z) {
        int i2 = this.Z;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.a0;
        if (i > i3) {
            i = i3;
        }
        if (i != this.Y) {
            this.Y = i;
            TextView textView = this.e0;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (x()) {
                int i4 = ~i;
                boolean zX = x();
                String str = this.w;
                if (zX) {
                    i4 = this.n.e().getInt(str, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor editorD = this.n.d();
                    editorD.putInt(str, i);
                    if (!this.n.a) {
                        editorD.apply();
                    }
                }
            }
            if (z) {
                g();
            }
        }
    }
}
