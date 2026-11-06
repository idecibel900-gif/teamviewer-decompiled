package o;

import androidx.compose.ui.node.Owner;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b11 {
    public static final h72 a = new h72(new ez0((byte) 17), (byte) 1);
    public static final h72 b = new h72(new ez0((byte) 18), (byte) 1);
    public static final h72 c = new h72(new ez0((byte) 23), (byte) 1);
    public static final h72 d = new h72(new ez0((byte) 24), (byte) 1);
    public static final h72 e = new h72(new ez0((byte) 25), (byte) 1);
    public static final h72 f = new h72(new ez0((byte) 26), (byte) 1);
    public static final h72 g = new h72(new ez0((byte) 27), (byte) 1);
    public static final h72 h = new h72(new ez0((byte) 29), (byte) 1);
    public static final h72 i = new h72(new y01(0), (byte) 1);
    public static final h72 j = new h72(new y01(1), (byte) 1);
    public static final h72 k = new h72(new ez0((byte) 28), (byte) 1);
    public static final h72 l = new h72(new y01(2), (byte) 1);
    public static final h72 m = new h72(new y01(3), (byte) 1);
    public static final h72 n = new h72(new y01(4), (byte) 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h72 f381o = new h72(new y01(5), (byte) 1);
    public static final h72 p;
    public static final h72 q;
    public static final h72 r;
    public static final h72 s;
    public static final h72 t;
    public static final h72 u;
    public static final h72 v;
    public static final h72 w;
    public static final h72 x;
    public static final h72 y;

    static {
        new kh7(new y01((byte) 10));
        p = new h72(new y01((byte) 6), (byte) 1);
        q = new h72(new y01((byte) 7), (byte) 1);
        r = new h72(new y01((byte) 8), (byte) 1);
        s = new h72(new y01((byte) 9), (byte) 1);
        t = new h72(new ez0((byte) 19), (byte) 1);
        u = new h72(new ez0((byte) 20), (byte) 1);
        v = new h72(new ez0((byte) 21), (byte) 1);
        w = new h72(new ez0((byte) 22), (byte) 1);
        x = new h72(new ti4((byte) 4), (byte) 0);
        y = new h72(new vr1((byte) 19), (byte) 1);
    }

    public static final void a(final Owner owner, nl nlVar, yy0 yy0Var, ux2 ux2Var, int i2) {
        ux2Var.Y(1925803616);
        int i3 = i2 | (ux2Var.f(owner) ? 4 : 2) | (ux2Var.f(nlVar) ? 32 : 16) | (ux2Var.h(yy0Var) ? 256 : 128);
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            dx5 dx5VarA = a.a(owner.getAccessibilityManager());
            dx5 dx5VarA2 = b.a(owner.getAutofill());
            dx5 dx5VarA3 = d.a(owner.getAutofillManager());
            dx5 dx5VarA4 = c.a(owner.getAutofillTree());
            dx5 dx5VarA5 = e.a(owner.getClipboardManager());
            dx5 dx5VarA6 = f.a(owner.getClipboard());
            dx5 dx5VarA7 = h.a(owner.getDensity());
            dx5 dx5VarA8 = i.a(owner.getFocusOwner());
            dx5 dx5VarA9 = j.a(owner.getFontLoader());
            dx5VarA9.g = false;
            dx5 dx5VarA10 = k.a(owner.getFontFamilyResolver());
            dx5VarA10.g = false;
            dx5 dx5VarA11 = l.a(owner.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z || objK == awVar) {
                final byte b2 = 0;
                objK = new Function1() { // from class: o.z01
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        Owner owner2 = owner;
                        switch (b3) {
                            case 0:
                                return owner2.getInputModeManager();
                            case 1:
                                return owner2.getTextInputService();
                            case 2:
                                return owner2.getSoftwareKeyboardController();
                            case 3:
                                return owner2.getTextToolbar();
                            default:
                                return owner2.getPointerIconService();
                        }
                    }
                };
                ux2Var.g0(objK);
            }
            dx5 dx5VarC = m.c((Function1) objK);
            dx5 dx5VarA12 = n.a(owner.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object objK2 = ux2Var.K();
            if (z2 || objK2 == awVar) {
                final byte b3 = 1;
                objK2 = new Function1() { // from class: o.z01
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        Owner owner2 = owner;
                        switch (b4) {
                            case 0:
                                return owner2.getInputModeManager();
                            case 1:
                                return owner2.getTextInputService();
                            case 2:
                                return owner2.getSoftwareKeyboardController();
                            case 3:
                                return owner2.getTextToolbar();
                            default:
                                return owner2.getPointerIconService();
                        }
                    }
                };
                ux2Var.g0(objK2);
            }
            dx5 dx5VarC2 = p.c((Function1) objK2);
            boolean z3 = i4 == 4;
            Object objK3 = ux2Var.K();
            if (z3 || objK3 == awVar) {
                final byte b4 = 2;
                objK3 = new Function1() { // from class: o.z01
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b5 = b4;
                        Owner owner2 = owner;
                        switch (b5) {
                            case 0:
                                return owner2.getInputModeManager();
                            case 1:
                                return owner2.getTextInputService();
                            case 2:
                                return owner2.getSoftwareKeyboardController();
                            case 3:
                                return owner2.getTextToolbar();
                            default:
                                return owner2.getPointerIconService();
                        }
                    }
                };
                ux2Var.g0(objK3);
            }
            dx5 dx5VarC3 = q.c((Function1) objK3);
            boolean z4 = i4 == 4;
            Object objK4 = ux2Var.K();
            final byte b5 = 3;
            if (z4 || objK4 == awVar) {
                objK4 = new Function1() { // from class: o.z01
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b6 = b5;
                        Owner owner2 = owner;
                        switch (b6) {
                            case 0:
                                return owner2.getInputModeManager();
                            case 1:
                                return owner2.getTextInputService();
                            case 2:
                                return owner2.getSoftwareKeyboardController();
                            case 3:
                                return owner2.getTextToolbar();
                            default:
                                return owner2.getPointerIconService();
                        }
                    }
                };
                ux2Var.g0(objK4);
            }
            dx5 dx5VarC4 = r.c((Function1) objK4);
            dx5 dx5VarA13 = s.a(nlVar);
            dx5 dx5VarA14 = t.a(owner.getViewConfiguration());
            dx5 dx5VarA15 = u.a(owner.getWindowInfo());
            final byte b6 = 4;
            boolean z5 = i4 == 4;
            Object objK5 = ux2Var.K();
            if (z5 || objK5 == awVar) {
                objK5 = new Function1() { // from class: o.z01
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b7 = b6;
                        Owner owner2 = owner;
                        switch (b7) {
                            case 0:
                                return owner2.getInputModeManager();
                            case 1:
                                return owner2.getTextInputService();
                            case 2:
                                return owner2.getSoftwareKeyboardController();
                            case 3:
                                return owner2.getTextToolbar();
                            default:
                                return owner2.getPointerIconService();
                        }
                    }
                };
                ux2Var.g0(objK5);
            }
            j51.m(new dx5[]{dx5VarA, dx5VarA2, dx5VarA3, dx5VarA4, dx5VarA5, dx5VarA6, dx5VarA7, dx5VarA8, dx5VarA9, dx5VarA10, dx5VarA11, dx5VarC, dx5VarA12, dx5VarC2, dx5VarC3, dx5VarC4, dx5VarA13, dx5VarA14, dx5VarA15, w.c((Function1) objK5), g.a(owner.getGraphicsContext()), gd4.a.a(owner.getRetainedValuesStore()), f381o.a(owner.getLocaleList())}, yy0Var, ux2Var, ((i3 >> 3) & 112) | 8);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((Object) owner, (Object) nlVar, (Object) yy0Var, i2, (byte) 5);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
