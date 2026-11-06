package o;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class na4 extends AbstractMap implements Serializable {
    public static final gj2 u = new gj2(23);
    public la4 s;
    public la4 t;
    public int p = 0;
    public int q = 0;
    public final Comparator m = u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ma4 f1558o = new ma4();
    public ma4[] n = new ma4[16];
    public int r = 12;

    public final ma4 a(Object obj, boolean z) {
        int iCompareTo;
        ma4 ma4Var;
        ma4 ma4Var2;
        ma4 ma4Var3;
        ma4 ma4Var4;
        ma4 ma4Var5;
        ma4 ma4Var6;
        ma4[] ma4VarArr = this.n;
        int iHashCode = obj.hashCode();
        int i = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i2 = ((i >>> 7) ^ i) ^ (i >>> 4);
        boolean z2 = true;
        int length = i2 & (ma4VarArr.length - 1);
        ma4 ma4Var7 = ma4VarArr[length];
        gj2 gj2Var = u;
        ma4 ma4Var8 = null;
        Comparator comparator = this.m;
        if (ma4Var7 != null) {
            Comparable comparable = comparator == gj2Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = ma4Var7.r;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return ma4Var7;
                }
                ma4 ma4Var9 = iCompareTo < 0 ? ma4Var7.n : ma4Var7.f1454o;
                if (ma4Var9 == null) {
                    break;
                }
                ma4Var7 = ma4Var9;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        ma4 ma4Var10 = this.f1558o;
        if (ma4Var7 != null) {
            ma4 ma4Var11 = ma4Var7;
            ma4Var = new ma4(ma4Var11, obj, i2, ma4Var10, ma4Var10.q);
            if (iCompareTo < 0) {
                ma4Var11.n = ma4Var;
            } else {
                ma4Var11.f1454o = ma4Var;
            }
            b(ma4Var11, true);
        } else {
            if (comparator == gj2Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            ma4Var = new ma4(ma4Var7, obj, i2, ma4Var10, ma4Var10.q);
            ma4VarArr[length] = ma4Var;
        }
        int i3 = this.p;
        this.p = i3 + 1;
        if (i3 > this.r) {
            ma4[] ma4VarArr2 = this.n;
            int length2 = ma4VarArr2.length;
            int i4 = length2 * 2;
            ma4[] ma4VarArr3 = new ma4[i4];
            byte b = 3;
            rr0 rr0Var = new rr0(b);
            rr0 rr0Var2 = new rr0(b);
            int i5 = 0;
            while (i5 < length2) {
                ma4 ma4Var12 = ma4VarArr2[i5];
                if (ma4Var12 == null) {
                    z2 = z2;
                    ma4Var3 = ma4Var8;
                } else {
                    ma4 ma4Var13 = ma4Var8;
                    for (ma4 ma4Var14 = ma4Var12; ma4Var14 != null; ma4Var14 = ma4Var14.n) {
                        ma4Var14.m = ma4Var13;
                        ma4Var13 = ma4Var14;
                    }
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (ma4Var13 != null) {
                            ma4 ma4Var15 = ma4Var13.m;
                            ma4Var13.m = ma4Var8;
                            ma4 ma4Var16 = ma4Var13.f1454o;
                            while (true) {
                                ma4 ma4Var17 = ma4Var16;
                                ma4Var2 = ma4Var15;
                                ma4Var15 = ma4Var17;
                                if (ma4Var15 == null) {
                                    break;
                                }
                                ma4Var15.m = ma4Var2;
                                ma4Var16 = ma4Var15.n;
                            }
                        } else {
                            ma4 ma4Var18 = ma4Var13;
                            ma4Var13 = ma4Var8;
                            ma4Var2 = ma4Var18;
                        }
                        if (ma4Var13 == null) {
                            break;
                        }
                        if ((ma4Var13.s & length2) == 0) {
                            i6++;
                        } else {
                            i7++;
                        }
                        ma4Var13 = ma4Var2;
                        z2 = z2;
                        ma4Var8 = null;
                    }
                    rr0Var.b = ((Integer.highestOneBit(i6) * 2) - 1) - i6;
                    rr0Var.d = 0;
                    rr0Var.c = 0;
                    ma4Var3 = null;
                    rr0Var.e = null;
                    rr0Var2.b = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    rr0Var2.d = 0;
                    rr0Var2.c = 0;
                    rr0Var2.e = null;
                    ma4 ma4Var19 = null;
                    while (ma4Var12 != null) {
                        ma4Var12.m = ma4Var19;
                        ma4 ma4Var20 = ma4Var12;
                        ma4Var12 = ma4Var12.n;
                        ma4Var19 = ma4Var20;
                    }
                    while (true) {
                        if (ma4Var19 != null) {
                            ma4 ma4Var21 = ma4Var19.m;
                            ma4Var19.m = null;
                            ma4 ma4Var22 = ma4Var19.f1454o;
                            while (true) {
                                ma4 ma4Var23 = ma4Var22;
                                ma4Var4 = ma4Var21;
                                ma4Var21 = ma4Var23;
                                if (ma4Var21 == null) {
                                    break;
                                }
                                ma4Var21.m = ma4Var4;
                                ma4Var22 = ma4Var21.n;
                            }
                        } else {
                            ma4Var4 = ma4Var19;
                            ma4Var19 = null;
                        }
                        if (ma4Var19 == null) {
                            break;
                        }
                        if ((ma4Var19.s & length2) == 0) {
                            rr0Var.a(ma4Var19);
                        } else {
                            rr0Var2.a(ma4Var19);
                        }
                        ma4Var19 = ma4Var4;
                    }
                    if (i6 > 0) {
                        ma4Var5 = (ma4) rr0Var.e;
                        if (ma4Var5.m != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        ma4Var5 = null;
                    }
                    ma4VarArr3[i5] = ma4Var5;
                    int i8 = i5 + length2;
                    if (i7 > 0) {
                        ma4Var6 = (ma4) rr0Var2.e;
                        if (ma4Var6.m != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        ma4Var6 = null;
                    }
                    ma4VarArr3[i8] = ma4Var6;
                }
                i5++;
                ma4Var8 = ma4Var3;
                z2 = z2;
            }
            this.n = ma4VarArr3;
            this.r = (i4 / 4) + (i4 / 2);
        }
        this.q++;
        return ma4Var;
    }

    public final void b(ma4 ma4Var, boolean z) {
        while (ma4Var != null) {
            ma4 ma4Var2 = ma4Var.n;
            ma4 ma4Var3 = ma4Var.f1454o;
            int i = ma4Var2 != null ? ma4Var2.u : 0;
            int i2 = ma4Var3 != null ? ma4Var3.u : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                ma4 ma4Var4 = ma4Var3.n;
                ma4 ma4Var5 = ma4Var3.f1454o;
                int i4 = (ma4Var4 != null ? ma4Var4.u : 0) - (ma4Var5 != null ? ma4Var5.u : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    f(ma4Var3);
                }
                e(ma4Var);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                ma4 ma4Var6 = ma4Var2.n;
                ma4 ma4Var7 = ma4Var2.f1454o;
                int i5 = (ma4Var6 != null ? ma4Var6.u : 0) - (ma4Var7 != null ? ma4Var7.u : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    e(ma4Var2);
                }
                f(ma4Var);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                ma4Var.u = i + 1;
                if (z) {
                    return;
                }
            } else {
                ma4Var.u = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            ma4Var = ma4Var.m;
        }
    }

    public final void c(ma4 ma4Var, boolean z) {
        ma4 ma4Var2;
        ma4 ma4Var3;
        int i;
        if (z) {
            ma4 ma4Var4 = ma4Var.q;
            ma4Var4.p = ma4Var.p;
            ma4Var.p.q = ma4Var4;
            ma4Var.q = null;
            ma4Var.p = null;
        }
        ma4 ma4Var5 = ma4Var.n;
        ma4 ma4Var6 = ma4Var.f1454o;
        ma4 ma4Var7 = ma4Var.m;
        int i2 = 0;
        if (ma4Var5 == null || ma4Var6 == null) {
            if (ma4Var5 != null) {
                d(ma4Var, ma4Var5);
                ma4Var.n = null;
            } else if (ma4Var6 != null) {
                d(ma4Var, ma4Var6);
                ma4Var.f1454o = null;
            } else {
                d(ma4Var, null);
            }
            b(ma4Var7, false);
            this.p--;
            this.q++;
            return;
        }
        if (ma4Var5.u > ma4Var6.u) {
            ma4 ma4Var8 = ma4Var5.f1454o;
            while (true) {
                ma4 ma4Var9 = ma4Var8;
                ma4Var3 = ma4Var5;
                ma4Var5 = ma4Var9;
                if (ma4Var5 == null) {
                    break;
                } else {
                    ma4Var8 = ma4Var5.f1454o;
                }
            }
        } else {
            ma4 ma4Var10 = ma4Var6.n;
            while (true) {
                ma4Var2 = ma4Var6;
                ma4Var6 = ma4Var10;
                if (ma4Var6 == null) {
                    break;
                } else {
                    ma4Var10 = ma4Var6.n;
                }
            }
            ma4Var3 = ma4Var2;
        }
        c(ma4Var3, false);
        ma4 ma4Var11 = ma4Var.n;
        if (ma4Var11 != null) {
            i = ma4Var11.u;
            ma4Var3.n = ma4Var11;
            ma4Var11.m = ma4Var3;
            ma4Var.n = null;
        } else {
            i = 0;
        }
        ma4 ma4Var12 = ma4Var.f1454o;
        if (ma4Var12 != null) {
            i2 = ma4Var12.u;
            ma4Var3.f1454o = ma4Var12;
            ma4Var12.m = ma4Var3;
            ma4Var.f1454o = null;
        }
        ma4Var3.u = Math.max(i, i2) + 1;
        d(ma4Var, ma4Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.n, (Object) null);
        this.p = 0;
        this.q++;
        ma4 ma4Var = this.f1558o;
        ma4 ma4Var2 = ma4Var.p;
        while (ma4Var2 != ma4Var) {
            ma4 ma4Var3 = ma4Var2.p;
            ma4Var2.q = null;
            ma4Var2.p = null;
            ma4Var2 = ma4Var3;
        }
        ma4Var.q = ma4Var;
        ma4Var.p = ma4Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        ma4 ma4VarA = null;
        if (obj != null) {
            try {
                ma4VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return ma4VarA != null;
    }

    public final void d(ma4 ma4Var, ma4 ma4Var2) {
        ma4 ma4Var3 = ma4Var.m;
        ma4Var.m = null;
        if (ma4Var2 != null) {
            ma4Var2.m = ma4Var3;
        }
        if (ma4Var3 == null) {
            int i = ma4Var.s;
            ma4[] ma4VarArr = this.n;
            ma4VarArr[i & (ma4VarArr.length - 1)] = ma4Var2;
        } else if (ma4Var3.n == ma4Var) {
            ma4Var3.n = ma4Var2;
        } else {
            ma4Var3.f1454o = ma4Var2;
        }
    }

    public final void e(ma4 ma4Var) {
        ma4 ma4Var2 = ma4Var.n;
        ma4 ma4Var3 = ma4Var.f1454o;
        ma4 ma4Var4 = ma4Var3.n;
        ma4 ma4Var5 = ma4Var3.f1454o;
        ma4Var.f1454o = ma4Var4;
        if (ma4Var4 != null) {
            ma4Var4.m = ma4Var;
        }
        d(ma4Var, ma4Var3);
        ma4Var3.n = ma4Var;
        ma4Var.m = ma4Var3;
        int iMax = Math.max(ma4Var2 != null ? ma4Var2.u : 0, ma4Var4 != null ? ma4Var4.u : 0) + 1;
        ma4Var.u = iMax;
        ma4Var3.u = Math.max(iMax, ma4Var5 != null ? ma4Var5.u : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        la4 la4Var = this.s;
        if (la4Var != null) {
            return la4Var;
        }
        la4 la4Var2 = new la4(this, (byte) 0);
        this.s = la4Var2;
        return la4Var2;
    }

    public final void f(ma4 ma4Var) {
        ma4 ma4Var2 = ma4Var.n;
        ma4 ma4Var3 = ma4Var.f1454o;
        ma4 ma4Var4 = ma4Var2.n;
        ma4 ma4Var5 = ma4Var2.f1454o;
        ma4Var.n = ma4Var5;
        if (ma4Var5 != null) {
            ma4Var5.m = ma4Var;
        }
        d(ma4Var, ma4Var2);
        ma4Var2.f1454o = ma4Var;
        ma4Var.m = ma4Var2;
        int iMax = Math.max(ma4Var3 != null ? ma4Var3.u : 0, ma4Var5 != null ? ma4Var5.u : 0) + 1;
        ma4Var.u = iMax;
        ma4Var2.u = Math.max(iMax, ma4Var4 != null ? ma4Var4.u : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        ma4 ma4VarA;
        if (obj != null) {
            try {
                ma4VarA = a(obj, false);
            } catch (ClassCastException unused) {
                ma4VarA = null;
            }
        } else {
            ma4VarA = null;
        }
        if (ma4VarA != null) {
            return ma4VarA.t;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        la4 la4Var = this.t;
        if (la4Var != null) {
            return la4Var;
        }
        la4 la4Var2 = new la4(this, (byte) 1);
        this.t = la4Var2;
        return la4Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            yq4.l("key == null");
            return null;
        }
        ma4 ma4VarA = a(obj, true);
        Object obj3 = ma4VarA.t;
        ma4VarA.t = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        ma4 ma4VarA;
        if (obj != null) {
            try {
                ma4VarA = a(obj, false);
            } catch (ClassCastException unused) {
                ma4VarA = null;
            }
        } else {
            ma4VarA = null;
        }
        if (ma4VarA != null) {
            c(ma4VarA, true);
        }
        if (ma4VarA != null) {
            return ma4VarA.t;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.p;
    }
}
