package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class oh6 implements nh6 {
    public final Function1 m;
    public final jx4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public jx4 f1654o;

    public oh6(Map map, Function1 function1) {
        jx4 jx4Var;
        this.m = function1;
        if (map == null || map.isEmpty()) {
            jx4Var = null;
        } else {
            jx4Var = new jx4(map.size());
            for (Map.Entry entry : map.entrySet()) {
                jx4Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.n = jx4Var;
    }

    @Override // o.nh6
    public final boolean a(Object obj) {
        return ((Boolean) this.m.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // o.nh6
    public final Map e() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        jx4 jx4Var = this.n;
        if (jx4Var == null && this.f1654o == null) {
            return fa2.m;
        }
        int i3 = 0;
        int i4 = jx4Var != null ? jx4Var.e : 0;
        jx4 jx4Var2 = this.f1654o;
        HashMap map = new HashMap(i4 + (jx4Var2 != null ? jx4Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (jx4Var != null) {
            Object[] objArr = jx4Var.b;
            Object[] objArr2 = jx4Var.c;
            long[] jArr3 = jx4Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        jx4 jx4Var3 = this.f1654o;
        if (jx4Var3 != null) {
            Object[] objArr3 = jx4Var3.b;
            Object[] objArr4 = jx4Var3.c;
            long[] jArr4 = jx4Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objA = ((Function0) list.get(i3)).a();
                                    if (objA != null) {
                                        if (!a(objA)) {
                                            an4.g(zu1.u(objA));
                                            return null;
                                        }
                                        map.put(str, qf0.p(objA));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objA2 = ((Function0) list.get(i3)).a();
                                        if (objA2 != null && !a(objA2)) {
                                            an4.g(zu1.u(objA2));
                                            return null;
                                        }
                                        arrayList.add(objA2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // o.nh6
    public final Object f(String str) {
        jx4 jx4Var = this.n;
        List list = jx4Var != null ? (List) jx4Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && jx4Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = jx4Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = jx4Var.c;
            Object obj = objArr[iF];
            jx4Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // o.nh6
    public final mh6 g(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!qf0.J(str.charAt(i))) {
                jx4 jx4Var = this.f1654o;
                if (jx4Var == null) {
                    long[] jArr = ti6.a;
                    jx4Var = new jx4();
                    this.f1654o = jx4Var;
                }
                Object objG = jx4Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    jx4Var.m(str, objG);
                }
                ((List) objG).add(function0);
                return new ep3(jx4Var, str, function0, (byte) 18);
            }
        }
        hk0.g("Registered key is empty or blank");
        return null;
    }
}
