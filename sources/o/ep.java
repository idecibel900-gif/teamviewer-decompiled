package o;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ep implements mj0 {
    public final Class a;
    public final ArrayList b;
    public final cp c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public ep(Class cls, ArrayList arrayList, cp cpVar, dp dpVar, List list) {
        cls.getClass();
        this.a = cls;
        this.b = arrayList;
        this.c = cpVar;
        this.d = list;
        ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List list2 = this.d;
        ArrayList arrayList3 = new ArrayList(mv0.Z(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> cls2 = (Class) p76.c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list3 = this.d;
        ArrayList arrayList4 = new ArrayList(mv0.Z(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == cp.n && dpVar == dp.m && !lv0.x0("value", this.b).isEmpty()) {
            yq4.r("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    @Override // o.mj0
    public final List a() {
        return this.e;
    }

    @Override // o.mj0
    public final Member b() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    @Override // o.mj0
    public final Object call(Object[] objArr) {
        wt3 wt3VarB;
        x86 x86Var;
        String strC;
        objArr.getClass();
        di1.o(this, objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i >= length) {
                return au8.x(this.a, xm4.U(lv0.V0(arrayList2, arrayList)), this.d);
            }
            Object array = objArr[i];
            int i3 = i2 + 1;
            ArrayList arrayList3 = this.f;
            if (array == null && this.c == cp.m) {
                array = this.g.get(i2);
            } else {
                Class cls = (Class) arrayList3.get(i2);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof wt3) {
                        array = et1.z((wt3) array);
                    } else if (array instanceof Object[]) {
                        Object[] objArr2 = (Object[]) array;
                        if (objArr2 instanceof Class[]) {
                            array = null;
                        } else if (objArr2 instanceof wt3[]) {
                            wt3[] wt3VarArr = (wt3[]) array;
                            ArrayList arrayList4 = new ArrayList(wt3VarArr.length);
                            for (wt3 wt3Var : wt3VarArr) {
                                arrayList4.add(et1.z(wt3Var));
                            }
                            array = arrayList4.toArray(new Class[0]);
                        } else {
                            array = objArr2;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = (String) arrayList2.get(i2);
                Class cls2 = (Class) arrayList3.get(i2);
                if (im3.n(cls2, Class.class)) {
                    x86Var = w86.a;
                    wt3VarB = x86Var.b(wt3.class);
                } else if (cls2.isArray() && im3.n(cls2.getComponentType(), Class.class)) {
                    x86Var = w86.a;
                    wt3VarB = x86Var.b(wt3[].class);
                } else {
                    x86 x86Var2 = w86.a;
                    wt3VarB = x86Var2.b(cls2);
                    x86Var = x86Var2;
                }
                if (im3.n(wt3VarB.c(), x86Var.b(Object[].class).c())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(wt3VarB.c());
                    sb.append('<');
                    Class<?> componentType = et1.z(wt3VarB).getComponentType();
                    componentType.getClass();
                    sb.append(x86Var.b(componentType).c());
                    sb.append('>');
                    strC = sb.toString();
                } else {
                    strC = wt3VarB.c();
                }
                throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + strC);
            }
            arrayList.add(array);
            i++;
            i2 = i3;
        }
    }

    @Override // o.mj0
    public final Type getReturnType() {
        return this.a;
    }

    public /* synthetic */ ep(Class cls, ArrayList arrayList, cp cpVar) {
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, cpVar, dp.n, arrayList2);
    }
}
