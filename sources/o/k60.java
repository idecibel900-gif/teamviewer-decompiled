package o;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Observer;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class k60 implements Observer {
    public final /* synthetic */ byte m;
    public final /* synthetic */ q60 n;

    public /* synthetic */ k60(q60 q60Var, byte b) {
        this.m = b;
        this.n = q60Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016a A[LOOP:0: B:96:0x015f->B:100:0x016a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:101:0x016d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x017b  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:83:0x0128  */
    /* JADX WARN: Code duplicated, block: B:85:0x0130  */
    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138  */
    /* JADX WARN: Code duplicated, block: B:90:0x0148  */
    /* JADX WARN: Code duplicated, block: B:97:0x0161  */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x017b, please report this as an issue */
    @Override // androidx.lifecycle.Observer
    public final void a(Object obj) {
        d70 d70Var;
        Context contextE;
        String str;
        String[] stringArray;
        int length;
        int i;
        byte b;
        byte b2 = this.m;
        byte b3 = 5;
        int i2 = 0;
        String strI = null;
        q60 q60Var = this.n;
        switch (b2) {
            case 0:
                u60 u60Var = (u60) obj;
                if (u60Var != null) {
                    q60Var.I0(u60Var);
                    d70 d70Var2 = q60Var.q0;
                    nw4 nw4Var = d70Var2.A;
                    if (nw4Var == null) {
                        nw4Var = new nw4();
                        d70Var2.A = nw4Var;
                    }
                    d70.Y0(nw4Var, null);
                }
                break;
            case 1:
                j60 j60Var = (j60) obj;
                if (j60Var != null) {
                    int i3 = j60Var.a;
                    CharSequence charSequenceW = j60Var.b;
                    switch (i3) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case ep1.b /* 9 */:
                        case ep1.c /* 10 */:
                        case 11:
                        case ep1.d /* 12 */:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i3 = 8;
                            break;
                    }
                    Context contextE2 = q60Var.E();
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 < 29 && ((i3 == 7 || i3 == 9) && contextE2 != null)) {
                        KeyguardManager keyguardManagerA = ky3.a(contextE2);
                        if ((keyguardManagerA == null ? false : ky3.b(keyguardManagerA)) && mo8.o(q60Var.q0.V0())) {
                            q60Var.F0();
                        } else if (q60Var.E0()) {
                            if (charSequenceW == null) {
                                charSequenceW = vs1.w(q60Var.E(), i3);
                            }
                            d70Var = q60Var.q0;
                            if (i3 == 5) {
                                b = d70Var.u;
                                if (b != 0) {
                                    q60Var.H0(i3, charSequenceW);
                                } else {
                                    q60Var.H0(i3, charSequenceW);
                                }
                                q60Var.B0();
                            } else {
                                if (d70Var.F) {
                                    q60Var.G0(i3, charSequenceW);
                                } else {
                                    q60Var.J0(charSequenceW);
                                    Handler handler = q60Var.p0;
                                    qt qtVar = new qt(q60Var, i3, charSequenceW);
                                    contextE = q60Var.E();
                                    if (contextE != null) {
                                        str = Build.MODEL;
                                        if (i4 == 28) {
                                            i2 = 2000;
                                        } else {
                                            stringArray = contextE.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                            length = stringArray.length;
                                            i = 0;
                                            while (true) {
                                                if (i < length) {
                                                    i2 = 2000;
                                                } else if (str.startsWith(stringArray[i])) {
                                                    i++;
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = 2000;
                                    }
                                    handler.postDelayed(qtVar, i2);
                                }
                                q60Var.q0.F = true;
                            }
                        } else {
                            if (charSequenceW == null) {
                                charSequenceW = q60Var.I(R.string.default_error_msg) + " " + i3;
                            }
                            q60Var.G0(i3, charSequenceW);
                        }
                    } else if (q60Var.E0()) {
                        if (charSequenceW == null) {
                            charSequenceW = vs1.w(q60Var.E(), i3);
                        }
                        d70Var = q60Var.q0;
                        if (i3 == 5) {
                            b = d70Var.u;
                            if (b != 0 || b == 3) {
                                q60Var.H0(i3, charSequenceW);
                            }
                            q60Var.B0();
                        } else {
                            if (d70Var.F) {
                                q60Var.G0(i3, charSequenceW);
                            } else {
                                q60Var.J0(charSequenceW);
                                Handler handler2 = q60Var.p0;
                                qt qtVar2 = new qt(q60Var, i3, charSequenceW);
                                contextE = q60Var.E();
                                if (contextE != null) {
                                    str = Build.MODEL;
                                    if (i4 == 28 || str == null) {
                                        i2 = 2000;
                                    } else {
                                        stringArray = contextE.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        length = stringArray.length;
                                        i = 0;
                                        while (true) {
                                            if (i < length) {
                                                i2 = 2000;
                                            } else if (str.startsWith(stringArray[i])) {
                                                i++;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = 2000;
                                }
                                handler2.postDelayed(qtVar2, i2);
                            }
                            q60Var.q0.F = true;
                        }
                    } else {
                        if (charSequenceW == null) {
                            charSequenceW = q60Var.I(R.string.default_error_msg) + " " + i3;
                        }
                        q60Var.G0(i3, charSequenceW);
                    }
                    d70 d70Var3 = q60Var.q0;
                    nw4 nw4Var2 = d70Var3.B;
                    if (nw4Var2 == null) {
                        nw4Var2 = new nw4();
                        d70Var3.B = nw4Var2;
                    }
                    d70.Y0(nw4Var2, null);
                }
                break;
            case 2:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (q60Var.E0()) {
                        q60Var.J0(charSequence);
                    }
                    d70 d70Var4 = q60Var.q0;
                    nw4 nw4Var3 = d70Var4.B;
                    if (nw4Var3 == null) {
                        nw4Var3 = new nw4();
                        d70Var4.B = nw4Var3;
                    }
                    d70.Y0(nw4Var3, null);
                }
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    if (q60Var.E0()) {
                        q60Var.J0(q60Var.I(R.string.fingerprint_not_recognized));
                    }
                    if (q60Var.q0.w) {
                        new Handler(Looper.getMainLooper()).post(new mt8(q60Var, b3));
                    } else {
                        io.sentry.android.core.v0.j("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    d70 d70Var5 = q60Var.q0;
                    nw4 nw4Var4 = d70Var5.D;
                    if (nw4Var4 == null) {
                        nw4Var4 = new nw4();
                        d70Var5.D = nw4Var4;
                    }
                    d70.Y0(nw4Var4, Boolean.FALSE);
                }
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    if (q60Var.D0()) {
                        q60Var.F0();
                    } else {
                        d70 d70Var6 = q60Var.q0;
                        String str2 = d70Var6.t;
                        if (str2 != null) {
                            strI = str2;
                        } else if (d70Var6.f592o != null) {
                            strI = "";
                        }
                        if (strI == null) {
                            strI = q60Var.I(R.string.default_error_msg);
                        }
                        q60Var.G0(13, strI);
                        q60Var.A0(2);
                    }
                    q60Var.q0.X0(false);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    q60Var.A0(1);
                    q60Var.B0();
                    d70 d70Var7 = q60Var.q0;
                    nw4 nw4Var5 = d70Var7.G;
                    if (nw4Var5 == null) {
                        nw4Var5 = new nw4();
                        d70Var7.G = nw4Var5;
                    }
                    d70.Y0(nw4Var5, Boolean.FALSE);
                }
                break;
        }
    }
}
