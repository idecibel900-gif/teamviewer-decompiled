package o;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gj2 implements Comparator {
    public static final gj2 n = new gj2(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final gj2 f899o = new gj2(1);
    public static final gj2 p = new gj2(2);
    public static final gj2 q = new gj2(3);
    public static final gj2 r = new gj2(4);
    public static final gj2 s = new gj2(5);
    public static final gj2 t = new gj2(6);
    public final /* synthetic */ byte m;

    public /* synthetic */ gj2(byte b) {
        this.m = b;
    }

    public static int a(fi1 fi1Var) {
        if (zo1.m(fi1Var)) {
            return 8;
        }
        if (fi1Var instanceof z61) {
            return 7;
        }
        if (fi1Var instanceof bu5) {
            return ((bu5) fi1Var).S() == null ? 6 : 5;
        }
        if (fi1Var instanceof xw2) {
            return ((xw2) fi1Var).S() == null ? 4 : 3;
        }
        if (fi1Var instanceof ns4) {
            return 2;
        }
        return fi1Var instanceof eq1 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        Integer num;
        Integer num2;
        switch (this.m) {
            case 0:
                nk7 nk7Var = (nk7) obj;
                nk7 nk7Var2 = (nk7) obj2;
                nk7Var.getClass();
                nk7Var2.getClass();
                if (nk7Var == nk7Var2) {
                    return 0;
                }
                lk7 lk7Var = nk7Var.n;
                lk7 lk7Var2 = lk7.f1374o;
                if (lk7Var == lk7Var2 && nk7Var2.n != lk7Var2) {
                    return -1;
                }
                if (lk7Var == lk7Var2 || nk7Var2.n != lk7Var2) {
                    lk7 lk7Var3 = lk7.n;
                    lk7 lk7Var4 = lk7.m;
                    if (lk7Var == lk7Var4 && nk7Var2.n == lk7Var3) {
                        return -1;
                    }
                    if (lk7Var != lk7Var3 || nk7Var2.n != lk7Var4) {
                        String str = nk7Var.m;
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        String upperCase = str.toUpperCase(locale);
                        upperCase.getClass();
                        String str2 = nk7Var2.m;
                        Locale locale2 = Locale.getDefault();
                        locale2.getClass();
                        String upperCase2 = str2.toUpperCase(locale2);
                        upperCase2.getClass();
                        return upperCase.compareTo(upperCase2);
                    }
                }
                return 1;
            case 1:
                br2 br2Var = (br2) obj;
                br2 br2Var2 = (br2) obj2;
                if (xs1.R(br2Var) && xs1.R(br2Var2)) {
                    LayoutNode layoutNodeP0 = vn4.p0(br2Var);
                    LayoutNode layoutNodeP1 = vn4.p0(br2Var2);
                    if (!im3.n(layoutNodeP0, layoutNodeP1)) {
                        Object[] objArr = new LayoutNode[16];
                        int i = 0;
                        while (layoutNodeP0 != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = layoutNodeP0;
                            i++;
                            layoutNodeP0 = layoutNodeP0.F();
                        }
                        Object[] objArr3 = new LayoutNode[16];
                        int i3 = 0;
                        while (layoutNodeP1 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = layoutNodeP1;
                            i3++;
                            layoutNodeP1 = layoutNodeP1.F();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (im3.n(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return im3.t(((LayoutNode) objArr[i5]).G(), ((LayoutNode) objArr3[i5]).G());
                        }
                        hk0.l("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (xs1.R(br2Var)) {
                        return -1;
                    }
                    if (xs1.R(br2Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 2:
                v56 v56VarH = ((fp6) obj).h();
                v56 v56VarH2 = ((fp6) obj2).h();
                int iCompare = Float.compare(v56VarH.a, v56VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(v56VarH.b, v56VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(v56VarH.d, v56VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(v56VarH.c, v56VarH2.c);
            case 3:
                fi1 fi1Var = (fi1) obj;
                fi1 fi1Var2 = (fi1) obj2;
                int iA = a(fi1Var2) - a(fi1Var);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else if (zo1.m(fi1Var) && zo1.m(fi1Var2)) {
                    numValueOf = 0;
                } else {
                    int iCompareTo = fi1Var.getName().m.compareTo(fi1Var2.getName().m);
                    numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            case 4:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                int iT = im3.t(layoutNode2.C, layoutNode.C);
                return iT != 0 ? iT : im3.t(layoutNode.hashCode(), layoutNode2.hashCode());
            case 5:
                v56 v56VarH3 = ((fp6) obj).h();
                v56 v56VarH4 = ((fp6) obj2).h();
                int iCompare4 = Float.compare(v56VarH4.c, v56VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(v56VarH3.b, v56VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(v56VarH3.d, v56VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(v56VarH4.a, v56VarH3.a);
            case 6:
                vd5 vd5Var = (vd5) obj;
                vd5 vd5Var2 = (vd5) obj2;
                int iCompare7 = Float.compare(((v56) vd5Var.m).b, ((v56) vd5Var2.m).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((v56) vd5Var.m).d, ((v56) vd5Var2.m).d);
            case 7:
                return Integer.valueOf(((wo) obj).b).compareTo(Integer.valueOf(((wo) obj2).b));
            case 8:
                return Integer.valueOf(((wo) obj).b).compareTo(Integer.valueOf(((wo) obj2).b));
            case ep1.b /* 9 */:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                int iMin2 = Math.min(str3.length(), str4.length());
                for (int i6 = 4; i6 < iMin2; i6++) {
                    char cCharAt = str3.charAt(i6);
                    char cCharAt2 = str4.charAt(i6);
                    if (cCharAt != cCharAt2) {
                        if (im3.t(cCharAt, cCharAt2) < 0) {
                            return -1;
                        }
                        return 1;
                    }
                }
                int length3 = str3.length();
                int length4 = str4.length();
                if (length3 == length4) {
                    return 0;
                }
                if (length3 < length4) {
                    return -1;
                }
                return 1;
            case ep1.c /* 10 */:
                return bp1.g((ns4) obj).b().compareTo(bp1.g((ns4) obj2).b());
            case 11:
                Integer num3 = 1;
                b91 b91Var = ((h71) obj).t;
                b91 b91Var2 = b91.m;
                return (b91Var == b91Var2 ? 0 : num3).compareTo(((h71) obj2).t == b91Var2 ? 0 : 1);
            case ep1.d /* 12 */:
                Integer num4 = 1;
                b91 b91Var3 = ((h71) obj).t;
                b91 b91Var4 = b91.f407o;
                return (b91Var3 == b91Var4 ? 0 : num4).compareTo(((h71) obj2).t == b91Var4 ? 0 : 1);
            case 13:
                WeakHashMap weakHashMap = be8.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 14:
                LayoutNode layoutNode3 = (LayoutNode) obj;
                LayoutNode layoutNode4 = (LayoutNode) obj2;
                int iT2 = im3.t(layoutNode3.C, layoutNode4.C);
                return iT2 != 0 ? iT2 : im3.t(layoutNode3.hashCode(), layoutNode4.hashCode());
            case 15:
                zx2 zx2Var = (zx2) obj;
                zx2 zx2Var2 = (zx2) obj2;
                RecyclerView recyclerView = zx2Var.d;
                if ((recyclerView == null) == (zx2Var2.d == null)) {
                    boolean z3 = zx2Var.a;
                    if (z3 == zx2Var2.a) {
                        int i7 = zx2Var2.b - zx2Var.b;
                        if (i7 != 0) {
                            return i7;
                        }
                        int i8 = zx2Var.c - zx2Var2.c;
                        if (i8 != 0) {
                            return i8;
                        }
                        return 0;
                    }
                    if (z3) {
                        return -1;
                    }
                } else if (recyclerView != null) {
                    return -1;
                }
                return 1;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                Integer num5 = Integer.MAX_VALUE;
                ls1 ls1Var = ((ns1) obj).c;
                int i9 = ls1Var == null ? -1 : y23.a[ls1Var.ordinal()];
                if (i9 == -1) {
                    num = num5;
                } else if (i9 == 1) {
                    num = 0;
                } else {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            num = 2;
                        }
                        gk0.s();
                        return 0;
                    }
                    num = 1;
                }
                ls1 ls1Var2 = ((ns1) obj2).c;
                int i10 = ls1Var2 == null ? -1 : y23.a[ls1Var2.ordinal()];
                if (i10 != -1) {
                    if (i10 == 1) {
                        num5 = 0;
                    } else {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                num5 = 2;
                            }
                            gk0.s();
                            return 0;
                        }
                        num5 = 1;
                    }
                }
                return num.compareTo(num5);
            case 17:
                Integer num6 = Integer.MAX_VALUE;
                ls1 ls1Var3 = ((ns1) obj).c;
                int i11 = ls1Var3 == null ? -1 : y23.a[ls1Var3.ordinal()];
                if (i11 == -1) {
                    num2 = num6;
                } else if (i11 == 1) {
                    num2 = 2;
                } else {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            num2 = 0;
                        }
                        gk0.s();
                        return 0;
                    }
                    num2 = 1;
                }
                ls1 ls1Var4 = ((ns1) obj2).c;
                int i12 = ls1Var4 == null ? -1 : y23.a[ls1Var4.ordinal()];
                if (i12 != -1) {
                    if (i12 == 1) {
                        num6 = 2;
                    } else {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                num6 = 0;
                            }
                            gk0.s();
                            return 0;
                        }
                        num6 = 1;
                    }
                }
                return num2.compareTo(num6);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return db8.q(((Method) obj).getName(), ((Method) obj2).getName());
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return db8.q(((pv3) obj).getName(), ((pv3) obj2).getName());
            case 20:
                e96 e96Var = ou3.m;
                Integer numB = dp1.b((cp1) obj, (cp1) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
            case 21:
                return bp1.g((ns4) obj).b().compareTo(bp1.g((ns4) obj2).b());
            case 22:
                String str5 = ((j74) obj).c;
                Locale locale3 = Locale.ROOT;
                String lowerCase = str5.toLowerCase(locale3);
                lowerCase.getClass();
                String lowerCase2 = ((j74) obj2).c.toLowerCase(locale3);
                lowerCase2.getClass();
                return lowerCase.compareTo(lowerCase2);
            case 23:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 24:
                return ((k67) obj).n - ((k67) obj2).n;
            case 25:
                ((d75) obj2).getClass();
                Integer num7 = 2;
                ((d75) obj).getClass();
                return num7.compareTo(num7);
            case 26:
                throw ua5.i(obj2);
            case 27:
                return Integer.valueOf(((mn1) obj).m).compareTo(Integer.valueOf(((mn1) obj2).m));
            case 28:
                return Integer.valueOf(((mn1) obj2).m).compareTo(Integer.valueOf(((mn1) obj).m));
            default:
                return db8.q((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
        }
    }
}
