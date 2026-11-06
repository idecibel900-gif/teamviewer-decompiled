package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class yi5 implements im5, lt5, ce1 {
    public final /* synthetic */ byte m;

    public yi5() {
        this.m = (byte) 0;
        new ax(0);
        new HashMap();
    }

    public static s77 a(View view) {
        view.getClass();
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? s77.q : g(view.getVisibility());
    }

    public static ia b() {
        ia iaVar = new ia();
        x02 x02VarA = ik7.a();
        iaVar.Z0 = x02VarA;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("dialogId", x02VarA);
        iaVar.u0(bundle);
        bundle.putBoolean("OrientationChangeKey", false);
        return iaVar;
    }

    public static bb4 c(i71 i71Var, DialogInterface.OnClickListener onClickListener) {
        bb4 bb4Var = new bb4();
        int iHashCode = bb4Var.hashCode();
        bb4.h1.put(iHashCode, new ab4(i71Var, onClickListener));
        x02 x02VarA = ik7.a();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("dialogId", x02VarA);
        bundle.putInt("WRAPPER_KEY", iHashCode);
        bb4Var.u0(bundle);
        return bb4Var;
    }

    public static fc4 d(Object obj, List list) {
        list.getClass();
        obj.getClass();
        fc4 fc4Var = new fc4();
        x02 x02VarA = ik7.a();
        fc4Var.Z0 = x02VarA;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("dialogId", x02VarA);
        fc4Var.u0(bundle);
        fc4Var.e1 = list;
        fc4Var.f1 = obj;
        return fc4Var;
    }

    public static fs7 e(String str) {
        if (str == null) {
            str = "";
        }
        x02 x02VarA = ik7.a();
        fs7 fs7Var = new fs7();
        fs7Var.Z0 = x02VarA;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("dialogId", x02VarA);
        bundle.putString("DefaultText", str);
        fs7Var.u0(bundle);
        return fs7Var;
    }

    public static s77 g(int i) {
        if (i == 0) {
            return s77.f1990o;
        }
        if (i == 4) {
            return s77.q;
        }
        if (i == 8) {
            return s77.p;
        }
        hk0.g(fx3.e(i, "Unknown visibility "));
        return null;
    }

    public static fu6 h(int i) {
        Object next;
        jc2 jc2Var = fu6.s;
        jc2Var.getClass();
        j1 j1Var = new j1(jc2Var, (byte) 0);
        do {
            if (!j1Var.hasNext()) {
                next = null;
                break;
            }
            next = j1Var.next();
        } while (((fu6) next).m != i);
        fu6 fu6Var = (fu6) next;
        return fu6Var == null ? fu6.Unknown : fu6Var;
    }

    public static xd3 i(Context context, int i) {
        Bitmap bitmap;
        Drawable drawable = context.getDrawable(i);
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else if (drawable != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmap = bitmapCreateBitmap;
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getClass();
        of6 of6Var = new of6(resources, bitmap);
        of6Var.a(true);
        return bt1.p(of6Var);
    }

    public String f(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public Object j(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean k(Method method) {
        return false;
    }

    public boolean l(CharSequence charSequence) {
        return false;
    }

    @Override // o.lt5
    public void o() {
    }

    @Override // o.lt5
    public void q(int i, Object obj) {
    }

    public String toString() {
        switch (this.m) {
            case 7:
                int iHashCode = hashCode();
                qf0.s(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return fx3.h("CreationExtras.Key@", string, "<", w86.a.b(Bundle.class).f(), ">");
            case 17:
                int iHashCode2 = hashCode();
                qf0.s(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return fx3.h("CreationExtras.Key@", string2, "<", w86.a.b(String.class).f(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ yi5(byte b) {
        this.m = b;
    }
}
