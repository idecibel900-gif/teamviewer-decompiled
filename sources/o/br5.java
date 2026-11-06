package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class br5 {
    public boolean a;
    public long b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public br5(Function1 function1) {
        this.c = function1;
        this.d = new AtomicReference(null);
        this.e = new gg4(this, (byte) 17);
        this.f = new y46((Object) this, (byte) 23);
        this.g = new xx4(new m57[16]);
        this.h = new Object();
        this.b = -1L;
    }

    public void a() {
        synchronized (this.h) {
            xx4 xx4Var = (xx4) this.g;
            Object[] objArr = xx4Var.m;
            int i = xx4Var.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                m57 m57Var = (m57) objArr[i2];
                m57Var.e.a();
                m57Var.f.a();
                m57Var.l.a();
                m57Var.m.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[Catch: all -> 0x0090, LOOP:1: B:14:0x002f->B:26:0x0076, LOOP_END, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:8:0x0013, B:27:0x007a, B:29:0x0082, B:34:0x0092, B:31:0x0087, B:11:0x0023, B:14:0x002f, B:16:0x0043, B:18:0x0051, B:20:0x005b, B:22:0x006b, B:26:0x0076, B:35:0x0096), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x007a A[EDGE_INSN: B:47:0x007a->B:27:0x007a BREAK  A[LOOP:1: B:14:0x002f->B:26:0x0076], SYNTHETIC] */
    public void b(Object obj) {
        int i;
        synchronized (this.h) {
            try {
                xx4 xx4Var = (xx4) this.g;
                int i2 = xx4Var.f2559o;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = xx4Var.m;
                    if (i3 < i2) {
                        m57 m57Var = (m57) objArr[i3];
                        vw4 vw4Var = (vw4) m57Var.f.k(obj);
                        if (vw4Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = vw4Var.b;
                            int[] iArr = vw4Var.c;
                            long[] jArr = vw4Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j & 255) < 128) {
                                                int i8 = (i5 << 3) + i7;
                                                Object obj2 = objArr2[i8];
                                                int i9 = iArr[i8];
                                                m57Var.c(obj, obj2);
                                            }
                                            j >>= 8;
                                        }
                                        if (i6 != 8) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    } else if (i5 != length) {
                                        break;
                                        break;
                                    } else {
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!m57Var.f.j()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = xx4Var.m;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i10 = i2 - i4;
                        Arrays.fill(objArr, i10, i2, (Object) null);
                        xx4Var.f2559o = i10;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.h) {
            z = this.a;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.d;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        i01.b("Unexpected notification");
                        hk0.b();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.h) {
                xx4 xx4Var = (xx4) this.g;
                Object[] objArr = xx4Var.m;
                int i = xx4Var.f2559o;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((m57) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    public SharedPreferences.Editor d() {
        if (!this.a) {
            return e().edit();
        }
        SharedPreferences.Editor editor = (SharedPreferences.Editor) this.e;
        if (editor != null) {
            return editor;
        }
        SharedPreferences.Editor editorEdit = e().edit();
        this.e = editorEdit;
        return editorEdit;
    }

    public SharedPreferences e() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = ((Context) this.c).getSharedPreferences((String) this.f, 0);
        this.d = sharedPreferences2;
        return sharedPreferences2;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0228 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    public void f(Object obj, Function1 function1, Function0 function0) {
        xx4 xx4Var;
        Object obj2;
        m57 m57Var;
        boolean z;
        m57 m57Var2;
        long j;
        long j2;
        m57 m57Var3;
        n47 e28Var;
        long j3;
        vw4 vw4Var;
        int i;
        long j4;
        vw4 vw4Var2;
        long jF = o67.f();
        synchronized (this.h) {
            xx4Var = (xx4) this.g;
            Object[] objArr = xx4Var.m;
            int i2 = xx4Var.f2559o;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((m57) obj2).a == function1) {
                    break;
                } else {
                    i3++;
                }
            }
            m57Var = (m57) obj2;
            z = true;
            if (m57Var == null) {
                function1.getClass();
                e8.i(1, function1);
                m57Var = new m57(function1);
                xx4Var.b(m57Var);
            }
            m57Var2 = (m57) this.j;
            j = this.b;
        }
        Object obj3 = xx4Var;
        if (j != -1 && j != jF) {
            obj3 = xx4Var;
            String name = Thread.currentThread().getName();
            StringBuilder sb = new StringBuilder("Detected multithreaded access to SnapshotStateObserver: previousThreadId=");
            sb.append(j);
            sb.append("), currentThread={id=");
            sb.append(jF);
            sb.append(", name=");
            sb.append(name);
            sb.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            up5.a(sb.toString());
            obj3 = sb;
        }
        try {
            obj3 = xx4Var;
            synchronized (this.h) {
                try {
                    this.j = m57Var;
                    this.b = jF;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            y46 y46Var = (y46) this.f;
            Object obj4 = m57Var.b;
            vw4 vw4Var3 = m57Var.c;
            int i4 = m57Var.d;
            m57Var.b = obj;
            m57Var.c = (vw4) m57Var.f.g(obj);
            if (m57Var.d == -1) {
                m57Var.d = Long.hashCode(v47.h().g());
            }
            tx2 tx2Var = m57Var.i;
            xx4 xx4VarA = d57.a();
            try {
                xx4VarA.b(tx2Var);
                if (y46Var == null) {
                    function0.a();
                    m57Var3 = m57Var;
                } else {
                    n47 n47Var = (n47) v47.b.get();
                    if (n47Var instanceof e28) {
                        m57Var3 = m57Var;
                        if (((e28) n47Var).t == o67.f()) {
                            Function1 function2 = ((e28) n47Var).r;
                            Function1 function3 = ((e28) n47Var).s;
                            try {
                                ((e28) n47Var).r = v47.i(y46Var, function2, true);
                                ((e28) n47Var).s = function3;
                                function0.a();
                                ((e28) n47Var).r = function2;
                                ((e28) n47Var).s = function3;
                            } catch (Throwable th2) {
                                ((e28) n47Var).r = function2;
                                ((e28) n47Var).s = function3;
                                throw th2;
                            }
                        }
                    } else {
                        m57Var3 = m57Var;
                    }
                    if (n47Var == null || (n47Var instanceof ox4)) {
                        e28Var = new e28(n47Var instanceof ox4 ? (ox4) n47Var : null, y46Var, null, true, false);
                    } else {
                        e28Var = n47Var.u(y46Var);
                    }
                    try {
                        n47 n47VarJ = e28Var.j();
                        try {
                            function0.a();
                            n47.q(n47VarJ);
                            e28Var.c();
                        } catch (Throwable th3) {
                            try {
                                n47.q(n47VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    e28Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    xx4VarA.k(xx4VarA.f2559o - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                xx4VarA.k(xx4VarA.f2559o - 1);
                m57 m57Var4 = m57Var3;
                Object obj5 = m57Var4.b;
                obj5.getClass();
                int i5 = m57Var4.d;
                vw4 vw4Var4 = m57Var4.c;
                if (vw4Var4 != null) {
                    try {
                        long[] jArr = vw4Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                vw4 vw4Var5 = vw4Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            vw4Var2 = vw4Var5;
                                            Object obj6 = vw4Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = vw4Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    m57Var4.c(obj5, obj6);
                                                }
                                                if (z3) {
                                                    vw4Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.h) {
                                                    this.j = m57Var2;
                                                    this.b = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            vw4Var2 = vw4Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        vw4Var5 = vw4Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    vw4Var = vw4Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    vw4Var = vw4Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                vw4Var4 = vw4Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.h) {
                            this.j = m57Var2;
                            this.b = j2;
                            throw th;
                        }
                    }
                } else {
                    j3 = j;
                }
                m57Var4.b = obj4;
                m57Var4.c = vw4Var3;
                m57Var4.d = i4;
                synchronized (this.h) {
                    this.j = m57Var2;
                    this.b = j3;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public void g() {
        gg4 gg4Var = (gg4) this.e;
        v47.b(v47.a);
        synchronized (v47.c) {
            v47.h = lv0.B0(v47.h, gg4Var);
        }
        this.i = new ar(gg4Var, (byte) 24);
    }

    public br5(Context context) {
        this.b = 0L;
        this.c = context;
        this.f = context.getPackageName() + "_preferences";
        this.d = null;
    }
}
