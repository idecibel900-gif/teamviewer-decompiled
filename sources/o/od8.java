package o;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class od8 {
    public final int a;
    public final Class b;
    public final byte c;
    public final byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public od8(int i, Class cls, int i2, int i3, byte b) {
        this.e = b;
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0061. Please report as an issue. */
    public final void a(View view, Object obj) {
        Object tag;
        boolean zEquals;
        boolean z;
        int i = Build.VERSION.SDK_INT;
        byte b = this.e;
        byte b2 = this.c;
        if (i >= b2) {
            switch (b) {
                case 0:
                    wd8.f(view, ((Boolean) obj).booleanValue());
                    break;
                case 1:
                    wd8.e(view, (CharSequence) obj);
                    break;
                case 2:
                    yd8.c(view, (CharSequence) obj);
                    break;
                default:
                    wd8.d(view, ((Boolean) obj).booleanValue());
                    break;
            }
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        p3 p3Var = null;
        int i3 = this.a;
        if (i2 >= b2) {
            switch (b) {
                case 0:
                    tag = Boolean.valueOf(wd8.c(view));
                    break;
                case 1:
                    tag = wd8.a(view);
                    break;
                case 2:
                    tag = yd8.b(view);
                    break;
                default:
                    tag = Boolean.valueOf(wd8.b(view));
                    break;
            }
        } else {
            tag = view.getTag(i3);
            if (!this.b.isInstance(tag)) {
                tag = null;
            }
        }
        boolean z2 = false;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) tag;
                Boolean bool2 = (Boolean) obj;
                if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                    z2 = true;
                }
                z = !z2;
                break;
            case 1:
                zEquals = TextUtils.equals((CharSequence) tag, (CharSequence) obj);
                z = !zEquals;
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) tag, (CharSequence) obj);
                z = !zEquals;
                break;
            default:
                Boolean bool3 = (Boolean) tag;
                Boolean bool4 = (Boolean) obj;
                if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                    z2 = true;
                }
                z = !z2;
                break;
        }
        if (z) {
            View.AccessibilityDelegate accessibilityDelegateE = be8.e(view);
            if (accessibilityDelegateE != null) {
                p3Var = accessibilityDelegateE instanceof o3 ? ((o3) accessibilityDelegateE).a : new p3(accessibilityDelegateE);
            }
            if (p3Var == null) {
                p3Var = new p3();
            }
            be8.m(view, p3Var);
            view.setTag(i3, obj);
            be8.h(view, this.d);
        }
    }
}
