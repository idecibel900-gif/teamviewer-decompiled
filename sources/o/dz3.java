package o;

import java.io.EOFException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class dz3 extends vp3 {
    public final /* synthetic */ byte a = 1;
    public final jr3 b;
    public final Object c;
    public final Object d;
    public final Object e;

    public dz3(Class cls) {
        this.c = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.e = enumArr;
            this.d = new String[enumArr.length];
            int i = 0;
            while (true) {
                Enum[] enumArr2 = (Enum[]) this.e;
                if (i >= enumArr2.length) {
                    this.b = jr3.a((String[]) this.d);
                    return;
                }
                String strName = enumArr2[i].name();
                String[] strArr = (String[]) this.d;
                Field field = cls.getField(strName);
                Set set = ma8.a;
                sp3 sp3Var = (sp3) field.getAnnotation(sp3.class);
                if (sp3Var != null) {
                    String strName2 = sp3Var.name();
                    if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName2)) {
                        strName = strName2;
                    }
                }
                strArr[i] = strName;
                i++;
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    @Override // o.vp3
    public final Object a(nr3 nr3Var) throws qq3, EOFException {
        Object objCall;
        String string;
        String string2;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        int i = -1;
        jr3 jr3Var = this.b;
        switch (b) {
            case 0:
                Object obj3 = di1.s;
                nr3Var.getClass();
                pu3 pu3Var = (pu3) this.c;
                int size = pu3Var.getParameters().size();
                ArrayList arrayList = (ArrayList) obj;
                int size2 = arrayList.size();
                Object[] objArr = new Object[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    objArr[i2] = obj3;
                }
                nr3Var.u0();
                while (true) {
                    objCall = null;
                    if (nr3Var.hasNext()) {
                        int iO0 = nr3Var.o0(jr3Var);
                        if (iO0 == i) {
                            nr3Var.H0();
                            nr3Var.v();
                        } else {
                            bz3 bz3Var = (bz3) ((ArrayList) obj2).get(iO0);
                            int i3 = bz3Var.e;
                            xv3 xv3Var = bz3Var.c;
                            if (objArr[i3] == obj3) {
                                Object objA = bz3Var.b.a(nr3Var);
                                objArr[i3] = objA;
                                if (objA == null && !((qw3) xv3Var.getReturnType()).m.p0()) {
                                    String name = xv3Var.getName();
                                    String str = bz3Var.a;
                                    Set set = ma8.a;
                                    String strZ = nr3Var.z();
                                    if (str.equals(name)) {
                                        string2 = to7.k("Non-null value '", name, "' was null at ", strZ);
                                    } else {
                                        StringBuilder sbO = e41.o("Non-null value '", name, "' (JSON name '", str, "') was null at ");
                                        sbO.append(strZ);
                                        string2 = sbO.toString();
                                    }
                                    throw new gq3(string2);
                                }
                                i = -1;
                            } else {
                                gk0.o("Multiple values for '", xv3Var.getName(), "' at ", nr3Var.z());
                            }
                        }
                    } else {
                        nr3Var.Z();
                        boolean z = arrayList.size() == size;
                        for (int i4 = 0; i4 < size; i4++) {
                            if (objArr[i4] == obj3) {
                                if (((pv3) pu3Var.getParameters().get(i4)).h()) {
                                    z = false;
                                } else {
                                    if (!((pv3) pu3Var.getParameters().get(i4)).d().m.p0()) {
                                        String name2 = ((pv3) pu3Var.getParameters().get(i4)).getName();
                                        bz3 bz3Var2 = (bz3) arrayList.get(i4);
                                        String str2 = bz3Var2 != null ? bz3Var2.a : null;
                                        Set set2 = ma8.a;
                                        String strZ2 = nr3Var.z();
                                        if (str2.equals(name2)) {
                                            string = to7.k("Required value '", name2, "' missing at ", strZ2);
                                        } else {
                                            StringBuilder sbO2 = e41.o("Required value '", name2, "' (JSON name '", str2, "') missing at ");
                                            sbO2.append(strZ2);
                                            string = sbO2.toString();
                                        }
                                        throw new gq3(string);
                                    }
                                    objArr[i4] = null;
                                }
                            }
                        }
                        objCall = z ? pu3Var.call(Arrays.copyOf(objArr, size2)) : pu3Var.callBy(new cz3(pu3Var.getParameters(), objArr));
                        int size3 = arrayList.size();
                        while (size < size3) {
                            Object obj4 = arrayList.get(size);
                            obj4.getClass();
                            bz3 bz3Var3 = (bz3) obj4;
                            Object obj5 = objArr[size];
                            if (obj5 != obj3) {
                                ((zu3) bz3Var3.c).k(objCall, obj5);
                            }
                            size++;
                        }
                    }
                }
                return objCall;
            default:
                int iX0 = nr3Var.x0(jr3Var);
                if (iX0 != -1) {
                    return ((Enum[]) obj2)[iX0];
                }
                String strZ3 = nr3Var.z();
                String strR = nr3Var.r();
                throw new gq3("Expected one of " + Arrays.asList((String[]) obj) + " but was " + strR + " at path " + strZ3);
        }
    }

    @Override // o.vp3
    public final void c(pr3 pr3Var, Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                pr3Var.getClass();
                if (obj != null) {
                    pr3Var.q();
                    for (bz3 bz3Var : (ArrayList) obj2) {
                        if (bz3Var != null) {
                            pr3Var.G(bz3Var.a);
                            bz3Var.b.c(pr3Var, bz3Var.c.get(obj));
                        }
                    }
                    pr3Var.z();
                } else {
                    yq4.l("value == null");
                }
                break;
            default:
                pr3Var.l0(((String[]) obj2)[((Enum) obj).ordinal()]);
                break;
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return "KotlinJsonAdapter(" + ((pu3) obj).getReturnType() + ')';
            default:
                return "JsonAdapter(" + ((Class) obj).getName() + ")";
        }
    }

    public dz3(pu3 pu3Var, ArrayList arrayList, ArrayList arrayList2, jr3 jr3Var) {
        this.c = pu3Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.b = jr3Var;
    }
}
