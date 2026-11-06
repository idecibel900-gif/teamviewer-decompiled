package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lo/i02;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i02 extends RuntimeException {
    public final vz0 m;

    public i02(vz0 vz0Var) {
        this.m = vz0Var;
        if (vz0Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = vz0Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            xz0 xz0Var = (xz0) list.get(i);
            if (!cx.C0(iArr, xz0Var.a)) {
                if (xz0Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((xz0) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        qv0.f0(arrayList);
                    }
                } else {
                    arrayList.add(xz0Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", fx3.e(((xz0) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        vz0 vz0Var = this.m;
        if (!vz0Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        sa4 sa4VarT = qf0.t();
        List list = vz0Var.a;
        list.getClass();
        dn4 dn4Var = new dn4(list);
        int iA = dn4Var.a();
        for (int i = 0; i < iA; i++) {
            ((xz0) dn4Var.get(i)).getClass();
        }
        sa4 sa4VarR = qf0.r(sa4VarT);
        sa4VarR.getClass();
        dn4 dn4Var2 = new dn4(sa4VarR);
        int iA2 = dn4Var2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            String str = (String) dn4Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
