package o;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class f92 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile f92 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new f77(cls, charSequence) : super.newEditable(charSequence);
    }
}
