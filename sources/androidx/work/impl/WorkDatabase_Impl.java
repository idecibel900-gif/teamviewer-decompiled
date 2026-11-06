package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import o.an8;
import o.cn8;
import o.ea2;
import o.fm8;
import o.fr4;
import o.hm8;
import o.j68;
import o.kh7;
import o.kq5;
import o.rm8;
import o.rn1;
import o.sm8;
import o.th7;
import o.vy1;
import o.w86;
import o.wm3;
import o.wt3;
import o.x86;
import o.z06;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {
    public final kh7 k;
    public final kh7 l;
    public final kh7 m;
    public final kh7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kh7 f27o;
    public final kh7 p;
    public final kh7 q;

    public WorkDatabase_Impl() {
        final byte b = 0;
        this.k = new kh7(new Function0(this) { // from class: o.gm8
            public final /* synthetic */ WorkDatabase_Impl n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                WorkDatabase_Impl workDatabase_Impl = this.n;
                switch (b2) {
                    case 0:
                        return new an8(workDatabase_Impl);
                    case 1:
                        return new rn1(workDatabase_Impl);
                    case 2:
                        return new cn8(workDatabase_Impl);
                    case 3:
                        return new th7(workDatabase_Impl);
                    case 4:
                        return new rm8(workDatabase_Impl);
                    case 5:
                        return new sm8(workDatabase_Impl);
                    default:
                        return new kq5(workDatabase_Impl);
                }
            }
        });
        final byte b2 = 1;
        this.l = new kh7(new Function0(this) { // from class: o.gm8
            public final /* synthetic */ WorkDatabase_Impl n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                WorkDatabase_Impl workDatabase_Impl = this.n;
                switch (b3) {
                    case 0:
                        return new an8(workDatabase_Impl);
                    case 1:
                        return new rn1(workDatabase_Impl);
                    case 2:
                        return new cn8(workDatabase_Impl);
                    case 3:
                        return new th7(workDatabase_Impl);
                    case 4:
                        return new rm8(workDatabase_Impl);
                    case 5:
                        return new sm8(workDatabase_Impl);
                    default:
                        return new kq5(workDatabase_Impl);
                }
            }
        });
        final byte b3 = 2;
        this.m = new kh7(new Function0(this) { // from class: o.gm8
            public final /* synthetic */ WorkDatabase_Impl n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                WorkDatabase_Impl workDatabase_Impl = this.n;
                switch (b4) {
                    case 0:
                        return new an8(workDatabase_Impl);
                    case 1:
                        return new rn1(workDatabase_Impl);
                    case 2:
                        return new cn8(workDatabase_Impl);
                    case 3:
                        return new th7(workDatabase_Impl);
                    case 4:
                        return new rm8(workDatabase_Impl);
                    case 5:
                        return new sm8(workDatabase_Impl);
                    default:
                        return new kq5(workDatabase_Impl);
                }
            }
        });
        final byte b4 = 3;
        this.n = new kh7(new Function0(this) { // from class: o.gm8
            public final /* synthetic */ WorkDatabase_Impl n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b5 = b4;
                WorkDatabase_Impl workDatabase_Impl = this.n;
                switch (b5) {
                    case 0:
                        return new an8(workDatabase_Impl);
                    case 1:
                        return new rn1(workDatabase_Impl);
                    case 2:
                        return new cn8(workDatabase_Impl);
                    case 3:
                        return new th7(workDatabase_Impl);
                    case 4:
                        return new rm8(workDatabase_Impl);
                    case 5:
                        return new sm8(workDatabase_Impl);
                    default:
                        return new kq5(workDatabase_Impl);
                }
            }
        });
        final byte b5 = 4;
        this.f27o = new kh7(new Function0(this) { // from class: o.gm8
            public final /* synthetic */ WorkDatabase_Impl n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b6 = b5;
                WorkDatabase_Impl workDatabase_Impl = this.n;
                switch (b6) {
                    case 0:
                        return new an8(workDatabase_Impl);
                    case 1:
                        return new rn1(workDatabase_Impl);
                    case 2:
                        return new cn8(workDatabase_Impl);
                    case 3:
                        return new th7(workDatabase_Impl);
                    case 4:
                        return new rm8(workDatabase_Impl);
                    case 5:
                        return new sm8(workDatabase_Impl);
                    default:
                        return new kq5(workDatabase_Impl);
                }
            }
        });
        final byte b6 = 5;
        this.p = new kh7(new Function0(this) { // from class: o.gm8
            public final /* synthetic */ WorkDatabase_Impl n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b7 = b6;
                WorkDatabase_Impl workDatabase_Impl = this.n;
                switch (b7) {
                    case 0:
                        return new an8(workDatabase_Impl);
                    case 1:
                        return new rn1(workDatabase_Impl);
                    case 2:
                        return new cn8(workDatabase_Impl);
                    case 3:
                        return new th7(workDatabase_Impl);
                    case 4:
                        return new rm8(workDatabase_Impl);
                    case 5:
                        return new sm8(workDatabase_Impl);
                    default:
                        return new kq5(workDatabase_Impl);
                }
            }
        });
        final byte b7 = 6;
        this.q = new kh7(new Function0(this) { // from class: o.gm8
            public final /* synthetic */ WorkDatabase_Impl n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b8 = b7;
                WorkDatabase_Impl workDatabase_Impl = this.n;
                switch (b8) {
                    case 0:
                        return new an8(workDatabase_Impl);
                    case 1:
                        return new rn1(workDatabase_Impl);
                    case 2:
                        return new cn8(workDatabase_Impl);
                    case 3:
                        return new th7(workDatabase_Impl);
                    case 4:
                        return new rm8(workDatabase_Impl);
                    case 5:
                        return new sm8(workDatabase_Impl);
                    default:
                        return new kq5(workDatabase_Impl);
                }
            }
        });
        new kh7(new j68(this, (byte) 11));
    }

    @Override // o.ze6
    public final List c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fr4(13, 14, (byte) 10));
        arrayList.add(new fm8((byte) 0));
        int i = 17;
        arrayList.add(new fr4(16, i, (byte) 11));
        int i2 = 18;
        arrayList.add(new fr4(i, i2, (byte) 12));
        arrayList.add(new fr4(i2, 19, (byte) 13));
        arrayList.add(new fm8((byte) 1));
        arrayList.add(new fr4(20, 21, (byte) 14));
        int i3 = 23;
        arrayList.add(new fr4(22, i3, (byte) 15));
        arrayList.add(new fr4(i3, 24, (byte) 16));
        return arrayList;
    }

    @Override // o.ze6
    public final wm3 d() {
        return new wm3(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // o.ze6
    public final vy1 e() {
        return new hm8(this);
    }

    @Override // o.ze6
    public final Set h() {
        return new LinkedHashSet();
    }

    @Override // o.ze6
    public final LinkedHashMap i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        x86 x86Var = w86.a;
        wt3 wt3VarB = x86Var.b(an8.class);
        ea2 ea2Var = ea2.m;
        linkedHashMap.put(wt3VarB, ea2Var);
        linkedHashMap.put(x86Var.b(rn1.class), ea2Var);
        linkedHashMap.put(x86Var.b(cn8.class), ea2Var);
        linkedHashMap.put(x86Var.b(th7.class), ea2Var);
        linkedHashMap.put(x86Var.b(rm8.class), ea2Var);
        linkedHashMap.put(x86Var.b(sm8.class), ea2Var);
        linkedHashMap.put(x86Var.b(kq5.class), ea2Var);
        linkedHashMap.put(x86Var.b(z06.class), ea2Var);
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final rn1 r() {
        return (rn1) this.l.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final kq5 s() {
        return (kq5) this.q.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final th7 t() {
        return (th7) this.n.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final rm8 u() {
        return (rm8) this.f27o.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final sm8 v() {
        return (sm8) this.p.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final an8 w() {
        return (an8) this.k.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cn8 x() {
        return (cn8) this.m.getValue();
    }
}
