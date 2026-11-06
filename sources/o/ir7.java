package o;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ir7 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pr7 f1094o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir7(pr7 pr7Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1094o = pr7Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        pr7 pr7Var = this.f1094o;
        switch (b) {
            case 0:
                return new ir7(pr7Var, hc1Var, (byte) 0);
            default:
                return new ir7(pr7Var, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                long j = ((t65) obj).a;
                return new ir7(this.f1094o, (hc1) obj2, (byte) 0).invokeSuspend(f88Var);
            default:
                return ((ir7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01a3  */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object zt0Var;
        Object xoVar;
        CharSequence text;
        int i;
        xo xoVar2;
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        byte b2 = 1;
        pr7 pr7Var = this.f1094o;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                byte b3 = this.n;
                if (b3 != 0) {
                    if (b3 == 1) {
                        ct1.a0(obj);
                    } else {
                        if (b3 != 2) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                    }
                    return f88Var;
                }
                ct1.a0(obj);
                this.n = (byte) 1;
                if (pr7Var.t(this) == ne1Var) {
                    return ne1Var;
                }
                vd5 vd5VarF = pr7Var.f();
                if (vd5VarF != null) {
                    String str = (String) vd5VarF.m;
                    long j = ((gt7) vd5VarF.n).a;
                    jm5 jm5Var = pr7Var.j;
                    if (jm5Var != null) {
                        this.n = (byte) 2;
                        om5 om5Var = (om5) jm5Var;
                        Object objJ0 = (str.length() == 0 || gt7.c(j)) ? f88Var : im3.j0(om5Var.a, new tb(om5Var, new mm5(j, str, (hc1) null, om5Var), null, (byte) 5), this);
                        if (objJ0 != ne1Var) {
                            objJ0 = f88Var;
                        }
                        if (objJ0 == ne1Var) {
                            return ne1Var;
                        }
                    }
                }
                return f88Var;
            default:
                byte b4 = this.n;
                if (b4 == 0) {
                    ct1.a0(obj);
                    au0 au0Var = pr7Var.h;
                    if (au0Var != null) {
                        this.n = (byte) 1;
                        ClipData primaryClip = ((gg) au0Var).a.F().getPrimaryClip();
                        zt0Var = primaryClip != null ? new zt0(primaryClip) : null;
                        if (zt0Var == ne1Var) {
                            return ne1Var;
                        }
                    }
                    return f88Var;
                }
                if (b4 == 1) {
                    ct1.a0(obj);
                    zt0Var = obj;
                } else {
                    if (b4 != 2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    xoVar = obj;
                }
                xoVar2 = (xo) xoVar;
                if (xoVar2 != null && pr7Var.h()) {
                    vo voVar = new vo(r47.x(pr7Var.l(), pr7Var.l().a.n.length()));
                    voVar.c(xoVar2);
                    xo xoVarG = voVar.g();
                    xo xoVarW = r47.w(pr7Var.l(), pr7Var.l().a.n.length());
                    vo voVar2 = new vo(xoVarG);
                    voVar2.c(xoVarW);
                    xo xoVarG2 = voVar2.g();
                    int length = xoVar2.n.length() + gt7.f(pr7Var.l().b);
                    pr7Var.c.invoke(pr7.b(xoVarG2, h57.a(length, length)));
                    pr7Var.r(n43.m);
                    pr7Var.a.e = true;
                }
                return f88Var;
                zt0 zt0Var2 = (zt0) zt0Var;
                if (zt0Var2 != null) {
                    this.n = (byte) 2;
                    int i2 = 0;
                    ClipData.Item itemAt = zt0Var2.a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        xoVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i3 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i3];
                                if (im3.n(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel parcelObtain = Parcel.obtain();
                                    byte[] bArrDecode = Base64.decode(value, i2);
                                    parcelObtain.unmarshall(bArrDecode, i2, bArrDecode.length);
                                    parcelObtain.setDataPosition(i2);
                                    long j2 = rv0.h;
                                    long j3 = j2;
                                    long jN = qt7.c;
                                    long jN2 = jN;
                                    ms2 ms2Var = null;
                                    ks2 ks2Var = null;
                                    ls2 ls2Var = null;
                                    String string = null;
                                    h40 h40Var = null;
                                    cs7 cs7Var = null;
                                    vp7 vp7Var = null;
                                    lw6 lw6Var = null;
                                    while (true) {
                                        if (parcelObtain.dataAvail() > b2) {
                                            byte b5 = parcelObtain.readByte();
                                            if (b5 != b2) {
                                                i2 = i2;
                                                parcelObtain = parcelObtain;
                                                if (b5 == 2) {
                                                    if (parcelObtain.dataAvail() >= 5) {
                                                        byte b6 = parcelObtain.readByte();
                                                        long j4 = b6 == b2 ? 4294967296L : b6 == 2 ? 8589934592L : 0L;
                                                        jN = rt7.a(j4, 0L) ? qt7.c : h67.n(parcelObtain.readFloat(), j4);
                                                        b2 = 1;
                                                    }
                                                } else if (b5 == 3) {
                                                    if (parcelObtain.dataAvail() >= 4) {
                                                        ms2Var = new ms2(parcelObtain.readInt());
                                                        b2 = 1;
                                                        i2 = i2;
                                                    }
                                                } else if (b5 == 4) {
                                                    if (parcelObtain.dataAvail() >= 1) {
                                                        byte b7 = parcelObtain.readByte();
                                                        ks2 ks2Var2 = new ks2((b7 != 0 && b7 == 1) ? 1 : i2);
                                                        i2 = i2;
                                                        ks2Var = ks2Var2;
                                                        b2 = 1;
                                                        parcelObtain = parcelObtain;
                                                    }
                                                } else if (b5 != 5) {
                                                    if (b5 == 6) {
                                                        string = parcelObtain.readString();
                                                    } else if (b5 == 7) {
                                                        if (parcelObtain.dataAvail() >= 5) {
                                                            byte b8 = parcelObtain.readByte();
                                                            long j5 = b8 == 1 ? 4294967296L : b8 == 2 ? 8589934592L : 0L;
                                                            jN2 = rt7.a(j5, 0L) ? qt7.c : h67.n(parcelObtain.readFloat(), j5);
                                                        }
                                                    } else if (b5 == 8) {
                                                        if (parcelObtain.dataAvail() >= 4) {
                                                            h40Var = new h40(parcelObtain.readFloat());
                                                            b2 = 1;
                                                            parcelObtain = parcelObtain;
                                                        }
                                                    } else if (b5 == 9) {
                                                        if (parcelObtain.dataAvail() >= 8) {
                                                            cs7Var = new cs7(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                            b2 = 1;
                                                            i2 = i2;
                                                        }
                                                    } else if (b5 == 10) {
                                                        if (parcelObtain.dataAvail() >= 8) {
                                                            int i4 = rv0.i;
                                                            long j6 = parcelObtain.readLong();
                                                            long j7 = j6 & 63;
                                                            if (j7 >= 16) {
                                                                j6 = (j6 & (-64)) | (j7 + 1);
                                                            }
                                                            j3 = j6;
                                                        }
                                                    } else if (b5 != 11) {
                                                        if (b5 == 12) {
                                                            if (parcelObtain.dataAvail() >= 20) {
                                                                int i5 = rv0.i;
                                                                long j8 = parcelObtain.readLong();
                                                                long j9 = j8 & 63;
                                                                if (j9 >= 16) {
                                                                    j8 = (j8 & (-64)) | (j9 + 1);
                                                                }
                                                                lw6Var = new lw6(j8, (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) & 4294967295L), parcelObtain.readFloat());
                                                            }
                                                        }
                                                        b2 = 1;
                                                    } else if (parcelObtain.dataAvail() >= 4) {
                                                        int i6 = parcelObtain.readInt();
                                                        int i7 = (i6 & 2) != 0 ? 1 : i2;
                                                        int i8 = (i6 & 1) != 0 ? 1 : i2;
                                                        vp7 vp7Var2 = vp7.d;
                                                        vp7 vp7Var3 = vp7.c;
                                                        if (i7 != 0 && i8 != 0) {
                                                            List listL = qf0.L(vp7Var2, vp7Var3);
                                                            Integer numValueOf = Integer.valueOf(i2);
                                                            int size = listL.size();
                                                            for (int i9 = i2; i9 < size; i9++) {
                                                                numValueOf = Integer.valueOf(numValueOf.intValue() | ((vp7) listL.get(i9)).a);
                                                            }
                                                            vp7Var = new vp7(numValueOf.intValue());
                                                        } else if (i7 != 0) {
                                                            vp7Var = vp7Var2;
                                                        } else {
                                                            vp7Var = i8 != 0 ? vp7Var3 : vp7.b;
                                                        }
                                                    }
                                                    b2 = 1;
                                                } else if (parcelObtain.dataAvail() >= 1) {
                                                    byte b9 = parcelObtain.readByte();
                                                    if (b9 == 0) {
                                                        i = i2;
                                                    } else if (b9 == 1) {
                                                        i = 65535;
                                                    } else if (b9 == 3) {
                                                        i = 2;
                                                    } else if (b9 == 2) {
                                                        i = 1;
                                                    } else {
                                                        i = i2;
                                                    }
                                                    ls2Var = new ls2(i);
                                                    b2 = 1;
                                                    parcelObtain = parcelObtain;
                                                }
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                int i10 = rv0.i;
                                                long j10 = parcelObtain.readLong();
                                                long j11 = j10 & 63;
                                                j2 = j11 < 16 ? j10 : (j10 & (-64)) | (j11 + 1);
                                            }
                                        }
                                        i2 = i2;
                                    }
                                    arrayList.add(new wo(spanStart, spanEnd, new c77(j2, jN, ms2Var, ks2Var, ls2Var, null, string, jN2, h40Var, cs7Var, null, j3, vp7Var, lw6Var, 49152)));
                                } else {
                                    i2 = i2;
                                }
                                if (i3 != length2) {
                                    i3++;
                                    i2 = i2;
                                    b2 = 1;
                                }
                            }
                        }
                        String string2 = text.toString();
                        xo xoVar3 = yo.a;
                        xoVar = new xo(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        xoVar = new xo(text.toString());
                    }
                    if (xoVar == ne1Var) {
                        return ne1Var;
                    }
                    xoVar2 = (xo) xoVar;
                    if (xoVar2 != null) {
                        vo voVar3 = new vo(r47.x(pr7Var.l(), pr7Var.l().a.n.length()));
                        voVar3.c(xoVar2);
                        xo xoVarG3 = voVar3.g();
                        xo xoVarW2 = r47.w(pr7Var.l(), pr7Var.l().a.n.length());
                        vo voVar4 = new vo(xoVarG3);
                        voVar4.c(xoVarW2);
                        xo xoVarG4 = voVar4.g();
                        int length3 = xoVar2.n.length() + gt7.f(pr7Var.l().b);
                        pr7Var.c.invoke(pr7.b(xoVarG4, h57.a(length3, length3)));
                        pr7Var.r(n43.m);
                        pr7Var.a.e = true;
                    }
                }
                return f88Var;
        }
    }
}
