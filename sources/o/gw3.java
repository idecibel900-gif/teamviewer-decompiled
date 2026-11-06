package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class gw3 implements Function0 {
    public final /* synthetic */ byte m;
    public final mw3 n;

    public /* synthetic */ gw3(mw3 mw3Var, byte b) {
        this.m = b;
        this.n = mw3Var;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01da  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f8  */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        fi1 fi1VarI;
        Class<?> clsA;
        xi2 xi2VarV;
        byte b = this.m;
        mw3 mw3Var = this.n;
        switch (b) {
            case 0:
                js0 js0Var = og6.a;
                bu5 bu5VarW = mw3Var.w();
                ou3 ou3Var = mw3Var.r;
                zu1 zu1VarB = og6.b(bu5VarW);
                if (!(zu1VarB instanceof ws3)) {
                    if (zu1VarB instanceof us3) {
                        return ((us3) zu1VarB).d;
                    }
                    if ((zu1VarB instanceof vs3) || (zu1VarB instanceof xs3)) {
                        return null;
                    }
                    gk0.s();
                    return null;
                }
                ws3 ws3Var = (ws3) zu1VarB;
                qv5 qv5Var = ws3Var.e;
                bu5 bu5Var = ws3Var.d;
                dg2 dg2Var = kt3.a;
                ns3 ns3VarB = kt3.b(qv5Var, ws3Var.g, ws3Var.h, true);
                if (ns3VarB == null) {
                    return null;
                }
                if (bu5Var.k() != 2) {
                    fi1 fi1VarI2 = bu5Var.i();
                    if (fi1VarI2 == null) {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                    }
                    if (zo1.l(fi1VarI2)) {
                        fi1 fi1VarI3 = fi1VarI2.i();
                        if (zo1.n(fi1VarI3, ms0.m) || zo1.n(fi1VarI3, ms0.f1501o)) {
                            LinkedHashSet linkedHashSet = nx0.a;
                            if (g68.u((ns4) fi1VarI2)) {
                                if (zo1.l(bu5Var.i())) {
                                    xi2VarV = bu5Var.V();
                                    if (!((xi2VarV == null && xi2VarV.getAnnotations().o0(sr3.a)) ? true : bu5Var.getAnnotations().o0(sr3.a))) {
                                        if (kt3.d(qv5Var)) {
                                            fi1VarI = bu5Var.i();
                                            if (fi1VarI instanceof ns4) {
                                                clsA = pa8.j((ns4) fi1VarI);
                                            } else {
                                                clsA = ou3Var.a();
                                            }
                                        }
                                    }
                                } else if (kt3.d(qv5Var)) {
                                    fi1VarI = bu5Var.i();
                                    if (fi1VarI instanceof ns4) {
                                        clsA = pa8.j((ns4) fi1VarI);
                                    } else {
                                        clsA = ou3Var.a();
                                    }
                                }
                            }
                        } else if (zo1.l(bu5Var.i())) {
                            xi2VarV = bu5Var.V();
                            if (!((xi2VarV == null && xi2VarV.getAnnotations().o0(sr3.a)) ? true : bu5Var.getAnnotations().o0(sr3.a))) {
                                if (kt3.d(qv5Var)) {
                                    fi1VarI = bu5Var.i();
                                    if (fi1VarI instanceof ns4) {
                                        clsA = pa8.j((ns4) fi1VarI);
                                    } else {
                                        clsA = ou3Var.a();
                                    }
                                }
                            }
                        } else if (kt3.d(qv5Var)) {
                            fi1VarI = bu5Var.i();
                            if (fi1VarI instanceof ns4) {
                                clsA = pa8.j((ns4) fi1VarI);
                            } else {
                                clsA = ou3Var.a();
                            }
                        }
                    } else if (zo1.l(bu5Var.i())) {
                        xi2VarV = bu5Var.V();
                        if (!((xi2VarV == null && xi2VarV.getAnnotations().o0(sr3.a)) ? true : bu5Var.getAnnotations().o0(sr3.a))) {
                            if (kt3.d(qv5Var)) {
                                fi1VarI = bu5Var.i();
                                if (fi1VarI instanceof ns4) {
                                    clsA = pa8.j((ns4) fi1VarI);
                                } else {
                                    clsA = ou3Var.a();
                                }
                            }
                        }
                    } else if (kt3.d(qv5Var)) {
                        fi1VarI = bu5Var.i();
                        if (fi1VarI instanceof ns4) {
                            clsA = pa8.j((ns4) fi1VarI);
                        } else {
                            clsA = ou3Var.a();
                        }
                    }
                    clsA = ou3Var.a().getEnclosingClass();
                } else if (kt3.d(qv5Var)) {
                    clsA = ou3Var.a().getEnclosingClass();
                } else {
                    fi1VarI = bu5Var.i();
                    if (fi1VarI instanceof ns4) {
                        clsA = pa8.j((ns4) fi1VarI);
                    } else {
                        clsA = ou3Var.a();
                    }
                }
                if (clsA == null) {
                    return null;
                }
                try {
                    return clsA.getDeclaredField(ns3VarB.e);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            default:
                ou3 ou3Var2 = mw3Var.r;
                String str = mw3Var.s;
                String str2 = mw3Var.t;
                ou3Var2.getClass();
                str.getClass();
                str2.getClass();
                e96 e96Var = ou3.m;
                e96Var.getClass();
                Matcher matcher = e96Var.m.matcher(str2);
                matcher.getClass();
                fn4 fn4Var = matcher.matches() ? new fn4(matcher, str2) : null;
                if (fn4Var != null) {
                    String str3 = (String) ((dn4) fn4Var.a()).get(1);
                    bu5 bu5VarR = ou3Var2.r(Integer.parseInt(str3));
                    if (bu5VarR != null) {
                        return bu5VarR;
                    }
                    StringBuilder sbP = ua5.p("Local property #", str3, " not found in ");
                    sbP.append(ou3Var2.a());
                    throw new kz3(sbP.toString());
                }
                Collection collectionU = ou3Var2.u(sy4.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionU) {
                    if (im3.n(og6.b((bu5) obj).m(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbO = e41.o("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                    sbO.append(ou3Var2);
                    throw new kz3(sbO.toString());
                }
                if (arrayList.size() == 1) {
                    return (bu5) lv0.F0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    cp1 cp1VarE = ((bu5) obj2).e();
                    Object arrayList2 = linkedHashMap.get(cp1VarE);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(cp1VarE, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap(new gj2((byte) 20));
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                collectionValues.getClass();
                List list = (List) lv0.u0(collectionValues);
                if (list.size() == 1) {
                    return (bu5) lv0.m0(list);
                }
                String strT0 = lv0.t0(ou3Var2.u(sy4.e(str)), "\n", null, null, ek.P, 30);
                StringBuilder sbO2 = e41.o("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbO2.append(ou3Var2);
                sbO2.append(':');
                sbO2.append(strT0.length() == 0 ? " no members found" : "\n".concat(strT0));
                throw new kz3(sbO2.toString());
        }
    }
}
