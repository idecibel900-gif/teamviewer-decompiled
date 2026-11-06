package o;

import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class p70 {
    public final /* synthetic */ byte a = 1;
    public final za5 b;
    public final tp6 c;
    public final Object d;
    public final Object e;

    public p70(te3 te3Var, za5 za5Var, tp6 tp6Var, ef2 ef2Var) {
        this.d = te3Var;
        this.b = za5Var;
        this.c = tp6Var;
        this.e = ef2Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public final Object a(jc1 jc1Var) throws Throwable {
        o70 o70Var;
        tp6 tp6Var;
        y yVar;
        y97 y97Var;
        byte b = this.a;
        tp6 tp6Var2 = this.c;
        ne1 ne1Var = ne1.m;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                if (jc1Var instanceof o70) {
                    o70Var = (o70) jc1Var;
                    int i = o70Var.p;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        o70Var.p = i - Integer.MIN_VALUE;
                    } else {
                        o70Var = new o70(this, jc1Var);
                    }
                } else {
                    o70Var = new o70(this, jc1Var);
                }
                Object objJ0 = o70Var.n;
                int i2 = o70Var.p;
                try {
                    try {
                        if (i2 == 0) {
                            ct1.a0(objJ0);
                            o70Var.m = tp6Var2;
                            o70Var.p = 1;
                            if (tp6Var2.a(o70Var) == ne1Var) {
                                return ne1Var;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                tp6Var = o70Var.m;
                                try {
                                    ct1.a0(objJ0);
                                    qi1 qi1Var = (qi1) objJ0;
                                    tp6Var.c();
                                    return qi1Var;
                                } catch (Throwable th) {
                                    th = th;
                                    tp6Var.c();
                                    throw th;
                                }
                            }
                            tp6Var2 = o70Var.m;
                            ct1.a0(objJ0);
                        }
                        objJ0 = im3.j0(ba2.m, new i9(yVar, hc1Var, (byte) 16), o70Var);
                        if (objJ0 == ne1Var) {
                            return ne1Var;
                        }
                        tp6Var = tp6Var2;
                        qi1 qi1Var2 = (qi1) objJ0;
                        tp6Var.c();
                        return qi1Var2;
                    } catch (Throwable th2) {
                        th = th2;
                        tp6Var = tp6Var2;
                        tp6Var.c();
                        throw th;
                    }
                    yVar = new y(this, (byte) 13);
                    o70Var.m = tp6Var2;
                    o70Var.p = 2;
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            default:
                if (jc1Var instanceof y97) {
                    y97Var = (y97) jc1Var;
                    int i3 = y97Var.p;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        y97Var.p = i3 - Integer.MIN_VALUE;
                    } else {
                        y97Var = new y97(this, jc1Var);
                    }
                } else {
                    y97Var = new y97(this, jc1Var);
                }
                Object obj = y97Var.n;
                int i4 = y97Var.p;
                if (i4 == 0) {
                    ct1.a0(obj);
                    y97Var.m = tp6Var2;
                    y97Var.p = 1;
                    if (tp6Var2.a(y97Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i4 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tp6Var2 = y97Var.m;
                    ct1.a0(obj);
                }
                try {
                    AutoCloseable autoCloseable = (AutoCloseable) this.e;
                    try {
                        g76 g76Var = new g76();
                        qi1 qi1Var3 = new qi1(new r70(ImageDecoder.decodeBitmap((ImageDecoder.Source) this.d, new z97(this, g76Var))), g76Var.m);
                        iq8.l(autoCloseable, null);
                        tp6Var2.c();
                        return qi1Var3;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            iq8.l(autoCloseable, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    tp6Var2.c();
                    throw th6;
                }
        }
    }

    public p70(ImageDecoder.Source source, AutoCloseable autoCloseable, za5 za5Var, tp6 tp6Var) {
        this.d = source;
        this.e = autoCloseable;
        this.b = za5Var;
        this.c = tp6Var;
    }
}
