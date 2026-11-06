package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ux3 {
    public int a;
    public int b;
    public int c;
    public int d;
    public final ArrayList e = new ArrayList();
    public int f;
    public final int g;
    public final vx3 h;

    public ux3(Resources resources, vx3 vx3Var, XmlResourceParser xmlResourceParser) {
        this.h = vx3Var;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mz5.a);
        int i = vx3Var.k;
        this.a = vx3.b(typedArrayObtainAttributes, 2, i, vx3Var.b);
        int i2 = vx3Var.l;
        this.b = vx3.b(typedArrayObtainAttributes, 1, i2, vx3Var.c);
        this.c = vx3.b(typedArrayObtainAttributes, 0, i, vx3Var.a);
        this.d = vx3.b(typedArrayObtainAttributes, 3, i2, vx3Var.d);
        typedArrayObtainAttributes.recycle();
        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mz5.d);
        this.f = typedArrayObtainAttributes2.getInt(1, 0);
        this.g = typedArrayObtainAttributes2.getResourceId(0, 0);
        typedArrayObtainAttributes2.recycle();
    }

    public ux3(vx3 vx3Var) {
        this.h = vx3Var;
    }
}
