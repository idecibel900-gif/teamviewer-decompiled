package o;

import android.content.SharedPreferences;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.teamviewer.remotecontrollib.swig.ISolutionsViewModel;
import com.teamviewer.remotecontrollib.swig.ISolutionsViewModelSWIGJNI;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nu6 extends cx2 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nu6(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.n = b;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01d3 A[PHI: r38
      0x01d3: PHI (r38v3 o.yw3) = (r38v1 o.yw3), (r38v1 o.yw3), (r38v1 o.yw3), (r38v1 o.yw3), (r38v4 o.yw3) binds: [B:165:0x0293, B:167:0x02a3, B:162:0x028d, B:147:0x0253, B:111:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:174:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:189:0x0302  */
    /* JADX WARN: Code duplicated, block: B:199:0x0326  */
    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:330:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        cx0 cx0Var;
        yw3 yw3Var;
        ft7 ft7Var;
        yw3 yw3Var2;
        yw3 yw3Var3;
        yw3 yw3Var4;
        yw3 yw3Var5;
        Integer numValueOf;
        byte b = this.n;
        boolean z = false;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                su6 su6Var = (su6) this.receiver;
                su6Var.getClass();
                l97 l97Var = su6Var.t;
                while (true) {
                    Object value2 = l97Var.getValue();
                    String str2 = str;
                    if (l97Var.j(value2, it6.a((it6) value2, null, false, null, null, str2, null, null, false, ub7.b0(str) || wh5.a.matcher(str).matches(), false, false, false, false, false, false, 32495))) {
                        return f88Var;
                    }
                    str = str2;
                }
                break;
            case 1:
                String str3 = (String) obj;
                str3.getClass();
                su6 su6Var2 = (su6) this.receiver;
                su6Var2.getClass();
                l97 l97Var2 = su6Var2.t;
                do {
                    value = l97Var2.getValue();
                } while (!l97Var2.j(value, it6.a((it6) value, null, false, null, null, null, str3, null, false, false, str3.length() <= 500, false, false, false, false, false, 32223)));
                return f88Var;
            case 2:
                String str4 = (String) obj;
                str4.getClass();
                hw6 hw6Var = (hw6) this.receiver;
                hw6Var.getClass();
                SharedPreferences.Editor editorEdit = hw6Var.p.edit();
                editorEdit.getClass();
                editorEdit.putString("lock_timeout_value", str4);
                editorEdit.apply();
                l97 l97Var3 = hw6Var.x;
                dw6 dw6Var = (dw6) l97Var3.getValue();
                dw6Var.getClass();
                l97Var3.l(null, dw6.a(dw6Var, false, false, false, false, false, false, false, false, false, str4, false, false, false, 30719));
                return f88Var;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                hw6 hw6Var2 = (hw6) this.receiver;
                hw6Var2.B.setValue(bool);
                hw6Var2.A.A(0);
                return f88Var;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                hw6 hw6Var3 = (hw6) this.receiver;
                fx3.q(hw6Var3.p, "KEY_FORCE_NATIVE_SESSION_RC", zBooleanValue);
                l97 l97Var4 = hw6Var3.x;
                dw6 dw6Var2 = (dw6) l97Var4.getValue();
                dw6Var2.getClass();
                l97Var4.l(null, dw6.a(dw6Var2, false, false, false, false, false, false, false, false, false, null, zBooleanValue, false, false, 28671));
                return f88Var;
            case 5:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                hw6 hw6Var4 = (hw6) this.receiver;
                fx3.q(hw6Var4.p, "KEY_FORCE_NATIVE_SESSION_FT", zBooleanValue2);
                l97 l97Var5 = hw6Var4.x;
                dw6 dw6Var3 = (dw6) l97Var5.getValue();
                dw6Var3.getClass();
                l97Var5.l(null, dw6.a(dw6Var3, false, false, false, false, false, false, false, false, false, null, false, zBooleanValue2, false, 24575));
                return f88Var;
            case 6:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                hw6 hw6Var5 = (hw6) this.receiver;
                fx3.q(hw6Var5.p, "KEY_ENABLE_RC_REDESIGNED_DEVICE_TAB", zBooleanValue3);
                l97 l97Var6 = hw6Var5.x;
                dw6 dw6Var4 = (dw6) l97Var6.getValue();
                dw6Var4.getClass();
                l97Var6.l(null, dw6.a(dw6Var4, false, false, false, false, false, false, false, false, false, null, false, false, zBooleanValue3, 16383));
                return f88Var;
            case 7:
                String str5 = (String) obj;
                str5.getClass();
                ((e67) this.receiver).getClass();
                return "market://details?id=".concat(str5);
            case 8:
                String str6 = (String) obj;
                str6.getClass();
                ((e67) this.receiver).getClass();
                return str6.equals("com.teamviewer.blizz.market") ? "https://play.google.com/store/apps/details?id=com.teamviewer.blizz.market" : "https://www.teamviewer.com/en/download/android/";
            case ep1.b /* 9 */:
                String str7 = (String) obj;
                str7.getClass();
                e67 e67Var = (e67) this.receiver;
                e67Var.getClass();
                ISolutionsViewModel iSolutionsViewModel = e67Var.n;
                ISolutionsViewModelSWIGJNI.ISolutionsViewModel_ReportActionEvent(iSolutionsViewModel.a, iSolutionsViewModel, str7);
                return f88Var;
            case ep1.c /* 10 */:
                ((nw4) this.receiver).postValue((Boolean) obj);
                return f88Var;
            case 11:
                long j = ((t65) obj).a;
                jp7 jp7Var = (jp7) this.receiver;
                jp7Var.getClass();
                op7 op7Var = (op7) xk0.q(jp7Var, pp7.a);
                if (op7Var != null) {
                    im3.R(jp7Var.I0(), null, null, new k0(jp7Var, j, op7Var, new ip7(jp7Var, j), (hc1) null), 3);
                }
                return f88Var;
            case ep1.d /* 12 */:
                ((cp7) this.receiver).b.a((Function1) obj);
                return f88Var;
            default:
                KeyEvent keyEvent = ((dx3) obj).a;
                sq7 sq7Var = (sq7) this.receiver;
                ft7 ft7Var2 = sq7Var.f;
                boolean z2 = sq7Var.d;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    cx0Var = null;
                } else {
                    bi1 bi1Var = sq7Var.i;
                    bi1Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        bi1Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = bi1Var.a;
                        if (num != null) {
                            bi1Var.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        cx0Var = new cx0(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        cx0Var = null;
                    }
                }
                if (cx0Var != null) {
                    if (z2) {
                        sq7Var.a(qf0.K(cx0Var));
                        ft7Var2.a = null;
                        z = true;
                    }
                } else if (yo1.F(keyEvent) == 2) {
                    ju juVar = j51.q;
                    int iT = lq1.t(keyEvent);
                    if (iT == 9) {
                        long jM = qs1.m(keyEvent.getKeyCode());
                        if (xw3.a(jM, xw3.f)) {
                            yw3Var = yw3.SELECT_LINE_LEFT;
                        } else if (xw3.a(jM, xw3.g)) {
                            yw3Var = yw3.SELECT_LINE_RIGHT;
                        } else if (xw3.a(jM, xw3.d)) {
                            yw3Var = yw3.SELECT_HOME;
                        } else if (xw3.a(jM, xw3.e)) {
                            yw3Var = yw3.SELECT_END;
                        } else {
                            yw3Var = null;
                        }
                    } else if (iT == 1) {
                        long jM2 = qs1.m(keyEvent.getKeyCode());
                        if (xw3.a(jM2, xw3.f)) {
                            yw3Var = yw3.LINE_LEFT;
                        } else if (xw3.a(jM2, xw3.g)) {
                            yw3Var = yw3.LINE_RIGHT;
                        } else if (xw3.a(jM2, xw3.d)) {
                            yw3Var = yw3.HOME;
                        } else if (xw3.a(jM2, xw3.e)) {
                            yw3Var = yw3.END;
                        } else if (xw3.a(jM2, xw3.s)) {
                            yw3Var = yw3.DELETE_FROM_LINE_START;
                        } else {
                            yw3Var = null;
                        }
                    } else {
                        yw3Var = null;
                    }
                    if (yw3Var == null) {
                        nx3 nx3Var = xk0.f2524o;
                        int iT2 = lq1.t(keyEvent);
                        long jM3 = qs1.m(keyEvent.getKeyCode());
                        boolean zA = xw3.a(jM3, xw3.s);
                        yw3 yw3Var6 = yw3.NEW_LINE;
                        yw3 yw3Var7 = yw3.DELETE_PREV_CHAR;
                        if (!zA) {
                            ft7Var = ft7Var2;
                            yw3Var2 = ((xw3.a(jM3, xw3.r) || xw3.a(jM3, xw3.E)) && (iT2 == 0 || iT2 == 8 || iT2 == 2 || iT2 == 10)) ? yw3Var6 : null;
                        } else if (iT2 == 0 || iT2 == 8 || iT2 == 12) {
                            ft7Var = ft7Var2;
                            yw3Var2 = yw3Var7;
                        } else {
                            yw3Var2 = (iT2 == 2 || iT2 == 10) ? yw3.DELETE_PREV_WORD : null;
                            ft7Var = ft7Var2;
                        }
                        if (yw3Var2 != null) {
                            yw3Var = yw3Var2;
                        } else {
                            int iT3 = lq1.t(keyEvent);
                            yw3 yw3Var8 = yw3.SELECT_LINE_START;
                            yw3 yw3Var9 = yw3.SELECT_LINE_END;
                            if (iT3 == 10) {
                                long jM4 = qs1.m(keyEvent.getKeyCode());
                                yw3Var3 = yw3Var6;
                                if (xw3.a(jM4, xw3.f) || xw3.a(jM4, xw3.H)) {
                                    yw3Var4 = yw3.SELECT_LEFT_WORD;
                                } else if (xw3.a(jM4, xw3.g) || xw3.a(jM4, xw3.I)) {
                                    yw3Var4 = yw3.SELECT_RIGHT_WORD;
                                } else if (xw3.a(jM4, xw3.d) || xw3.a(jM4, xw3.F)) {
                                    yw3Var4 = yw3.SELECT_PREV_PARAGRAPH;
                                } else if (xw3.a(jM4, xw3.e) || xw3.a(jM4, xw3.G)) {
                                    yw3Var4 = yw3.SELECT_NEXT_PARAGRAPH;
                                } else {
                                    yw3Var4 = null;
                                }
                            } else {
                                yw3Var3 = yw3Var6;
                                if (iT3 == 2) {
                                    long jM5 = qs1.m(keyEvent.getKeyCode());
                                    if (xw3.a(jM5, xw3.f) || xw3.a(jM5, xw3.H)) {
                                        yw3Var4 = yw3.LEFT_WORD;
                                    } else if (xw3.a(jM5, xw3.g) || xw3.a(jM5, xw3.I)) {
                                        yw3Var4 = yw3.RIGHT_WORD;
                                    } else if (xw3.a(jM5, xw3.d) || xw3.a(jM5, xw3.F)) {
                                        yw3Var4 = yw3.PREV_PARAGRAPH;
                                    } else if (xw3.a(jM5, xw3.e) || xw3.a(jM5, xw3.G)) {
                                        yw3Var4 = yw3.NEXT_PARAGRAPH;
                                    } else if (xw3.a(jM5, xw3.k)) {
                                        yw3Var4 = yw3Var7;
                                    } else if (xw3.a(jM5, xw3.t)) {
                                        yw3Var4 = yw3.DELETE_NEXT_WORD;
                                    } else if (xw3.a(jM5, xw3.B)) {
                                        yw3Var4 = yw3.DESELECT;
                                    } else {
                                        yw3Var4 = null;
                                    }
                                } else if (iT3 == 8) {
                                    long jM6 = qs1.m(keyEvent.getKeyCode());
                                    if (xw3.a(jM6, xw3.v) || xw3.a(jM6, xw3.J)) {
                                        yw3Var4 = yw3Var8;
                                    } else if (xw3.a(jM6, xw3.w) || xw3.a(jM6, xw3.K)) {
                                        yw3Var4 = yw3Var9;
                                    } else {
                                        yw3Var4 = null;
                                    }
                                } else if (iT3 == 1 && xw3.a(qs1.m(keyEvent.getKeyCode()), xw3.t)) {
                                    yw3Var4 = yw3.DELETE_TO_LINE_END;
                                } else {
                                    yw3Var4 = null;
                                }
                            }
                            if (yw3Var4 == null) {
                                Object obj2 = nx3Var.n;
                                int iT4 = lq1.t(keyEvent);
                                yw3 yw3Var10 = yw3.REDO;
                                if (iT4 != 10) {
                                    yw3 yw3Var11 = yw3.COPY;
                                    yw3 yw3Var12 = yw3.CUT;
                                    yw3 yw3Var13 = yw3.PASTE;
                                    if (iT4 == 2) {
                                        long jM7 = qs1.m(keyEvent.getKeyCode());
                                        if (xw3.a(jM7, xw3.j) || xw3.a(jM7, xw3.x) || xw3.a(jM7, xw3.N)) {
                                            yw3Var5 = yw3Var11;
                                        } else if (xw3.a(jM7, xw3.l)) {
                                            yw3Var5 = yw3Var13;
                                        } else if (xw3.a(jM7, xw3.m)) {
                                            yw3Var5 = yw3Var12;
                                        } else if (xw3.a(jM7, xw3.i)) {
                                            yw3Var5 = yw3.SELECT_ALL;
                                        } else if (xw3.a(jM7, xw3.n)) {
                                            yw3Var5 = yw3Var10;
                                        } else if (xw3.a(jM7, xw3.f2557o)) {
                                            yw3Var5 = yw3.UNDO;
                                        } else {
                                            yw3Var5 = null;
                                        }
                                    } else if (iT4 == 8) {
                                        long jM8 = qs1.m(keyEvent.getKeyCode());
                                        if (xw3.a(jM8, xw3.f) || xw3.a(jM8, xw3.H)) {
                                            yw3Var5 = yw3.SELECT_LEFT_CHAR;
                                        } else if (xw3.a(jM8, xw3.g) || xw3.a(jM8, xw3.I)) {
                                            yw3Var5 = yw3.SELECT_RIGHT_CHAR;
                                        } else if (xw3.a(jM8, xw3.d) || xw3.a(jM8, xw3.F)) {
                                            yw3Var5 = yw3.SELECT_UP;
                                        } else if (xw3.a(jM8, xw3.e) || xw3.a(jM8, xw3.G)) {
                                            yw3Var5 = yw3.SELECT_DOWN;
                                        } else if (xw3.a(jM8, xw3.C) || xw3.a(jM8, xw3.L)) {
                                            yw3Var5 = yw3.SELECT_PAGE_UP;
                                        } else if (xw3.a(jM8, xw3.D) || xw3.a(jM8, xw3.M)) {
                                            yw3Var5 = yw3.SELECT_PAGE_DOWN;
                                        } else if (xw3.a(jM8, xw3.v) || xw3.a(jM8, xw3.J)) {
                                            yw3Var5 = yw3Var8;
                                        } else if (xw3.a(jM8, xw3.w) || xw3.a(jM8, xw3.K)) {
                                            yw3Var5 = yw3Var9;
                                        } else if (xw3.a(jM8, xw3.x) || xw3.a(jM8, xw3.N)) {
                                            yw3Var5 = yw3Var13;
                                        } else {
                                            yw3Var5 = null;
                                        }
                                    } else if (iT4 == 0) {
                                        long jM9 = qs1.m(keyEvent.getKeyCode());
                                        if (xw3.a(jM9, xw3.f) || xw3.a(jM9, xw3.H)) {
                                            yw3Var5 = yw3.LEFT_CHAR;
                                        } else if (xw3.a(jM9, xw3.g) || xw3.a(jM9, xw3.I)) {
                                            yw3Var5 = yw3.RIGHT_CHAR;
                                        } else if (xw3.a(jM9, xw3.d) || xw3.a(jM9, xw3.F)) {
                                            yw3Var5 = yw3.UP;
                                        } else if (xw3.a(jM9, xw3.e) || xw3.a(jM9, xw3.G)) {
                                            yw3Var5 = yw3.DOWN;
                                        } else if (xw3.a(jM9, xw3.h)) {
                                            yw3Var5 = yw3.CENTER;
                                        } else if (xw3.a(jM9, xw3.C) || xw3.a(jM9, xw3.L)) {
                                            yw3Var5 = yw3.PAGE_UP;
                                        } else if (xw3.a(jM9, xw3.D) || xw3.a(jM9, xw3.M)) {
                                            yw3Var5 = yw3.PAGE_DOWN;
                                        } else if (xw3.a(jM9, xw3.v) || xw3.a(jM9, xw3.J)) {
                                            yw3Var5 = yw3.LINE_START;
                                        } else if (xw3.a(jM9, xw3.w) || xw3.a(jM9, xw3.K)) {
                                            yw3Var5 = yw3.LINE_END;
                                        } else if (xw3.a(jM9, xw3.r) || xw3.a(jM9, xw3.E)) {
                                            yw3Var5 = yw3Var3;
                                        } else if (xw3.a(jM9, xw3.s)) {
                                            yw3Var5 = yw3Var7;
                                        } else if (xw3.a(jM9, xw3.t)) {
                                            yw3Var5 = yw3.DELETE_NEXT_CHAR;
                                        } else if (xw3.a(jM9, xw3.A)) {
                                            yw3Var5 = yw3Var13;
                                        } else if (xw3.a(jM9, xw3.y)) {
                                            yw3Var5 = yw3Var12;
                                        } else if (xw3.a(jM9, xw3.z)) {
                                            yw3Var5 = yw3Var11;
                                        } else if (xw3.a(jM9, xw3.p)) {
                                            yw3Var5 = yw3.TAB;
                                        } else {
                                            yw3Var5 = null;
                                        }
                                    } else {
                                        yw3Var5 = null;
                                    }
                                } else if (xw3.a(qs1.m(keyEvent.getKeyCode()), xw3.f2557o)) {
                                    yw3Var5 = yw3Var10;
                                } else {
                                    yw3Var5 = null;
                                }
                                yw3Var = yw3Var5;
                            } else {
                                yw3Var = yw3Var4;
                            }
                        }
                    } else {
                        ft7Var = ft7Var2;
                    }
                    if (yw3Var != null && (!yw3Var.m || z2)) {
                        g76 g76Var = new g76();
                        g76Var.m = true;
                        xn5 xn5Var = new xn5(yw3Var, sq7Var, g76Var, (byte) 7);
                        zr7 zr7Var = sq7Var.c;
                        br7 br7Var = new br7(zr7Var, sq7Var.g, sq7Var.a.d(), ft7Var);
                        xn5Var.invoke(br7Var);
                        boolean zB = gt7.b(br7Var.f, zr7Var.b);
                        xo xoVar = br7Var.g;
                        if (!zB || !im3.n(xoVar, zr7Var.a)) {
                            sq7Var.j.invoke(zr7.a(zr7Var, xoVar, br7Var.f, 4));
                        }
                        sq7Var.h.e = true;
                        z = g76Var.m;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
