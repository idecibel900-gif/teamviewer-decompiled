package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import io.sentry.android.core.v0;
import java.util.ArrayList;
import o.a07;
import o.hk0;
import o.sq5;
import o.wz5;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final a07 Y;
    public final ArrayList Z;
    public boolean a0;
    public int b0;
    public boolean c0;
    public int d0;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        this.Y = new a07(0);
        new Handler(Looper.getMainLooper());
        this.a0 = true;
        this.b0 = 0;
        this.c0 = false;
        this.d0 = Integer.MAX_VALUE;
        this.Z = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wz5.i, i, 0);
        this.a0 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && TextUtils.isEmpty(this.w)) {
                v0.c("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.d0 = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void a(Bundle bundle) {
        super.a(bundle);
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            z(i).a(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            z(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void h(boolean z) {
        super.h(z);
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceZ = z(i);
            if (preferenceZ.G == z) {
                preferenceZ.G = !z;
                preferenceZ.h(preferenceZ.w());
                preferenceZ.g();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void i() {
        super.i();
        this.c0 = true;
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            z(i).i();
        }
    }

    @Override // androidx.preference.Preference
    public final void m() {
        super.m();
        this.c0 = false;
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            z(i).m();
        }
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(sq5.class)) {
            super.p(parcelable);
            return;
        }
        sq5 sq5Var = (sq5) parcelable;
        this.d0 = sq5Var.m;
        super.p(sq5Var.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new sq5(this.d0);
    }

    public final Preference y(CharSequence charSequence) {
        Preference preferenceY;
        if (charSequence == null) {
            hk0.g("Key cannot be null");
            return null;
        }
        if (TextUtils.equals(this.w, charSequence)) {
            return this;
        }
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceZ = z(i);
            if (TextUtils.equals(preferenceZ.w, charSequence)) {
                return preferenceZ;
            }
            if ((preferenceZ instanceof PreferenceGroup) && (preferenceY = ((PreferenceGroup) preferenceZ).y(charSequence)) != null) {
                return preferenceY;
            }
        }
        return null;
    }

    public final Preference z(int i) {
        return (Preference) this.Z.get(i);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
