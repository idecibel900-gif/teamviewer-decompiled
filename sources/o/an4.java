package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.messaging.TopicSubscriptionClient;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class an4 implements f36, Deferred$DeferredHandler, rg6, jo6, ds7, TopicSubscriptionClient.HttpConnectionFactory {
    public final /* synthetic */ byte m;

    public /* synthetic */ an4(byte b) {
        this.m = b;
    }

    public static /* synthetic */ void c(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void f(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void g(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void k(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void n(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void p(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void q(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void s(String str) throws ev8 {
        throw new ev8(str);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    @Override // o.f36
    public void a(String str) {
        ye4.a("NativeLibExt", "ReLinker: ".concat(str));
    }

    @Override // o.rg6
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                iu iuVarA = u00.a();
                iuVarA.O(cursorRawQuery.getString(1));
                iuVarA.n = us5.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                iuVarA.p = string == null ? null : Base64.decode(string, 0);
                arrayList.add(iuVarA.f());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    @Override // o.jo6
    public io6 b(io.sentry.android.core.n1 n1Var) {
        ho6 ho6VarZ;
        ho6 ho6Var;
        ho6 ho6Var2;
        io6 io6Var;
        boolean z;
        String str;
        int i;
        int length;
        boolean z2;
        int iL;
        switch (this.m) {
            case 17:
                return wo1.w(n1Var, yl7.W);
            default:
                io6 io6Var2 = (io6) n1Var.f118o;
                rr0 rr0Var = (rr0) n1Var.p;
                if (io6Var2 == null) {
                    return wo1.w(n1Var, yl7.W);
                }
                ho6 ho6Var3 = io6Var2.b;
                ho6 ho6Var4 = io6Var2.a;
                if (n1Var.n) {
                    ho6VarZ = wo1.Z(n1Var, rr0Var, ho6Var4);
                    ho6Var2 = ho6Var3;
                    ho6Var3 = ho6Var4;
                    ho6Var = ho6VarZ;
                } else {
                    ho6VarZ = wo1.Z(n1Var, rr0Var, ho6Var3);
                    ho6Var = ho6Var4;
                    ho6Var2 = ho6VarZ;
                }
                if (im3.n(ho6VarZ, ho6Var3)) {
                    return io6Var2;
                }
                io6 io6Var3 = new io6(ho6Var, ho6Var2, n1Var.h() == ef1.m || (n1Var.h() == ef1.f707o && ho6Var.b > ho6Var2.b));
                rr0 rr0Var2 = (rr0) n1Var.p;
                ho6 ho6Var5 = io6Var3.a;
                long j = ho6Var5.c;
                ho6 ho6Var6 = io6Var3.b;
                if (j != ho6Var6.c) {
                    boolean z3 = io6Var3.c;
                    if ((z3 ? ho6Var5 : ho6Var6).b == 0) {
                        if (((vs7) rr0Var2.e).a.a.n.length() == (z3 ? ho6Var6 : ho6Var5).b) {
                            io6Var = (io6) n1Var.f118o;
                            String str2 = ((vs7) rr0Var2.e).a.a.n;
                            if (io6Var != null) {
                                z = n1Var.n;
                                str = ((vs7) rr0Var2.e).a.a.n;
                                i = rr0Var2.b;
                                length = str.length();
                                if (i == 0) {
                                    int iL2 = x67.l(0, str);
                                    if (z) {
                                    }
                                }
                                if (i == length) {
                                    int iM = x67.m(length, str);
                                    if (z) {
                                    }
                                }
                                if (io6Var.c) {
                                }
                                if (z ^ z2) {
                                    iL = x67.m(i, str);
                                } else {
                                    iL = x67.l(i, str);
                                }
                                if (z) {
                                }
                            }
                        }
                    }
                } else if (ho6Var5.b == ho6Var6.b) {
                    io6Var = (io6) n1Var.f118o;
                    String str3 = ((vs7) rr0Var2.e).a.a.n;
                    if (io6Var != null && str3.length() != 0) {
                        z = n1Var.n;
                        str = ((vs7) rr0Var2.e).a.a.n;
                        i = rr0Var2.b;
                        length = str.length();
                        if (i == 0) {
                            int iL3 = x67.l(0, str);
                            return z ? io6.a(io6Var3, wo1.z(ho6Var5, rr0Var2, iL3), null, true, 2) : io6.a(io6Var3, null, wo1.z(ho6Var6, rr0Var2, iL3), false, 1);
                        }
                        if (i == length) {
                            int iM2 = x67.m(length, str);
                            return z ? io6.a(io6Var3, wo1.z(ho6Var5, rr0Var2, iM2), null, false, 2) : io6.a(io6Var3, null, wo1.z(ho6Var6, rr0Var2, iM2), true, 1);
                        }
                        z2 = io6Var.c;
                        if (z ^ z2) {
                            iL = x67.m(i, str);
                        } else {
                            iL = x67.l(i, str);
                        }
                        return z ? io6.a(io6Var3, wo1.z(ho6Var5, rr0Var2, iL), null, z2, 2) : io6.a(io6Var3, null, wo1.z(ho6Var6, rr0Var2, iL), z2, 1);
                    }
                }
                return io6Var3;
        }
    }

    @Override // o.ds7
    public boolean d(v56 v56Var, v56 v56Var2) {
        return v56Var.g(v56Var2);
    }
}
