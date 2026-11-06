package o;

import android.view.autofill.AutofillValue;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yd1 n;

    public /* synthetic */ xd1(yd1 yd1Var, op6 op6Var) {
        this.m = (byte) 3;
        this.n = yd1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        StringBuilder sb = null;
        boolean z = true;
        yd1 yd1Var = this.n;
        switch (b) {
            case 0:
                bg5 bg5Var = yd1Var.E.t;
                Boolean bool = Boolean.TRUE;
                bg5Var.setValue(bool);
                yd1Var.E.s.setValue(bool);
                j64 j64Var = yd1Var.E;
                AutofillValue autofillValue = ((pi) obj).a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                yd1.X0(j64Var, (String) textValue, yd1Var.F, yd1Var.G);
                return bool;
            case 1:
                List list = (List) obj;
                if (yd1Var.E.d() != null) {
                    ws7 ws7VarD = yd1Var.E.d();
                    ws7VarD.getClass();
                    list.add(ws7VarD.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                yd1.X0(yd1Var.E, ((xo) obj).n, yd1Var.F, yd1Var.G);
                return Boolean.TRUE;
            default:
                xo xoVar = (xo) obj;
                if (yd1Var.F || !yd1Var.G) {
                    z = false;
                } else {
                    ns7 ns7Var = yd1Var.E.e;
                    if (ns7Var != null) {
                        List listL = qf0.L(new ql2(), new cx0(xoVar, 1));
                        j64 j64Var2 = yd1Var.E;
                        wk0 wk0Var = j64Var2.d;
                        od1 od1Var = j64Var2.v;
                        zr7 zr7VarJ = wk0Var.j(listL);
                        ns7Var.a(null, zr7VarJ);
                        od1Var.invoke(zr7VarJ);
                    } else {
                        zr7 zr7Var = yd1Var.D;
                        String str = zr7Var.a.n;
                        long j = zr7Var.b;
                        int i = gt7.c;
                        int i2 = (int) (j >> 32);
                        int i3 = (int) (j & 4294967295L);
                        str.getClass();
                        xoVar.getClass();
                        if (i3 >= i2) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i2);
                            sb.append((CharSequence) xoVar);
                            sb.append((CharSequence) str, i3, str.length());
                        } else {
                            hk0.r(fx3.d(i3, i2, "End index (", ") is less than start index (", ")."));
                        }
                        String string = sb.toString();
                        int length = xoVar.n.length() + ((int) (yd1Var.D.b >> 32));
                        yd1Var.E.v.invoke(new zr7(4, h57.a(length, length), string));
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ xd1(yd1 yd1Var, byte b) {
        this.m = b;
        this.n = yd1Var;
    }
}
